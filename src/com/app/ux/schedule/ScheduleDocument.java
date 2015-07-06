package com.app.ux.schedule;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Entities.EscapeMode;


import com.app.cons.LocationDto;

public class ScheduleDocument {
	Document doc;
	
	public ScheduleDocument(){
		doc = Document.createShell("");
		doc.outputSettings().escapeMode(EscapeMode.xhtml);
		DocumentType type = new DocumentType("html", "", "", "");
		doc.prependChild(type);
		doc.select("html").attr("class", "js no-touch geolocation backgroundsize csstransforms csstransforms3d audio localstorage inlinesvg pointerevents webaudio mediaqueries getusermedia");
		
	}
	
	public Document getDocument(){
		return doc;
	}
	
	
	public static void main(String[] args){
		ScheduleDocument document = new ScheduleDocument();
		ScheduleHeader header = new ScheduleHeader(document.getDocument());
		LocationDto dto = new LocationDto();
        dto.setLocation("31.4187142,73.07910730000003");
        dto.setZoneName("Asia/Karachi");
		ScheduleBody body = new ScheduleBody(document.getDocument(), "Title --", dto);
		header.getHeader().addTitle("Prayer Times");
		System.out.println(document.getDocument());
	}
}
