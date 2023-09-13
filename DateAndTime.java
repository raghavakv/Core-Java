package com.Hackerrank;

import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateAndTime {

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int month = scanner.nextInt();
//		int day = scanner.nextInt();
//		int year = scanner.nextInt();
//		
//		DateAndTime dateAndTime=DateAndTime.getInstance();
//		DateAndTime.set(year,month-1,day);
//		int dayofWeek=DateAndTime.get(DateAndTime.Day_OF_Week);
//		 // System.out.println(dayOfWeek);
//
//	    String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
//
//	    System.out.println(daysOfWeek[dayOfWeek -1]);
//
//		scanner.close();
//	}
//}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Date:");
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int year = scanner.nextInt();

		LocalDate date = LocalDate.of(year, month, day);
		DayOfWeek dayOfWeek = date.getDayOfWeek();

		String[] daysOfWeek = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

		System.out.println(daysOfWeek[dayOfWeek.getValue() - 1]);

		scanner.close();
	}
}
