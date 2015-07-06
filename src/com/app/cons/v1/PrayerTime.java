package com.app.cons.v1;

import com.app.util.MathUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by AR001AF on 11/19/2014.
 */
public class PrayerTime {
    private double latitude;
    private double longitude;
    private String javZoneName;
    private double[] defaultTime = {5, 6, 12, 13, 18, 18, 18};
    private int currentDay = 0;
    private String calculationMethod = "ISNA";
    private int juristicMethod = 0;  //{"SHAFII", "HANAFII"}
    DefaultConfig config;

    private int day;
    private int zone;
    private double julianDate;
    private String datePartial;
    private String zonePartial;
    private String monthName;

    Prayer fajr;
    Prayer sunrise;
    Prayer dhuhar;
    Prayer asr;
    Prayer sunset;
    Prayer maghrib;
    Prayer isha;

    public PrayerTime(double latitude, double longitude, String javaZoneName, String calculationMethod, String juristic){
        this.latitude = latitude;
        this.longitude = longitude;
        this.javZoneName = javaZoneName;
        this.calculationMethod = (calculationMethod == null) ? this.calculationMethod : calculationMethod;
        config = new DefaultConfig(this.calculationMethod, null);
        defaultTime = dayPortions();
        this.juristicMethod = ("HANAFII".equals(juristic)) ? 1 : 0;

        julianDate = createJulianDate() - (longitude / (15.0 * 24.0));

        init();
    }

    public void setJuristicMethod(String juristicMethod){
        this.juristicMethod = ("HANAFII".equals(juristicMethod)) ? 1 : 0;
    }

    public void updateCalculation(int currentDay, String calculationMethod, String juristic){
        this.currentDay = currentDay;
    	this.calculationMethod = (calculationMethod == null) ? this.calculationMethod : calculationMethod;
        config.setCalculationMethod(this.calculationMethod);
        defaultTime = dayPortions();
        this.juristicMethod = ("HANAFII".equals(juristic)) ? 1 : 0;

        julianDate = createJulianDate() - (longitude / (15.0 * 24.0));

        init();
    }

    public double getJulianDate(){
        return julianDate;
    }

    private double createJulianDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone(javZoneName));
        calendar.add(Calendar.DAY_OF_MONTH, currentDay);

        int year = calendar.get(Calendar.YEAR);
        int month= calendar.get(Calendar.MONTH) + 1;
        day =  calendar.get(Calendar.DAY_OF_MONTH);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'");
        format.setTimeZone(TimeZone.getTimeZone(javZoneName));
        datePartial = format.format(calendar.getTime());
        format = new SimpleDateFormat("Z");
        format.setTimeZone(TimeZone.getTimeZone(javZoneName));
        zonePartial = format.format(calendar.getTime());
        format = new SimpleDateFormat("MMM");
        format.setTimeZone(TimeZone.getTimeZone(javZoneName));
        monthName = format.format(calendar.getTime());
        zone = (calendar.get(Calendar.ZONE_OFFSET) + calendar.get(Calendar.DST_OFFSET)) / (60 * 60 * 1000);

        if(month <= 2){
            year -= 1;
            month += 12;
        }
        double A = Math.floor(year / 100.0);
        double B = 2 - A + Math.floor(A / 4.0);

        return Math.floor(365.25 * (year + 4716 )) + Math.floor(30.6001 * (month + 1)) + day + B - 1524.5;
    }

    private double computeTime(double angle, double t){
        double D = sunPosition(julianDate + t, true);

        double Z = computeMidDay(t);

        double b = -MathUtil.degreeSin(angle) - MathUtil.degreeSin(D) * MathUtil.degreeSin(latitude);

        double mid = MathUtil.degreeCos(D) * MathUtil.degreeCos(latitude);

        double V = MathUtil.degreeArcCos(b/mid)/15;
        return Z + (angle > 90 ? -V : V);
    }


    /**
     *
     * @param jd - Julian Date
     * @param sunDeclination - true=declination false=equationOfTime
     * @return
     */
    private double sunPosition(double jd, boolean sunDeclination){
        double D = jd - 2451545;
        double g = fixAngle(357.529 + 0.98560028 * D);
        double q = fixAngle(280.459 + 0.98564736 * D);
        double L = fixAngle(q + (1.915 * MathUtil.degreeSin(g)) + (0.020 * MathUtil.degreeSin(2 * g)));

        double e = 23.439 - (0.00000036 * D);
        double d = MathUtil.degreeArcSin(MathUtil.degreeSin(e) * MathUtil.degreeSin(L));
        double RA= (MathUtil.degreeArcTan2((MathUtil.degreeCos(e) * MathUtil.degreeSin(L)), (MathUtil.degreeCos(L)))) / 15.0;
        RA = MathUtil.fixHour(RA);
        double EqT = q / 15.0 - RA;
        return (sunDeclination) ? d : EqT;
    }

    private double computeMidDay(double t){
        double T = sunPosition(getJulianDate() + t, false);
        return MathUtil.fixHour(12 - T);
    }

    private double computerAsr(double step, double t){
        double D = sunPosition(getJulianDate() + t, true);
        double G = -MathUtil.degreeCot(step + MathUtil.degreeTan(Math.abs(latitude - D)));
        return computeTime(G, t);
    }


    private double fixAngle(double a){
        a = a - (360 * (Math.floor( a /360.0)));
        return a < 0 ? (a + 360) : a;
    }

    private double[] dayPortions(){
        for(int i = 0; i < 7; i++){
            defaultTime[i] /= 24;
        }
        return defaultTime;
    }

    /**
     * Currently only angle based
     * @param angle
     * @return
     */
    private double nightPortion(double angle){
        return angle / 60.0;
    }


    /**
     * fajr    0
     * sunrise 1
     * dhuhar  2
     * asr     3
     * sunset  4
     * maghrib 5
     * isha    6
     * @param adjust
     */

    private void adjustHighLatTimes(boolean adjust){
        if (adjust) {
            double nightTime = MathUtil.timeDifference(sunset.getTime(), sunrise.getTime());

            //Adjust Fajr
            double fajrDiff = nightPortion(config.getFajrAngle()) * nightTime;
            if(Double.isNaN(fajr.getTime()) || MathUtil.timeDifference(fajr.getTime(), sunrise.getTime()) > fajrDiff){
                fajr.setTime(sunrise.getTime() - fajrDiff);
            }

            //Adjust Isha
            double ishaAngle = config.getIshaOffset() == 0 ? config.getIshaAngle() : 18;
            double ishaDiff = nightPortion(ishaAngle) * nightTime;
            if(Double.isNaN(isha.getTime()) || MathUtil.timeDifference(sunset.getTime(), isha.getTime()) > ishaDiff){
                isha.setTime(sunset.getTime() + ishaDiff);
            }

            //Adjust Maghrib
            double maghribAngle = config.getMaghribOffset() == 0 ? config.getMaghribAngle() : 4;
            double maghribDiff = nightPortion(maghribAngle) * nightTime;
            if(Double.isNaN(maghrib.getTime()) || MathUtil.timeDifference(sunset.getTime(), maghrib.getTime())  > maghribDiff){
                maghrib.setTime(sunset.getTime() + maghribDiff);
            }
        }
    }

    public void init(){
        double time = computeTime(180 - config.getFajrAngle(), defaultTime[0]);
        time += zone - longitude / 15;
        fajr = new Prayer();
        fajr.setName("Fajr");
        fajr.setArName("\u0627\u0644\u0641\u062C\u0631");
        fajr.setTime(time);

        time = computeTime(180 - 0.833, defaultTime[1]);
        time += zone - longitude / 15;
        sunrise = new Prayer();
        sunrise.setName("Sunrise");
        sunrise.setArName("\u0634\u0631\u0648\u0642 \u0627\u0644\u0634\u0645\u0633");
        sunrise.setTime(time);

        time = computeMidDay(defaultTime[2]);
        time += zone - longitude / 15;
        dhuhar = new Prayer();
        dhuhar.setName("Dhuhr");
        dhuhar.setArName("\u0627\u0644\u0638\u0647\u0631");
        dhuhar.setTime(time);

        time = computerAsr(1 + juristicMethod, defaultTime[3]);;
        time += zone - longitude / 15;
        asr = new Prayer();
        asr.setName("Asr");
        asr.setArName("\u0627\u0644\u0639\u0635\u0631");
        asr.setTime(time);

        time = computeTime(0.833, defaultTime[4]);
        time += zone - longitude / 15;
        sunset = new Prayer();
        sunset.setName("Sunset");
        sunset.setArName("\u0627\u0644\u063A\u0631\u0648\u0628");
        sunset.setTime(time);

        time = computeTime(config.getMaghribAngle(), defaultTime[5]);
        time += zone - longitude / 15;
        if(config.getMaghribOffset() == 1) {
            time = sunset.getTime() + config.getMaghribOffset() / 60;
        }
        maghrib = new Prayer();
        maghrib.setName("Maghrib");
        maghrib.setArName("\u0627\u0644\u0645\u063A\u0631\u0628");
        maghrib.setTime(time);

        time = computeTime(config.getIshaAngle(), defaultTime[6]);
        time += zone - longitude / 15;
        if(config.getIshaOffset() == 1){
            time = maghrib.getTime() + config.getIshaAngle() / 60;
        }
        isha = new Prayer();
        isha.setName("Isha");
        isha.setArName("\u0627\u0644\u0639\u0634\u0627\u0621");
        isha.setTime(time);

        adjustHighLatTimes(true);
    }



    /**
     * default time 5
     * @return
     */
    public Prayer getFajr(){
        return fajr;
    }

    public Prayer getSunrise(){
        return sunrise;
    }

    public Prayer getDhuhr(){
        return dhuhar;
    }

    public Prayer getAsr(){
        return asr;
    }

    public Prayer getSunset(){
        return sunset;
    }

    public Prayer getMaghrib(){
        return maghrib;
    }

    public Prayer getIsha(){
        return isha;
    }

    public int getZone(){
        return zone;
    }
    
    public int getDay(){
    	return day;
    }
    
    public String getMonthName(){
    	return monthName;
    }

    public String getISODate(String time){
        return datePartial + time + ":00" + zonePartial;
    }
    
    public List<Prayer> getPrayerList(){
    	List<Prayer> list = new ArrayList<Prayer>();
    	list.add(fajr);
    	list.add(sunrise);
    	list.add(dhuhar);
    	list.add(asr);
    	list.add(sunset);
    	list.add(maghrib);
    	list.add(isha);
    	return list;
    }

    public static void main(String[] args){
        PrayerTime prayerTime = new PrayerTime(31.4187142, 73.07910730000003,"Asia/Karachi", "MAKKAH", "HANAFII");
        prayerTime.updateCalculation(1, "ISNA", "SHAFII");
        System.out.println(prayerTime.getFajr());
        System.out.println(prayerTime.getSunrise());
        System.out.println(prayerTime.getDhuhr());
        System.out.println(prayerTime.getAsr());
        System.out.println(prayerTime.getSunset());
        System.out.println(prayerTime.getMaghrib());
        System.out.println(prayerTime.getIsha());
        System.out.println(prayerTime.getISODate(prayerTime.getFajr().getTimeString24()));
    }
}
