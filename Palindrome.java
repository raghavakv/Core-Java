package com.hackerrank;

public class Palindrome {
	public static void main(String[] args) {
		int[] arr = { 10 };
		for (int i = 0; i < arr.length; i++) {
			if (isPalindrome(arr[i])) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}

	public static boolean isPalindrome(int i) {
		if (i < 0) {
			return false;
		}
		int originalnum = i;
		int reverse = 0;
		while (i != 0) {
			int digit = i % 10;
			reverse = reverse * 10 + digit;
			i /= 10;
		}
		return originalnum == reverse;
	}
}
