package com.exceptionhandling;

public class TestExceptionDemo3 {

	public static void main(String[] args) {
		// array indexoutofboundexception
		int[] numbers = new int[4];
		try {
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		numbers[3] = 400;
		numbers[4] = 500;// abnormal termination
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
