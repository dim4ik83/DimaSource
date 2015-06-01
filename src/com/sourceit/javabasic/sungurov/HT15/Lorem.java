package com.sourceit.javabasic.sungurov.HT15;

import com.sourceit.javabasic.sungurov.HT11.TextOp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lorem {

	public static void main(String[] args) {

		String s = "";
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

		PrintWriter outputStream = null;

		try {
			try {
				outputStream = new PrintWriter(new FileWriter("LoremStat.txt"));
			} catch (IOException e) {
				e.printStackTrace();
			}

			outputStream.println("Statistics:");
			outputStream.println("Frequency of the character " + 'f' + " is: "
					+ ol.getCharFrequency('f') + "%");
			outputStream.println("The character " + 'f' + " occurs in a text: "
					+ ol.getCharCount('f') + " times");
			outputStream
					.println("Collection of unique characters and it's counts"
							+ ol.getChars());
			outputStream.println("list of words in a text" + ol.words());
			outputStream.println("Count of a char which most popular: "
					+ ol.getMostPopularCharCount());
			outputStream.println("Count of a char which least popular: "
					+ ol.getLeastPopularCharCount());
			outputStream.println("------------------------");

			outputStream.println(s);

		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}
}
