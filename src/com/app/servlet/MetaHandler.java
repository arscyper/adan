package com.app.servlet;

public class MetaHandler {
	public String keywords = "";
	public static String STATIC_KEYWORDS = "Islam, Namaz, Islaam, Islamic, Masjid, Masjids, Mosque, Masque, Mosq, Islamic"+
"Center, Arab, Arabic, Arbi, US, USA, United States, Find, Search engine, Finder, Jumuah, Friday"+
"prayer, organization, muslim, musalman, muslims, publish, Arabian, Middleast, Mideast, prayer time,"+
"World, World Prayer, All world, Continents, businesses, business, salat, solat, time, times, GMT, daylight,"+ 
"timezone, advertisement, search, longitude, latitude, qibla, kibla, direction, pakistan, saudi arabia, asia,kaaba,"+
"europe, africa, geography, azaan, adhan, adhaan, namaz, fajr, shurooq, asr, maghrib, isha, Allah,"+
"Muhammad, Quran, pray, country, city, small town, ramadan, ramazan, ramadhan, muslim prayer times, Muslim Prayer Times, Islamic Prayer times, Namaz Salat, 1436 Ramadan 2015, Namaz Times, Prayer Timetable, Ramadan Timings, Ramadan Timetable, Namaz/Namaaz Timings, Prayertimes, Mp3 Athan Azan,"+
"islamic prayer times, Athan, Adan, Azan, Azaan, Adhan, Salat, Salah, Articles, إلإسلام, إسلام, مسلم, المسلمين, المسلمون, الإسلامية, مسجد, مساجد, مركز إسلامي, مؤسسة إسلامية, محلات تجارية, عرب, عربي, "+
"عربية, أمريكا, كندا,السعودية, الولايات المتحدة الأمريكية, أوروبا, أفريقيا, آسيا, بحث, محرك بحث, أوقات الصلاة,الصلاة, الجمعة, القبلة, التاريخ, التقويم,"+
"محول التاريخ, تحويل التاريخ, الكعبة, خارطة جغرافية, مدن, مدينة, دول, دولة, العالم,دول العالم, اتجاه, اتجاه القبلة, خط الطول, خط العرض, برنامج الأذان للجوال ,"+
"الفجر, الظهر, العصر, المغرب,العشاء, أذان, الأذان, الإشراق, الشروق,رمضان, شهر رمضان, شهر, شهور, الحج, قرآن ,القرآن , محمد, الله, يوم, أيام,"+
"ليلة القدر, عيد , عيد الفطر, عيد الأضحى ";
	
	public MetaHandler(){} 
	
	public String getMeta(String title, String desc, String imageUrl, String url){
		title = (title == null || title.isEmpty()) ? "Find Azan" : title;
		desc = (desc == null || desc.isEmpty()) ? "Find Azan bring you the real time salat/azan information for cities around the world!" : desc;
		imageUrl = (imageUrl == null || imageUrl.isEmpty()) ? "http://www.findazan.info/images/fb.png" : imageUrl;
		url = (url == null || url.isEmpty()) ? "http://www.findazan.info" : url;
		String meta ="<meta content=\"IE=edge\" http-equiv=\"X-UA-Compatible\">"+
				"<meta charset=\"utf-8\">"+
				"<meta content=\"width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no,target-densitydpi=160\" name=\"viewport\">"+
				"<meta http-equiv=\"cleartype\" content=\"on\">"+
				"<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">"+
				"<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black-translucent\">"+
				"<meta name=\"keywords\" content=\""+ STATIC_KEYWORDS + keywords+"\">"+
				"<meta property=\"og:type\" content=\"website\">"+
				"<meta property=\"og:title\" content=\""+title+"\">"+
				"<meta property=\"og:description\" content=\""+desc+"\">"+
				"<meta property=\"og:image\" content=\""+imageUrl+"\">"+
				"<meta property=\"og:url\" content=\""+url+"\">"+
				"<meta name='yandex-verification' content='452b74c97165ea88' />" +
				"<meta name=\"alexaVerifyID\" content=\"Uv53T04xLjx5qrhhlDPVMY6WCUY\"/>"+
				"<meta name=\"google-site-verification\" content=\"jfOUqw70NlcjRmMnD60ZA3Y1XcHLX3ujmPNYonBz8j4\"/>";
		return meta;
	}
	
	public static String ANALYTICS = "<script src=\"//www.google.com/js/gweb/analytics/autotrack.js\"></script>"+ 
    "<script>new gweb.analytics.AutoTrack({ profile: 'UA-52877210-1'});</script>"+
    "<script type=\"text/javascript\">"+
      "window.___gcfg = { parsetags: 'explicit' };"+
      "(function() {"+
        "var po = document.createElement('script');"+
        "po.type = 'text/javascript'; po.async = true;"+
        "po.src = 'https://plus.google.com/js/client:plusone.js';"+
        "var s = document.getElementsByTagName('script')[0];"+
        "s.parentNode.insertBefore(po, s);"+
      "})();"+
    "</script>";
	
	
	public String getResourceLinks(){
		String res= "<link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\">"+
				"<link rel=\"apple-touch-icon\" href=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/apple-touch-icon.png\">"+
				"<link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/apple-touch-icon-57x57.png\">"+
				"<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/apple-touch-icon-72x72.png\">"+
				"<link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/apple-touch-icon-76x76.png\">"+
				"<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/apple-touch-icon-114x114.png\">"+
				"<link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/apple-touch-icon-120x120.png\">"+
				"<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/apple-touch-icon-144x144.png\">"+
				"<link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/apple-touch-icon-152x152.png\">"+
				"<link href=\"//fonts.googleapis.com/css?family=Roboto:400,300,100\" rel=\"stylesheet\">"+
				"<link href=\"/css/site.css\" rel=\"stylesheet\">";
		return res;
	}
	
	public String getScripts(){
		String s="<script src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/modernizr.js\" type=\"text/javascript\"></script>\n"+
				"<script type=\"text/javascript\" language=\"javascript\" src=\""+ Util.PROPERTIES.get("PRAYER_JS")+"\"></script>\n"+
				"<script src=\"https://apis.google.com/js/platform.js\" async defer type=\"text/javascript\"></script>";
		return s;
	}
	
	public String getScripts1(){
		String s = "<script type=\"text/javascript\" language=\"javascript\" src=\""+Util.PROPERTIES.get("SCHEDULE_JS")+"\"></script>" +
				"<script src=\"https://apis.google.com/js/platform.js\" async defer></script>"+
				"<script type=\"text/javascript\" async=\"\" src=\"https://plus.google.com/js/client:plusone.js\" gapi_processed=\"true\"></script>"+ 
				"<script type=\"text/javascript\" async=\"\" src=\"https://ssl.google-analytics.com/ga.js\"></script>" +
				"<script type=\"text/javascript\">var sessionDetails;</script>" +
				"<script src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/modernizr.js\"></script>";
		return s;
	}
	
	public String getHelpScripts(){
		String s = "<script type=\"text/javascript\" async src=\"https://plus.google.com/js/client:plusone.js\" gapi_processed=\"true\"></script>"+
                   "<script type=\"text/javascript\" async src=\"https://ssl.google-analytics.com/ga.js\"></script>"+ 
                   "<script type=\"text/javascript\">var sessionDetails;</script>"+
                   "<script src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/modernizr.js\"></script>"+
                   "<script src=\"https://apis.google.com/js/platform.js\" async defer type=\"text/javascript\"></script>";
		return s;
	}

}
