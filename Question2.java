package com.arrays.one;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		int[] arr = { 54, 67, 78, 7, 7, 8, 98, 67, 55, 45, 43, 89, 54, 55, 90 };
		int fourthLargest = findFourthLargest(arr);
		System.out.println("4th Largest element is: " + fourthLargest);
	}

	public static int findFourthLargest(int[] arr) {
		if (arr.length < 4) {
			System.out.println("Array does not have a fourth largest element.");
			return -1;
		}

		Arrays.sort(arr);
		return arr[arr.length - 4];
	}
}
