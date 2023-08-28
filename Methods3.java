package javaintro;

public class Methods3 {

// Instance data
	String studentname;
	int studentage;
	int studentRollnum;
	String section;
	String blockname;

// Static data
	static int Phonenumber;
	static String City;
	static String streetname;
	static int pincode;
	static int Housenumber;

// Instance Method
	void Studentinfo() {
		System.out.println("Student Name:" + studentname);
		System.out.println("Student Age:" + studentage);
		System.out.println("Student Rollnum:" + studentRollnum);
		System.out.println("Section:" + section);
		System.out.println("Block Name:" + blockname);
	}

// Static Method
	static void studentaddress() {
		System.out.println("Phone Number:" + Phonenumber);
		System.out.println("City:" + City);
		System.out.println("Street Name:" + streetname);
		System.out.println("Pincode:" + pincode);
		System.out.println("House Number:" + Housenumber);
	}

	public static void main(String[] args) {
		Phonenumber = 799599101;
		City = "Tadepalligudem";
		streetname = "Govt Hospital street";
		pincode = 534196;
		Housenumber = 3 - 7 / 11;

		Methods3 h = new Methods3();
		h.studentname = "Raghava";
		h.studentage = 22;
		h.studentRollnum = 111;
		h.section = "O2";
		h.blockname = "Vrushabhadri";

//Calling Instance Method
		System.out.println("Studentinfo");
		h.Studentinfo();

//Calling Static Method
		System.out.println("studentaddress");
		studentaddress();
	}
}