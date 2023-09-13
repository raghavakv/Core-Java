package com.Hackerrank;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = scanner.nextInt();
		if (n <= 100 && n >= -100) {
			System.out.println("Good job");
		} else {
			System.out.println("Wrong answer");
		}
		scanner.close();
	}

}
