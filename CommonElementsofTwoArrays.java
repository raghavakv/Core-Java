package com.arrays.one;

public class CommonElementsofTwoArrays {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0] = new int[] { 1, 2, 1 };
		arr[1] = new int[] { 9, 7, 2 };
		arr[2] = new int[] { 7, 6, 4 };

		int[][] arr1 = new int[3][];
		arr1[0] = new int[] { 2, 6, 8, 6 };
		arr1[1] = new int[] { 0, 1, 3, 9, 7 };
		arr1[2] = new int[] { 7, 2, 0 };
		System.out.println("The common elements are:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				for (int k = 0; k < arr[i].length; k++) {
					for (int l = 0; l < arr1[j].length; l++) {
						if (arr[i][k] == arr1[j][l]) {
							System.out.print(arr[i][k] + "  ");
						}
					}
				}
			}
		}
	}
}
// int result[][]=new int[3][];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr1.length; j++) {
//				for (int k = 0; k < arr[i].length; k++) {
//					for (int l = 0; l < arr1[j].length; l++) {
//						if (arr[i][k] == arr1[j][l]) {
//							System.out.print(arr[i][k] + "  ");
//
//						}
//
//					}
//
//				}
//			}