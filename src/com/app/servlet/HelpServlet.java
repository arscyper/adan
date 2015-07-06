package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelpServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override  
	public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		StringBuffer requestURL = request.getRequestURL();
		if (request.getQueryString() != null) {
		    requestURL.append("?").append(request.getQueryString());
		}
		String completeURL = requestURL.toString();
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.write("<!DOCTYPE html>");
		out.write("<html class=\"js no-touch geolocation backgroundsize csstransforms csstransforms3d audio localstorage inlinesvg pointerevents webaudio mediaqueries getusermedia\">");
		out.write("<head>");
		String title = "Find Azan - Help";
		out.write("<title>"+title+ "</title>");
		MetaHandler head = new MetaHandler();
		out.write(head.getMeta(title, null, null, completeURL));
		out.write(head.getResourceLinks());
		out.write(head.getHelpScripts());
		out.write("<head>");
		new HelpBody(out);//print body
		out.write("</html>");
	}

}
