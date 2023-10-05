package com.arrays.one;

public class SortingListOfNumbers {

	public static void main(String[] args) {
		int number[] = { 55, 40, 80, 65, 75 };
		int n = number.length;
		System.out.println("Given list :");
		for (int i = 0; i < number.length; i++) {
			System.out.println(" " + number[i]);
		}
		//System.out.println("/n");
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] < number[j]) {
					int temp = number[i];
					number[i] = number[j];
					number[j]=temp;
				}
			}
		}
		System.out.println("Sorted List");
		for (int i = 0; i < number.length; i++) {
			System.out.println(" " + number[i]);
		}
		System.out.println(" ");
	}
}
