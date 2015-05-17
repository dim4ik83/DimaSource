package com.sourceit.javabasic.sungurov.HT11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class TextOp extends TextStatistics {

	int Count = 0;
	String buffer = this.getText();
	int length = buffer.length();
	char g;

	public TextOp(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TextOp s = new TextOp(
				"Hello, my little char inedx for cream nice for money peace");
		s.getText();

		System.out.println(s);
		System.out.println();
		
		System.out.print("The character 'l' occurs in a text ");
		s.getCharCount('l');
		System.out.println(" times");
		 
		s.getCharFrequency('a');

		System.out.println();
		System.out.println("collection of unique characters and it's counts");
		s.getChars();

	}

	@Override
	public int getCharFrequency(char c) {
		g=c;
		int fr = getCharCount(c) / length;

		System.out.println(fr + " %");
		return fr;
	}

	@Override
	public int getCharCount(char c) {
		buffer = this.getText();
		int length = buffer.length();

		for (int i = 0; i < length; i++) {
			if (c == buffer.charAt(i)) {
				Count++;
			}
		}
		System.out.println(Count);
		return Count;
	}

	@Override
	public Map<String, Integer> getChars() {

		Map<String, Integer> mapUnCh = new TreeMap<>();
		String buf = " ";
		int value = 1;

		for (int i = 0; i < length; i++) {
			buf = " " + buffer.charAt(i);
			if (!mapUnCh.containsKey(buf)) {
				int val = 1;
				mapUnCh.put(buf, val);
			}

			else {
				for (Entry<String, Integer> entry : mapUnCh.entrySet())
					if (buf.equals(entry.getKey())) {
						value = entry.getValue();
						entry.setValue(++value);
					}
			}
		}

		System.out.println(mapUnCh);
		return mapUnCh;
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
