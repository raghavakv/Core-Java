package com.arrays.one;

public class InterchangeValuesofArray {
	

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0] = new int[] { 1, 8, 4 };
		arr[1] = new int[] { 9, 7, 2 };
		arr[2] = new int[] { 7, 6, 4 };

		int[][] arr1 = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = arr[j][i];
			}
		}
		System.out.println("Given Array:");
		printArray(arr);

		System.out.println("\nTransposed Array:");
		printArray(arr1);
	}

	public static void printArray(int[][] arr) {
		for (int[] row : arr) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}
}
//package com.arrays.one;
//
//public class InterchangeValuesofArray {
//
//    public static void main(String[] args) {
//        int[][] arr = new int[3][3];
//        arr[0] = new int[] { 1, 8, 4 };
//        arr[1] = new int[] { 9, 7, 2 };
//        arr[2] = new int[] { 7, 6, 4 };
//
//        int[][] arr1 = new int[3][3];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                arr1[i][j] = arr[j][i];
//            }
//        }
//        System.out.println("Given Array:");
//        printArray(arr);
//
//        System.out.println("\nTransposed Array:");
//        printArray(arr1);
//    }
//
//    public static void printArray(int[][] arr) {
//        for (int[] row : arr) {
//            for (int element : row) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
//    }
//}
