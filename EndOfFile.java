package com.Hackerrank;

import java.util.Scanner;

public class EndOfFile {
		    public static void main(String[] args) {
		        int i = 0;
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter The String:");

		        while (scanner.hasNext()) {
		            i++;
		            String line = scanner.nextLine();
		            System.out.println(i + " " + line);
		            
		        }
		        scanner.close();
		    }
		}
