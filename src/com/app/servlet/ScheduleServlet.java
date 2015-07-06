package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.cons.LocationDto;

public class ScheduleServlet extends HttpServlet {
	private static final Logger log = Logger.getLogger(ScheduleServlet.class.getName());
	private static final long serialVersionUID = 1L;

	@Override  
	public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		doPost(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		
		String def_location = request.getHeader("X-AppEngine-CityLatLong");
		String def_city = request.getHeader("X-AppEngine-City");
		String def_state = request.getHeader("X-AppEngine-Region");
		String def_country = request.getHeader("X-AppEngine-Country");
		
		StringBuffer requestURL = request.getRequestURL(); 
		log.log(Level.FINEST, requestURL.toString());
		LocationDto dto = Util.urlLocation(requestURL.toString());
		if(!dto.isValidLocation()){
			if(dto.isValidPlace()){
				dto = Util.get(dto.getCity(), dto.getState(), dto.getCountry());
				if(dto == null){
					dto = new LocationDto(def_location, def_city, def_state,
							def_country, null, "key", null);
				}
			}else{
				dto = new LocationDto(def_location, def_city, def_state,
						def_country, null, "key", null);
			}
		}else{
			log.log(Level.INFO, "valid dto retrieved from url");
		}
		log.log(Level.INFO, dto.toString());
		//default from ip? ...maybe?
		
		ScheduleBody body = new ScheduleBody(out);//print body
		body.setLocationDto(dto);
		
		if (request.getQueryString() != null) {
		    requestURL.append("?").append(request.getQueryString());
		}
		String completeURL = requestURL.toString();
	
		out.write("<!DOCTYPE html>");
		out.write("<html class=\"js no-touch geolocation backgroundsize csstransforms csstransforms3d audio localstorage inlinesvg pointerevents webaudio mediaqueries getusermedia\">");
		out.write("<head>");
		String[] sub_title = title(dto.getCity(), dto.getState(), dto.getCountry(), dto.getShort_country());
		String title = "Find Azan - Prayer times for " + sub_title[0];
		out.write("<title>"+title+ "</title>");
		out.write("<meta id=\"default-location\" name=\"default-location\" content=\""+titleEnc(Util.encode(def_city), Util.encode(def_state), Util.encode(def_country), def_location)+"\">");
		MetaHandler head = new MetaHandler();
		head.keywords = ","+ sub_title[1];
		if("default".equals(dto.getKey())){
			//"72.231.144.61"
			out.write(head.getResourceLinks());
			out.write(script(request.getRemoteAddr()));
			out.write("</head>");
			out.write(temp());
		}else{
			out.write(head.getMeta(title, null, null, completeURL));
			out.write(head.getResourceLinks());
			out.write(head.getScripts1());
			out.write("</head>");
			body.setTitle("<span id=\"location-name\">" +sub_title[0] + "</span> (<span id=\"location\">" + dto.getLocation() +"</span>)");
			body.make();
			out.write("</html>");
		}
	}
	
	private String temp(){
		return "<div class=\"butter-bar g-bg-baby-blue -secondary-padding v-align text-center\">"+
				"<h1 class=\"h1 g-color-blue -padding-sides text-right\">:(</h1>"+
				""+
				"<p class=\"g-color-charcoal text-left\">"+
				"          Please allow www.findazan.info to get browser location for better accuracy."+
				"<br>"+
				"          Determining location using IP address <a class=\"g-color-blue\" href=\"http://www.findazan.info\" target=\"_blank\">Click</a> here if you would like to find prayer time using city name"+
				"</p>"+
				"</div>";
	}
	
	public String script(String ip){
		return "<script type=\"text/javascript\">" +
				" var ip_location;" +
				" var oHead = document.getElementsByTagName('head')[0];" + 
				" var oScript = document.createElement(\"script\");" + 
				" oScript.type = \"text/javascript\";" + 
				" oScript.src = \"http://ip-api.com/json/" + ip + "?callback=callback\";" + 
				" oHead.appendChild(oScript);" +
				" function callback(data){" +
				"  ip_location = 'schedule?city=' + data.city + '&state='+ data.regionName +'&country=' + data.country +'&location=' + data.lat + ',' + data.lon + '&timezone=' + data.timezone;" +
				"  window.location.href = ip_location; "+
				" }" +
				"</script>";
/*		return "<script src=\"/js/ipl.js\" type=\"text/javascript\"></script>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"	IPL.init(\""+ip+"\");\r\n" + 
				"    IPL.request_location();\r\n" + 
				"    function callback(data){\r\n" + 
				"    	alert('city=' + data.city + '&state='+ data.regionName +'&country=' + data.country +'&location=' + data.lat + ',' + data.lon);\r\n" + 
				"    }\r\n" + 
				"</script>";*/
	}
	
	public static String[] title(String c, String s, String co, String s_co){
		String res = "";
		String res1 = "";
		String d = "";
		if(c != null && c.length() > 0){
			res += d + Util.toProperCase(c);
			res1 += res;
			d = ", ";
		}
		if(s != null && s.length() > 0){
			String state = Util.toProperCase(s);
			res += d + state;
			res1 += d.trim() + Util.states.get(state);
			d = ", ";
		}
		if(co != null && co.length() > 0){
			String country = Util.toProperCase(co);
			res += d + country;
			res1 += d.trim() + s_co;
		}
		String res2[] = new String[2];
		res2[0] = res;
		res2[1] = res1;
		return res2;
	}
	public static String titleEnc(String a1, String a2, String a3,String a4){
		String res = "";
		res =  (a1 == null) ? "," : a1 + ",";
		res += (a2 == null) ? "," : a2 + ",";
		res += (a3 == null) ? "," : a3 + ",";
		res += (a4 == null) ? "" : a4;
		return res;
	}
	
	public static void main(String[] ar){
		String key = null;
		String location = null;
		if(key != null || location == null){
			System.out.println("---------");
		}
	}
}
