package com.Hackerrank;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int i = scanner.nextInt();
		for (int j = 1; j <= 10; j++) {
			System.out.println(i+"x"+j+"="+i*j);
		}
		scanner.close();
	}
	
	
}
