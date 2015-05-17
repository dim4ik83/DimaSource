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
import java.util.TreeSet;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class TextOp extends TextStatistics {

	int Count = 0;
	String buffer = this.getText();
	int length = buffer.length();

	public TextOp(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TextOp s = new TextOp("Hello, my little char inedx for cream nice for money peace");

		System.out.println("Text operation is: " + s.getText());
		System.out.println();
		
		System.out.print("The character " + 'l' + " occurs in a text: ");
		s.getCharCount('l');
		System.out.println(" times");
		
		System.out.println();
		
		System.out.print("Frequency of the character " + 'a' + " is: ");
		s.getCharFrequency('a');

		
		System.out.println();
		System.out.println("Collection of unique characters and it's counts");
		s.getChars();
		
		
		System.out.println();
		System.out.println("list of words in a text");
		s.words();
		
		System.out.println();
		System.out.print("Count of a char which most popular: ");
		s.getMostPopularCharCount();
		
		
	}

	
	
	@Override
	public int getCharFrequency(char c) {
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
		System.out.print(Count);
		return Count;
	}

	@Override
	public Map<String, Integer> getChars() {

		Map<String, Integer> mapUnCh = new TreeMap<>();
		String buf = " ";
		int value = 1;

		for (int i = 0; i < length; i++) {
			buf = "" + buffer.charAt(i);
			
			if (!mapUnCh.containsKey(buf)) {
				int val = 1;
				mapUnCh.put(buf, val);
				}

			else  {
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
		
		TreeSet <String> listWords = new TreeSet<>();
		String k = "";
		int value = 0;

		for (int i = 0; i < length; i++) {
			k= " ";
			if (buffer.charAt(i) == ' ' || i == length-1) {
				for (int y=value; y<i+1; y++){
					k += "" + buffer.charAt(y);
				}

				listWords.add (k);
				value = i;
			}
		}
		List <String> listW = new ArrayList(listWords);
		System.out.println(listW);
		return listW;
	}

	@Override
	public int getMostPopularCharCount() {
		
//		Map <String, Integer> mapa = getChars();
//		int value=0;
//		for (Entry<String, Integer> entry : mapa.entrySet())
//			if (entry.getValue() +1 > entry.getValue()) {
//				value = entry.getValue()+1;
//				entry.setValue(++value);
//			}
		
		
		
		Map<String, Integer> mapUnCh = new HashMap<>();
		String buf = " ";
		int value = 1;

		for (int i = 0; i < length; i++) {
			buf = "" + buffer.charAt(i);
			
			if (!mapUnCh.containsKey(buf)) {
				int val = 1;
				mapUnCh.put(buf, val);
				}

			else  {
				for (Entry<String, Integer> entry : mapUnCh.entrySet())
					if (buf.equals(entry.getKey())) {
						value = entry.getValue();
						entry.setValue(++value);
					}
			}
		}
		
		int va=0;
		for (Entry<String, Integer> entry : mapUnCh.entrySet())
			if (entry.getValue() +1 > entry.getValue()) {
				va = entry.getValue()+1;
			}
		
		
		

		System.out.println(va);
		return va;
		
		
		
		
		
		
		
		
		
		
		
		

		
		
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
