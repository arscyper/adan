/**
 * 
 */
package com.app.prayer.schedule.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author arslan
 *
 */
@RemoteServiceRelativePath("geocode")
public interface GeocodeService extends RemoteService {
	String geocode(String city) throws IllegalArgumentException;
	String geocode(String city, String state, String country) throws IllegalArgumentException;
}
