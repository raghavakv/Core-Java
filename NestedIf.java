package com.DescionMakingStatments;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Status");
		String assignment = scanner.nextLine();
		if (assignment == "Pass") {
			System.out.println("You are Selected to Round1");

			String round1 = "Pass";
			if (round1 == "Pass") {
				System.out.println("You are Selected to Round2");

				String round2 = "Pass";
				if (round2 == "Pass") {
					System.out.println("You are Selected to HR Round");

					String hrRound = "Pass";
					if (hrRound == "Pass") {
						System.out.println("You are HIRED!!");
					} else {
						System.out.println("Thanks for Your Time and Cooperation");
					}
				} else {
					System.out.println("Thanks for Your Time and Cooperation");
				}
			} else {
				System.out.println("Thanks for Your Time and Cooperation");
			}
		} else {
			System.out.println("Thanks for Your Time and Cooperation");
		}
		scanner.close();
	}
}
