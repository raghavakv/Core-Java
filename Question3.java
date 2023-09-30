package com.arrays.one;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		int[] arr = { 54, 67, 78, 7, 7, 8, 98, 67, 55, 45, 43, 89, 54, 55, 90 };
		int length = arr.length;
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[length - 1 - i];
			arr[length - 1 - i] = temp;
			System.out.println("Reversed arr:" + Arrays.toString(arr));

		}

	}

}
