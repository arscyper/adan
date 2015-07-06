package com.app.cons;

import com.app.servlet.Util;

public class LocationDto {
	
	public LocationDto(){
		
	}
	
	public LocationDto(String location, String city, String state,
			String country, String short_country, String key, String zone_name) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.short_country = short_country;
		this.key = key;
		this.zone_name = zone_name;
		setLocation(location);
	}
	String location;
	String city;
	String state;
	String country;
	String short_country;
	String key;
	double latitude;
	double longitude;
	String zone_name;
	
	public void setPlace(String s){
		String[] s1 = s.split(",");
		for(int j = 0; j <= s1.length -1; j++){
			String fragment = s1[j];
			if(fragment.trim().length() > 0){
				if(j == 0){
					city = fragment.trim();
				}else if(j == 1){
					state = fragment.trim();
				}else if(j == 2){
					country = fragment.trim();
				}
			}
		}
	}
	
	public boolean isValidPlace(){
		return (city != null && state != null && country != null 
				&& city.length() > 0 && state.length() > 0 && country.length() > 0);
	}
	
	public void setZoneName(String zone_name){
		//decode?
		this.zone_name = zone_name;
	}
	
	public String getZoneName(){
		return zone_name;
	}
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public void setKey(String key){
		this.key = key;
	}
	public String getKey(){
		return key;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
		try{
			String[] l = location.split(",");
			latitude = Double.valueOf(l[0]);
			longitude= Double.valueOf(l[1]);
		}catch(Exception e){
			
		}
	}
	
	public boolean isValidLocation(){
		return latitude != 0 && longitude != 0;
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
	public String getShort_country() {
		if(short_country == null && country != null){
			short_country = Util.short_country.get(country.toLowerCase());
		}
		return short_country;
	}
	public void setShort_country(String short_country) {
		this.short_country = short_country;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LocationDto [location=");
		builder.append(location);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", country=");
		builder.append(country);
		builder.append(", short_country=");
		builder.append(short_country);
		builder.append(", key=");
		builder.append(key);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append(", zone_name=");
		builder.append(zone_name);
		builder.append("]");
		return builder.toString();
	}
}
