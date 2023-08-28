package javaintro;

public class Methods2 {
	// Instance Data
	int studentId;
	String Studentname;
	// Static Data
	static int pincode;
	static String address;

	public static void main(String[] args) {
		System.out.println("Hello Raghava");
		Methods2 h = new Methods2();// Created Object

		h.studentId = 777;
		h.Studentname = "Raghava";

		pincode = 534196;
		address = "TadepalliGudem";

		System.out.println("The Student ID is:" + h.studentId);
		System.out.println("The Student Name is :" + h.Studentname);

		System.out.println("Your Pincode is:" + pincode);
		System.out.println("Your Address is:" + address);
		
		int sum=addition();
		int diff=h.subraction();
		System.out.println("Sum:"+ sum);
		System.out.println("diff:"+diff);
	}
		
		
		static int addition(){
			int a=100;
			int b=200;
			int c=a+b;
			return c;
		}
		int subraction() {
			int a=300;
			int b=100;
			int c=a-b;
			return c;
	}

}
