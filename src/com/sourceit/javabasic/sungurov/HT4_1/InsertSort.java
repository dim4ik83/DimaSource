package com.sourceit.javabasic.sungurov.HT4_1;

/**
 * Make sort array by method "Insertsort"
 * @author Dmitry
 *
 */

public class InsertSort {

	public int[] InsertSort(int[] Array) {

		int perem;
		int count = 0;
		int steps = 0;

		for (int i = 0; i < Array.length; i++) {

			perem = Array[i];

			for (int j = i; j > 0; j--) {
				if (perem < Array[j - 1]) {
					Array[j] = Array[j - 1];
					Array[j - 1] = perem;
					count++;
				}
				steps++;
			} // end for j

		} // end for i

		System.out.println(" ");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}

		System.out.println("Method insertsort. The nuber of operations is: "
				+ count + ". Number steps is: " + steps);

		return Array;

	}

}
