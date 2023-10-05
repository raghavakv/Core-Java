package com.arrays.one;

public class SumOfElementsOfMultiDarray {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0] = new int[] { 1, 8, 4 };
		arr[1] = new int[] { 9, 7, 2 };
		arr[2] = new int[] { 7, 6, 4 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
				sum += arr[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum of all elements:" + sum);
	}

}
