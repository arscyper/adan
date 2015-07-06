package com.app.servlet;

import java.io.PrintWriter;

public class HelpBody {
	PrintWriter out;
	HelpBody(PrintWriter out){
		this.out = out;
		out.write(body);
	}
	
	String body="<body class=\"help hoverable\" data-google-drive-client-id=\"237695054204-umlfeaogsp53dibh6nc462fa2invrven.apps.googleusercontent.com\">"+
			"<div class=\"details js-details -hide\">"+
			"<div class=\"details__dismiss js-scrim-dismiss-main\">&nbsp;</div>"+
			"<div class=\"details__card js-details-card\">&nbsp;</div>"+
			"</div>"+
			""+
			"<div class=\"toggle-basement js-basement\" data-toggle-name=\"basement\" data-direction=\"left\">"+
			"<div class=\"basement js-toggle-content--basement\">"+
			"<nav class=\"nav -mobile\">"+
			"<a class=\"nav__item -mobile -logo\" href=\"/prayer\"><span class=\"icon -mosque -clean\">FindAzan</span></a>"+
			"<a class=\"nav__item -mobile -home\" href=\"/prayer\">Home</a>"+
			"<a class=\"nav__item -mobile -logistics\" href=\"/schedule\">Schedule</a>"+
			"<a class=\"nav__item -mobile -help show-for-small-only active\" href=\"/help\">Help</a>"+
			"</nav>"+
			"</div>"+
			""+
			"<!--[if lt IE 9]>"+
			"<div class=\"butter-bar g-bg-baby-blue -secondary-padding v-align text-center\">"+
			"<h1 class=\"h1 g-color-blue -padding-sides text-right\">:(</h1>"+
			""+
			"<p class=\"g-color-charcoal text-left\">"+
			" Your current browser can't handle this site."+
			"<br>"+
			" It may be time to <a class=\"g-color-blue\" href=\"http://whatbrowser.org\" target=\"_blank\">upgrade</a>."+
			"</p>"+
			"</div>"+
			"<![endif]-->"+
			""+
			"<div class=\"wrapper js-basement-sibling\">"+
			"<header class=\"header hide-for-x-large -lighter post-keynote-header js-nav\">"+
			"<nav class=\"nav -desktop\">"+
			"<a class=\"nav__item -desktop -logo\" href=\"/prayer\"><span class=\"icon -mosque -small\">FindAzan</span></a>"+
			"<a class=\"nav__item -desktop -home hide-for-small-only\" href=\"/prayer\">Home</a>"+
			"<a class=\"nav__item -desktop -schedule hide-for-small-only\" href=\"/schedule\">Schedule</a>"+
			"<div class=\"menu js-toggler--basement\">"+
			"<span class=\"icon -menu-black\">Navigation</span>"+
			"</div>"+
			"</nav>"+
			"</header>"+
			" "+
			"<div class=\"bucket g-bg-white -primary-padding-top -last-padding js-toggle-back-to-top\">"+
			"<div class=\"bucket__background -shorter -mobile-full g-bg-purple-blue\"></div>"+
			""+
			"<h1 class=\"bucket__headline -top-buffer h1 g-color-white -padding-sides\">"+
			" Have a question?"+
			"</h1>"+
			""+
			"<div class=\"row\">"+
			"<div class=\"card -buffer col -width-whole\">"+
			"<div class=\"card__content -gutterless-sides g-bg-white\">"+
			"<div class=\"row\">"+
			"<div class=\"col -width-1-3\">"+
			"<div class=\"-card-padding-sides\">"+
			"<h3 class=\"h3\">Islamic School of thought</h3>"+
			""+
			"<ol class=\"g-color-blue\">"+
			"<li><a href=\"#shafii\" class=\"js-scroll-to\">Shafii</a></li>"+
			"<li><a href=\"#hanafi\" class=\"js-scroll-to\">Hanafi</a></li>"+
			"</ol>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"col -width-1-3\">"+
			"<div class=\"-card-padding-sides\">"+
			"<h3 class=\"h3\">Calculation types</h3>"+
			""+
			"<ol class=\"g-color-blue\">"+
			"<li><a href=\"#isna\" class=\"js-scroll-to\">ISNA</a></li>"+
			"<li><a href=\"#karachi\" class=\"js-scroll-to\">Karachi</a></li>"+
			"<li><a href=\"#umm-al-qura\" class=\"js-scroll-to\">Umm Al-Qura</a></li>"+
			"</ol>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"col -width-1-3\">"+
			"<div class=\"-card-padding-sides\">"+
			"<h3 class=\"h3\">Helpful definitions</h3>"+
			"<ol class=\"g-color-blue\">"+
			"<li><a href=\"#azan\" class=\"js-scroll-to\">Azan</a></li>"+
			"<li><a href=\"#salat\" class=\"hs-scroll-to\">Salat</a></li>"+
			"<li><a href=\"#adan\" class=\"hs-scroll-to\">Adan</a></li>"+
			"<li><a href=\"#athan\" class=\"hs-scroll-to\">Athan</a></li>"+
			"</ol>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			""+
			"<section class=\"section g-bg-white -mobile-top-gutter -bottom-gutter-large\">"+
			"<div class=\"row\">"+
			"<div class=\"col -width-2-3\">"+
			"<h2 class=\"h2 -bottom-buffer\">Islamic School of thought</h2>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"row\">"+
			"<dl class=\"col -width-3-4\">"+
			"<dt class=\"h3\" id=\"shafii\">Shafii</dt>"+
			"<dd>"+
			" The Shafi'i (Arabic: \u0634\u0627\u0641\u0639\u064A\u200E \u0160\u0101fi\u02BF\u012B ) school of thought is one of the schools of jurisprudence within the Sunni branch of Islam, adhering to the teachings of the Muslim Arab scholar of jurisprudence, Al-Shafi'i of the prestigious Quraysh tribe."+
			"</dd>"+
			""+
			"<dt class=\"h3\" id=\"hanafi\">Hanafii</dt>"+
			"<dd>"+
			" The Hanafi (Arabic: \u062D\u0646\u0641\u064A\u200E \u1E24anaf\u012B) school is one of the four Sunni madhhabs (schools of law) in fiqh (Islamic jurisprudence). It is named after the scholar Ab\u016B \u1E24an\u012Bfa an-Nu\u2018man ibn Th\u0101bit, a tabi\u2018i whose legal views were preserved primarily by his two most important disciples, Abu Yusuf and Muhammad al-Shaybani."+
			"</dd>"+
			"</dl>"+
			"</div>"+
			"</section>"+
			""+
			"<section class=\"section g-bg-white -bottom-gutter-large\">"+
			"<div class=\"row\">"+
			"<div class=\"col -width-2-3\">"+
			"<h2 class=\"h2 -bottom-buffer\">Calculation types</h2>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"row\">"+
			"<dl class=\"col -width-3-4\">"+
			"<dt class=\"h3\" id=\"isna\">Islamic Society of North America (ISNA)</dt>"+
			"<dd>"+
			" Fajr Angle"+
			"<ul>"+
			"<li>15 degrees</li>"+
			"</ul>"+
			"</dd>"+
			"<dd>"+
			" Maghrib"+
			"<ul>"+
			"<li>0 minute after sunset</li>"+
			"</ul>"+
			"</dd>"+
			"<dd>"+
			" Isha"+
			"<ul>"+
			"<li>15 degrees</li>"+
			"</ul>"+
			"</dd>"+
			"<dt class=\"h3\" id=\"karachi\">University of Islamic Sciences, Karachi</dt>"+
			"<dd>"+
			" Fajr Angle"+
			"<ul>"+
			"<li>18 degrees</li>"+
			"</ul>"+
			"</dd>"+
			"<dd>"+
			" Maghrib"+
			"<ul>"+
			"<li>0 minute after sunset</li>"+
			"</ul>"+
			"</dd>"+
			"<dd>"+
			" Isha"+
			"<ul>"+
			"<li>18 degrees</li>"+
			"</ul>"+
			"</dd>"+
			"<dt class=\"h3\" id=\"umm-al-qura\">Umm al-Qura, Makkah</dt>"+
			"<dd>"+
			" Fajr Angle"+
			"<ul>"+
			"<li>18.5 degrees</li>"+
			"</ul>"+
			"</dd>"+
			"<dd>"+
			" Maghrib"+
			"<ul>"+
			"<li>0 minute after sunset</li>"+
			"</ul>"+
			"</dd>"+
			"<dd>"+
			" Isha"+
			"<ul>"+
			"<li>90 minutes after Maghrib</li>"+
			"</ul>"+
			"</dd>"+
			" "+
			"</dl>"+
			"</div>"+
			"</section>"+
			""+
			"<section class=\"section g-bg-white -bottom-gutter-large\">"+
			"<div class=\"row\">"+
			"<div class=\"col -width-2-3\">"+
			"<h2 class=\"h2 -bottom-buffer\">Helpful definitions</h2>"+
			"<h3 class=\"h3 -shorter -offset-up -bottom-buffer\">Definition of some of the common words being used throughout the application</h3>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"row\">"+
			"<dl class=\"col -width-3-4\">"+
			"<dt class=\"h3\" id=\"azan\">Azan</dt>"+
			"<dd>"+
			" the Muslim call to ritual prayer, typically made by a muezzin from the minaret of a mosque."+
			"</dd>"+
			"<dt class=\"h3\" id=\"salat\">Salat</dt>"+
			"<dd>"+
			" the ritual prayer of Muslims, performed five times daily in a set form. This if followed by Azan"+
			"</dd>"+
			"<dt class=\"h3\" id=\"adan\">Adan</dt>"+
			"<dd>"+
			" An alternate to \"Azan\" "+
			"</dd>"+
			"<dd>"+
			" the Muslim call to ritual prayer, typically made by a muezzin from the minaret of a mosque."+
			"</dd>"+
			"<dt class=\"h3\" id=\"athan\">Athan</dt>"+
			"<dd>"+
			" An alternate to \"Azan\" "+
			"</dd>"+
			"<dd>"+
			" the Muslim call to ritual prayer, typically made by a muezzin from the minaret of a mosque."+
			"</dd>"+
			"</dl>"+
			"</div>"+
			"</section>"+
			"<div class=\"back-to-top js-back-to-top\" style=\"visibility: hidden; opacity: 0; transform: matrix(1, 0, 0, 1, 0, 50); -webkit-user-select: none; touch-action: pan-y; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); margin-bottom: 0px;\">Back to top</div>"+
			"<footer class=\"section footer g-bg-light-grey -border-top\">"+
			"<div class=\"row\">"+
			"<div class=\"col -width-whole\">"+
			"<div class=\"left\">"+
			"<div id=\"___plusone_0\" style=\"text-indent: 0px; margin: 0px; padding: 0px; border-style: none; float: none; line-height: normal; font-size: 1px; vertical-align: baseline; display: inline-block; width: 38px; height: 24px; background: transparent;\">"+
			"<div class=\"g-plusone\" data-annotation=\"inline\" data-width=\"300\"></div>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"right\">"+
			"<a class=\"icon -google\" href=\"//findazan.info\" target=\"_blank\">Google</a>"+
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
			" "+
			"<script src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/libs.min.js\"></script>"+
			"<script src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/site1.min.js\"></script>"+
			"<script>"+
			" io.init('help');"+
			"</script>"+
			MetaHandler.ANALYTICS +
			"</body>";
}
