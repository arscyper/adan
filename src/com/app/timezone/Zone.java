package com.app.timezone;

import java.util.List;

public class Zone {
	private String tz;
	private List<List<Double>> polygon;
	
	public String getName() {
		return tz;
	}
	public void setName(String tz) {
		this.tz = tz;
	}
	public List<List<Double>> getMap() {
		return polygon;
	}
	public void setMap(List<List<Double>> polygon) {
		this.polygon = polygon;
	}
}
