package com.app.prayer.time.client;

import java.util.ArrayList;
import java.util.Date;

import com.app.prayer.time.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Prayer implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		publish();
		String value = Window.Location.getParameter("q");
		GWT.log(value + "--add");
		//GWTCode.exportMethod();

/*		final Button sendButton = new Button("Send");
		final TextBox nameField = new TextBox();
		nameField.setText("GWT User");
		final Label errorLabel = new Label();

		// We can add style names to widgets
		sendButton.addStyleName("sendButton");

		// Add the nameField and sendButton to the RootPanel
		// Use RootPanel.get() to get the entire body element
		RootPanel.get("nameFieldContainer").add(nameField);
		RootPanel.get("sendButtonContainer").add(sendButton);
		RootPanel.get("errorLabelContainer").add(errorLabel);

		// Focus the cursor on the name field when the app loads
		nameField.setFocus(true);
		nameField.selectAll();
		//Prayer p = new Prayer();
		// Create the popup dialog box
		final DialogBox dialogBox = new DialogBox();
		dialogBox.setText("Remote Procedure Call");
		dialogBox.setAnimationEnabled(true);
		final Button closeButton = new Button("Close");
		// We can set the id of a widget by accessing its Element
		closeButton.getElement().setId("closeButton");
		final Label textToServerLabel = new Label();
		final HTML serverResponseLabel = new HTML();
		VerticalPanel dialogVPanel = new VerticalPanel();
		dialogVPanel.addStyleName("dialogVPanel");
		dialogVPanel.add(new HTML("<b>Sending name to the server:</b>"));
		dialogVPanel.add(textToServerLabel);
		dialogVPanel.add(new HTML("<br><b>Server replies:</b>"));
		dialogVPanel.add(serverResponseLabel);
		dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
		dialogVPanel.add(closeButton);
		print(dialogVPanel, 0, 0);
		dialogBox.setWidget(dialogVPanel);

		// Add a handler to close the DialogBox
		closeButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				dialogBox.hide();
				sendButton.setEnabled(true);
				sendButton.setFocus(true);
			}
		});

		// Create a handler for the sendButton and nameField
		class MyHandler implements ClickHandler, KeyUpHandler {
			*//**
			 * Fired when the user clicks on the sendButton.
			 *//*
			public void onClick(ClickEvent event) {
				sendNameToServer();
			}

			*//**
			 * Fired when the user types in the nameField.
			 *//*
			public void onKeyUp(KeyUpEvent event) {
				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
					sendNameToServer();
				}
			}

			*//**
			 * Send the name from the nameField to the server and wait for a response.
			 *//*
			private void sendNameToServer() {
				// First, we validate the input.
				errorLabel.setText("");
				String textToServer = nameField.getText();
				if (!FieldVerifier.isValidName(textToServer)) {
					errorLabel.setText("Please enter at least four characters");
					return;
				}

				// Then, we send the input to the server.
				sendButton.setEnabled(false);
				textToServerLabel.setText(textToServer);
				serverResponseLabel.setText("");
				greetingService.greetServer(textToServer,
						new AsyncCallback<String>() {
							public void onFailure(Throwable caught) {
								// Show the RPC error message to the user
								dialogBox
										.setText("Remote Procedure Call - Failure");
								serverResponseLabel
										.addStyleName("serverResponseLabelError");
								serverResponseLabel.setHTML(SERVER_ERROR);
								dialogBox.center();
								closeButton.setFocus(true);
							}

							public void onSuccess(String result) {
								dialogBox.setText("Remote Procedure Call");
								serverResponseLabel
										.removeStyleName("serverResponseLabelError");
								serverResponseLabel.setHTML(result);
								dialogBox.center();
								closeButton.setFocus(true);
							}
						});
			}
		}

		// Add a handler to send the name to the server
		MyHandler handler = new MyHandler();
		sendButton.addClickHandler(handler);
		nameField.addKeyUpHandler(handler);*/
	}
	
	  // Set up the JS-callable signature as a global JS function.
	  private static native void publish() /*-{
	    $wnd.prayer_print = 
	      @com.app.prayer.time.client.Prayer::print(Lcom/google/gwt/core/client/JavaScriptObject;);
	  }-*/;
	  
	  public static JsArrayString print(JavaScriptObject o){
		  GeoLocation g = new GeoLocation(o);
		  JsArrayString jsArrayString = createEmptyJsArrayString();
		  ArrayList<String> input = print(g.getLatitude(), g.getLongitude());
			for (String s : input) {
			    jsArrayString.push(s);
			}
			jsArrayString.push(nextTime(input) +"");
			return jsArrayString; 
	  }
	  //0,2,3,5,6
	  public static int nextTime(ArrayList<String> input){
		  int res = -1;
		  Date d = new Date(); 
		  DateTimeFormat fmt = DateTimeFormat.getFormat("hh:mm a");
		  int i = 0;
		  for(String s: input){
			  if(i != 1 && i != 4){
				  if(d.before(fmt.parse(s))){
					 return i; 
				  }
			  }
			  i++;
		  }
		  return res;
	  }
	  
	  private static native JsArrayString createEmptyJsArrayString() /*-{
    	return [];
  	  }-*/;
	  
	public static ArrayList<String> print(double latitude, double longitude){

	    PrayTime prayers = new PrayTime();
	
	    prayers.setTimeFormat(prayers.Time12);
	    prayers.setCalcMethod(prayers.ISNA);
	    prayers.setAsrJuristic(prayers.Shafii);
	    prayers.setAdjustHighLats(prayers.AngleBased);
	    int[] offsets = {0, 0, 0, 0, 0, 0, 0}; // {Fajr,Sunrise,Dhuhr,Asr,Sunset,Maghrib,Isha}
	    prayers.tune(offsets);    
	    int time[] = getTimeInfo();
	    ArrayList<String> prayerTimes = prayers.getPrayerTimes(time[0], time[1], time[2],
	            latitude, longitude, time[3]);
	    //ArrayList<String> prayerNames = prayers.getTimeNames();
	    return prayerTimes;
	}
	  	
	public static int[] getTimeInfo(){
		int[] t = new int[4];
		try{
			Date now = new Date(); 
			DateTimeFormat fmt = DateTimeFormat.getFormat("yyyy/MM/dd/Z");
			String s[] = fmt.format(now).split("/");
	        
	        t[0] = Integer.parseInt(s[0]);
	        t[1] = Integer.parseInt(s[1]);
	        t[2] = Integer.parseInt(s[2]);
	        t[3] = getZone(s);
	        GWT.log(""+t[3]);
		}catch(Exception e){
			e.printStackTrace();
		}
		return t;
	}
	
	public static int getZone(String[] s){
		int timezone;
        if(s[3].startsWith("-")){
        	if(s[3].charAt(1) == '0'){
        		timezone = Integer.valueOf(Character.toString(s[3].charAt(2))) * -1;
        	}else{
        		timezone = Integer.valueOf(s[3].substring(0, 3));
        	}
        }else if(s[3].startsWith("+")){
        	if(s[3].substring(1).startsWith("0")){
        		timezone = Integer.valueOf(Character.toString(s[3].charAt(2)));
        	}else{
        		timezone = Integer.valueOf(s[3].substring(1, 3));
        	}
        }else{
        	if(s[3].startsWith("0")){
        		timezone = Integer.valueOf(Character.toString(s[3].charAt(1)));
        	}else{
        		timezone = Integer.valueOf(s[3].substring(0, 2));
        	}
        }
        return timezone;
    }
}