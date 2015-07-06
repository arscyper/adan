package com.app.prayer.schedule.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;

public class GeoLocation {
	private JavaScriptObject a;
	private double latitude = 0;
	private double longitude = 0;
	private boolean isValid;
	
	public GeoLocation(JavaScriptObject o){
		a = o;
		process();
	}
	
	public GeoLocation(){
		
	}
	
	public void parse_1(String s){
		try{
			if(s != null && s.length() > 2){
				String s1[] = s.split(",");
				latitude = Double.parseDouble(s1[0]);
				longitude = Double.parseDouble(s1[1]);
				isValid = true;
			}
		}catch(Exception e){
			isValid = false;
		}
	}
	
	public static GeoLocation parse1(String s){
		GeoLocation g = new GeoLocation();
		g.parse_1(s);
		return g;
	}
	
	public void parse_2(String text){
		try{
			JSONLocation j = JsonUtils.safeEval(text);
			if(j != null){
				if(j.getLoc() != null){
					parse_1(j.getLoc());
				}
			}
		}catch(Exception e){
			
		}
  	}
	public static GeoLocation parse2(String s){
		GeoLocation g = new GeoLocation();
		g.parse_2(s);
		return g;
	}
	
	public void parseIPInfo(String text){
		try{
			int start = text.indexOf("<pre>");
			int end = text.indexOf("</pre>");
			String text1 = text.substring(start, end);
			String text2 = text1.substring(text1.indexOf("{"), text1.indexOf("}"));
			text2 = text2.replaceAll("&quot;", "\"") + "}";
			
			parse_2(text2);
		}catch(Exception e){
			
		}
	}
	
	public void process(){
		String s = a.toString();
		if(s != null && s.length() > 2){
			s = s.substring(1, s.length()-1);
			String s1[] = s.split(",");
			latitude = Double.parseDouble(s1[0]);
			longitude = Double.parseDouble(s1[1]);
		}
	}
	
	public boolean isValidLocation(){
		return isValid;
	}
	
	
	public double getLatitude(){
		return latitude;
	}
	
	public double getLongitude(){
		return longitude;
	}
	
	public static class JSONLocation extends JavaScriptObject{
		protected JSONLocation(){}
		public final native String getIp() /*-{ 
	    	return this.ip;
	  	}-*/;
		public final native String getLoc() /*-{ 
    		return this.loc;
  		}-*/;
		public final native String getCity() /*-{ 
			return this.city;
		}-*/;
		public final native String getRegion() /*-{ 
			return this.region;
		}-*/;
		public final native String getCountry() /*-{ 
		return this.country;
		}-*/;
		public final native String getPostal() /*-{ 
		return this.postal;
		}-*/;
	}

}
