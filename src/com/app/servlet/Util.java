package com.app.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.cons.LocationDto;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class Util {
	private final static String base64chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
	private static final Logger log = Logger.getLogger(Util.class.getName());
	
	public static final Map<String, String> states = new HashMap<String, String>();
	static{
		states.put("Alabama","AL");
		states.put("Alabama","AL");
		states.put("Alaska","AK");
		states.put("Alberta","AB");
		states.put("American Samoa","AS");
		states.put("Arizona","AZ");
		states.put("Arkansas","AR");
		states.put("Armed Forces (AE)","AE");
		states.put("Armed Forces Americas","AA");
		states.put("Armed Forces Pacific","AP");
		states.put("British Columbia","BC");
		states.put("California","CA");
		states.put("Colorado","CO");
		states.put("Connecticut","CT");
		states.put("Delaware","DE");
		states.put("District Of Columbia","DC");
		states.put("Florida","FL");
		states.put("Georgia","GA");
		states.put("Guam","GU");
		states.put("Hawaii","HI");
		states.put("Idaho","ID");
		states.put("Illinois","IL");
		states.put("Indiana","IN");
		states.put("Iowa","IA");
		states.put("Kansas","KS");
		states.put("Kentucky","KY");
		states.put("Louisiana","LA");
		states.put("Maine","ME");
		states.put("Manitoba","MB");
		states.put("Maryland","MD");
		states.put("Massachusetts","MA");
		states.put("Michigan","MI");
		states.put("Minnesota","MN");
		states.put("Mississippi","MS");
		states.put("Missouri","MO");
		states.put("Montana","MT");
		states.put("Nebraska","NE");
		states.put("Nevada","NV");
		states.put("New Brunswick","NB");
		states.put("New Hampshire","NH");
		states.put("New Jersey","NJ");
		states.put("New Mexico","NM");
		states.put("New York","NY");
		states.put("Newfoundland","NF");
		states.put("North Carolina","NC");
		states.put("North Dakota","ND");
		states.put("Northwest Territories","NT");
		states.put("Nova Scotia","NS");
		states.put("Nunavut","NU");
		states.put("Ohio","OH");
		states.put("Oklahoma","OK");
		states.put("Ontario","ON");
		states.put("Oregon","OR");
		states.put("Pennsylvania","PA");
		states.put("Prince Edward Island","PE");
		states.put("Puerto Rico","PR");
		states.put("Quebec","PQ");
		states.put("Rhode Island","RI");
		states.put("Saskatchewan","SK");
		states.put("South Carolina","SC");
		states.put("South Dakota","SD");
		states.put("Tennessee","TN");
		states.put("Texas","TX");
		states.put("Utah","UT");
		states.put("Vermont","VT");
		states.put("Virgin Islands","VI");
		states.put("Virginia","VA");
		states.put("Washington","WA");
		states.put("West Virginia","WV");
		states.put("Wisconsin","WI");
		states.put("Wyoming","WY");
		states.put("Yukon Territory","YT");
	};
	
	public static int DEV_MODE = -1; // 0 local, 1 with ip, 2 PROD
	public static String version = "1-2";
	
	public static HashMap<String, String> PROPERTIES = new HashMap<String, String>(){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			if (DEV_MODE == -1) {
				put("SITE_JS", "http://1-2-dot-islamicsalat.appspot.com/js/site1.min.js");
				put("PRAYER_JS", "http://1-2-dot-islamicsalat.appspot.com/prayer/prayer.nocache.js");
			    put("SCHEDULE_JS", "http://1-2-dot-islamicsalat.appspot.com/schedule/schedule.nocache.js");
			    put("SITE_JS", "//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/site-"+ version +".min.js");
			}else if(DEV_MODE == 0) {
				put("SITE_JS", "http://localhost:8888/js/site1.min.js");
				put("PRAYER_JS", "http://localhost:8888/prayer/prayer.nocache.js");
				put("SCHEDULE_JS", "http://localhost:8888/schedule/schedule.nocache.js");
			}else if( DEV_MODE == 1) {
				put("SITE_JS", "http://10.124.51.81:8888/js/site1.min.js");
				put("PRAYER_JS", "http://10.124.51.81:8888/prayer/prayer.nocache.js");
				put("SCHEDULE_JS", "http://10.124.51.81:8888/schedule/schedule.nocache.js");
			}else if( DEV_MODE == 2) {
				put("SITE_JS", "//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/site1.min.js");
				put("PRAYER_JS", "http://www.findazan.info/prayer/prayer.nocache.js");
			    put("SCHEDULE_JS", "http://www.findazan.info/schedule/schedule.nocache.js");
			}
			
		}
	};
		
	
	public static String encode(String s) {
		if(s== null){
			s = "";
		}
		// the result/encoded string, the padding string, and the pad count
		String r = "", p = "";
		int c = s.length() % 3;
		// add a right zero pad to make this string a multiple of 3 characters
		if (c > 0) {
			for (; c < 3; c++) {
				p += "="; //=
				s += "\0";
			}
		}
		// increment over the length of the string, three characters at a time
		for (c = 0; c < s.length(); c += 3) {
			// we add newlines after every 76 output characters, according to
			// the MIME specs
			if (c > 0 && (c / 3 * 4) % 76 == 0)
				r += "\r\n";

			// these three 8-bit (ASCII) characters become one 24-bit number
			int n = (s.charAt(c) << 16) + (s.charAt(c + 1) << 8)
					+ (s.charAt(c + 2));

			// this 24-bit number gets separated into four 6-bit numbers
			int n1 = (n >> 18) & 63, n2 = (n >> 12) & 63, n3 = (n >> 6) & 63, n4 = n & 63;
			// those four 6-bit numbers are used as indices into the base64
			// character list
			r += "" + base64chars.charAt(n1) + base64chars.charAt(n2)
					+ base64chars.charAt(n3) + base64chars.charAt(n4);
		}
		return r.substring(0, r.length() - p.length()) + p;
	}
		
	public static String cleanForDecode(String a){
		int length = a.length();
		String s = "";
		if(length % 4 != 0){
			for(int i = 0; i < (4  - length % 4); i++){
				s += "=";
			}
		}
		return a + s;
	}
	 
	public static String decode(String s) {
	 
		// remove/ignore any characters not in the base64 characters list
		// or the pad character -- particularly newlines
		s = s.replaceAll("[^" + base64chars + "=]", "");
	    s = cleanForDecode(s);
		// replace any incoming padding with a zero pad (the 'A' character is
		// zero)
		String p = (s.charAt(s.length() - 1) == '=' ? 
			(s.charAt(s.length() - 2) == '=' ? "AA" : "A") : "");
		String r = "";
		s = s.substring(0, s.length() - p.length()) + p;
	 
		// increment over the length of this encoded string, four characters
		// at a time
		for (int c = 0; c < s.length(); c += 4) {
	 
		    // each of these four characters represents a 6-bit index in the
		    // base64 characters list which, when concatenated, will give the
		    // 24-bit number for the original 3 characters
		    int n = (base64chars.indexOf(s.charAt(c)) << 18)
			    + (base64chars.indexOf(s.charAt(c + 1)) << 12)
			    + (base64chars.indexOf(s.charAt(c + 2)) << 6)
			    + base64chars.indexOf(s.charAt(c + 3));
	 
		    // split the 24-bit number into the original three 8-bit (ASCII)
		    // characters
		    r += "" + (char) ((n >>> 16) & 0xFF) + (char) ((n >>> 8) & 0xFF)
			    + (char) (n & 0xFF);
		}
	 
		// remove any zero pad that was added to make this a multiple of 24 bits
		return r.substring(0, r.length() - p.length());
	    }
	
	public static LocationDto get(String city, String state, String country) throws IOException {
		LocationDto dto = null;
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		String key = clean(city) + "-" + clean(state) + "-" + clean(country);
		
		key = URLEncoder.encode(key, "UTF-8");
		//String key =  Util.encode(clean(city)).replaceAll("=", "") + "-" + Util.encode(clean(state)).replaceAll("=", "") + "-"
		//		+ Util.encode(clean(country)).replaceAll("=", "");
		
		Key todoKey = KeyFactory.createKey("Location", key);
		Entity entity;
		try {
			entity = datastore.get(todoKey);
			dto = new LocationDto();
			dto.setKey(key);
			dto.setLocation((String) entity.getProperty(Location.location
					.toString()));
			dto.setCity((String) entity.getProperty(Location.city.toString()));
			dto.setState((String) entity.getProperty(Location.state.toString()));
			dto.setCountry((String) entity.getProperty(Location.country
					.toString()));
			dto.setShort_country((String) entity.getProperty(Location.short_country.toString()));
			dto.setZoneName((String)entity.getProperty(Location.timezone.toString()));
			dto.setZoneName(Util.decode(dto.getZoneName()));
		} catch (EntityNotFoundException e) {
			dto = null;
		}
		log.log(Level.INFO, dto.toString());
		return dto;
	}
	
	public static String toProperCase(String s) {
		if(s != null && s.length() > 0 && s.length() != 2){
			String temp[] = s.split(" ");
			String res = "";
			String d = "";
			for(String fragment: temp){
				res += d + fragment.substring(0, 1).toUpperCase() +
			               fragment.substring(1).toLowerCase();
				d = " ";
			}
			s = res;
		}else if(s != null && s.length() == 2){
			s = s.toUpperCase();
		}
	    return s;
	}

	public static LocationDto get(HttpServletRequest request,
			HttpServletResponse response, String city, String state,
			String country, String location) throws IOException {

		// TODO remove this
		String ADMIN_KEY = "_adk";
		String ADMIN_VALUE1 = "QXJzbGFuIEFmemFs1";

		LocationDto dto = null;
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
		String adkey = request.getParameter(ADMIN_KEY);

		String key = clean(city) + "-" + clean(state) + "-" + clean(country);
		
		key = URLEncoder.encode(key, "UTF-8");

		Key todoKey = KeyFactory.createKey("Location", key);
		Entity entity;
		try {
			entity = datastore.get(todoKey);

			dto = new LocationDto();
			dto.setKey(key);
			dto.setLocation((String) entity.getProperty(Location.location
					.toString()));
			dto.setCity((String) entity.getProperty(Location.city.toString()));
			dto.setState((String) entity.getProperty(Location.state.toString()));
			dto.setCountry((String) entity.getProperty(Location.country
					.toString()));
			dto.setShort_country((String) entity
					.getProperty(Location.short_country.toString()));
			dto.setZoneName((String)entity.getProperty(Location.timezone.toString()));
			dto.setZoneName(decode(dto.getZoneName()));
			if(adkey.equals(ADMIN_VALUE1)){
				response.setContentType("text/plain");
				response.getWriter().println(dto.toString());
			}
		} catch (EntityNotFoundException e) {
			if(adkey.equals(ADMIN_VALUE1)){
				response.setContentType("text/plain");
				response.getWriter().println("Entry not found.");
			}
		}
		return dto;
	}
	
	public static LocationDto urlLocation(String url){
		LocationDto dto = new LocationDto();
		try {
			url = URLDecoder.decode(url, "UTF-8");
		} catch (UnsupportedEncodingException e) {}
		String[] uri = url.split("/schedule/");
		if(uri.length == 2 && uri[1].startsWith("location")){
			String[] fragments = uri[1].split("/");
			for(String fragment : fragments){
				if(!"location".equals(fragment)){
					if(fragment.startsWith("@")){
						fragment = fragment.substring(1);
						dto.setLocation(fragment);
					}else if(fragment.startsWith("!")){
						fragment = fragment.substring(1);
						dto.setZoneName(Util.decode(fragment));
					}else{
						dto.setPlace(fragment);
					}
				}
			}
		}
		return dto;
	}

	public static String clean(String s) throws IllegalArgumentException {
		return (s == null) ? "" : s.toLowerCase();
	}
	
	public static final Map<String, String> short_country = new HashMap<String, String>();
	static{
		for(String iso : Locale.getISOCountries()){
			Locale l = new Locale("", iso);
			short_country.put(l.getDisplayCountry().toLowerCase(), iso);
		}
	}
	
	public static String cleanKey(String s) throws IllegalArgumentException {
		if (s == null || s.trim().length() == 0) {
			throw new IllegalArgumentException("invalid parameter!");
		} else {
			s = s.toLowerCase();
		}
		return s;
	}
	
	public static String cleanZone(String s) throws IllegalArgumentException {
		if (s == null || s.trim().length() == 0) {
			throw new IllegalArgumentException("invalid parameter!");
		}
		return s;
	}
}
