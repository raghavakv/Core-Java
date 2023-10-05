//package com.arrays.one;
//
//public class SumArrays {
//
//	public static void main(String[] args) {
//
//		int array[][] = new int[3][3];
//
//		array[0] = new int[] { 6, 8, 9 };
//
//		array[1] = new int[] { 7, 4, 8 };
//
//		array[2] = new int[] { 5, 8, 9 };
//
//		int sum = 0;
//
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				sum += array[i][j];
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println("Sum of elements in row " + i+":" + sum);
//			sum = 0;
//		}
//		System.out.println();
//
//	}
//}
//package com.arrays.one;
//
//public class SumArrays {
//
//	public static void main(String[] args) {
//
//		int[] numbers = { 20, -6, 58, 83, 68, -76, 794, 93, 67, 9 };
//
//		double sum = 0;
//		double avg = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			sum = sum + numbers[1];
//		}
//		avg = sum / numbers.length;
//
//		System.out.println("Sum of all the numbers is: " + sum);
//
//		System.out.println("Avg of all the numbers is : " + avg);
//	}
//}
//class and package declaration
package com.arrays.one;

public class SumArrays {
	//Main Method
	public static void main(String[] args) {
		//array declaration and initilization
		int array[][] = new int[3][3];
		array[0] = new int[] { 6, 8, 9 };
		array[1] = new int[] { 7, 4, 8 };
		array[2] = new int[] { 5, 8, 9 };
		//Sum Calculation and Printing
		int sum = 0;
//It uses nested loops to iterate over the rows and columns of the array
		for (int i = 0; i < array.length; i++) {//for Rows
			for (int j = 0; j < array[i].length; j++) {//For Columns

				sum += array[i][j];
//For each element, it prints the value and accumulates the sum for each
//After each row, it prints the sum of the elements in that row.
//The variable sum is reset to 0 for each new row.
				System.out.print(array[i][j] + " ");
			}
			System.out.println("sum of elements in row " + i + ":" + sum);
			sum = 0;
		}
	}
}