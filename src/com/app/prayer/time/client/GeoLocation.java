package com.app.prayer.time.client;

import com.google.gwt.core.client.JavaScriptObject;

public class GeoLocation {
	private JavaScriptObject a;
	private double latitude = 0;
	private double longitude = 0;
	
	public GeoLocation(JavaScriptObject o){
		a = o;
		process();
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
	
	public double getLatitude(){
		return latitude;
	}
	
	public double getLongitude(){
		return longitude;
	}
}