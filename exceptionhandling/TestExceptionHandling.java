package com.exceptionhandling;

import java.util.Scanner;

public class TestExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a Value");
		int a = sc.nextInt();

		System.out.println("Enter b value");
		int b = sc.nextInt();

		System.out.println("Hello main method");
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("Please enter non zero values");
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Hello Raghava");
		System.out.println("Hello Dhanush");

	}
}
