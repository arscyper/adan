package com.app.servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class TimeZoneServlet extends HttpServlet {
	//private static final Logger log = Logger.getLogger(TimeZoneServlet.class.getName());


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String lat = request.getParameter("lat");
		String lng = request.getParameter("lng");

		String res = "";
		try{
			Calendar cal = Calendar.getInstance();
		    String zone = com.app.timezone.TimeZoneMapper.getZoneName(Double.valueOf(lat), Double.valueOf(lng));
			
		    if(!"unknown".equals(zone)){
			    cal.setTimeZone(TimeZone.getTimeZone(zone));
			    
			    int y = cal.get(Calendar.YEAR);
			    int m = cal.get(Calendar.MONTH) +1;
			    int d = cal.get(Calendar.DAY_OF_MONTH);
			    
			    //cal.setTime(date);
			    cal.add(Calendar.DAY_OF_MONTH, 0);
		        int zone_id = (cal.get(Calendar.ZONE_OFFSET) + cal.get(Calendar.DST_OFFSET)) / (60 * 60 * 1000);
		        
		        
		        res = "{\"month\":" + m + ",\"day\":" + d + ",\"year\":" + y + ",\"zone\":" + zone_id + ",\"status\":\"OK\"}";
		        
		    }else{
		    	res = "{\"status\":\"ERROR\"}";
		    }

		}catch(Exception e) {
			res = "{\"status\":\"ERROR\"}";
		}
		response.setContentType("application/json; charset=utf-8");
		response.getWriter().println(res);
	}


	
}
