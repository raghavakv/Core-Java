package com.exceptionhandling;

import java.util.Scanner;

public class Testexception3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			int a = sc.nextInt();
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Hello main method");
	}

}
