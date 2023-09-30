package com.arrays.one;

public class Question4b {

	public static void main(String[] args) {
		int i, j, k, star = 1, space = 4;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= star; k++) {
				System.out.print("*");
			}
			star = star + 2;
			space = space - 1;
			System.out.println();
		}
	}
}
		