package com.sourceit.javabasic.sungurov.L16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.SortedSet;
import java.util.TreeSet;

public class Country {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		SortedSet<String> countrySet = new TreeSet<String>();
		SortedSet<String> letterSet = new TreeSet<String>();

		try {
			inputStream = new BufferedReader(new FileReader("Country.txt"));
			outputStream = new PrintWriter(new FileWriter("CountrySort.txt"));

			String l;
			while ((l = inputStream.readLine()) != null) {
				l = l.substring(4);
				countrySet.add(l);
			}

			for (String str : countrySet) {
				letterSet.add(str.charAt(0) + "");
			}
			
			countrySet.addAll(letterSet);

			for (String tr : countrySet) {
				if (tr.length() > 2) {
					outputStream.print("   ");
				}
				outputStream.println(tr);
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
