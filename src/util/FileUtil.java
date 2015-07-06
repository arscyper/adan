package util;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringEscapeUtils;

public class FileUtil {

	
	public static void main(String[] args){
		File f = new File(".");
		
		String fileName = f.getAbsolutePath() + "/src/util/text.txt";
		 
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName),
                    Charset.defaultCharset());
            StringBuilder builder = new StringBuilder();
            int j = 0;
            for (String line : lines) {
            	if(line.trim().startsWith("<")){
            		line =line.trim();
            	}else{
            		j++;
            		char prev = '\0';
            		String newLine = "";
            		remove(line, newLine);
            		System.out.println(newLine);
            		if(j == 5){
            			break;
            		}
            		//System.out.println();
            		
        			
            	}
                //write(fileName, line);
            	if(line.length() > 0){
            		//System.out.print(line);
            	}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void remove(String line, String newLine){
		
		for(int i = 0; i<=line.length() -1; i++){
			char prev = '\0';
			char curr = line.charAt(i);
			char next = '\0';
			try{
				if(i > 1){
					prev = line.charAt(i - 1);
				}
				if(i < (line.length() - 1)){
					next = line.charAt(i+1);
				}
				
				if(curr == ' ' && prev == ' '){
					
				}else if(prev == '{' && curr == ' '){
					
				}else if(prev == '(' && curr == ' '){
					
				}else if(prev == ')' && curr == ' '){
					
				}else if(prev == ' ' && curr == '('){
					
				}else{
					newLine += String.valueOf(curr);
				}
			}catch(Exception e){
				break;
			}
			
		}
		System.out.print(newLine);
	}
	
	
	public static void write(String f, String c){
		try {
			 
			String content = c;
 
			File file = new File(f);
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), false);
			System.out.println(fw.getEncoding());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
