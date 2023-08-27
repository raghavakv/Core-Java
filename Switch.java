package com.DescionMakingStatments;

public class Switch {

	public static void main(String[] args) {
		int i=10;
		switch (i) {
		case 1:
			System.out.println("This is first number");
			break;
		case 2:
			System.out.println("This is second number");
		case 3:
			System.out.println("This is third number");
		default:
			System.err.println("The number is invalid");
			break;
		}

	}

}
