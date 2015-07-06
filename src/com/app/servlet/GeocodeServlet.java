package com.app.servlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class GeocodeServlet extends HttpServlet {
	private static final Logger log = Logger.getLogger(GeocodeServlet.class.getName());
	private String ADMIN_KEY = "_adk";
	private String ADMIN_VALUE = "QXJzbGFuIEFmemFs";
	private String ADMIN_VALUE1 = "QXJzbGFuIEFmemFs1";

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String key = request.getParameter(ADMIN_KEY);
		String city = request.getParameter(Location.city.toString());
		String state = request.getParameter(Location.state.toString());
		String country = request.getParameter(Location.country.toString());
		String location = request.getParameter(Location.location.toString());
		if (key != null && key.equals(ADMIN_VALUE)) {
			save(request, response);
		} else if (key != null && key.equals(ADMIN_VALUE1)) {
			Util.get(request, response, city, state, country, location);
		} else {
			response.getWriter().write("The end of internet.");
		}
	}

	private boolean isValidLocation(String location)
			throws IllegalArgumentException {
		try {
			String[] s = location.split(",");
			for (String a : s) {
				Double.parseDouble(a);
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("invalid parameter!");
		}
		return true;
	}

	private void save(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String city = Util.cleanKey(request.getParameter(Location.city.toString()));
		String state = Util.cleanKey(request.getParameter(Location.state.toString()));
		String country = Util.cleanKey(request.getParameter(Location.country.toString()));
		String location = Util.cleanKey(request.getParameter(Location.location.toString()));
		String short_country = request.getParameter(Location.short_country.toString());
		String zone_name = Util.cleanZone(request.getParameter(Location.timezone.toString()));
		log.log(Level.INFO, "zone_name=" + zone_name + "," + Util.encode(zone_name));
		String key = city + "-" + state + "-" + country;
		key = URLEncoder.encode(key,"UTF-8");
		log.log(Level.INFO, key);
		short_country = (short_country == null) ? Util.short_country.get(country) : short_country;
		isValidLocation(location);
		Entity entity = new Entity("Location", key);

		entity.setProperty(Location.city.toString(), city);
		entity.setProperty(Location.state.toString(), state);
		entity.setProperty(Location.country.toString(), country);
		entity.setProperty(Location.short_country.toString(), short_country);
		entity.setProperty(Location.location.toString(), location);
		entity.setProperty(Location.timezone.toString(), Util.encode(zone_name));
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		datastore.put(entity);

		response.setContentType("text/plain");
		response.getWriter().println("Saved data");
	}
	
}
