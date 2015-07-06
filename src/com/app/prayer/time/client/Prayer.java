package com.app.prayer.time.client;

import java.util.ArrayList;
import java.util.Date;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Element;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.rpc.AsyncCallback;
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Prayer implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private static final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);
	
	private static int zone_id = -1000;
	private static int month;
	private static int year;
	private static int day;
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		publish();
	}
	
	  // Set up the JS-callable signature as a global JS function.
	  private static native void publish() /*-{
	    $wnd.prayer_print = 
	      @com.app.prayer.time.client.Prayer::print(Lcom/google/gwt/core/client/JavaScriptObject;);
	    $wnd.prayer_print1 = 
	      @com.app.prayer.time.client.Prayer::print(Ljava/lang/String;);  
	  }-*/;
	  
	  public static JsArrayString printlatlng(){
		  Element sub = DOM.getElementById("default-location");
		  if(sub != null){
			 String[] l = sub.getAttribute("content").split(",");
			 if(l.length == 5){
				 JsArrayString jsArrayString = createEmptyJsArrayString();
				 jsArrayString.push(l[3]);
				 jsArrayString.push(l[4]);
				 return jsArrayString;
			 }
		  }
		  return null;
	  }
	  
	  public static JsArrayString print(String o){
		  
		  GeoLocation g = GeoLocation.parse1(o);
		  JsArrayString jsArrayString = createEmptyJsArrayString();
	  	  ArrayList<String> input = print(g.getLatitude(), g.getLongitude());
	  	  for (String s : input) {
	  		  jsArrayString.push(s);
	  	  }
	  	  jsArrayString.push(nextTime(input) +"");
	  	  return jsArrayString;
	  }
	  
	  public static JsArrayString print(JavaScriptObject o){
		  GeoLocation g = new GeoLocation(o);
		  JsArrayString jsArrayString = createEmptyJsArrayString();
		  ArrayList<String> input = print(g.getLatitude(), g.getLongitude());
			for (String s : input) {
			    jsArrayString.push(s);
			}
			jsArrayString.push(nextTime(input) +"");
			return jsArrayString; 
	  }
	  //0,2,3,5,6
	  public static int nextTime(ArrayList<String> input){
		  int res = -1;
		  Date d = new Date(); 
		  DateTimeFormat fmt = DateTimeFormat.getFormat("hh:mm a");
		  int i = 0;
		  for(String s: input){
			  if(i != 1 && i != 4){
				  if(d.before(fmt.parse(s))){
					 return i; 
				  }
			  }
			  i++;
		  }
		  return res;
	  }
	  
	  private static native JsArrayString createEmptyJsArrayString() /*-{
    	return [];
  	  }-*/;
	  
	public static ArrayList<String> print(double latitude, double longitude){

	    PrayTime prayers = new PrayTime();
	    
	    prayers.setTimeFormat(prayers.Time12);
	    prayers.setCalcMethod(prayers.ISNA);
	    prayers.setAsrJuristic(prayers.Shafii);
	    prayers.setAdjustHighLats(prayers.AngleBased);
	    int[] offsets = {0, 0, 0, 0, 0, 0, 0}; // {Fajr,Sunrise,Dhuhr,Asr,Sunset,Maghrib,Isha}
	    prayers.tune(offsets);    
	    greetingService.geocodeTimeZone(latitude, longitude, new AsyncCallback<String>() {
							public void onFailure(Throwable caught) {
								
							}
							public void onSuccess(String result) {
								String[] a = result.split(",");
								month = Integer.parseInt(a[0]);
								day = Integer.parseInt(a[1]);
								year= Integer.parseInt(a[2]);
								zone_id = Integer.parseInt(a[3]);
							}
						});
	    
	    if(zone_id == -1000){
	    	int time[] = getTimeInfo();
	    	year = time[0];
	    	month = time[1];
	    	day = time[2];
	    	zone_id = time[3];
	    }
	    
	    
	    ArrayList<String> prayerTimes = prayers.getPrayerTimes(year, month, day,
	            latitude, longitude, zone_id);
	    //ArrayList<String> prayerNames = prayers.getTimeNames();
	    return prayerTimes;
	}
	  	
	public static int[] getTimeInfo(){
		int[] t = new int[4];
		try{
			Date now = new Date(); 
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