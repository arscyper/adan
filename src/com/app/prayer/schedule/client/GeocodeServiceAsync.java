package com.app.prayer.schedule.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GeocodeServiceAsync {
	void geocode(String city, AsyncCallback<String> callback) 
			throws IllegalArgumentException;

	void geocode(String city, String state, String country,
			AsyncCallback<String> callback) throws IllegalArgumentException;
}
