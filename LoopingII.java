package com.Hackerrank;

import java.util.Scanner;

public class LoopingII {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();

				int sum = a;
				for (int j = 0; j < c; j++) {
					sum += Math.pow(2, j) * b;
					System.out.println(sum + " ");
				}
				System.out.println();
			}
		}
	}
}
