package com.sourceit.javabasic.sungurov.HT7;

import com.sourceit.exercise.IntArrays;

public class Start {

	public static void main(String[] args) {

		MyArray newArr = new MyArray();

		newArr.add(1);
		newArr.add(150);

		System.out.println(newArr.size()); // 2
		System.out.println(newArr.get(1)); // 150

	}

}

class MyArray implements IntArrays {

	int i = 0;
	int[] Mas = new int[20];

	public void add(int value) {

		Mas[i] = value;
		i++;
	}

	public int get(int index) {

		return Mas[index];
	}

	public int size() {

		int[] Mas2 = new int[i];
		int size = Mas2.length;
		return size;
	}

}