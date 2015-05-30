package com.sourceit.javabasic.sungurov.HT15;
import com.sourceit.javabasic.sungurov.HT11.TextOp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;



public class Lorem {

	
	public static void main(String[] args) {
		
		String s="";
		for (int i = 0; i < args.length; i++) {
			s += args[i] + " ";
		}
		
		TextOp ol = new TextOp(s);
		
		ol.getCharFrequency('f');
		ol.getCharCount('f');
		ol.getChars();
		
		ol.words();
		
		ol.getMostPopularCharCount();
		
		ol.getLeastPopularCharCount();
		
		
		
		try{

			BufferedReader br =

			new BufferedReader(new InputStreamReader(System.in, s)); 

			PrintWriter pw = new PrintWriter(

			new OutputStreamWriter(System.out, s), true); 

			String s1 = "Это строка с русским текстом"; 

			System.out.println("System.out puts: " + s1); 

			pw.println("PrintWriter puts: " + s1) ; 

			int с = 0;

			pw.println("Посимвольный ввод:"); 

			while((с = br.read()) != -1)

//			pw.println((char) c); 

			pw.println("Построчный ввод:"); 

			do{

			s = br.readLine(); 

			pw.println(s); 

			}while(!s.equals("q")); 

			}catch(Exception e){

			System.out.println(e); 

			} 

			} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new InputStreamReader(System.in,s));
//			
//			
//			
//			
//			
//		} catch (UnsupportedEncodingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//					System.out.println("Enter String");
//					String s1="";
//					try {
//						s1 = br.readLine();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//		
//		System.out.println(s1);
//		
//		
//		
//		
//	//	ol.
//		
//		
//		
//		
//		BufferedReader inputStream = null;
//		        PrintWriter outputStream = null;
//		
//		        try {
////		            inputStream = new BufferedReader((s));
//		            outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));
//		
//		            String l;
//		            while ((l = inputStream.readLine()) != null) {
//		                outputStream.println(l);
//		                outputStream.println("---");
//		            }
//		        } finally {
//		            if (inputStream != null) {
//		                inputStream.close();
//		            }
//		            if (outputStream != null) {
//		                outputStream.close();
//		            }
//		        }
//		
//		
//		
//
	
	
}
