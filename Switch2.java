package com.DescionMakingStatments;

public class Switch2 {

	public static void main(String[] args) {
		String i = "0.....100";
		switch (i) {
		case "0.....35":
			System.out.println("FAIL");
			break;
		case "36.....50":
			System.out.println("Your Grade is 'C'");
			break;
		case "51.....65":
			System.out.println("Your Grade is 'B+'");
			break;
		case "66.....75":
			System.out.println("Your Grade is 'B'");
			break;
		case "76.....85":
			System.out.println("Your Grade is ''A");
			break;
		case "86.....100":
			System.out.println("Your Grade is 'A+'");
			break;

		default:
			System.out.println("Invalid");
			break;
		}
	}

}
