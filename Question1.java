package com.arrays.one;

public class Question1 {

	public static void main(String[] args) {
		int[] arr = { 54, 67, 78, 7, 7, 8, 98, 67, 55, 45, 43, 89, 54, 55, 90 };
		System.out.println("Repeated elements are:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}

		}

	}

}
