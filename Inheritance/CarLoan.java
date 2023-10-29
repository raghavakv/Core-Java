package com.Inheritance;

public class CarLoan extends Loan {

	public static void main(String[] args) {
		CarLoan c = new CarLoan();
		int cibil = c.getCibilScore();
		double sal = c.getEmployeeSalInfo();
		if (cibil >= 600 && sal >= 5000000) {
			System.out.println("Congratulations ! you are eligible for Car Loan!!");
			System.out.println("Your ROI for CarLoan is" + c.getROI());
			System.out.println("As per the document ew are having below adderss:" + c.getAddressDetials());
		} else
			System.out.println("Sorry for the inconvience:( you are not eligible for the Car Loan!!");
	}
}
