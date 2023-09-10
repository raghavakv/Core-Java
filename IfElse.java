package com.Hackerrank;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = scanner.nextInt();
		if (a % 2 == 0) {
			if (a >= 2 && a <= 5 && a % 2 == 0) {
				System.out.println("Not Weird");
			}
			if (a >= 6 && a <= 20 ) {
				System.out.println("Weird");
			}
			if (a > 20 && a % 2 == 0) {
				System.out.println("Not Weird");
			}
		} else {
			System.out.println("Weird");
		}
		scanner.close();
	}
}
//******************************************************************************
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        
//        if (N % 2 == 0) {
//            if (N >= 2 && N <= 5) {
//            System.out.println("Not Weird");
//            }
//            
//            if (N >= 6 && N <= 20) {
//                System.out.println("Weird");
//            }
//            
//            if (N > 20) {
//                System.out.println("Not Weird");
//            }
//        } else { 
//            System.out.println("Weird");
//        }
//        
//        scanner.close();
//    }
//}