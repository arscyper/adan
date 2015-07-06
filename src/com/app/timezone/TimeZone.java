package com.app.timezone;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.app.timezone.FloatPolygon;
import com.app.timezone.Zone;

public class TimeZone {
	/*static List<List<FloatPolygon>> data;
	
	static{
		data = new ArrayList<List<FloatPolygon>>();
		for(int i = 0; i <= 15; i++){
			try {
				data.add(getPolygonList("quadrent"+i+".json"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		try {
			data.add(getPolygonList("moreThan1.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static String getZoneName(double latitude, double longitude){
		float x = (float)longitude;
		float y = (float)latitude;
		if(x > 90 && y > 45){
			return find(x,y,data.get(0),data.get(16));
		}else if(x > 0 && x < 90 && y > 45){
			return find(x,y,data.get(1),data.get(16));
		}else if(x > 0 && x < 90 && y < 45 && y > 0){
			return find(x,y,data.get(2),data.get(16));
		}else if(x  > 90 && y < 45 && y > 0){
			return find(x,y,data.get(3),data.get(16));
		}else if( x < -90 && y > 45){
			return find(x,y,data.get(4),data.get(16));
		}else if(x < 0 && x > -90 && y > 45){
			return find(x,y,data.get(5),data.get(16));
		}else if(x < 0 && x > -90 && y < 45 && y > 0){
			return find(x,y,data.get(6),data.get(16));
		}else if(x < -90 && y < 45 && y > 0){
			return find(x,y,data.get(7),data.get(16));
		}else if(x < -90 && y < -45){
			return find(x,y,data.get(8),data.get(16));
		}else if(x < -90 && y < 0 && y > -45){
			return find(x,y,data.get(9),data.get(16));
		}else if(x < 0 && x > -90 && y < 0 && y > -45){
			return find(x,y,data.get(10),data.get(16));
		}else if(x < 0 && x > -90 && y < -45){
			return find(x,y,data.get(11),data.get(16));
		}else if(x > 90 && y < -45){
			return find(x,y,data.get(12),data.get(16));
		}else if(x > 0 && x < 90 && y < -45){
			return find(x,y,data.get(13),data.get(16));
		}else if(x > 0 && x < 90 && y < 0 && y > -45){
			return find(x,y,data.get(14),data.get(16));
		}else if(x > 90 && y < 0 && y > -45){
			return find(x,y,data.get(15),data.get(16));
		}else{
			return find(x,y,data.get(16),null);
		}
	}
	
	public static String find(float x, float y, List<FloatPolygon> polygon, List<FloatPolygon> fallback){
		for(FloatPolygon p:polygon){
			if(p.contains(x, y)){
				return p.getName();
			}
		}
		for(FloatPolygon p:fallback){
			if(p.contains(x, y)){
				return p.getName();
			}
		}	
		return null;
	}
	
	public static List<FloatPolygon> getPolygonList(String file) throws FileNotFoundException{
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(file);
		Reader reader = new InputStreamReader(in);

		Type listType = new TypeToken<ArrayList<Zone>>() {
		   }.getType();
		List<Zone> l = new Gson().fromJson(reader, listType);	
		List<FloatPolygon> list = new ArrayList<FloatPolygon>();
		   
		for(Zone z: l){
			FloatPolygon polygon = new FloatPolygon(z.getName());
   	
			for(List<Double> a: z.getMap()){
				double x = a.get(0);
				double y = a.get(1);
				polygon.addPoint(x, y);
			}
			list.add(polygon);
		}
		return list;   
	}
	
	public static void main(String[] args) throws IOException{
		long start = System.currentTimeMillis();
		//System.out.println(getZoneName(28.669954, 68.124186));
		
		System.out.println(getZoneName(31.183286, 0.975748));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println("-----------");
	}
	
	
	///////////////////////////////
	
	public static List<List<FloatPolygon>> list;
	static{
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("timezones.json");
		Reader reader = new InputStreamReader(in);
		Type listType = new TypeToken<ArrayList<Zone>>() {
        }.getType();
        List<Zone> l = new Gson().fromJson(reader, listType);
        
        list = new ArrayList<List<FloatPolygon>>();
        
        for(int j = 1; j <= 17; j++){
        	list.add(new ArrayList<FloatPolygon>());
        }
        
        boolean[] quadrent = {false, false, false, false, false, false, false, false, false, false, false, false, false,false, false,false,false};
        int[] quadrent_count = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for(Zone z: l){
        	FloatPolygon polygon = new FloatPolygon(z.getName());
        	
        	for(List<Double> a: z.getMap()){
        		double x = a.get(0);
        		double y = a.get(1);
        		
        		if(x > 90 && y > 45){
        			quadrent[0] = true;
        			quadrent_count[0]++;
        		}else if(x > 0 && x < 90 && y > 45){
        			quadrent[1] = true;
        			quadrent_count[1]++;
        		}else if(x > 0 && x < 90 && y < 45 && y > 0){
        			quadrent[2] = true;
        			quadrent_count[2]++;
        		}else if(x  > 90 && y < 45 && y > 0){
        			quadrent[3] = true;
        			quadrent_count[3]++;
        		}else if( x < -90 && y > 45){
        			quadrent[4] = true;
        			quadrent_count[4]++;
        		}else if(x < 0 && x > -90 && y > 45){
        			quadrent[5] = true;
        			quadrent_count[5]++;
        		}else if(x < 0 && x > -90 && y < 45 && y > 0){
        			quadrent[6] = true;
        			quadrent_count[6]++;
        		}else if(x < -90 && y < 45 && y > 0){
        			quadrent[7] = true;
        			quadrent_count[7]++;
        		}else if(x < -90 && y < -45){
        			quadrent[8] = true;
        			quadrent_count[8]++;
        		}else if(x < -90 && y < 0 && y > -45){
        			quadrent[9] = true;
        			quadrent_count[9]++;
        		}else if(x < 0 && x > -90 && y < 0 && y > -45){
        			quadrent[10] = true;
        			quadrent_count[10]++;
        		}else if(x < 0 && x > -90 && y < -45){
        			quadrent[11] = true;
        			quadrent_count[11]++;
        		}else if(x > 90 && y < -45){
        			quadrent[12] = true;
        			quadrent_count[12]++;
        		}else if(x > 0 && x < 90 && y < -45){
        			quadrent[13] = true;
        			quadrent_count[13]++;
        		}else if(x > 0 && x < 90 && y < 0 && y > -45){
        			quadrent[14] = true;
        			quadrent_count[14]++;
        		}else if(x > 90 && y < 0 && y > -45){
        			quadrent[15] = true;
        			quadrent_count[15]++;
        		}else{
        			quadrent[16] = true;
        		}	
        		polygon.addPoint(x, y);
        	}
        	
    		for(int k = 0; k <= quadrent.length -1; k++){
    			if(quadrent[k]){
    				list.get(k).add(polygon);
    			}
    		}	
        }
	}
	
	public static String getZoneName(double latitude, double longitude){
		float x = (float)longitude;
		float y = (float)latitude;
		if(x > 90 && y > 45){
			return find(x,y,list.get(0));
		}else if(x > 0 && x < 90 && y > 45){
			return find(x,y,list.get(1));
		}else if(x > 0 && x < 90 && y < 45 && y > 0){
			return find(x,y,list.get(2));
		}else if(x  > 90 && y < 45 && y > 0){
			return find(x,y,list.get(3));
		}else if( x < -90 && y > 45){
			return find(x,y,list.get(4));
		}else if(x < 0 && x > -90 && y > 45){
			return find(x,y,list.get(5));
		}else if(x < 0 && x > -90 && y < 45 && y > 0){
			return find(x,y,list.get(6));
		}else if(x < -90 && y < 45 && y > 0){
			return find(x,y,list.get(7));
		}else if(x < -90 && y < -45){
			return find(x,y,list.get(8));
		}else if(x < -90 && y < 0 && y > -45){
			return find(x,y,list.get(9));
		}else if(x < 0 && x > -90 && y < 0 && y > -45){
			return find(x,y,list.get(10));
		}else if(x < 0 && x > -90 && y < -45){
			return find(x,y,list.get(11));
		}else if(x > 90 && y < -45){
			return find(x,y,list.get(12));
		}else if(x > 0 && x < 90 && y < -45){
			return find(x,y,list.get(13));
		}else if(x > 0 && x < 90 && y < 0 && y > -45){
			return find(x,y,list.get(14));
		}else if(x > 90 && y < 0 && y > -45){
			return find(x,y,list.get(15));
		}else{
			return find(x,y,list.get(16));
		}
	}
	
	public static void main(String[] args) throws IOException{
		long start = System.currentTimeMillis();
		System.out.println(getZoneName(28.669954, 68.124186));
		
		System.out.println(getZoneName(31.183286, 0.975748));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public static String find(float x, float y, List<FloatPolygon> polygon){
		for(FloatPolygon p:polygon){
			if(p.contains(x, y)){
				return p.getName();
			}
		}
		return null;
	}*/
}
