package com.arrays.one;

public class Adding2Arrays {

	public static void main(String[] args) {

		int arr[][] = new int[3][3];
		arr[0] = new int[] { 1, 2, 1 };
		arr[1] = new int[] { 9, 7, 2 };
		arr[2] = new int[] { 7, 6, 4 };

		int arr1[][] = new int[3][3];
		arr1[0] = new int[] { 2, 6, 8 };
		arr1[1] = new int[] { 0, 1, 3 };
		arr1[2] = new int[] { 1, 2, 4 };

		int result[][] = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result[i][j] = arr[i][j] + arr1[i][j];
			}

		}
		System.out.println("Result of addition:");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.println(result[i][j] + "  ");

			}
			System.out.println();

		}
	}
}