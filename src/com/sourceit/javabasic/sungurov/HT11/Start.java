package com.sourceit.javabasic.sungurov.HT11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Start extends TextStatistics {

	int Count=0;
	String buffer= this.getText();
	int length = buffer.length();
	
	
	
	public Start(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Start s = new Start ("Hello, my little char inedx for cream nice");
		s.getText();
		
				
		s.getCharCount('l');
		s.getCharFrequency('a');
		
		

	}

	@Override
	public int getCharFrequency(char c) {

		int fr = getCharCount(c)/length;
		
		System.out.println(fr + " %");
		return 0;
	}

	@Override
	public int getCharCount(char c) {
		buffer = this.getText();
		int length = buffer.length();
		
		for (int i=0; i< length; i++ ) {
			if (c==buffer.charAt(i)) {
				Count++;
			}
		} 
		System.out.println(Count);		
		return Count;
	}

	
	@Override
	public Map<String, Integer> getChars() {
		
		
		
		return null;
	}

	@Override
	public List<String> words() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMostPopularCharCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastPopularCharCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char getCharByCount(int count) {
		// TODO Auto-generated method stub
		return 0;
	}

}
