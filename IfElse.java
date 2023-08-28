package com.DescionMakingStatments;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your score");
		int score=scanner.nextInt();

		if (score >= 0 && score <= 35) {
			System.out.println("FAIL");
		} else if (score <= 50) {
			System.out.println("Your Grade is 'C'");
		} else if (score <= 65) {
			System.out.println("Your Grade is 'B+'");
		} else if (score <= 75) {
			System.out.println("Your Grade is 'B'");
		} else if (score <= 85) {
			System.out.println("Your Grade is 'A'");
		} else if (score <= 100) {
			System.out.println("Your Grade is 'A+'");
		} else {
			System.out.println("Invalid");
			scanner.close();
		}
	}
}
