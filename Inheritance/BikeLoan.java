package com.Inheritance;

public class BikeLoan extends Loan {

	public static void main(String[] args) {

	BikeLoan b = new BikeLoan();
	int cibil = b.getCibilScore();
	double sal=b.getEmployeeSalInfo();
	
	if(cibil>=600&&sal>=5000000)
	{
		System.out.println("Congratulations ! you are eligible for Bike Loan!!");
		System.out.println("Your ROI for BikeLoan is" + b.getROI());
		System.out.println("As per the document ew are having below adderss:" + b.getAddressDetials());
	}else
		System.out.println("Sorry for the inconvience:( you are not eligible for the Bike Loan!!");
	{
		

	}

}}
