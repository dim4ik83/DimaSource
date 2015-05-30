package com.sourceit.javabasic.sungurov.L16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import com.sun.imageio.plugins.common.InputStreamAdapter;
//import src.com.sourceit.java.basic.lesson16.lab.Country.txt;




public class Country {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		 BufferedReader inputStream = null;
		         PrintWriter outputStream = null;
		 
		         try {
		             inputStream = new BufferedReader(new FileReader("Country.txt"));
		             outputStream = new PrintWriter(new FileWriter("CountrySort.txt"));
		 
		             String l;
		             while ((l = inputStream.readLine()) != null) {
		                 outputStream.println(l);
		                 outputStream.println("---");
		             }
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
