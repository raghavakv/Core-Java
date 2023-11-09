package com.exceptionhandling;

public class TestDemo02 {

	static String s2;

	public static void main(String[] args) {
		try {
			String s = "Hello";
			String s1 = "Java";
			System.out.println("hello main method");
			System.out.println(s2.length());
			System.out.println(s.length());
			System.out.println(s1.indexOf('a'));
		} catch (Exception e) {
			System.out.println("Dont perform any operations on null");
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}

		System.out.println("This is testing of Exception Handling");

	}

}
