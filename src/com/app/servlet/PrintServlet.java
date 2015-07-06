package com.app.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		System.out.print(request.getParameter("city"));
		System.out.print(";");
		System.out.print(request.getParameter("state"));
		System.out.print(";");
		System.out.print(request.getParameter("country"));
		System.out.print(";");
		System.out.print(request.getParameter("location"));
		System.out.print(";");
		System.out.print(request.getParameter("zone_name"));
		System.out.println();
	}
}
