package com.Inheritance;

public class Loan {

	int getCibilScore() {
		int cibil = 700;
		return cibil;
	}

	String getAddressDetials() {
		String address = null;
		String name = "Raghava";
		String flatno = "Block-A:313";
		String street = "Ameenpur";
		String city = "Hyderabad";
		int pin = 502032;
		address = name + " " + flatno + " " + street + " " + city + " " + pin;
		return address;
	}

	double getROI() {
		double roi = 10.5;
		return roi;
	}

	double getEmployeeSalInfo() {
		double sal = 700000.00;
		return sal;

	}
}
