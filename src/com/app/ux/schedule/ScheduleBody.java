package com.app.ux.schedule;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.app.cons.LocationDto;
import com.app.cons.v1.Prayer;
import com.app.cons.v1.PrayerTime;
import com.app.servlet.Util;


public class ScheduleBody {
	Element body;
	Document doc;
	String title;
	LocationDto dto;
	PrayerTime prayer;
	
	public ScheduleBody(Document doc, String title, LocationDto dto){
		this.title = title;
		this.doc = doc;
		body = doc.body();
		body.addClass("js no-touch geolocation backgroundsize csstransforms csstransforms3d audio localstorage inlinesvg pointerevents webaudio mediaqueries getusermedia");
		this.dto = dto;
		prayer = new PrayerTime(dto.getLatitude(), dto.getLongitude(), dto.getZoneName(), "ISNA", "SHAFII");
		init();
	}
	
	public Element detailsCard(){
		Element e = doc.createElement("div");
		e.addClass("details js-details -hide");
		Element e1 = doc.createElement("div");
		e1.addClass("details__card js-details-card");
		e.appendChild(e1);
		return e;
	}
	
	public Element nav(){
		Element e = doc.createElement("div");
		e.addClass("toggle-basement js-basement");
		e.attr("data-toggle-name", "basement");
		e.attr("data-direction", "left");
		Element e1 = doc.createElement("nav");
		e1.addClass("nav -mobile");
		e1.html("<a class=\"nav__item -mobile -logo\" href=\"/prayer\"><span"+
				"\tclass=\"icon -mosque -clean\">Find Azan</span></a> "+
				"<a class=\"nav__item -mobile -home\""+
				"\thref=\"/prayer\">Home</a> "+
				"<a class=\"nav__item -mobile -videos active\""+
				"\thref=\"/schedule\">Schedule</a>"+
				"<a class=\"nav__item -mobile -logistics\""+
				"\thref=\"http://unify.findazan.info\">Unify Islam</a>"+
				"<a class=\"nav__item -mobile -help show-for-small-only\""+
				"\thref=\"/help\">Help</a>");
		e.appendChild(e1);		
		return e;
	}
	
	public void ieConditionalTag(){
		body.append("<!--[if lt IE 9]>"+
				"<div class=\"butter-bar g-bg-baby-blue -secondary-padding v-align text-center\">"+
				"<h1 class=\"h1 g-color-blue -padding-sides text-right\">:(</h1>"+
				"<p class=\"g-color-charcoal text-left\">"+
				"Your current browser can't handle this site."+
				"<br>"+
				"It may be time to <a class=\"g-color-blue\" href=\"http://whatbrowser.org\" target=\"_blank\">upgrade</a>."+
				"</p>"+
				"</div>"+
				"<![endif]-->");
	}
	public Element mainContent(){
		Element e = doc.createElement("div");
		e.addClass("wrapper js-basement-sibling");
		return e;
	}
	
	public Element navDesktop(){
		Element e = doc.createElement("nav");
		e.addClass("nav -desktop");
		e.append("<a class=\"nav__item -desktop -logo\" href=\"/prayer\">" +
				 "<span class=\"icon -mosque\">Find Azan</span></a>"+
				 "<a class=\"nav__item -desktop -home hide-for-small-only\""+
				 "\thref=\"/prayer\">Home</a> "+
				 "<a class=\"nav__item -desktop -schedule hide-for-small-only active\""+
				 "\thref=\"/schedule\">Schedule</a> "+
				 "<a class=\"nav__item -desktop -logistics hide-for-small-only\""+
				 "\thref=\"http://unify.findazan.info\">Unify Islam</a>"+
				 "<div class=\"menu js-toggler--basement\""+
				 "\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				 "<span class=\"icon -menu-black\">Navigation</span>"+
				"</div>");
		return e;
	}
	
	public Element bodyHeader(){
		Element e = doc.createElement("header");
		e.appendChild(navDesktop());
		return e;
	}
	
	public Element titleSection(){
		Element e = doc.createElement("div");
		e.addClass("bucket -primary g-bg-purple-blue g-color-white experiment-partial -clouds js-experiment-partial");
		
		e.append("<div class=\"bucket -primary g-bg-purple-blue g-color-white experiment-partial -clouds js-experiment-partial\">"+
				  "<div class=\"v-align -whole\">"+
				   "<div class=\"v-align__element -bottom\">"+
				    "<h1 class=\"bucket__headline -bottom h1 allow-orphan\">Azan"+
				    "\tSchedule</h1>"+
				   "<div id=\"currentLocation\">"+
				    "<p>"+title+"</p>"+
				   "</div>"+
				  "<div class=\"-location-schedule\">"+
				    "<a onClick=\"get_location()\" class=\"bucket__cta -top g-color-dark-blue with-icon js-cta\" href=\"javascript:void(0);\" target=\"_blank\">"+
				    "<span class=\"icon -location-grey -bottom\"></span>"+
				    "<span class=\"g-color-lightblue-grey\">Tap for your location</span>"+
				    "</a>"+
				  "</div>"+
				"</div>"+
				"</div>"+
				"<div class=\"renderer\">"+
				"</div>"+
				"</div>");
		
		return e;
	}
	
	public Element filters(){
		Element e = doc.createElement("div");
		e.addClass("filters__icon-holder -bottom-border show-for-small-only js-toggler--filters");
		
		e.append("<div class=\"filters__toggle icon js-toggler--filters\">Filters</div>"+
			      "<span class=\"filter-text g-light-grey\">Filters Prayer</span>");
		return e;
	}
	
	public Element filtersSelection(){
		Element e = doc.createElement("div");
		e.addClass("filters__current-holder row block g-bg-light-blue show-for-small-only -js-filter-current-holder -hide");
		e.append("<div class=\"filters__current col -width-1-2 g-color-blue -js-filters-pretty\">"+
			     "\tSession, Design</div>"+
			     "<div class=\"filters__current-clear col -width-1-2 -mobile js-clear-filters-mobile\""+
			        "\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
			        "<span class=\"clear-all g-light-grey\">Clear all</span> <span"+
			        "\tclass=\"icon -cancel-grey -middle\">Clear</span>"+
			     "</div>");
	
		return e;
	}
	
	public Element timeTable(){
		Element e = doc.createElement("table");
		
		List<Prayer> prayerList = prayer.getPrayerList();
		String short_state = (Util.states.get(dto.getState()) == null) ? dto.getState() : Util.states.get(dto.getState());
		for(Prayer p: prayerList){
			Element e1 = doc.createElement("tr");
			e1.attr("itemscope");
			e1.attr("itemtype", "http://schema.org/Event");
			
			e1.append("<td><span itemprop=\"name\" class=\"-quran-small\">"+p.getName()+"</span></td>");
			e1.append("<td class=\"g-light-grey\">" +
						"<meta itemprop=\"description\" content=\"Prayer time for "+ p.getName() + " in " + dto.getCity() + ","+ dto.getState() + " " + dto.getShort_country()  +"\">"+
						 	"<meta itemprop=\"startDate\" content=\""+ prayer.getISODate(p.getTimeString24()) +"\">" +
						 	p.getTimeString12() +
						 	//endDate +
						 	"<div itemprop=\"location\" itemscope itemtype=\"http://schema.org/Place\">" +
							    "<div itemprop=\"address\" itemscope itemtype=\"http://schema.org/PostalAddress\">"+
							      "<meta itemprop=\"addressLocality\" content=\""+dto.getCity()+"\">"+
							      "<meta itemprop=\"addressRegion\" content=\""+short_state+"\">"+
							    "</div>"+		
							"</div>"+
					 	"</td>");
			e1.append("<td class=\"-show-ar-name\">" +
							"<span class=\"-quran-small\">"+p.getArName()+"</span>" +
					  "</td>");
			e.appendChild(e1);
		}
		
		return e;
	}
	
	public Element makeTile(String s, String j, int i, String design, String hide){
		Element e = doc.createElement("div");
		e.addClass("video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card "+design+" -karachi -isna -umm-al-qura "+hide);
		Element e1 = doc.createElement("div");
		e1.addClass("card__content -gutterless timetile -"+s.toLowerCase());
		Element e2 = doc.createElement("div");
		e2.addClass("timeslot__events");
		e2.attr("id", "prayer-times-"+s+ "-"+i);
		
		Element e3 = doc.createElement("div");
		e3.addClass("timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed");
		e3.attr("id", "prayer-times-" +j+"-"+i+"-title");
		e3.append(prayer.getDay() + "<span>" + prayer.getMonthName() + "</span>");
		
		Element e4 = doc.createElement("div");
		Element e5 = doc.createElement("div");
		e5.addClass("event__content -quran");
		e5.attr("id", "prayer-times-"+j+"-"+i);
		e5.appendChild(timeTable());
		e4.appendChild(e5);
		
		
		
		Element e6 = doc.createElement("div");
		e6.attr("id", "prayer-times-sub-"+j+"-"+i);
		e6.append("<span class=\"video-card__speakers g-light-grey\""+
				  " style=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">"+s+",ISNA</span>");
		
		e2.appendChild(e3);
		e2.appendChild(e4);
		e2.appendChild(e6);
		e1.appendChild(e2);
		e.appendChild(e1);
		return e;
	}
	
	public Element timeBlock(){
		Element e = doc.createElement("div");
		e.addClass("videos__col -left -width-3-4 -full-height -mobile-whole js-videos-holder data-tab-namespace");
		
		for(int i = 0; i <= 13; i++){
			prayer.updateCalculation(i, "ISNA", "SHAFII");
			e.appendChild(makeTile("Shafii", "", i, "-design", ""));
			
		}
		
		for(int i = 0; i <= 13; i++){
			prayer.updateCalculation(i, "ISNA", "HANAFII");
			e.appendChild(makeTile("Hanafii","h", i, "-develop", "-hide"));
		}
		
		return e;
	}
	
	
	public Element section(){
		Element e = doc.createElement("section");
		e.addClass("section g-bg-white -schedule");
		Element e1 = doc.createElement("div");
		e1.addClass("row -full-height -gutterless-left -gutterless-right");
		e1.appendChild(filters());
		e1.appendChild(filtersSelection());
		e1.appendChild(timeBlock());
		
		e.appendChild(e1);
		return e;
	}
	
	public void init(){
		body.appendChild(detailsCard());
		body.appendChild(nav());
		ieConditionalTag();
		Element main = mainContent();
		main.appendChild(bodyHeader());
		main.appendChild(section());
		body.appendChild(titleSection());
		body.appendChild(main);
		
	}

}
