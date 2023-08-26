package javaintro;

public class CallingMethods {

	public static void main(String[] args) {
		System.out.println("Hello main method");
		CallingMethods h = new CallingMethods();
		CallingMethods.method2();
		h.method1();
	}

	void method1() {
		System.out.println("Hello method1");
	}

	static void method2() {
		System.out.println("Hello method2");
	}
}
