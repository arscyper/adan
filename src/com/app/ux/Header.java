package com.app.ux;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;

public class Header {
	Document doc;
	public Header(Document doc){
		this.doc = doc;
	}
	
	public void addTitle(String text){
		doc.head().appendElement("title").text(text);
	}
	
	public void addMeta(String...key){
		Element e = doc.head().appendElement("meta");
		for(int i = 0; i <= key.length -2; i++){
			e.attributes().put(key[i], key[i+1]);
			i++;
		}
	}
	
	public void addlink(String...key){
		Element e = doc.head().appendElement("link");
		for(int i = 0; i <= key.length -2; i++){
			e.attributes().put(key[i], key[i+1]);
			i++;
		}
	}
	
	public static void main(String args[]){
		Document doc = Document.createShell("");
		DocumentType type = new DocumentType("html","","","");
		doc.prependChild(type);
		Header h = new Header(doc);
		h.addTitle("Yes sir!");
		String[] a= {"rel", "bb", "size", "100p", "href", "kjasldlasjd"};
		h.addlink(a);
		h.addMeta("hell", "yes");
		System.out.println(doc);
	}

}
