package com.app.servlet;

import java.io.PrintWriter;
/*

*/
public class HomeBody {
	PrintWriter out;
	HomeBody(PrintWriter out){
		this.out = out;
		out.write(body);
	}
	
/*	String search_add = "<div class=\"div__stat -walking\">"+
							"<span class=\"data__label\">"+
							"<script async "+
								"src=\"//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\" "+
								"type=\"text/javascript\"></script>"+
												"<!-- findazan-test -->"+
												"<ins class=\"adsbygoogle\" "+
													"style=\"display: inline-block; width: 320px; height: 50px\" "+
													"data-ad-client=\"ca-pub-5648075695468923\" "+
													"data-ad-slot=\"5343743619\"></ins>"+
									"<script type=\"text/javascript\">"+
										"(adsbygoogle = window.adsbygoogle || []).push({});"+
									"</script>"+	
							"</span>"+  
							
						"</div>";*/
	String search_add = "";
	
	String body="<body class=\"logistics hoverable\""+
			"\tdata-google-drive-client-id=\"237695054204-umlfeaogsp53dibh6nc462fa2invrven.apps.googleusercontent.com\">"+
			"<div class=\"details js-details -hide\">"+
			"<div class=\"details__dismiss js-scrim-dismiss-main\">&nbsp;</div>"+
			"<div class=\"details__card js-details-card\">&nbsp;</div>"+
			"</div>"+
			""+
			"<div class=\"toggle-basement js-basement\" data-toggle-name=\"basement\""+
			"\tdata-direction=\"left\">"+
			"<div class=\"basement js-toggle-content--basement\">"+
			"<nav class=\"nav -mobile\">"+
			"<a class=\"nav__item -mobile -logo\" href=\"/prayer\"> <span"+
			"\tclass=\"icon -mosque -clean\">Find Azan</span></a> <a"+
			"\tclass=\"nav__item -mobile -home active\" href=\"/prayer\">Home</a>"+
			"<a class=\"nav__item -mobile -schedule\" href=\"/schedule\">Schedule</a>"+
			"<a class=\"nav__item -mobile -help show-for-small-only\""+
			"\thref=\"/help\">Help</a>"+
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
			"\tclass=\"icon -mosque\">Find Azan</span></a> <a"+
			"\tclass=\"nav__item -desktop -home hide-for-small-only active\""+
			"\thref=\"/prayer\">Home</a> <a"+
			"\tclass=\"nav__item -desktop -schedule hide-for-small-only\""+
			"\thref=\"/schedule\">Schedule</a>"+
			/*"<!-- <a class=\"nav__item -desktop -sandbox hide-for-small-only\" href=\"/events/io/sandbox\">Sandbox</a>"+
			"<a class=\"nav__item -desktop -schedule hide-for-small-only\" href=\"/events/io/schedule\">Schedule</a>"+
			"<a class=\"nav__item -desktop -io-extended hide-for-small-only\" href=\"/events/io/io-extended\">I/O Extended</a>"+
			"<a class=\"nav__item -desktop -logistics hide-for-small-only active\" href=\"/events/io/logistics\">Logistics</a>"+
			"<a class=\"nav__item -desktop -videos hide-for-small-only\" href=\"/events/io/io14videos\">Videos</a>"+
			"<a class=\"nav__item -desktop -experiment hide-for-small-only\" href=\"/events/io/experiment\">Experiment</a>"+
			"             -->"+*/
			"<div class=\"menu js-toggler--basement\""+
			"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
			"<span class=\"icon -menu-black\">Navigation</span>"+
			"</div>"+
			"</nav>"+
			"</header>"+
			""+
			"<div"+
			"\tclass=\"bucket -primary g-bg-dark-blue g-color-white experiment-partial -clouds js-experiment-partial\">"+
			"<div class=\"v-align -whole\">"+
			"<div class=\"v-align__element -bottom\">"+
			"<h1 class=\"bucket__headline -bottom h1 allow-orphan\">Get"+
			"\tready for Salat/Namaz</h1>"+
			"</div>"+
			"</div>"+
			"<div class=\"renderer\""+
			"\tstyle=\"overflow: hidden; -webkit-transform-style: preserve-3d; width: 1263px; height: 600px; position: absolute; top: 0px; left: 0px; -webkit-perspective: 1701.3845458853127px;\">"+
/*			"<div"+
			"\tstyle=\"-webkit-transform-style: preserve-3d; width: 1263px; height: 600px; -webkit-transform: translate3d(0px, 0px, 1701.3845458853127px) matrix3d(1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, -500, 1) translate3d(631.5px, 300px, 0px);\">"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(0.13743393123149872, 0, -0.18856394290924072, 0, 0, -0.23333333432674408, 0, 0, 0.18856394290924072, 0, 0.13743393123149872, 0, 127.77222442626953, -16, -7.919685363769531, 1); -webkit-filter: brightness(0.856287807226181);\">"+
			"<rect id=\"exp-svg-21\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#F2B329\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(-0.18856394290924072, 0, -0.13743393123149872, 0, 0, -0.23333333432674408, 0, 0, 0.13743393123149872, 0, -0.18856394290924072, 0, 114.08031463623047, -16, -5.7722249031066895, 1); -webkit-filter: brightness(0.9327460825443268);\">"+
			"<rect id=\"exp-svg-22\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#FA5357\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(-0.13743393123149872, 0, 0.18856394290924072, 0, 0, -0.23333333432674408, 0, 0, -0.18856394290924072, 0, -0.13743393123149872, 0, 116.22777557373047, -16, 7.919685363769531, 1); -webkit-filter: brightness(0.856287807226181);\">"+
			"<rect id=\"exp-svg-23\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#F2B329\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(0.18856394290924072, 0, 0.13743393123149872, 0, 0, -0.23333333432674408, 0, 0, -0.13743393123149872, 0, 0.18856394290924072, 0, 129.91969299316406, -16, 5.7722249031066895, 1); -webkit-filter: brightness(0.9327460825443268);\">"+
			"<rect id=\"exp-svg-24\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#FA5357\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(-0.16666661202907562, 0, 0.00014606564946006984, 0, 0, -0.1666666716337204, 0, 0, -0.00014606564946006984, 0, -0.16666661202907562, 0, 51.000003814697266, -46, 0.006134756840765476, 1); -webkit-filter: brightness(0.9999999791383744);\">"+
			"<rect id=\"exp-svg-25\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#34C7D9\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(0.00014606564946006984, 0, 0.16666661202907562, 0, 0, -0.1666666716337204, 0, 0, -0.16666661202907562, 0, 0.00014606564946006984, 0, 58.006134033203125, -46, 6.999997615814209, 1); -webkit-filter: brightness(0.650125666592794);\">"+
			"<rect id=\"exp-svg-26\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#34C7D9\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(0.16666661202907562, 0, -0.00014606564946006984, 0, 0, -0.1666666716337204, 0, 0, 0.00014606564946006984, 0, 0.16666661202907562, 0, 65, -46, -0.006134756840765476, 1); -webkit-filter: brightness(0.9999999791383744);\">"+
			"<rect id=\"exp-svg-27\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#34C7D9\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(-0.00014606564946006984, 0, -0.16666661202907562, 0, 0, -0.1666666716337204, 0, 0, 0.16666661202907562, 0, -0.00014606564946006984, 0, 57.993865966796875, -46, -6.999997615814209, 1); -webkit-filter: brightness(0.650125666592794);\">"+
			"<rect id=\"exp-svg-28\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#34C7D9\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(0.3276976943016052, 0, -0.06103545427322388, 0, 0, -0.3333333432674408, 0, 0, 0.06103545427322388, 0, 0.3276976943016052, 0, 18.763303756713867, 8, -2.5634889602661133, 1); -webkit-filter: brightness(0.9941153526306152);\">"+
			"<rect id=\"exp-svg-29\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#29C659\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(-0.06103545427322388, 0, -0.3276976943016052, 0, 0, -0.3333333432674408, 0, 0, 0.3276976943016052, 0, -0.06103545427322388, 0, 2.4365110397338867, 8, -13.76330280303955, 1); -webkit-filter: brightness(0.7139111079275609);\">"+
			"<rect id=\"exp-svg-30\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#34C7D9\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(-0.3276976943016052, 0, 0.06103545427322388, 0, 0, -0.3333333432674408, 0, 0, -0.06103545427322388, 0, -0.3276976943016052, 0, -8.76330280303955, 8, 2.5634889602661133, 1); -webkit-filter: brightness(0.9941153526306152);\">"+
			"<rect id=\"exp-svg-31\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#29C659\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"84\" height=\"180\""+
			"\tviewBox=\"-34.98 -0.22 100.98 211\""+
			"\tstyle=\"display: block; overflow: hidden; width: 84px; height: 180px; position: absolute; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(0.06103545427322388, 0, 0.3276976943016052, 0, 0, -0.3333333432674408, 0, 0, -0.3276976943016052, 0, 0.06103545427322388, 0, 7.563488960266113, 8, 13.76330280303955, 1); -webkit-filter: brightness(0.7139111079275609);\">"+
			"<rect id=\"exp-svg-32\" x=\"-35\" y=\"189.78\" fill=\"#546E7A\""+
			"\twidth=\"11\" height=\"19.999\"></rect>"+
			"<path fill=\"#34C7D9\""+
			"\td=\"M-34.98-0.22v180.686h14.96c0-40.033,55.04-60.049,55.04-110.686C35.02,31.12,3.68-0.22-34.98-0.22z\"></path></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"300\" height=\"300\""+
			"\tviewBox=\"0 0 144 144\""+
			"\tstyle=\"display: block; overflow: hidden; width: 300px; height: 300px; position: absolute; -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(0.13333334028720856, 0, 0, 0, 0, -0.13333334028720856, 0, 0, 0, 0, 0.13333334028720856, 0, 170, -18, 0, 1);\">"+
			"<g>\t<g opacity=\"0.05\">\t<path fill=\"#010101\""+
			"\td=\"M115.282,68.518c-3.602-18.457-19.63-32.377-38.869-32.377c-15.279,0-28.516,8.793-35.132,21.654\tc-15.895,1.734-28.279,15.389-28.279,31.99c0,17.774,14.198,32.186,31.707,32.186h68.697c14.593,0,26.421-12.005,26.421-26.821\tC139.824,80.986,128.978,69.512,115.282,68.518z\"></path>\t<path"+
			"\topacity=\"0.05\" fill=\"#010101\" enable-background=\"new    \""+
			"\td=\"M41.28,57.795C25.385,59.529,13,73.184,13,89.785\tc0,17.774,14.198,32.186,31.707,32.186h31.706v-85.83C61.134,36.141,47.896,44.934,41.28,57.795z\"></path>\t</g>\t<g>\t<g>\t<path"+
			"\tfill=\"#E9F7FE\""+
			"\td=\"M107.615,60.852c-3.603-18.457-19.63-32.377-38.87-32.377c-15.278,0-28.514,8.793-35.131,21.654\tc-15.896,1.733-28.28,15.388-28.28,31.989c0,17.775,14.198,32.186,31.707,32.186h68.696c14.594,0,26.421-12.006,26.421-26.821\tC132.157,73.32,121.311,61.844,107.615,60.852z\"></path>\t<g>\t<path"+
			"\topacity=\"0.05\" fill=\"#46A8DF\" enable-background=\"new    \""+
			"\td=\"M33.613,50.128C17.718,51.862,5.333,65.517,5.333,82.118\tc0,17.775,14.198,32.186,31.707,32.186h31.705V28.475C53.467,28.475,40.229,37.267,33.613,50.128z\"></path>\t</g>\t</g>\t</g></g></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"300\" height=\"300\""+
			"\tviewBox=\"0 0 144 144\""+
			"\tstyle=\"display: block; overflow: hidden; width: 300px; height: 300px; position: absolute; -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(0.0833333358168602, 0, 0, 0, 0, -0.0833333358168602, 0, 0, 0, 0, 0.0833333358168602, 0, 49, -44, -50, 1);\">"+
			"<g>\t<g opacity=\"0.05\">\t<path fill=\"#010101\""+
			"\td=\"M115.282,68.518c-3.602-18.457-19.63-32.377-38.869-32.377c-15.279,0-28.516,8.793-35.132,21.654\tc-15.895,1.734-28.279,15.389-28.279,31.99c0,17.774,14.198,32.186,31.707,32.186h68.697c14.593,0,26.421-12.005,26.421-26.821\tC139.824,80.986,128.978,69.512,115.282,68.518z\"></path>\t<path"+
			"\topacity=\"0.05\" fill=\"#010101\" enable-background=\"new    \""+
			"\td=\"M41.28,57.795C25.385,59.529,13,73.184,13,89.785\tc0,17.774,14.198,32.186,31.707,32.186h31.706v-85.83C61.134,36.141,47.896,44.934,41.28,57.795z\"></path>\t</g>\t<g>\t<g>\t<path"+
			"\tfill=\"#E9F7FE\""+
			"\td=\"M107.615,60.852c-3.603-18.457-19.63-32.377-38.87-32.377c-15.278,0-28.514,8.793-35.131,21.654\tc-15.896,1.733-28.28,15.388-28.28,31.989c0,17.775,14.198,32.186,31.707,32.186h68.696c14.594,0,26.421-12.006,26.421-26.821\tC132.157,73.32,121.311,61.844,107.615,60.852z\"></path>\t<g>\t<path"+
			"\topacity=\"0.05\" fill=\"#46A8DF\" enable-background=\"new    \""+
			"\td=\"M33.613,50.128C17.718,51.862,5.333,65.517,5.333,82.118\tc0,17.775,14.198,32.186,31.707,32.186h31.705V28.475C53.467,28.475,40.229,37.267,33.613,50.128z\"></path>\t</g>\t</g>\t</g></g></svg>"+
			"<svg class=\"entity\" preserveAspectRatio=\"none\""+
			"\txmlns=\"http://www.w3.org/2000/svg\" width=\"300\" height=\"300\""+
			"\tviewBox=\"0 0 144 144\""+
			"\tstyle=\"display: block; overflow: hidden; width: 300px; height: 300px; position: absolute; -webkit-transform: translate3d(-50%, -50%, 0px) matrix3d(0.06666667014360428, 0, 0, 0, 0, -0.06666667014360428, 0, 0, 0, 0, 0.06666667014360428, 0, 25, 11, 50, 1);\">"+
			"<g>\t<g opacity=\"0.05\">\t<path fill=\"#010101\""+
			"\td=\"M115.282,68.518c-3.602-18.457-19.63-32.377-38.869-32.377c-15.279,0-28.516,8.793-35.132,21.654\tc-15.895,1.734-28.279,15.389-28.279,31.99c0,17.774,14.198,32.186,31.707,32.186h68.697c14.593,0,26.421-12.005,26.421-26.821\tC139.824,80.986,128.978,69.512,115.282,68.518z\"></path>\t<path"+
			"\topacity=\"0.05\" fill=\"#010101\" enable-background=\"new    \""+
			"\td=\"M41.28,57.795C25.385,59.529,13,73.184,13,89.785\tc0,17.774,14.198,32.186,31.707,32.186h31.706v-85.83C61.134,36.141,47.896,44.934,41.28,57.795z\"></path>\t</g>\t<g>\t<g>\t<path"+
			"\tfill=\"#E9F7FE\""+
			"\td=\"M107.615,60.852c-3.603-18.457-19.63-32.377-38.87-32.377c-15.278,0-28.514,8.793-35.131,21.654\tc-15.896,1.733-28.28,15.388-28.28,31.989c0,17.775,14.198,32.186,31.707,32.186h68.696c14.594,0,26.421-12.006,26.421-26.821\tC132.157,73.32,121.311,61.844,107.615,60.852z\"></path>\t<g>\t<path"+
			"\topacity=\"0.05\" fill=\"#46A8DF\" enable-background=\"new    \""+
			"\td=\"M33.613,50.128C17.718,51.862,5.333,65.517,5.333,82.118\tc0,17.775,14.198,32.186,31.707,32.186h31.705V28.475C53.467,28.475,40.229,37.267,33.613,50.128z\"></path>\t</g>\t</g>\t</g></g></svg>"+
			"</div>"+*/
			"</div>"+
			"</div>"+
			""+
			"<div"+
			"\tclass=\"bucket -secondary g-bg-water-blue hide-for-small-only js-desktop-map\">"+
			"<div class=\"map js-map\""+
			"\tstyle=\"overflow: hidden; -webkit-transform: translateZ(0px); background-color: rgb(229, 227, 223);\">"+
			"<div class=\"gm-style\""+
			"\tstyle=\"position: absolute; left: 0px; top: 0px; overflow: hidden; width: 100%; height: 100%; z-index: 0;\">"+
			"<div"+
			"\tstyle=\"position: absolute; left: 0px; top: 0px; overflow: hidden; width: 100%; height: 100%; z-index: 0;\">"+
			"<div"+
			"\tstyle='position: absolute; left: 0px; top: 0px; z-index: 1; width: 100%; cursor: url(https://maps.gstatic.com/mapfiles/openhand_8_8.cur) 8 8, default; -webkit-transform-origin: 0px 0px; -webkit-transform: matrix(1, 0, 0, 1, 0, 0);'>"+
			"<div"+
			"\tstyle=\"-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; width: 100%; z-index: 200;\">"+
			"<div"+
			"\tstyle=\"-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 101; width: 100%;\"></div>"+
			"</div>"+
			"<div"+
			"\tstyle=\"-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; width: 100%; z-index: 201;\">"+
			"<div"+
			"\tstyle=\"-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 102; width: 100%;\"></div>"+
			"<div"+
			"\tstyle=\"-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 103; width: 100%;\">"+
			"<div"+
			"\tstyle=\"position: absolute; left: 0px; top: 0px; z-index: -1;\">"+
			"<div"+
			"\tstyle=\"position: absolute; left: 0px; top: 0px; z-index: 1;\">"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 345px; top: 178px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 601px; top: 178px;\">"+
			"<canvas draggable=\"false\" height=\"256\" width=\"256\""+
			"\tstyle=\"-webkit-user-select: none; position: absolute; left: 0px; top: 0px; height: 256px; width: 256px;\"></canvas>"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 601px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 345px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 345px; top: 434px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 601px; top: 434px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 89px; top: 178px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 857px; top: 178px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 89px; top: 434px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 857px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 857px; top: 434px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 89px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 1113px; top: 178px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: -167px; top: 178px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: -167px; top: 434px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 1113px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: -167px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; overflow: hidden; -webkit-transform: translateZ(0px); position: absolute; left: 1113px; top: 434px;\"></div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"<div"+
			"\tstyle=\"-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; width: 100%; z-index: 202;\">"+
			"<div"+
			"\tstyle=\"-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 104; width: 100%;\"></div>"+
			"<div"+
			"\tstyle=\"-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 105; width: 100%;\"></div>"+
			"<div"+
			"\tstyle=\"-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 106; width: 100%;\"></div>"+
			"</div>"+
			"<div"+
			"\tstyle=\"-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 100; width: 100%;\">"+
			"<div"+
			"\tstyle=\"position: absolute; left: 0px; top: 0px; z-index: 0;\">"+
			"<div"+
			"\tstyle=\"position: absolute; left: 0px; top: 0px; z-index: 1;\">"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 345px; top: 178px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 601px; top: 178px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 601px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 345px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 345px; top: 434px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 601px; top: 434px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 89px; top: 178px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 857px; top: 178px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 89px; top: 434px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 857px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 857px; top: 434px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 89px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 1113px; top: 178px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: -167px; top: 178px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: -167px; top: 434px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 1113px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: -167px; top: -78px;\"></div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 1113px; top: 434px;\"></div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"<div"+
			"\tstyle=\"position: absolute; left: 0px; top: 0px; z-index: 0;\">"+
			"<div"+
			"\tstyle=\"position: absolute; left: 0px; top: 0px; z-index: 1;\">"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 345px; top: 178px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts0.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=4&amp;y=12&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 601px; top: 178px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts1.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=5&amp;y=12&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 601px; top: -78px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts1.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=5&amp;y=11&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 601px; top: 434px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts1.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=5&amp;y=13&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 345px; top: -78px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts0.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=4&amp;y=11&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 345px; top: 434px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts0.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=4&amp;y=13&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 89px; top: 178px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts1.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=3&amp;y=12&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 89px; top: 434px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts1.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=3&amp;y=13&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 89px; top: -78px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts1.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=3&amp;y=11&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 857px; top: 178px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts0.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=6&amp;y=12&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 1113px; top: 178px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts1.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=7&amp;y=12&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 857px; top: -78px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts0.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=6&amp;y=11&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 857px; top: 434px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts0.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=6&amp;y=13&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: -167px; top: 178px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts0.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=2&amp;y=12&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: -167px; top: 434px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts0.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=2&amp;y=13&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 1113px; top: -78px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts1.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=7&amp;y=11&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: 1113px; top: 434px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts1.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=7&amp;y=13&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"<div"+
			"\tstyle=\"width: 256px; height: 256px; -webkit-transform: translateZ(0px); position: absolute; left: -167px; top: -78px; opacity: 1; transition: opacity 200ms ease-out; -webkit-transition: opacity 200ms ease-out;\">"+
			"<img"+
			"\tsrc=\"https://mts0.googleapis.com/vt?lyrs=m@267000000&amp;src=apiv3&amp;hl=en-US&amp;x=2&amp;y=11&amp;z=5&amp;apistyle=s.e%3Al%7Cp.v%3Aoff%2Cs.t%3A3%7Cs.e%3Ag%7Cp.v%3Aoff%2Cs.t%3A6%7Cp.v%3Aon%7Cp.c%3A%23ff5dc7ff&amp;style=47,37%7Csmartmaps\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; -webkit-transform: translateZ(0px);\""+
			"\talt=\"\">"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"<div class=\"gmnoprint\""+
			"\tstyle=\"z-index: 1000001; position: absolute; right: 70px; bottom: 0px; width: 224px;\">"+
			"<div draggable=\"false\" class=\"gm-style-cc\""+
			"\tstyle=\"-webkit-user-select: none;\">"+
			"<div"+
			"\tstyle=\"opacity: 0.7; width: 100%; height: 100%; position: absolute;\">"+
			"<div style=\"width: 1px;\"></div>"+
			"<div"+
			"\tstyle=\"width: auto; height: 100%; margin-left: 1px; background-color: rgb(245, 245, 245);\"></div>"+
			"</div>"+
			"<div"+
			"\tstyle=\"position: relative; padding-right: 6px; padding-left: 6px; font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); white-space: nowrap; direction: ltr; text-align: right;\">"+
			"<span>\u00A92014 Google - </span><a"+
			"\tstyle=\"color: rgb(68, 68, 68); text-decoration: none; cursor: pointer; display: none;\">Map"+
			"\tData</a><span>Map data \u00A92014 Google, INEGI</span>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"<div"+
			"\tstyle=\"padding: 15px 21px; border: 1px solid rgb(171, 171, 171); font-family: Roboto, Arial, sans-serif; color: rgb(34, 34, 34); -webkit-box-shadow: rgba(0, 0, 0, 0.2) 0px 4px 16px; box-shadow: rgba(0, 0, 0, 0.2) 0px 4px 16px; z-index: 10000002; display: none; width: 256px; height: 148px; position: absolute; left: 482px; top: 183px; background-color: white;\">"+
			"<div style=\"padding: 0px 0px 10px; font-size: 16px;\">Map"+
			"\tData</div>"+
			"<div style=\"font-size: 13px;\">Map data \u00A92014 Google, INEGI</div>"+
			"<div"+
			"\tstyle=\"width: 13px; height: 13px; overflow: hidden; position: absolute; opacity: 0.7; right: 12px; top: 12px; z-index: 10000; cursor: pointer;\">"+
			"<img"+
			"\tsrc=\"https://maps.gstatic.com/mapfiles/api-3/images/mapcnt3.png\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"position: absolute; left: -2px; top: -336px; width: 59px; height: 492px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px;\""+
			"\talt=\"\">"+
			"</div>"+
			"</div>"+
			"<div class=\"gmnoscreen\""+
			"\tstyle=\"position: absolute; right: 0px; bottom: 0px;\">"+
			"<div"+
			"\tstyle=\"font-family: Roboto, Arial, sans-serif; font-size: 11px; color: rgb(68, 68, 68); direction: ltr; text-align: right; background-color: rgb(245, 245, 245);\">Map"+
			"\tdata \u00A92014 Google, INEGI</div>"+
			"</div>"+
			"<div class=\"gmnoprint gm-style-cc\" draggable=\"false\""+
			"\tstyle=\"z-index: 1000001; position: absolute; -webkit-user-select: none; right: 0px; bottom: 0px;\">"+
			"<div"+
			"\tstyle=\"opacity: 0.7; width: 100%; height: 100%; position: absolute;\">"+
			"<div style=\"width: 1px;\"></div>"+
			"<div"+
			"\tstyle=\"width: auto; height: 100%; margin-left: 1px; background-color: rgb(245, 245, 245);\"></div>"+
			"</div>"+
			"<div"+
			"\tstyle=\"position: relative; padding-right: 6px; padding-left: 6px; font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); white-space: nowrap; direction: ltr; text-align: right;\">"+
			"<a"+
			"\thref=\"http://www.google.com/intl/en-US_US/help/terms_maps.html\""+
			"\ttarget=\"_blank\""+
			"\tstyle=\"text-decoration: none; cursor: pointer; color: rgb(68, 68, 68);\">Terms"+
			"\tof Use</a>"+
			"</div>"+
			"</div>"+
			"<div draggable=\"false\" class=\"gm-style-cc\""+
			"\tstyle=\"-webkit-user-select: none; position: absolute; right: 0px; bottom: 0px;\">"+
			"<div"+
			"\tstyle=\"opacity: 0.7; width: 100%; height: 100%; position: absolute;\">"+
			"<div style=\"width: 1px;\"></div>"+
			"<div"+
			"\tstyle=\"width: auto; height: 100%; margin-left: 1px; background-color: rgb(245, 245, 245);\"></div>"+
			"</div>"+
			"<div"+
			"\tstyle=\"position: relative; padding-right: 6px; padding-left: 6px; font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); white-space: nowrap; direction: ltr; text-align: right; display: none;\">"+
			"<a target=\"_new\""+
			"\ttitle=\"Report errors in the road map or imagery to Google\""+
			"\thref=\"http://maps.google.com/maps?ll=37.784731,-122.401978&amp;z=5&amp;hl=en-US&amp;gl=US&amp;mapclient=apiv3&amp;skstate=action:mps_dialog$apiref:1&amp;output=classic\""+
			"\tstyle=\"font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); text-decoration: none; position: relative;\">Report"+
			"\ta map error</a>"+
			"</div>"+
			"</div>"+
			"<div class=\"gmnoprint\" draggable=\"false\" controlwidth=\"25\""+
			"\tcontrolheight=\"202\""+
			"\tstyle=\"margin: 5px; -webkit-user-select: none; position: absolute; top: 0px; right: 25px;\">"+
			"<div class=\"gmnoprint\" controlwidth=\"25\" controlheight=\"202\""+
			"\tstyle=\"position: absolute; left: 0px; top: 0px;\">"+
			"<div title=\"Zoom in\""+
			"\tstyle=\"width: 23px; height: 24px; overflow: hidden; position: relative; cursor: pointer; z-index: 1;\">"+
			"<img"+
			"\tsrc=\"https://maps.gstatic.com/mapfiles/api-3/images/mapcnt3.png\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"position: absolute; left: -17px; top: -400px; width: 59px; height: 492px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px;\""+
			"\talt=\"\">"+
			"</div>"+
			"<div title=\"Click to zoom\""+
			"\tstyle=\"width: 25px; height: 154px; overflow: hidden; position: relative; cursor: pointer; top: -4px;\">"+
			"<img"+
			"\tsrc=\"https://maps.gstatic.com/mapfiles/api-3/images/mapcnt3.png\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"position: absolute; left: -17px; top: -87px; width: 59px; height: 492px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px;\""+
			"\talt=\"\">"+
			"</div>"+
			"<div title=\"Drag to zoom\""+
			"\tstyle='width: 21px; height: 14px; overflow: hidden; position: absolute; -webkit-transition: top 0.25s ease; transition: top 0.25s ease; z-index: 2; cursor: url(https://maps.gstatic.com/mapfiles/openhand_8_8.cur) 8 8, default; left: 2px; top: 140px;'>"+
			"<img"+
			"\tsrc=\"https://maps.gstatic.com/mapfiles/api-3/images/mapcnt3.png\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"position: absolute; left: 0px; top: -384px; width: 59px; height: 492px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px;\""+
			"\talt=\"\">"+
			"</div>"+
			"<div title=\"Zoom out\""+
			"\tstyle=\"width: 23px; height: 23px; overflow: hidden; position: relative; cursor: pointer; top: -4px; z-index: 3;\">"+
			"<img"+
			"\tsrc=\"https://maps.gstatic.com/mapfiles/api-3/images/mapcnt3.png\""+
			"\tdraggable=\"false\""+
			"\tstyle=\"position: absolute; left: -17px; top: -361px; width: 59px; height: 492px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px;\""+
			"\talt=\"\">"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"v-align -whole\">"+
			"<div class=\"v-align__element\">"+
			"<h2 class=\"bucket__headline h2 g-color-dark-blue -map\">Find your"+
			"\tprayer time&nbsp;here</h2>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"location js-map-location\">"+
			"<div class=\"map__card location__name\">"+
			"<div class=\"location__input js-map-search\">"+
			"<form class=\"js-location-form\" action=\"\">"+
			"<label for=\"location-input\" class=\"u-is-hidden-visually\">Your"+
			"\tlocation</label> <input type=\"text\" id=\"location-input\""+
			"\tname=\"location-input\" class=\"left js-location-input\""+
			"\tdata-input-value=\"Your location\" placeholder=\"Your location\""+
			"\tautocomplete=\"off\"> <input type=\"submit\""+
			"\tclass=\"u-is-hidden-visually js-location-submit\">"+
			"</form>"+
			"</div>"+
			""+
			"<div class=\"location__result\">"+
			"<span class=\"result__name js-location-name\"></span> <span>to"+
			"\tKaaba</span> <span"+
			"\tclass=\"location__clear js-clear-location icon -close-grey\"></span>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"map__card location__data js-location-data\">"+
			"<div class=\"data__stat -flux-capacitor -border-bottom\">"+
			"<span class=\"data__label\"> <span"+
			"\tclass=\"icon -warp-black -middle\"></span> Fajr"+
			"</span> <span class=\"data__value js-flux-fajr\"></span>"+
			"</div>"+
			"<div class=\"data__stat -flux-capacitor -border-bottom\">"+
			"<span class=\"data__label\"> <span"+
			"\tclass=\"icon -warp-black -middle\"></span> Dhuhr"+
			"</span> <span class=\"data__value js-flux-dhuhr\"></span>"+
			"</div>"+
			"<div class=\"data__stat -flux-capacitor -border-bottom\">"+
			"<span class=\"data__label\"> <span"+
			"\tclass=\"icon -warp-black -middle\"></span> Asr"+
			"</span> <span class=\"data__value js-flux-asr\"></span>"+
			"</div>"+
			"<div class=\"data__stat -flux-capacitor -border-bottom\">"+
			"<span class=\"data__label\"> <span"+
			"\tclass=\"icon -warp-black -middle\"></span> Maghrib"+
			"</span> <span class=\"data__value js-flux-maghrib\"></span>"+
			"</div>"+
			"<div class=\"data__stat -flux-capacitor -border-bottom\">"+
			"<span class=\"data__label\"> <span"+
			"\tclass=\"icon -warp-black -middle\"></span> Isha"+
			"</span> <span class=\"data__value js-flux-isha\"></span>"+
			"</div>"+
			""+
/*			"<!--   <div class=\"data__stat -driving -border-bottom\">"+
			"<span class=\"data__label\">"+
			"<span class=\"icon -car-black -text-bottom\"></span>"+
			"                  Driving"+
			"</span>"+
			""+
			"<span class=\"data__value js-driving\"></span>"+
			"</div>  -->"+*/
			""+
			"<div class=\"data__stat -walking\">"+
			"<span class=\"data__label\"> <span"+
			"\tclass=\"icon -walking-black -text-bottom\"></span> Distance"+
			"</span> <a class=\"js-url-more-main\" href=\"\"><span"+
			"\tclass=\"icon -menu-black\""+
			"\tstyle=\"margin-left: 40px; margin-right: auto;\">More</span></a> <span"+
			"\tclass=\"data__value js-distance\"></span>"+
			"</div>"+
			search_add+
			"</div>"+
			"</div>"+
			"</div>"+
			""+
			"<div"+
			"\tclass=\"bucket -secondary g-bg-water-blue show-for-small-only js-mobile-map\">"+
			"<div class=\"map js-map\"></div>"+
			""+
			"<div class=\"js-before\">"+
			"<h2 class=\"bucket__headline h2 g-color-dark-blue -map\">Find your"+
			"\tprayer times&nbsp;here</h2>"+
			""+
			"<a class=\"bucket__cta -top g-color-dark-blue with-icon js-cta\""+
			"\thref=\"//www.google.com/maps/place/Kaaba,+Al+Haram,+Mecca+24231,+Saudi+Arabia/@21.4216181,39.8247903,17z/data=!3m1!4b1!4m2!3m1!1s0x15c204b74c5bf99f:0x374ededffc94c249\""+
			"\ttarget=\"_blank\"> <span class=\"icon -location-darkblue -bottom\"></span>"+
			"<span>Tap for next prayer&nbsp;time</span>"+
			"</a>"+
			"</div>"+
			""+
			"<div class=\"map__results js-after\">"+
			"<div class=\"js-after-delay\">"+
			"<a class=\"map__cta -mobile js-url-more\" href=\"/schedule\""+
			"\ttarget=\"_blank\"> Prayer time for <span class=\"js-distance\"></span>"+
			"<span class=\"icon -directions-darkblue right\"></span>"+
			"</a>"+
			"</div>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"paging js-paging g-bg-blue show-for-small-only\""+
			"\tdata-mobile-only=\"true\">"+
			"<div class=\"pane js-pane\">"+
			"<div class=\"bucket -secondary g-bg-slate-grey\">"+
			"<div class=\"bucket__photo -fade js-responsive-image-mobile\""+
			"\tdata-src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/kaba-wallpaper.jpg\""+
			"\tdata-hasretina=\"true\" data-lazyload=\"true\""+
			"\tdata-breakpoints=\"320,568,768\"></div>"+
			""+
			"<h2 class=\"bucket__headline g-color-white h2 -map\">Common"+
			"\tDua's for Azan</h2>"+
			""+
			"<span"+
			"\tclass=\"bucket__scrim with-icon g-color-yellow js-pane-forward\""+
			"\tstyle=\"cursor: pointer; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
			"<span class=\"scrim show-for-small-only\"></span> <span"+
			"\tclass=\"icon -planes-yellow -bottom\"></span> <span>Namaz/Salat"+
			"\ttips</span>"+
			"</span>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"pane g-bg-white js-pane\">"+
			"<div"+
			"\tclass=\"bucket -secondary g-color-off-black -auto -mobile-height-auto\">"+
			"<div class=\"pane__back with-icon js-accordion-close js-pane-back\""+
			"\tdata-accordion-target=\"logistics\""+
			"\tstyle=\"cursor: pointer; -webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
			"<span class=\"icon -back-blue -middle -on-right\"></span>"+
			"</div>"+
			""+
			"<p>Here are some Dua's you should recite after prayers.</p>"+
			""+
			"<div class=\"accordion js-accordion\""+
			"\tdata-accordion-name=\"logistics\">"+
			"<div class=\"accordion__item js-accordion-item\">"+
			"<div class=\"accordion__label -first js-accordion-label\""+
			"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
			"<span class=\"icon -trains-blue -baseline -buffer-right\"></span>"+
			"\tAzan Dua - en"+
			"</div>"+
			""+
			"<div class=\"accordion__content\">"+
			"<p>Allahumma Rabba Hazihid Da'awatit Taam Mati Was Salaatil"+
			"\tQaimati Aati Sayyedana Mohammada Nil Waseelata Wal Fadeelata"+
			"\tWad Darajatar Rafeea'ata Wab A's Hu Maqamam Mahmooda Nil Lazi"+
			"\tWa A't Tahoo War Zuqna Shafa A'tahu Yaomal Qiyamah. Innaka La"+
			"\tTukhliful Meea'ad.</p>"+
			""+
			"<p class=\"-hide\">Small word add will go here</p>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"accordion__item js-accordion-item\">"+
			"<div class=\"accordion__label js-accordion-label\""+
			"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
			"<span class=\"icon -trains-blue -baseline -buffer-right\"></span>"+
			"\tAzan Guide"+
			"</div>"+
			""+
			"<div class=\"accordion__content\">"+
			"<p>Repeat what the Mu'aththin says, except for when he"+
			"\tsays:</p>"+
			"<p class=\"-quran\">\"\u062D\u064E\u064A\u0651\u064E \u0639\u064E\u0644\u064E\u0649 \u0627\u0644\u0635\u0651\u064E\u0644\u0627\u064E\u0629\u0650 \u0648\u064E\u062D\u064E\u064A\u0651\u064E \u0639\u064E\u0644\u064E\u0649"+
			"\t\u0627\u0644\u0652\u0641\u064E\u0644\u064E\u0627\u062D\u0650\"</p>"+
			"<p>Hayya 'alas-Salaah (hasten to the prayer) and Hayya"+
			"\t'alal-Falaah (hasten to salvation).</p>"+
			"<p class=\"-quran\">\"\u0644\u064E\u0627 \u062D\u064E\u0648\u0652\u0644\u064E \u0648\u064E\u0644\u064E\u0627 \u0642\u064F\u0648\u0651\u064E\u0629\u064E \u0625\u0650\u0644\u0651\u064E\u0627 \u0628\u0650\u0627\u0644\u0644\u0647\u0650\""+
			"\t- Laa hawla wa laa quwwata 'illaa billaah. (There is no might"+
			"\tand no power except by Allah.)</p>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"accordion__item js-accordion-item\">"+
			"<div class=\"accordion__label js-accordion-label\""+
			"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
			"<span class=\"icon -trains-blue -baseline -buffer-right\"></span>"+
			"\tAzan Dua - ar"+
			"</div>"+
			""+
			"<div class=\"accordion__content\">"+
			"<p class=\"-quran\">\u0627\u0644\u0644\u0651\u064E\u0647\u064F\u0645\u0651\u064E \u0631\u064E\u0628\u0651\u064E \u0647\u064E\u0630\u0650\u0647\u0650 \u0627\u0644\u062F\u0651\u064E\u0639\u0652\u0648\u064E\u0629\u0650"+
			"\t\u0627\u0644\u062A\u0651\u064E\u0627\u0645\u0651\u064E\u0629\u0650\u060C</p>"+
			"<p class=\"-quran\">\u0648\u064E\u0627\u0644\u0635\u0651\u064E\u0644\u064E\u0627\u0629\u0650 \u0627\u0644\u0652\u0642\u064E\u0627\u0626\u0650\u0645\u064E\u0629\u0650\u060C \u0622\u062A\u0650 \u0645\u064F\u062D\u064E\u0645\u0651\u064E\u062F\u0627\u064B"+
			"</p>"+
			"<p class=\"-quran\">\u0627\u0644\u0652\u0648\u064E\u0633\u0650\u064A\u0644\u064E\u0629\u064E \u0648\u064E\u0627\u0644\u0652\u0641\u064E\u0636\u0650\u064A\u0644\u064E\u0629\u064E\u060C \u0648\u064E\u0627\u0628\u0652\u0639\u064E\u062B\u0652\u0647\u064F"+
			"\t\u0645\u064E\u0642\u064E\u0627\u0645\u0627\u064B</p>"+
			"<p class=\"-quran\">\u0645\u064E\u062D\u0652\u0645\u064F\u0648\u062F\u0627\u064B \u0627\u0644\u0651\u064E\u0630\u0650\u064A \u0648\u064E\u0639\u064E\u062F\u0652\u062A\u064E\u0647\u064F\u060C [\u0625\u064E\u0646\u0651\u064E\u0643\u064E"+
			"\t\u0644\u064E\u0627</p>"+
			"<p class=\"-quran\">\u062A\u064F\u062E\u0652\u0644\u0650\u0641\u064F \u0627\u0644\u0652\u0645\u0650\u064A\u0639\u064E\u0627\u062F\u064E]</p>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"accordion__item js-accordion-item\">"+
			"<div class=\"accordion__label js-accordion-label\""+
			"\tstyle=\"-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">"+
			"<span class=\"icon -trains-blue -baseline -buffer-right\"></span>"+
			"\tDua Wudu"+
			"</div>"+
			""+
			"<div class=\"accordion__content\">"+
			"<p>"+
			"<span class=\"g-color-blue\">In Islam before stating wudu"+
			"\tone should say</span>"+
			"</p>"+
			"<p class=\"-quran\">\u0628\u0633\u0645 \u0627\u0644\u0644\u0647 - Bismillah</p>"+
			""+
			"<p>Meaning \"In the name of Allah\"</p>"+
			""+
			"<p>"+
			"<span class=\"g-color-blue\"> Dua after Wudu </span> Prophet"+
			"\t(Peace and Blessings of Allah be upon him) said: \"There is no"+
			"\tone amongst you who does wudoo' and does it properly and does"+
			"\tit well THEN he says,"+
			"</p>"+
			""+
			"<p>"+
			"<span class=\"g-color-dark-blue\">ash-hadu an laa ilaha"+
			"\tilla Allah, wahdahu, laa shareeka lah, wa ash-hadu anna"+
			"\tmuhammadan a'abduhu warasooluhu</span>"+
			"</p>"+
			""+
			"<p>Except the gates of Paradise will be opened to him and"+
			"\the may enter through whichever of them he wishes.\" (Muslim)</p>"+
			""+
			"<p>"+
			"<span class=\"g-color-dark-blue -quran\"> Meaning: (I"+
			"\tbear witness that none has the right to be worshipped except"+
			"\tAllah, alone, without partner, and i bear witness that"+
			"\tMuhammad is His slave and messenger.</span>"+
			"</p>"+
			""+
			"<p></p>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			""+
			"<div"+
			"\tclass=\"bucket g-bg-white -secondary-padding-top -last-padding hide-for-small-only\">"+
			"<div class=\"bucket__background g-bg-slate-grey\">"+
			"<div class=\"bucket__photo -fade js-responsive-image\""+
			"\tdata-src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/kaba-wallpaper.jpg\""+
			"\tdata-hasretina=\"true\" data-lazyload=\"true\""+
			"\tdata-breakpoints=\"768,1024,1200,1400,1600\"></div>"+
			"</div>"+
			""+
			"<h2 class=\"bucket__headline h2 g-color-white -padding-sides\">"+
			"\tCommon Dua's for Azan</h2>"+
			""+
			"<div class=\"row js-match-max js-card-intro\">"+
			"<div class=\"u-buffer-point -middle js-card-point\"></div>"+
			""+
			"<div"+
			"\tclass=\"card -large-buffer col -width-1-3 -medium-only-width-whole js-match-item\""+
			"\tstyle=\"height: 692px;\">"+
			"<div"+
			"\tclass=\"card__content -tallest g-bg-white initially-hidden js-card\""+
			"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 50);\">"+
			"<h3 class=\"bucket__headline h3 with-absolute-icon\">"+
			"<span class=\"left\">Dua Adhan - English Tajweed</span> <span"+
			"\tclass=\"icon -trains-black -absolute -right\"></span>"+
			"</h3>"+
			""+
			"<p>Allahumma Rabba Hazihid Da'awatit Taam Mati Was Salaatil</p>"+
			""+
			"<p>Qaimati Aati Sayyedana Mohammada Nil Waseelata</p>"+
			""+
			"<p>Wal Fadeelata Wad Darajatar Rafeea'ata Wab A's</p>"+
			""+
			"<p>Hu Maqamam Mahmooda Nil Lazi Wa A't Tahoo War Zuqna</p>"+
			"<p>Shafa A'tahu Yaomal Qiyamah. Innaka La Tukhliful Meea'ad."+
			"</p>"+
			"<h3 class=\"bucket__headline h3 with-absolute-icon\">"+
			"<span class=\"left\">English Translation</span> <span"+
			"\tclass=\"icon -trains-black -absolute -right\"></span>"+
			"</h3>"+
			"<p>\u2018O Allah, Owner of this perfect call and Owner of</p>"+
			"<p>this prayer to be performed, bestow upon</p>"+
			"<p>"+
			"\tMuhammad al-waseelah (<span class=\"-quran\">\u0627\u0644\u0648\u0633\u06CC\u0644\u06C3</span>) and"+
			"\tal-fadeelah"+
			"</p>"+
			"<p>"+
			"\t(<span class=\"-quran\">\u0627\u0644\u0641\u0636\u06CC\u0644\u06C3</span>) and send him upon a"+
			"\tpraised platform"+
			"</p>"+
			"<p>which You have promised him. Verily, You never</p>"+
			"<p>fail in Your promise.\u2019</p>"+
			"</div>"+
			"</div>"+
			""+
			"<div"+
			"\tclass=\"card -large-buffer col -width-1-3 -medium-only-width-whole js-match-item\""+
			"\tstyle=\"height: 692px;\">"+
			"<div"+
			"\tclass=\"card__content -tallest g-bg-white initially-hidden js-card\""+
			"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 50);\">"+
			"<h3 class=\"bucket__headline h3 with-absolute-icon\">"+
			"<span class=\"left\">Azan/Athan guide</span> <span"+
			"\tclass=\"icon -trains-black -absolute -right\"></span>"+
			"</h3>"+
			""+
			"<p>Repeat what the Mu'aththin says, except for when he says:"+
			"</p>"+
			"<p class=\"-quran\">\"\u062D\u064E\u064A\u0651\u064E \u0639\u064E\u0644\u064E\u0649 \u0627\u0644\u0635\u0651\u064E\u0644\u0627\u064E\u0629\u0650 \u0648\u064E\u062D\u064E\u064A\u0651\u064E \u0639\u064E\u0644\u064E\u0649"+
			"\t\u0627\u0644\u0652\u0641\u064E\u0644\u064E\u0627\u062D\u0650\"</p>"+
			"<p>Hayya 'alas-Salaah (hasten to the prayer) and Hayya"+
			"\t'alal-Falaah (hasten to salvation).</p>"+
			"<p>After hearing this say:</p>"+
			"<p></p>"+
			"<p class=\"-quran\">\"\u0644\u064E\u0627 \u062D\u064E\u0648\u0652\u0644\u064E \u0648\u064E\u0644\u064E\u0627 \u0642\u064F\u0648\u0651\u064E\u0629\u064E \u0625\u0650\u0644\u0651\u064E\u0627 \u0628\u0650\u0627\u0644\u0644\u0647\u0650\"</p>"+
			"<p>English Tajveed - Laa hawla wa laa quwwata 'illaa billaah."+
			"</p>"+
			"<p>Definition - There is no might and no power except by"+
			"\tAllah.</p>"+
			"</div>"+
			"</div>"+
			""+
			"<div"+
			"\tclass=\"card -large-buffer col -width-1-3 -medium-only-width-whole js-match-item\""+
			"\tstyle=\"height: 692px;\">"+
			"<div"+
			"\tclass=\"card__content -tallest g-bg-white initially-hidden js-card\""+
			"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 50);\">"+
			"<h3 class=\"bucket__headline h3 with-absolute-icon\">"+
			"<span class=\"left\">Azan Dua Arabic</span> <span"+
			"\tclass=\"icon -trains-black -absolute -right\"></span>"+
			"</h3>"+
			""+
			"<p class=\"-quran\">\u0627\u0644\u0644\u0651\u064E\u0647\u064F\u0645\u0651\u064E \u0631\u064E\u0628\u0651\u064E \u0647\u064E\u0630\u0650\u0647\u0650 \u0627\u0644\u062F\u0651\u064E\u0639\u0652\u0648\u064E\u0629\u0650"+
			"\t\u0627\u0644\u062A\u0651\u064E\u0627\u0645\u0651\u064E\u0629\u0650\u060C</p>"+
			"<p class=\"-quran\">\u0648\u064E\u0627\u0644\u0635\u0651\u064E\u0644\u064E\u0627\u0629\u0650 \u0627\u0644\u0652\u0642\u064E\u0627\u0626\u0650\u0645\u064E\u0629\u0650\u060C \u0622\u062A\u0650 \u0645\u064F\u062D\u064E\u0645\u0651\u064E\u062F\u0627\u064B</p>"+
			"<p class=\"-quran\">\u0627\u0644\u0652\u0648\u064E\u0633\u0650\u064A\u0644\u064E\u0629\u064E \u0648\u064E\u0627\u0644\u0652\u0641\u064E\u0636\u0650\u064A\u0644\u064E\u0629\u064E\u060C \u0648\u064E\u0627\u0628\u0652\u0639\u064E\u062B\u0652\u0647\u064F"+
			"\t\u0645\u064E\u0642\u064E\u0627\u0645\u0627\u064B</p>"+
			"<p class=\"-quran\">\u0645\u064E\u062D\u0652\u0645\u064F\u0648\u062F\u0627\u064B \u0627\u0644\u0651\u064E\u0630\u0650\u064A \u0648\u064E\u0639\u064E\u062F\u0652\u062A\u064E\u0647\u064F\u060C [\u0625\u064E\u0646\u0651\u064E\u0643\u064E \u0644\u064E\u0627"+
			"</p>"+
			"<p class=\"-quran\">\u062A\u064F\u062E\u0652\u0644\u0650\u0641\u064F \u0627\u0644\u0652\u0645\u0650\u064A\u0639\u064E\u0627\u062F\u064E]</p>"+
			
			"</div>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"row js-card-intro\">"+
			"<div class=\"card -buffer col -width-whole initially-hidden js-card\""+
			"\tstyle=\"-webkit-transform: matrix(1, 0, 0, 1, 0, 50);\">"+
			"<div class=\"card__content -gutterless-sides -taller g-bg-white\">"+
			"<h3 class=\"h3 -card-padding-sides\">Questions?</h3>"+
			""+
			"<div class=\"row\">"+
			"<div class=\"col -width-1-3\">"+
			"<div class=\"-card-padding-sides\">"+
			"<h4 class=\"h4\">General</h4>"+
			""+
			"<ol>"+
			"<li><a class=\"g-color-blue\" href=\"\">Dua</a></li>"+
			"</ol>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"col -width-1-3\">"+
			"<div class=\"-card-padding-sides\">"+
			"<h4 class=\"h4\">Registration</h4>"+
			""+
			"<ol>"+
			"<li><a class=\"g-color-blue\" href=\"\">Coming soon!</a></li>"+
			""+
			"</ol>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"col -width-1-3\">"+
			"<div class=\"-card-padding-sides\">"+
			"<h4 class=\"h4\">Time Details</h4>"+
			""+
			"<ol>"+
			"<li><a class=\"g-color-blue\" href=\"\">Cool Stuff"+
			"\tComing!</a></li>"+
			"</ol>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			"</div>"+
			""+
			"<div class=\"u-buffer-point -middle js-card-point\"></div>"+
			"</div>"+
			"</div>"+
			"<div>" +
			"<script async src=\"//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>" +
			"<!-- 728x90, created 15/01/11 -->" +
			"<ins class=\"adsbygoogle\" " +
			     "style=\"display:block\" "+
			     "data-ad-client=\"ca-pub-5648075695468923\" " +
			     "data-ad-slot=\"3216369269\"" +
			     "data-ad-format=\"auto\"></ins>"+
			"<script>"+
			"(adsbygoogle = window.adsbygoogle || []).push({});"+
			"</script>"+
			
			"</div>"+
			
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
			"<a class=\"icon -google\" href=\"//findazan.info\" target=\"_blank\">Find"+
			"\tAzan</a>"+
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
			"<script type=\"text/javascript\""+
			"\tsrc=\"https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=geometry,places\">"+
			"</script>"+
			"<script src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/libs.min.js\" type=\"text/javascript\"></script>"+
			//"<script src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/site1.min.js\" type=\"text/javascript\"></script>"+
			"<script src=\""+ Util.PROPERTIES.get("SITE_JS") +"\" type=\"text/javascript\"></script>"+
			"<script type=\"text/javascript\">"+
			"io.init('logistics');"+
			"</script>"+
			MetaHandler.ANALYTICS +
			"<script src=\"//googledrive.com/host/0B9lA1v7cwGK2MHZMMEE1Ti10aEU/partials1.min.js\" type=\"text/javascript\"></script>"+
			"<div class=\"pac-container\"></div>"+
			"<div class=\"hud-renderer\"></div>"+
			"</body>";
}
