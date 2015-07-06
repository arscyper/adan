package com.app.ux.schedule;

import org.jsoup.nodes.Document;

import com.app.ux.Header;

public class ScheduleHeader {
	Header header;
	Document doc;
	
	public ScheduleHeader(Document doc){
		this.doc = doc;
		header = new Header(doc);
		init();
	}
	
	public void init(){
		String metaa[] = {"content","IE=edge", "http-equiv","X-UA-Compatible"};
		String metab[] = {"charset=", "utf-8"};
		String metac[] = {"content", "width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no,target-densitydpi=160", "name","viewport"};
		String metad[] = {"http-equiv", "cleartype", "content","on"};
		String metae[] = {"name", "apple-mobile-web-app-capable", "content", "yes"};
		String metaf[] = {"name", "apple-mobile-web-app-status-bar-style", "content", "black-translucent"};
		String metag[] = {"name", "keywords", "content", "Islam,islam,namaz,adan,azan,athan,pray,prayer,time,kaaba,ramadan,namaz,salat,info"};
		String metah[] = {"property", "og:type", "content", "website"};
		String metai[] = {"property", "og:title", "content", "title-place-holder"};
		String metaj[] = {"property", "og:description", "content=", "desc-place-holder"};
		String metak[] = {"property", "og:image", "content", "image-place-holder"};
		String metal[] = {"property", "og:url", "content", "content-url-place-holder"};
		String metam[] = {"name", "yandex-verification", "content", "452b74c97165ea88"}; 
		String metan[] = {"name", "alexaVerifyID", "content", "Uv53T04xLjx5qrhhlDPVMY6WCUY"};
		String metao[] = {"name", "google-site-verification", "content", "jfOUqw70NlcjRmMnD60ZA3Y1XcHLX3ujmPNYonBz8j4"};
		header.addMeta(metaa);
		header.addMeta(metab);
		header.addMeta(metac);
		header.addMeta(metad);
		header.addMeta(metae);
		header.addMeta(metaf);
		header.addMeta(metag);
		header.addMeta(metah);
		header.addMeta(metai);
		header.addMeta(metaj);
		header.addMeta(metak);
		header.addMeta(metal);
		header.addMeta(metam);
		header.addMeta(metan);
		header.addMeta(metao);
		
	}
	
	public Header getHeader(){
		return header;
	}

}
