package com.sourceit.javabasic.sungurov.HT14;

public class Exceptions {

	public static void main(String[] args) {

		int len = args.length;
		String s = "";

		Integer indStart = 0;
		Integer indEnd = 0;

		String tIndEnd = args[len - 1];

		try {

			indEnd = Integer.valueOf(tIndEnd);
		} catch (NumberFormatException e) {
			System.err.println("Неверный формат строки!");
		}

		try {
			String tIndStart = args[len - 2];

			indStart = Integer.valueOf(tIndStart);
		}

		catch (NumberFormatException e) {
			System.err.println("You inputed only one index");
			indStart = indEnd;

			for (int i = 0; i < args.length - 1; i++) {
				s += args[i] + " ";
			}
			s = s.trim();

			System.out.println("Input String: " + s);

			try {
				System.out.println("Substring from indStart (" + indStart
						+ "): " + s.substring(indStart));
			}

			catch (StringIndexOutOfBoundsException e1) {
				System.err
						.println("Out of bounds! Input the number less then: "
								+ s.length());
			}

			return;
		}

		for (int i = 0; i < args.length - 2; i++) {
			s += args[i] + " ";
		}
		s = s.trim();

		System.out.println("Input String: " + s);

		try {
			System.out.println("Substring from indStart (" + indStart + ") "
					+ "to indEnd (" + indEnd + "): "
					+ s.substring(indStart, indEnd));
		}

		catch (StringIndexOutOfBoundsException e) {
			System.err.println("Out of bounds! Input the number less then: "
					+ s.length());
		}

	}

}
