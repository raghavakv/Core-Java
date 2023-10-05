package com.Hackerrank;

import java.util.Scanner;

public class StringIntroduction {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = A + B;
		System.out.println(C.length());
		if (A.length() > B.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
//		System.out.println(A + " " + B);
		System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " "
				+ Character.toUpperCase(B.charAt(0)) + B.substring(1));
	}

}
