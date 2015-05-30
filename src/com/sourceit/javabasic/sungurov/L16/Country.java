package com.sourceit.javabasic.sungurov.L16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.SortedSet;
import java.util.TreeSet;

//import com.sun.imageio.plugins.common.InputStreamAdapter;
//import src.com.sourceit.java.basic.lesson16.lab.Country.txt;




public class Country {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
				BufferedReader inputStream = null;
		        PrintWriter outputStream = null;
		        
		       SortedSet <String> mapUnCh = new TreeSet<String>() ;
				
		        
		         try {
		             inputStream = new BufferedReader(new FileReader("Country.txt"));
		             outputStream = new PrintWriter(new FileWriter("CountrySort.txt"));
		 
		             String l;
		             while ((l = inputStream.readLine()) != null) {
		                 l=l.substring(6);
		            	 mapUnCh.add(l);
		            	 System.out.println();
		            	 
		             }

		             for (String tr : mapUnCh ) {
		             
		             outputStream.println(tr);}
		             
		         } finally {
		             if (inputStream != null) {
		                 inputStream.close();
		             }
		             if (outputStream != null) {
		                 outputStream.close();
		             }
		         }
        }

	

}
