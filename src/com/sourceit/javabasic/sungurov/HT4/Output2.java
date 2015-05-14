package com.sourceit.javabasic.sungurov.HT4;
public class Output2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fooBar(18);

		// System.out.println("  ");

	}

	public static int fooBar(int n) {

		int[] Mas = new int[n];

		for (int i = 1; i < n; i++) {
			Mas[i] = i;

		}

		for (int i = 1; i < Mas.length; i++) {

			if (Mas[i] % 3 == 0 && Mas[i] % 5 == 0) {
				System.out.println("FooBar");
				
			}

			else if (Mas[i] % 5 == 0) {
				System.out.println("Bar");
			}

			else if (Mas[i] % 3 == 0) {
				System.out.println("Foo");
			}

			else
				System.out.println(Mas[i]);

		}

		return n;

	}

}
