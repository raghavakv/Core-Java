package com.arrays.one;

import java.util.Scanner;

public class PrimeAndComposite {

	public static void main(String[] args) {

//		int arr[] = { 24, 35, 6, 7, 215, 8, 82, 101, 77, 22 };
//		int primary = arr[0];
//		int composite = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			int num = arr[i];
//			boolean isPrime = true;
//			if (num < 2)
//				isPrime = false;
//			else {
//				for (int j = 2; j < arr.length; j++) {
//					if (num % j == 0) {
//						isPrime = false;
//
//					}
//				}
//			}
//			if (isPrime)
//				System.err.println(num + ":is a prime number");
//			else {
//				System.err.println(num + ":is a composite number");
//			}
//		}
//	}
//}
//			if (isPrime(num)) {
//				System.out.println("Prime numbers are:" + num);
//			} else {
//				System.out.println("Composite numbers are:" + arr[i]);
//			}
//
//		}
//
//	}
//
//	private static boolean isPrime(int num) {
//		if (num < 2) {
//			return false;
//		}
//		for (int i = 2; i <= Math.sqrt(num); i++) {
//			if (num % i == 0) {
//				return false;
//			}
//		}
//		return true;
//***************************************************************************

		        int arr[] = {24, 35, 6, 7, 215, 8, 82, 101, 77, 22};

		        for (int num : arr) {
		            boolean isPrime = isPrime(num);

		            if (isPrime)
		                System.out.println(num + " is a prime number.");
		            else
		                System.out.println(num + " is a composite number.");
		        }
		    }

		    private static boolean isPrime(int num) {
		        if (num < 2)
		            return false;

		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0)
		                return false;
		        }

		        return true;
		    }
		}

//		int[] array = new int[5];
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the elements of the array: ");
//		for (int i = 0; i < 5; i++) {
//			array[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < array.length; i++) {
//			boolean isPrime = true;
//
//			for (int j = 2; j < i; j++) {
//
//				if (i % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//
//			if (isPrime)
//
//				System.out.println(i + " are the prime numbers in the array ");
//
//		}
//
//	}
//
//}
