package com.Hackerrank;

import java.util.Scanner;

public class StaticInitializerBlock {
//	private static final int B = 3;
//	private static final int H = 1;
//	Scanner scanner = new Scanner(System.in);
//
////	System.out.println("Enter The First Number:");
////	System.out.println("Enter The Second Number:");
//	public static void main(String[] args) {
//		// Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter The First Number:");
//		System.out.println("Enter The Second Number:");
//		if (B <= 0 && H <= 0) {
//			System.out.println(B * H);
//		} else {
//			System.out.println("java.Exception:Breadth and Height must be positive");
//		}
//	}
//
//}
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter The First Number:");
		 System.out.println("Enter The Second Number:");
		int breadth = scanner.nextInt();
		int height = scanner.nextInt();

		if (breadth > 0 && height > 0) {
			System.out.println(breadth * height);
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
}