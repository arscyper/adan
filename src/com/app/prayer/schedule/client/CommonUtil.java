package com.app.prayer.schedule.client;
import java.util.ArrayList;
import java.util.Date;

import com.app.prayer.schedule.client.PrayTime;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.user.datepicker.client.CalendarUtil;

public class CommonUtil{
	public static ArrayList<String> s;
	public static ArrayList<String> print(double latitude, double longitude, PrayTime prayers, int i){

	    /**
	     * final Date dueDate = new Date();
		 * CalendarUtil.addDaysToDate(dueDate, 21);
	     */
	    
	    int time[] = getTimeInfo(i);
	    ArrayList<String> prayerTimes = prayers.getPrayerTimes(time[0], time[1], time[2],
	            latitude, longitude, time[3]);
	    //ArrayList<String> prayerNames = prayers.getTimeNames();
	    s = prayers.getTimeNames();
	    return prayerTimes;
	}
	
	public static int[] getTimeInfo(int i){
		int[] t = new int[4];
		try{
			Date now = new Date();
			CalendarUtil.addDaysToDate(now, i);
			DateTimeFormat fmt = DateTimeFormat.getFormat("yyyy/MM/dd/Z");
			String s[] = fmt.format(now).split("/");
	        
	        t[0] = Integer.parseInt(s[0]);
	        t[1] = Integer.parseInt(s[1]);
	        t[2] = Integer.parseInt(s[2]);
	        t[3] = getZone(s);
	        GWT.log(""+t[3]);
		}catch(Exception e){
			e.printStackTrace();
		}
		return t;
	}
	
	public static int getZone(String[] s){
		int timezone;
        if(s[3].startsWith("-")){
        	if(s[3].charAt(1) == '0'){
        		timezone = Integer.valueOf(Character.toString(s[3].charAt(2))) * -1;
        	}else{
        		timezone = Integer.valueOf(s[3].substring(0, 3));
        	}
        }else if(s[3].startsWith("+")){
        	if(s[3].substring(1).startsWith("0")){
        		timezone = Integer.valueOf(Character.toString(s[3].charAt(2)));
        	}else{
        		timezone = Integer.valueOf(s[3].substring(1, 3));
        	}
        }else{
        	if(s[3].startsWith("0")){
        		timezone = Integer.valueOf(Character.toString(s[3].charAt(1)));
        	}else{
        		timezone = Integer.valueOf(s[3].substring(0, 2));
        	}
        }
        return timezone;
    }
}