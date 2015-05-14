package com.sourceit.javabasic.sungurov.HT4_1;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Mas[] = { 56, -2, 75, 52, 15, -152, 56, 85, 15, 53 };

		for (int i = 0; i < Mas.length; i++) {
			System.out.print(Mas[i] + " ");
		}
		System.out.print("Not sorted array ");
		System.out.println(" ");

		BubbleSort Bub = new BubbleSort();
		Bub.BubbleSort(Mas);
		System.out.println(" ");

		int Mas1[] = { 56, -2, 75, 52, 15, -152, 56, 85, 15, 53 };
		InsertSort Ins = new InsertSort();
		Ins.InsertSort(Mas1);

	}

}
