package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override  
	public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {   
//		String name = request.getParameter("name");  
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Type", "text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write("<!DOCTYPE html>");
		out.write("<html class=\"js no-touch geolocation backgroundsize csstransforms csstransforms3d audio localstorage inlinesvg pointerevents webaudio mediaqueries getusermedia\">");
		out.write("<head>");
		String location = request.getHeader("X-AppEngine-CityLatLong");
		String city = request.getHeader("X-AppEngine-City");
		String state = request.getHeader("X-AppEngine-Region");
		String country = request.getHeader("X-AppEngine-Country");
		String sub_title = title(city, state, country, location);
		String title = "Find Azan - Find Prayer time for your location";
		out.write("<meta id=\"default-location\" name=\"default-location\" content=\""+sub_title+"\">");
		out.write("<title>"+title+"</title>");
		MetaHandler head = new MetaHandler();
		out.write(head.getMeta(title, null, null, null));
		out.write(head.getResourceLinks());
		out.write(head.getScripts());
		out.write("<head>");
		new HomeBody(out);//print body
		out.write("</html>");
	}  
	
	public static String title(String a1, String a2, String a3,String a4){
		String res = "";
		res =  (a1 == null) ? "," : a1 + ",";
		res += (a2 == null) ? "," : a2 + ",";
		res += (a3 == null) ? "," : a3 + ",";
		res += (a4 == null) ? "" : a4;
		return res;
	}
	
	public static void main(String args[]){
		MetaHandler ha = new MetaHandler();
		System.out.println(ha.getMeta(null, null, null, null)); 
	}

}
