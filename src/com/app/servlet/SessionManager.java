package com.app.servlet;

import java.util.Arrays;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionManager {
	HttpServletRequest request;
	HttpServletResponse response;
	boolean isLocationSet = false;
	String U_LOCATION = "_ULOCATION";
	
	String city = "";
	String state = "";
	String country = "";
	String latitude = "";
	String longitude = "";
	public SessionManager(HttpServletRequest request, HttpServletResponse response){
		this.request = request;
		this.response = response;
		System.out.println("--------------");
    }
	
	public void setLocationInfo(String city, String state, String country, String location){
		this.city = cleanString(city);
		this.state = cleanString(state);
		this.country = cleanString(country); 
		setLatLong(location);
		check();
	}
	
	private void setLatLong(String location){
		try{
			String[] a = location.split(","); 
			this.latitude = cleanString(a[0]);
			this.longitude = cleanString(a[1]);
			
		}catch(Exception e){
			
		}
	}
	
	private void setLocationCookie(){
		String location = city + "=" + state + "=" + country + "=" + latitude + "=" + longitude;
		
		
		Cookie cookie = new Cookie(U_LOCATION, location);
		cookie.setMaxAge(10 * 365 * 24 * 60 * 60); 
		response.addCookie(cookie);
	}
	
	public void check(){
		try{
			Cookie[] cookies = request.getCookies();
			if(cookies != null){
				for(Cookie c:cookies){
					System.out.println(c.getName());
					if(U_LOCATION.equals(c.getName()) && c.getMaxAge() > 0){
						setLocation(c.getValue(), c);
					}else{
						setLocationCookie();
					}
				}
			}else{
				setLocationCookie();
				System.out.println("Something is wrong!");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
    }
	
	public void setLocation(String cookie, Cookie c){
		try{
			String[] val = cookie.split(";");
			setCity(val[0]);
			setState(val[1]);
			setCountry(val[2]);
			setLatitude(val[3]);
			setLongitude(val[4]);
			System.out.println(Arrays.asList(val));
		}catch(Exception e){
			String location = city + ";" + state + ";" + country + ";" + latitude + ";" + longitude;
			c.setValue(location);
			response.addCookie(c);
		}
	}
	
	public String cleanString(String s){
		return s = (s == null) ? "": s;
 	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Double getLatitude() {
		return Double.valueOf(latitude);
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return Double.valueOf(longitude);
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
