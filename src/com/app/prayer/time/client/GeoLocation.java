package com.app.prayer.time.client;

import com.google.gwt.core.client.JavaScriptObject;

public class GeoLocation {
	private JavaScriptObject a;
	private double latitude = -1;
	private double longitude = -1;
	private boolean isValid;
	private int m;
	private int d;
	private int y;
	private int z;
	
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
	
	public void parse_2(String s) {
		try{
			if(s != null && s.length() > 2){
				String s1[] = s.split(",");
				latitude = Double.parseDouble(s1[0]);
				longitude = Double.parseDouble(s1[1]);
				m = Integer.parseInt(s1[2]);
				d = Integer.parseInt(s1[3]);
				y = Integer.parseInt(s1[4]);
				z = Integer.parseInt(s1[5]);
				isValid = true;
			}else{
				
			}
		}catch(Exception e){
			isValid = false;
		}
	}
	
	public static GeoLocation parse2(String s){
		GeoLocation g = new GeoLocation();
		g.parse_2(s);
		return g;
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
	public int getM() {
		return m;
	}
	public int getD() {
		return d;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
}