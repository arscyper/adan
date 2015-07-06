package com.app.util;

/**
 * Created by AR001AF on 11/19/2014.
 */
public class MathUtil {

    public static double degreeSin(double d){
        return Math.sin((d * Math.PI) / 180);
    }

    public static double degreeCos(double d){
        return Math.cos((d * Math.PI) / 180);
    }

    public static double degreeTan(double d){
        return Math.tan((d * Math.PI) / 180);
    }

    public static double degreeArcSin(double d){
        return (Math.asin(d) * 180) / Math.PI;
    }

    public static double degreeArcCos(double d){
        return ((Math.acos(d) * 180) / Math.PI);
    }

    public static double degreeArcTan(double d){
        return (Math.atan(d) * 180) / Math.PI;
    }

    public static double degreeArcTan2(double y, double x){
        return (Math.atan2(y, x) * 180) / Math.PI;
    }

    public static double degreeCot(double x){
        return (Math.atan2(1.0, x) * 180) / Math.PI;
    }

    public static double timeDifference(double time1, double time2){
        return fixHour(time2 - time1);
    }

    public static double fixHour(double a){
        a = a - 24.0 * Math.floor(a / 24.0);
        return a < 0 ? (a + 24) : a;
    }

    public static String getTime12(double time){
        if(Double.isNaN(time)){
            return "---";
        }
        time = fixHour(time + 0.5 / 60);
        int hours = (int)Math.floor(time);
        double minutes = Math.floor((time - hours) * 60);

        hours = ((((hours + 12) -1) % (12)) + 1);

        String result,suffix="";
        boolean noSuffix = true;

        if (noSuffix == false) {
            if ((hours >= 0 && hours <= 9) && (minutes >= 0 && minutes <= 9)) {
                result = "0" + hours + ":0" + Math.round(minutes) + " "
                        + suffix;
            } else if ((hours >= 0 && hours <= 9)) {
                result = "0" + hours + ":" + Math.round(minutes) + " " + suffix;
            } else if ((minutes >= 0 && minutes <= 9)) {
                result = hours + ":0" + Math.round(minutes) + " " + suffix;
            } else {
                result = hours + ":" + Math.round(minutes) + " " + suffix;
            }

        } else {
            if ((hours >= 0 && hours <= 9) && (minutes >= 0 && minutes <= 9)) {
                result = "0" + hours + ":0" + Math.round(minutes);
            } else if ((hours >= 0 && hours <= 9)) {
                result = "0" + hours + ":" + Math.round(minutes);
            } else if ((minutes >= 0 && minutes <= 9)) {
                result = hours + ":0" + Math.round(minutes);
            } else {
                result = hours + ":" + Math.round(minutes);
            }
        }
        return result;
    }

    public static String getTime24(double time){
        String result;
        if(Double.isNaN(time)){
            return "---";
        }

        time = MathUtil.fixHour(time + 0.5 / 60.0);
        int hours = (int)Math.floor(time);
        double minutes = Math.floor((time - hours) * 60);
        if ((hours >= 0 && hours <= 9) && (minutes >= 0 && minutes <= 9)) {
            result = "0" + hours + ":0" + Math.round(minutes);
        } else if ((hours >= 0 && hours <= 9)) {
            result = "0" + hours + ":" + Math.round(minutes);
        } else if ((minutes >= 0 && minutes <= 9)) {
            result = hours + ":0" + Math.round(minutes);
        } else {
            result = hours + ":" + Math.round(minutes);
        }
        return result;
    }
}
