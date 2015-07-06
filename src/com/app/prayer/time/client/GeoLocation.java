package com.app.prayer.time.client;

import com.google.gwt.core.client.JavaScriptObject;

public class GeoLocation {
	private JavaScriptObject a;
	private double latitude = -1;
	private double longitude = -1;
	private boolean isValid;
	
	public GeoLocation(JavaScriptObject o){
		a = o;
		process();
	}
	public GeoLocation(){}
	
	public boolean isValidLocation(){
		return isValid;
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
	
	public void parse_1(String s){
		try{
			if(s != null && s.length() > 2){
				String s1[] = s.split(",");
				latitude = Double.parseDouble(s1[0]);
				longitude = Double.parseDouble(s1[1]);
				isValid = true;
			}else{
				
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
	
	public double getLatitude(){
		return latitude;
	}
	
	public double getLongitude(){
		return longitude;
	}
}