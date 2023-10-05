package com.Hackerrank;

import java.util.Scanner;

public class StaticInitialization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = sc.nextInt();
		if (h > 0 || b > 0) {
			System.out.println(b*h);
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}

	}
}