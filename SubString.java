package com.Hackerrank;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
//		char[] c1 = S.toCharArray();
//		String s1 = "";
//		for (int i = start; i < end; i++) {
//			s1 += c1[i];
//		}
//		System.out.println(s1);
//		sc.close();
		System.out.println(S.substring(start, end));
		sc.close();
	}

}
