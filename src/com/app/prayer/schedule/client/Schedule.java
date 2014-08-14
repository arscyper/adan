package com.app.prayer.schedule.client;

import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.MetaElement;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.dom.client.ParagraphElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Schedule implements EntryPoint {
	private String title = "";
	
	@Override
	public void onModuleLoad() {
		String location = Window.Location.getParameter("location");
		String city = Window.Location.getParameter("city");
		String state = Window.Location.getParameter("state");
		String country = Window.Location.getParameter("country");
		setBrowserWindowTitle("Prayer Times - Schedule " +title(city, state, country));
		if(location == null || location.length()== 0){
			GWT.log("no location provided");
			//default location
			location = "21.422500,39.826150";
			city="Mecca";
			state="Kaaba Al Haram";
			country = "Saudi Arabia";
			//display(defaultLocation(true), 0, false);//XXX true
			 
		}		
		GWT.log(location + "------------");
		display(location, 0, city,state,country);
		addListeners("isna", location, city,state,country);
		addListeners("karachi", location, city,state,country);
		addListeners("umm-al-qura", location, city,state,country);
		addListeners("isna1", location, city,state,country);
		addListeners("karachi1", location, city,state,country);
		addListeners("umm-al-qura1", location, city,state,country);
		
	}
	
	private void updateDescription(String description) {
	    NodeList<Element> tags = Document.get().getElementsByTagName("meta");
	    for (int i = 0; i < tags.getLength(); i++) {
	        MetaElement metaTag = ((MetaElement) tags.getItem(i));
	        GWT.log(metaTag.getAttribute("property"));
	        if (metaTag.getAttribute("property").equals("og:description")) {
	            metaTag.setContent(description);
	        }else if(metaTag.getAttribute("property").equals("og:title")){
	        	metaTag.setContent("Prayer Times for " + title);
	        }
	    }
	}
	
	public void addListeners(final String id, final String location, final String city, final String state, final String country){
		final Element e = RootPanel.get(id).getElement(); 
		Label l = Label.wrap(e);
		l.addClickHandler(new ClickHandler(){
			@Override
			public void onClick(ClickEvent event) {
				GWT.log(e.getAttribute("class"));
				if(e.getAttribute("class").contains("selected")){
					GWT.log(id);
					if(id.startsWith("isna")){
						display(location, 0, city, state,country);
					}else if(id.startsWith("karachi")){
						display(location, 1, city,state,country);
					}else if(id.startsWith("umm-al-qura")){
						display(location, 2, city,state,country);
					}
				}
			}
			
		});
	}
	
	public void display(String location, int calc, String city, String state, String country){
		GeoLocation g = GeoLocation.parse1(location);
		if(g.isValidLocation()){
			GWT.log(g.getLongitude() + ":::");
			currentLocation(g.getLatitude(),g.getLongitude(), city, state, country);
			PrayTime prayers = new PrayTime(); 
			prayers.setTimeFormat(prayers.Time12);
			if(calc == 0){
				prayers.setCalcMethod(prayers.ISNA);
			}else if (calc == 1){
				prayers.setCalcMethod(prayers.Karachi);
			}else if (calc == 2){
				prayers.setCalcMethod(prayers.Makkah);
			}
		    prayers.setAsrJuristic(prayers.Shafii);
		    prayers.setAdjustHighLats(prayers.AngleBased);
		    int[] offsets = {0, 0, 0, 0, 0, 0, 0}; // {Fajr,Sunrise,Dhuhr,Asr,Sunset,Maghrib,Isha}
		    prayers.tune(offsets);
			for(int i = 0; i <= 13; i++){
				print("Shafii", calc, prayers, g.getLatitude(), g.getLongitude(), i);
				
			}
			prayers.setAsrJuristic(prayers.Hanafi);
			for(int i = 0; i <= 13; i++){
				print("Hanafii", calc, prayers, g.getLatitude(), g.getLongitude(), i);			
			}
		}else{
			GWT.log("invalid location");
		}
	}	
	
	public void currentLocation(double latitude,double longitude, String city, String state, String country){
		Element sub = DOM.getElementById("currentLocation");
		if(sub!= null){
			sub.removeAllChildren();
			Document doc = Document.get();
			ParagraphElement p = doc.createPElement();
			title = title(city,state,country)+" (" + latitude + ", " + longitude +")";
			p.setInnerText(title);
			sub.appendChild(p);
		}
	}
	
	/*public GeoLocation defaultLocation(final boolean b){
		final GeoLocation g = new GeoLocation();
		// Send request to server and catch any errors.
		String url = "http://ipinfo.io";
		if(b){
			url += "?callback";
		}
	    RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, url);
	    
	    try {
	      Request request = builder.sendRequest(null, new RequestCallback() {
	        public void onError(Request request, Throwable exception) {
	          GWT.log("Couldn't retrieve JSON");
	        }

			@Override
			public void onResponseReceived(Request request, Response response) {
				if(200 == response.getStatusCode()){
					if(b){
						g.parse_2(response.getText());
					}else{
						g.parseIPInfo(response.getText());
					}
				}else{
					if(b){
						defaultLocation(false);
					}else{
						//No location found
					}
				}
			}
	      });
	    } catch (RequestException e) {
	      GWT.log("Couldn't retrieve JSON");
	    }
	    return g;
	}
*/	
	public void print(String j,int calc, PrayTime p, double latitude,double longitude, int day){
		Element sub = DOM.getElementById("prayer-times-"+j+"-" + day);
		if(sub != null){
			String[] dateTitle = p.getMonthInfo(day);
			sub.removeAllChildren();
			Document doc = Document.get();
			DivElement l = doc.createDivElement();
			l.setAttribute("class", "timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed");
			l.setAttribute("style", "position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;");
			l.setInnerHTML(dateTitle[0] +"<span>"+dateTitle[1]+"</span>");
			sub.appendChild(l);
			DivElement l1 = doc.createDivElement();
			l1.setAttribute("class", "event__content -quran");
			l1.setAttribute("id", "prayer-times-2");
			String html = p.print(latitude, longitude, day);
			l1.setInnerHTML(html);
			sub.appendChild(l1);
			//<span  class="video-card__speakers g-light-grey" style="position:relative; bottom:0; right:0; font-size:10px;">Shafii,ISNA</span>
			SpanElement l2 = doc.createSpanElement();
			l2.setAttribute("class", "video-card__speakers g-light-grey");
			l2.setAttribute("style", "position:relative; bottom:0; right:0; font-size:10px;");
			l2.setInnerText(createSubText(j, calc));
			sub.appendChild(l2);
			if(j.equals("Shafii") && calc == 0){
				updateDescription(html);
			}
		}
	}
	public String createSubText(String id, int calc){
		String[] texts = {"ISNA", "Karachi", "Umm Al-Qura"};
		return id + "," + texts[calc];
	}
	public static void setBrowserWindowTitle (String newTitle) {
	    if (Document.get() != null) {
	        Document.get().setTitle (newTitle);
	    }
	}
	
	
/*	public static String printDay(int day, PrayTime prayers, GeoLocation g){
		String temp = "";
		
		
		ArrayList<String> a = CommonUtil.print(g.getLatitude(), g.getLongitude(), prayers, day);
		ArrayList<String> b = CommonUtil.s;
		temp = "<table>";
		for(int i = 0 ; i <= a.size() -1; i++){
			if(i != 4){
				temp += "<tr><td>"+b.get(i)+"</td><td class=\"g-light-grey\">"+a.get(i)+"</td></tr>";
			}
		}
		temp+="</table>";
	    
	    
	    return temp;
	}*/
	
	public static String title(String c, String s, String co){
		String res = "";
		String d = "";
		if(c != null && c.length() > 0){
			res += d + c;
			d = ", ";
		}
		if(s != null && s.length() > 0){
			res += d + s;
			d = ", ";
		}
		if(co != null && co.length() > 0){
			res += d + co;
		}
		return res;
	}

}