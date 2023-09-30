package com.arrays.one;

public class DashInsertI {
	public static void main(String[] args) {
		int arr[] = { 4, 5, 4, 6, 7, 9, 3 };

		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i]);
				if (i < arr.length - 1) {
					System.out.print(" - ");
				}
			}
		}

		System.out.print("\n");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i]);
				if (i < arr.length - 1) {
					System.out.print(" * ");
				}
			}
		}
	}
}

//	public static String DashInsertII(String str) {
//		StringBuilder result = new StringBuilder();
//
//		for (int i = 0; i < str.length(); i++) {
//			char currentChar = str.charAt(i);
//			result.append(currentChar);
//
//			if (i < str.length() - 1 && Character.isDigit(currentChar) && Character.isDigit(str.charAt(i + 1))) {
//				int currentDigit = Character.getNumericValue(currentChar);
//				int nextDigit = Character.getNumericValue(str.charAt(i + 1));
//
//				if (currentDigit % 2 != 0 && nextDigit % 2 != 0) {
//					result.append('-');
//				} else if (currentDigit % 2 == 0 && nextDigit % 2 == 0 && currentDigit != 0 && nextDigit != 0) {
//					result.append('*');
//				}
//			}
//		}
//
//		return result.toString();
//	}
//
//	public static void main(String[] args) {
//		String inputStr = "4546793";
//		String outputStr = DashInsertII(inputStr);
//		System.out.println(outputStr); // Output: 454*67-9-3

// public static void main(String[] args) {

//		int arr[] = { 4, 5, 4, 6, 7, 9, 3 };
////System.out.println("odd numbers: "); 
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] % 2 != 0) {
//				System.out.print(arr[i] + " - ");
//			}
//			//System.out.print(" " + " ");
//		}
//// System.out.println("even numbers: "); 
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				System.out.print(arr[i] + " * ");
//			}
//
//		}
//	}
//}
