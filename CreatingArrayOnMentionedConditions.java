//package com.arrays.one;
//
//public class CreatingArrayOnMentionedConditions {
//
//    public static void main(String[] args) {
//        int[][] arr = new int[3][3];
//        arr[0] = new int[] { 1, 2, 1 };
//        arr[1] = new int[] { 9, 7, 2 };
//        arr[2] = new int[] { 7, 6, 4 };
//
//        int[][] arr1 = new int[3][3];
//        arr1[0] = new int[] { 1, 6, 1 };
//        arr1[1] = new int[] { 0, 7, 3 };
//        arr1[2] = new int[] { 1, 6, 4 };
//
//        int[][] result = new int[3][3];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == arr1[i][j]) {
//                    result[i][j] = 1; // Condition met
//                } else {
//                    result[i][j] = 0; // Condition not met
//                }
//            }
//        }
//
//        System.out.println("Result Array:");
//
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//***********************************************************************
package com.arrays.one;

public class CreatingArrayOnMentionedConditions {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0] = new int[] { 1, 2, 1 };
		arr[1] = new int[] { 9, 7, 2 };
		arr[2] = new int[] { 7, 6, 4 };

		int[][] arr1 = new int[3][3];
		arr1[0] = new int[] { 1, 6, 1 };
		arr1[1] = new int[] { 0, 7, 3 };
		arr1[2] = new int[] { 1, 6, 4 };

		int[][] result = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == arr1[i][j]) {
					result[i][j] = 1;
				} else {
					result[i][j] = 0;
				}
			}
		}
		System.out.println("Result Array:");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}