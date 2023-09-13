package com.Hackerrank;

//import java.util.Scanner;
//
//public class DataTypes {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter The Number:");
//		//int i = scanner.nextInt();
//		for (int j = 0; j < args.length; j++) {
//		}
//		long i=scanner.nextLong();
//		System.out.println(i+"Can be Fitted in:");
//		if (i>=-128&&i<=127) {
//			System.out.println("*byte");
//			if (i>=-2147483648&&i<=2147483647) {
//				System.out.println("*int");
//				if (i>=-32768&&i<=32767) {
//					System.out.println("*short");
//					if (i>=-9223372036854775808f&&i<=9223372036854775807f) {
//						System.out.println("*long");
//					}
//				}
//			}
//		}
//		else {
//			System.out.println(i+"Cant be fitted anywhere");
//		}
//		
//		scanner.close();
//	}
//
//}
//*************************************************************************
//import java.util.Scanner;
//
//public class DataTypes {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter The Number:");
//        long i = scanner.nextLong();
//        System.out.println(i + " can be fitted in:");
//        
//        if (i >= Byte.MIN_VALUE && i <= Byte.MAX_VALUE) {
//            System.out.println("* byte");
//        }
//        if (i >= Short.MIN_VALUE && i <= Short.MAX_VALUE) {
//            System.out.println("* short");
//        }
//        if (i >= Integer.MIN_VALUE && i <= Integer.MAX_VALUE) {
//            System.out.println("* int");
//        }
//        if (i >= Long.MIN_VALUE && i <= Long.MAX_VALUE) {
//            System.out.println("* long");
//        } else {
//            System.out.println("Can't be fitted anywhere.");
//        }
//        
//        scanner.close();
//    }
//}
//******************************************************************************
import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		long a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number");
		int numOfQueries = Integer.parseInt(scanner.nextLine());

		long[] nums = new long[numOfQueries];
		for (long k : nums) {
			try {
				nums[(int) k] = scanner.nextLong();
				a = nums[(int) k];
				if (a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE) {
					System.out.println(a + " can be fitted in: ");
					System.out.println("* byte\n* short\n* int\n* long");
				} else if (a >= Short.MAX_VALUE && a <= Short.MAX_VALUE) {
					System.out.println(a + " can be fitted in: ");
					System.out.println("* short\n* int\n* long");
				} else if (a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE) {
					System.out.println(a + " can be fitted in: ");
					System.out.println("* int\n* long");
				} else if (a >= Long.MIN_VALUE && a <= Integer.MAX_VALUE) {
					System.out.println(a + " can be fitted in: ");
					System.out.println("* long");
				} else {
					throw new Exception("test");
				}
			}

			catch (Exception e) {
				System.out.println(scanner.nextLine() + " can't be fitted anywhere.");
			}

		}

		scanner.close();
	}
}
