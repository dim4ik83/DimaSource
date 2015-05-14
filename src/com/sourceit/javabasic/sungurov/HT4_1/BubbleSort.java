package com.sourceit.javabasic.sungurov.HT4_1;

/**
 * Make sort array by method "Bubblesort"
 * @author Dmitry
 *
 */

public class BubbleSort {

	public int[] BubbleSort(int[] Array) {

		int perem = 0;
		int count = 0;
		int leng = Array.length;
		int steps = 0;

		for (int i = 0; i < Array.length; i++) {

			for (int j = 0; j < leng - 1; j++) {
				if (Array[j] > Array[j + 1]) {
					perem = Array[j + 1];
					Array[j + 1] = Array[j];
					Array[j] = perem;
					count++;
				}
				steps ++;		//count number steps of cycle
			} // end for j
			leng --;			//decrease array by 1, in the end of one cycle pass
		} // end for i

		System.out.println(" ");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}

		System.out.println("Method bubblesort. The nuber of operations is: "
				+ count + ". Number steps is: " + steps );
	
		return Array;

	}

}
