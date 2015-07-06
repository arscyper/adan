package com.app.ux;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Body {
	Document doc;
	Element body;
	
	public Body(Document doc){
		this.doc = doc;
		body = doc.body();
	}
	
	public void addDiv(){
		
	}
	
	public Element getBody(){
		return body;
	}
	

}
