package com.sourceit.javabasic.sungurov.lesson19.lab;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WGet  {

	/**
	 * @param args
	 */
	final static String commands [] = {"1) Save page", "2) Display title", "3) Find a word",
		"4) List all url's on the page", "5) Exit"};
		
	public static void main(String[] args) {
		
			if (args.length==0) {
			System.out.println(getInstructions());
			return;
			
		}
		
			String command = args[0];
			String url;
			
			if ("-u".equals (command)) {
				// TODO ask for URL
				System.out.println("Enter an URL: ");
			} else if (!command.startsWith("https://") ) {
				System.out.println(getInstructions());
				return;
				
			}
			ArrayList <String> file = new ArrayList <String>();
			
			try {
			 file = getOpenFile (command);
			} catch (Exception e){};
			
		while (true) {
			
			Scanner in = new Scanner (System.in);
			System.out.println("Select what to do next: ");
			
		for (int i=0; i<commands.length; i++) {
			System.out.println(commands [i]);
		}
		System.out.println();
		
		byte choice = in.nextByte();
		
		switch (choice) {
		
		case 1:
			
		    PrintWriter outputStream = null;
	
			    try {
			        outputStream = new PrintWriter(new FileWriter("HTMLpage.txt"));
			        outputStream.print (file); 
			        }

		 catch(Exception ex){
			    	System.out.println("Smth. wrong" + ex);
			    } finally {
			    	if (outputStream!=null){
			    		outputStream.close();
			    	}
			    }
			    
			    System.out.println("In your site: " + command);
			    System.out.println("You saved your page. Your file is: HTMLpage.txt");
			    System.out.println();
			
			break;
			
		case 2:
			
			String [] title = null;
			
			for ( String s: file) {
				if (s.contains("<title>")) {
					String [] parcer = s.split("<title>");
					title =parcer[1].split("</title>");
				}
			}
			
			System.out.println("In your site: " + command);
			System.out.println("Title of your page is: " + title[0]);
			System.out.println();
			
			break;
			
		case 3:
			
			System.out.println("Input a word you find");
			
			break;
			
		case 4:
			
			System.out.println("all url's on the page");
			
			break;
		
		
	
		case 5:
			
			System.exit(0);
		}
		}	//while
	}
	
	public static String getInstructions () {
		return "Usage: some web address\n" + "           or -i\n" + "Example: https://google.com\n";
	}
	
	public static ArrayList<String> getOpenFile (String url) {
		
			URL url1;
		    InputStream is = null;
		    BufferedReader br;
		    String line;
		    ArrayList <String> fileString = new ArrayList <String>();
		    
		    try {
		        url1 = new URL(url);
		        is = url1.openStream();
		        br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		        
		        while ((line = br.readLine()) != null) {
		        	fileString.add(line);
		        }
		    }catch(Exception ex){
		    	System.out.println("Smth. wrong" + ex);
		    } finally {
		    	if (is != null){
		    		try {
						is.close();
						} catch (IOException e) {}
		    	}
		    }
		
		return fileString;
		
	}
	
	
}
