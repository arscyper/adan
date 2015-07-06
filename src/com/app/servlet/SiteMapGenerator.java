package com.app.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.QueryResultList;

public class SiteMapGenerator extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/xml");
		PrintWriter out = response.getWriter();
		out.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + 
				"<urlset" + 
				" xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\"" + 
				" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + 
				" xsi:schemaLocation=\"http://www.sitemaps.org/schemas/sitemap/0.9" + 
				" http://www.sitemaps.org/schemas/sitemap/0.9/sitemap.xsd\">");
		out.print(staticUrls());
/*		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		
	    FetchOptions fetchOptions = FetchOptions.Builder.withDefaults();
		
		Query q = new Query("Location");

		PreparedQuery pq = datastore.prepare(q);
		QueryResultList<Entity> results = pq.asQueryResultList(fetchOptions);
	    for (Entity entity : results) {
	    	out.write("<url>");
	    	 out.write("<loc>");
	    	 String url = "http://www.findazan.info/schedule/location/";
	    	        url+= "@" +(String) entity.getProperty(Location.location.toString());
	    	        url+= "/" +(String) entity.getProperty(Location.city.toString());
	    	        url+= "," +(String) entity.getProperty(Location.state.toString());
	    	        url+= "," + (String) entity.getProperty(Location.country.toString());
	    	 String zone = (String) entity.getProperty(Location.timezone.toString());
	    	 url = url.replaceAll(" ", "+");
	    	  out.write(url);
	    	  
	    	  out.write("/!" + zone.replaceAll("=", ""));
	    	 out.write("</loc>");
	    	 out.write("<changefreq>daily</changefreq>");
	    	out.write("</url>");
	    }*/
		
		
		out.write("</urlset>");
		out.close();
	}
	
	public String staticUrls(){
		return "<url>" + 
				"  <loc>http://www.findazan.info/</loc>" + 
				"  <changefreq>daily</changefreq>" + 
				"</url>" + 
				"<url>" + 
				"  <loc>http://www.findazan.info/prayer</loc>" + 
				"  <changefreq>daily</changefreq>" + 
				"</url>" + 
				"<url>" + 
				"  <loc>http://www.findazan.info/schedule</loc>" + 
				"  <changefreq>daily</changefreq>" + 
				"</url>" + 
				"<url>" + 
				"  <loc>http://www.findazan.info/help</loc>" + 
				"  <changefreq>daily</changefreq>" + 
				"</url>";
	}
}
