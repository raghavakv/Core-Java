package com.Hackerrank;

import java.util.Scanner;

public class JavaSubstringComparisons {
	public static String getSmallestAndLargest(String s, int k) {

		String smallest = "";
		String largest = "";
		return smallest + "\n" + largest;
	}

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
////public static void main(String[] args) {
//Collection <String> str = new TreeSet<String> ();
//Scanner in =new Scanner(System.in);
//String s=in.nextLine();
//int k=in.nextInt();
//int i=0;
//while(i<s.length()-k+1)
//{
//    str.add(s.substring(i,i+k));
//    i++;
//}
//String st[] = new String[str.size()];
//st=str.toArray(st);
//System.out.println(st[0]);
//System.out.println(st[st.length-1]);
//}