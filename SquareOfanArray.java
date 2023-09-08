package com.arrays.one;

public class SquareOfanArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0] = new int[] { 2, 3, 5 };
		arr[1] = new int[] { 0, 1, 3 };
		arr[2] = new int[] { 1, 2, 4 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int square = arr[i][j] * arr[i][j];
				System.out.print(square + "  ");

			}
			System.out.println();
		}

	}

}