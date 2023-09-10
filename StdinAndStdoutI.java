package com.Hackerrank;

import java.util.Scanner;

public class StdinAndStdoutI {

	// public static void main(String[] args) {
	// Scanner scanner = new Scanner(System.in);
	// System.out.println("Enter The String:");
	// String myInt = scanner.next();
	// int myString = scanner.nextInt();

	// System.out.println("myString is: " + myString);
	// System.out.println("myInt is: " + myInt);
	//
	// }
	//
	// }
// *************************************************************
	// public class StdinAndStdoutI {
	//
	// public static void main(String[] args) {
	// Scanner scanner = new Scanner(System.in);
	// int a = scan.nextInt();
	// int b = scan.nextInt();
	// int c = scan.nextInt();
	//
	// System.out.println(a);
	// System.out.println(b);
	// System.out.println(c);
	//
	// }
	// }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Format:");
		int i = scanner.nextInt();
		Double d = scanner.nextDouble();
		String s = scanner.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}
//public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//
//    int i = scan.nextInt();
//    double d = scan.nextDouble();
//
//    scan.nextLine();
//    String s = scan.nextLine();
//
//    System.out.println("String: " + s);
//    System.out.println("Double: " + d);
//    System.out.println("Int: " + i);
//}
//}