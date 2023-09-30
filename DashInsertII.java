package com.arrays.one;

public class DashInsertII {

	public static String DashInsertII(String str) {
		StringBuilder result = new StringBuilder();

	    for (int i = 0; i < str.length(); i++) {
	        char currentChar = str.charAt(i);
	        result.append(currentChar);

	        if (i < str.length() - 1) {
	            char nextChar = str.charAt(i + 1);
	            // Check if both currentChar and nextChar are digits
	            if (Character.isDigit(currentChar) && Character.isDigit(nextChar)) {
	                int currentDigit = Character.getNumericValue(currentChar);
	                int nextDigit = Character.getNumericValue(nextChar);

	                // Check if the digits are odd or even
	                if (currentDigit % 2 == 0 && nextDigit % 2 == 0) {
	                    result.append('*');
	                } else if (currentDigit % 2 != 0 && nextDigit % 2 != 0) {
	                    result.append('-');
	                }
	            }
	        }
	    }

	    return result.toString();
	}

	public static void main(String[] args) {
	    String input = "4546793";
	    String output = DashInsertII(input);
	    System.out.println("Output: " + output);  // Output: 454*67-9-3
	}
}

