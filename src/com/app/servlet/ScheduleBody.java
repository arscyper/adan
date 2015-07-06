package com.app.servlet;

import java.io.PrintWriter;

import com.app.cons.LocationDto;
import com.app.cons.PrayTime;

public class ScheduleBody {
	PrintWriter out;
	String title;
	LocationDto dto;
	
	PrayTime prayers;
	ScheduleBody(PrintWriter out){
		this.out = out;
	}
	
	public void setLocationDto(LocationDto dto){
		this.dto = dto;
		prayers = new PrayTime();
		prayers.setLocationDto(dto);
		prayers.setTimeFormat(prayers.Time12);
		prayers.setCalcMethod(prayers.ISNA);
		prayers.setAsrJuristic(prayers.Shafii);
	    prayers.setAdjustHighLats(prayers.AngleBased);
	    int[] offsets = {0, 0, 0, 0, 0, 0, 0}; // {Fajr,Sunrise,Dhuhr,Asr,Sunset,Maghrib,Isha}
	    prayers.tune(offsets);
		prayers.setLocationDto(dto);
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void make(){	
		String body = "<body class=\"videos hoverable\""+
				"\tdata-google-drive-client-id=\"237695054204-umlfeaogsp53dibh6nc462fa2invrven.apps.googleusercontent.com\">"+
				"<div class=\"details js-details -hide\">"+
				"<div class=\"details__card js-details-card\">&nbsp;</div>"+
				"</div>"+
				""+
				"<div class=\"toggle-basement js-basement\" data-toggle-name=\"basement\""+
				"\tdata-direction=\"left\">"+
				"<div class=\"basement js-toggle-content--basement\">"+
				"<nav class=\"nav -mobile\">"+
				"<a class=\"nav__item -mobile -logo\" href=\"/prayer\"><span"+
				"\tclass=\"icon -mosque -clean\">Find Azan</span></a> "+
				"<a class=\"nav__item -mobile -home\""+
				"\thref=\"/prayer\">Home</a> "+
				"<a class=\"nav__item -mobile -videos active\""+
				"\thref=\"/schedule\">Schedule</a>"+
				"<a class=\"nav__item -mobile -help show-for-small-only\""+
				"\thref=\"/help\">Help</a>"+
				/*"<!--<a class=\"nav__item -mobile -io-extended\""+
				"\thref=\"/events/io/io-extended\">I/O Extended</a> "+
				"<a class=\"nav__item -mobile -logistics\""+
				"\thref=\"/events/io/logistics\">Logistics</a>"+
				"<a class=\"nav__item -mobile -videos\""+
				"\thref=\"/events/io/io14videos\">Videos</a>"+
				"<a class=\"nav__item -mobile -sandbox\""+
				"\thref=\"/events/io/sandbox\">Sandbox</a>-->"+*/
				"</nav>"+
				"</div>"+
				""+
				"<!--[if lt IE 9]>"+
				"<div class=\"butter-bar g-bg-baby-blue -secondary-padding v-align text-center\">"+
				"<h1 class=\"h1 g-color-blue -padding-sides text-right\">:(</h1>"+
				""+
				"<p class=\"g-color-charcoal text-left\">"+
				"          Your current browser can't handle this site."+
				"<br>"+
				"          It may be time to <a class=\"g-color-blue\" href=\"http://whatbrowser.org\" target=\"_blank\">upgrade</a>."+
				"</p>"+
				"</div>"+
				"<![endif]-->"+
				""+
				"<div class=\"wrapper js-basement-sibling\">"+
				"<header"+
				"\tclass=\"header hide-for-x-large -lighter post-keynote-header js-nav\">"+
				"<nav class=\"nav -desktop\">"+
				"<a class=\"nav__item -desktop -logo\" href=\"/prayer\"><span"+
				"\tclass=\"icon -mosque\">Find Azan</span></a> "+
				"<a class=\"nav__item -desktop -home hide-for-small-only\""+
				"\thref=\"/prayer\">Home</a> "+
				"<a class=\"nav__item -desktop -schedule hide-for-small-only active\""+
				"\thref=\"/schedule\">Schedule</a> "+
				"\t"+
				/*"<!-- <a class=\"nav__item -desktop -sandbox hide-for-small-only\""+
				"\thref=\"/events/io/sandbox\">Sandbox</a>"+
				"<a class=\"nav__item -desktop -io-extended hide-for-small-only\""+
				"\thref=\"/events/io/io-extended\">I/O Extended</a> <a"+
				"\tclass=\"nav__item -desktop -logistics hide-for-small-only\""+
				"\thref=\"/events/io/logistics\">Logistics</a> <a"+
				"\tclass=\"nav__item -desktop -videos hide-for-small-only active\""+
				"\thref=\"/events/io/io14videos\">Videos</a> <a"+
				"\tclass=\"nav__item -desktop -experiment hide-for-small-only\""+
				"\thref=\"/events/io/experiment\">Experiment</a>"+
				"\t-->"+*/
				"<div class=\"menu js-toggler--basement\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<span class=\"icon -menu-black\">Navigation</span>"+
				"</div>"+
				"</nav>"+
				"</header>"+
				""+
				"<div"+
				"\tclass=\"bucket -primary g-bg-purple-blue g-color-white experiment-partial -clouds js-experiment-partial\">"+
				"<div class=\"v-align -whole\">"+
				"<div class=\"v-align__element -bottom\">"+
				"<h1 class=\"bucket__headline -bottom h1 allow-orphan\">Azan"+
				"\tSchedule</h1>"+
				"<div id=\"currentLocation\">"+
				"<p>"+title+"</p>"+
				"</div>"+
				"\t"+
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
				"</div>"+
				"\t"+
				"<section class=\"section g-bg-white -schedule\">"+
				"<div class=\"row -full-height -gutterless-left -gutterless-right\">"+
				 "<div"+
				    "\tclass=\"filters__icon-holder -bottom-border show-for-small-only js-toggler--filters\""+
				    "\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				    "<div class=\"filters__toggle icon js-toggler--filters\">Filters</div>"+
				      "<span class=\"filter-text g-light-grey\">Filters Prayer</span>"+
				  "</div>"+
				 "<div"+
				   "\tclass=\"filters__current-holder row block g-bg-light-blue show-for-small-only -js-filter-current-holder -hide\">"+
				 "<div"+
				    "\tclass=\"filters__current col -width-1-2 g-color-blue -js-filters-pretty\">"+
				    "\tSession, Design</div>"+
				 "<div"+
				    "\tclass=\"filters__current-clear col -width-1-2 -mobile js-clear-filters-mobile\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<span class=\"clear-all g-light-grey\">Clear all</span> <span"+
				"\tclass=\"icon -cancel-grey -middle\">Clear</span>"+
				"</div>"+
				"</div>"+
				"<div"+
				"\tclass=\"videos__col -left -width-3-4 -full-height -mobile-whole js-videos-holder\""+
				"\tdata-tab-namespace style=\"min-height: 366px;\">"+
				makeTiles()+
				/*"<a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"f3063708-ffe1-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-0\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-0-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\t>"+
				"<!-- 13<span>Jul</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-0\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-0\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				""+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-1\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-1-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-1\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-1\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-2\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-2-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-2\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-2\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-3\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-3-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-3\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-3\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-4\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-4-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-4\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-4\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-5\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-5-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-5\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-5\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-6\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-6-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-6\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-6\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-7\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-7-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-7\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-7\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-8\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-8-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-8\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-8\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-9\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-9-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-9\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-9\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-10\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-10-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-10\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-10\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-11\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-11-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-11\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-11\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-12\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-12-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-12\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-12\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -design -karachi -isna -umm-al-qura\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless timetile -shafii\">"+
				"<div id=\"prayer-times-Shafii-13\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-13-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-13\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-13\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Shafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-0\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-0-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-0\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-0\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-1\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-1-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-1\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-1\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-2\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-2-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-2\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-2\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-3\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-3-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-3\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-3\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-4\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-4-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-4\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-4\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-5\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-5-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-5\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-5\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-6\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-6-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-6\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-6\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-7\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-7-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-7\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-7\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-8\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-8-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-8\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-8\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-9\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-9-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-9\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-9\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-10\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-10-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-10\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-10\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-11\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-11-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-11\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-11\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-12\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-12-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-12\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-12\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a> <a"+
				"\thref=\"\""+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card -develop -karachi -isna -umm-al-qura -hide\""+
				"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 0); opacity: 1; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\""+
				"\tdata-session-id=\"ceb44645-6eca-e311-b297-00155d5066d7\">"+
				"<div class=\"card__content -gutterless  timetile -hanafii\">"+
				"<div id=\"prayer-times-Hanafii-13\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-h-13-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\tstyle=\"position: absolute; top: 0px; width: 100px; height: 100px; overflow: hidden; display: block; z-index: 1000; -webkit-transform: translate3d(0px, 0px, 0px); left: 0px;\">"+
				"<!-- Date<span>Month</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-h-13\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-h-13\">"+
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">Hanafii,ISNA</span>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</a>"+*/
				""+
				""+
				"</div>"+
				""+
				"<div"+
				"\tclass=\"schedule__col -right -width-1-4 -full-height hide-for-small-only js-large-filters js-sticky-container\">"+
				"<div class=\"stick-element-spacer\" style=\"\">"+
				"<div class=\"filters__headline -wrapper js-filters-headline\">"+
				"\tFilters</div>"+
				"<ul class=\"filters js-filter-holder\" style=\"height: 286px;\">"+
				"<li class=\"filter__group -theme\">"+
				"<div class=\"video__filter filter js-filter\""+
				"\tdata-filter-by=\"design\" data-filter-name=\"Shafii - Default\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -dark-blue\"></div>"+
				"<span class=\"filter__label\">Shafii - Default</span>"+
				"</div>"+
				""+
				"<div class=\"video__filter filter js-filter\""+
				"\tdata-filter-by=\"develop\" data-filter-name=\"Hanafii\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -blue\"></div>"+
				"<span class=\"filter__label\">Hanafii</span>"+
				"</div>"+
				""+
				"<!-- <div id=\"umm-al-qura\" class=\"video__filter filter js-filter\""+
				"\tdata-filter-by=\"distribute\" data-filter-name=\"Umm Al-Qura\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -pink\"></div>"+
				"<span class=\"filter__label\">Umm Al-Qura</span>"+
				"</div> -->"+
				"</li>"+
				""+
				"<li class=\"filter__group -tags\">"+
				"<div class=\"js-tags\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div id=\"isna1\" class=\"video__filter filter js-filter -mobile\""+
				"\tdata-filter-by=\"isna\" data-filter-name=\"ISNA - Default\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -grey\"></div>"+
				"<span class=\"filter__label\">ISNA - Default</span>"+
				"</div>"+
				""+
				"<div id=\"karachi1\" class=\"video__filter filter js-filter -mobile\""+
				"\tdata-filter-by=\"karachi\" data-filter-name=\"Karachi\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -grey\"></div>"+
				"<span class=\"filter__label\">Karachi</span>"+
				"</div>"+
				"\t"+
				"<div id=\"umm-al-qura1\" class=\"video__filter filter js-filter -mobile\""+
				"\tdata-filter-by=\"umm-al-qura\" data-filter-name=\"Umm Al-Qura\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -grey\"></div>"+
				"<span class=\"filter__label\">Umm Al-Qura</span>"+
				"</div>"+
				"</div>"+
				"</li>"+
				"</ul>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</section>"+
				""+
				"<div class=\"filters__holder-mobile js-mobile-filter-holder -hide\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filters__headline -wrapper -mobile\">"+
				"\tFilter the selection <span"+
				"\tclass=\"filters__close icon -close-grey -actionable -absolute -right js-filters-dismiss\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">Close</span>"+
				"</div>"+
				"<ul class=\"filters js-filter-holder\">"+
				"<li class=\"filter__group -theme\">"+
				"<div class=\"filter js-filter -mobile\" data-filter-by=\"design\""+
				"\tdata-filter-name=\"Shafii - Default\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -dark-blue\"></div>"+
				"<span class=\"filter__label\">Shafii - Default</span>"+
				"</div>"+
				""+
				"<div class=\"filter js-filter -mobile\" data-filter-by=\"develop\""+
				"\tdata-filter-name=\"Hanafii\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -blue\"></div>"+
				"<span class=\"filter__label\">Hanafii</span>"+
				"</div>"+
				""+
				"<!-- <div class=\"filter js-filter -mobile\" data-filter-by=\"distribute\""+
				"\tdata-filter-name=\"Umm Al-Qura\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -pink\"></div>"+
				"<span class=\"filter__label\">Umm Al-Qura</span>"+
				"</div> -->"+
				"</li>"+
				""+
				"<li class=\"filter__group -tags\">"+
				"<div id=\"isna\" class=\"filter js-filter -mobile\" data-filter-by=\"isna\""+
				"\tdata-filter-name=\"ISNA - Default\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -grey\"></div>"+
				"<span class=\"filter__label\">ISNA - Default</span>"+
				"</div>"+
				""+
				"<div id=\"karachi\" class=\"filter js-filter -mobile\" data-filter-by=\"karachi\""+
				"\tdata-filter-name=\"Karachi\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -grey\"></div>"+
				"<span class=\"filter__label\">Karachi</span>"+
				"</div>"+
				"\t"+
				"<div id=\"umm-al-qura\" class=\"filter js-filter -mobile\" data-filter-by=\"umm-al-qura\""+
				"\tdata-filter-name=\"Umm Al-Qura\""+
				"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
				"<div class=\"filter__radio -grey\"></div>"+
				"<span class=\"filter__label\">Umm Al-Qura</span>"+
				"</div>"+
				""+
				"</li>"+
				"</ul>"+
				"</div>"+
				""+
				"<footer class=\"section footer g-bg-light-grey -border-top\">"+
				"<div class=\"row\">"+
				"<div class=\"col -width-whole\">"+
				"<div class=\"left\">"+
				"<div id=\"___plusone_0\""+
				"\tstyle=\"text-indent: 0px; margin: 0px; padding: 0px; border-style: none; float: none; line-height: normal; font-size: 1px; vertical-align: baseline; display: inline-block; width: 38px; height: 24px; background: transparent;\">"+
				"<div class=\"g-plusone\" data-annotation=\"inline\" data-width=\"300\"></div>"+
				"</div>"+
				"</div>"+
				""+
				"<div class=\"right\">"+
				"<a class=\"icon -google\" href=\"//findazan.info\" target=\"_blank\">FindAzan</a>"+
				"</div>"+
				""+
				"<div class=\"footer__links -top-buffer\">"+
				"<div class=\"footer__link\">"+
				"<a href=\"/help\">Help</a>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</div>"+
				"</footer>"+
				"</div>"+
				"</div>"+
				"\t"+
				"<meta name=\"timezone-id\" content=\""+prayers.getTimeZone()+"\">"+
				"<script src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/libs.min.js\"></script>"+
				//"<script src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/site1.min.js\"></script>"+
				"<script src=\""+Util.PROPERTIES.get("SITE_JS")+"\"></script>"+
				"<script>"+
				"      io.init('videos');"+
				"</script>"+
				MetaHandler.ANALYTICS +
				"<script src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/partials1.min.js\"></script>"+
				"<div class=\"hud-renderer\" style=\"\">"+
				"\t"+
				"</div>"+
				"</body>";
		out.write(body);
	}
	
	public String makeTiles(){
		String res = "";
		res = makeAdTile();
		for(int i = 0; i <= 13; i++){
			if(dto.getZoneName() == null){
				res += makeTile("Shafii", "", ""+ i, "-design", "");
			}else{
				res += makeTile("Shafii", "", i, "-design", "");
			}
		}
		for(int i = 0; i <= 13; i++){
			if(dto.getZoneName() == null){
				res += makeTile("Hanafii","h", ""+ i, "-develop", "-hide");
			}else{
				res += makeTile("Hanafii","h", i, "-develop", "-hide");
			}
		}
		return res;
	}
	
	/**
	 * 
	 * @param s Shafii
	 * @return
	 */
	public static String makeTile(String s, String j, String i, String design, String hide){
		String t = "<div"+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card "+design+" -karachi -isna -umm-al-qura "+hide+"\""+">"+
				"<div class=\"card__content -gutterless timetile -"+s.toLowerCase()+"\">"+
				"<div id=\"prayer-times-"+s+ "-"+i+"\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-" +j+"-"+i+"-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\t>"+
				"<!-- 13<span>Jul</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-"+j+"-"+i+"\" class=\"event__content -quran\">"+
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-"+j+"-"+i+"\">"+ //prayer-times-sub-h-13
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">"+s+",ISNA</span>"+
				"</div>"+
				"</div>"+
				""+
				"</div>"+
				"</div>";
		return t;
	}
	
	//makeTile("Shafii", "", ""+ i, "-design", "");
	public String makeTile(String s, String j, int i, String design, String hide){
		String[] dateTitle = prayers.getMonthInfo(i);
		String t = "";
		t += "<div"+
				"\tclass=\"video__card card -width-1-3 -medium-only-sched-1-3 -mobile-whole js-event-card "+design+" -karachi -isna -umm-al-qura "+hide+"\""+">"+
				"<div class=\"card__content -gutterless timetile -"+s.toLowerCase()+"\">"+
				"<div id=\"prayer-times-"+s+ "-"+i+"\" class=\"timeslot__events\">"+
				"<div id=\"prayer-times-" +j+"-"+i+"-title\""+
				"\tclass=\"timeslot__label g-color-slate-grey js-timeslot-label js-sticky-element fixed\""+
				"\t>"+
				dateTitle[0] + "<span>" + dateTitle[1] + "</span>" +
				"<!-- 13<span>Jul</span> -->"+
				"</div>"+
				"<div class=\"\">"+
				"<div id=\"prayer-times-"+j+"-"+i+"\" class=\"event__content -quran\">"+
				prayers.print(i) +
				"</div>"+
				"</div>"+
				"<div id=\"prayer-times-sub-"+j+"-"+i+"\">"+ //prayer-times-sub-h-13
				"<span class=\"video-card__speakers g-light-grey\""+
				"\tstyle=\"position: relative; bottom: 0; right: 0; font-size: 10px;\">"+s+",ISNA</span>"+
				"</div>"+
				"</div>"+
				""+
				"</div>"+
				"</div>";
		return t;
	}
	
	public String makeAdTile(){
		return "<div style=height=100px;>"+
					"<script async src=\"//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>" +
					"<!-- findazan-test -->" +
					"<ins class=\"adsbygoogle\" " +
					     "style=\"display:block\" "+
					     "data-ad-client=\"ca-pub-5648075695468923\" " +
					     "data-ad-slot=\"5343743619\"" +
					     "data-ad-format=\"auto\"></ins>"+
					"<script>"+
					"(adsbygoogle = window.adsbygoogle || []).push({});"+
					"</script>"+
				"</div>";
	}
}
