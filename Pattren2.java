package com.Patterns.one;

public class Pattren2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i % 2 != 0) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
