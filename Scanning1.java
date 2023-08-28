package com.scanning;

import java.util.Scanner;

public class Scanning1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name");
		String name = scanner.nextLine();
		System.out.println("Student name : " + name);

		System.out.println("What is Your Mobile Number");
		long mno = scanner.nextLong();
		System.out.println("mobile num : " + mno);

		System.out.println("Thank You For the Informantion");
		scanner.close();
	}

}
