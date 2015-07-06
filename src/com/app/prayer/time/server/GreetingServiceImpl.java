package com.app.prayer.time.server;

import java.util.Calendar;
import java.util.TimeZone;

import com.app.prayer.time.client.GreetingService;
import com.app.prayer.time.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	public String greetServer(String input) throws IllegalArgumentException {
		// Verify that the input is valid. 
		if (!FieldVerifier.isValidName(input)) {
			// If the input is not valid, throw an IllegalArgumentException back to
			// the client.
			throw new IllegalArgumentException(
					"Name must be at least 4 characters long");
		}

		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");
		System.out.println(userAgent);

		// Escape data from the client to avoid cross-site script vulnerabilities.
		input = escapeHtml(input);
		userAgent = escapeHtml(userAgent);

		return "Hello, " + input + "!<br><br>I am running " + serverInfo
				+ ".<br><br>It looks like you are using:<br>" + userAgent;
	}

	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}

	public String geocodeTimeZone(double lat, double lon)
			throws IllegalArgumentException {
		Calendar cal = Calendar.getInstance();
	    String zone = com.app.timezone.TimeZoneMapper.getZoneName(lat, lon);
		
	    if(!"unknown".equals(zone)){
		    cal.setTimeZone(TimeZone.getTimeZone(zone));
	    }else{
	    	return "-1000";
	    }
	    int y = cal.get(Calendar.YEAR);
	    int m = cal.get(Calendar.MONTH) +1;
	    int d = cal.get(Calendar.DAY_OF_MONTH);
	    
	    //cal.setTime(date);
	    cal.add(Calendar.DAY_OF_MONTH, 0);
        int zone_id = (cal.get(Calendar.ZONE_OFFSET) + cal.get(Calendar.DST_OFFSET)) / (60 * 60 * 1000);
		return m + "," + d +"," + y + ","+ zone_id;
	}
}
