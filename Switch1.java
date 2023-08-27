package com.DescionMakingStatments;

public class Switch1 {

	public static void main(String[] args) {
		String day="Tuesday";
		switch(day){
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
		System.out.println("Uff! Its a week day");
		break;
		default:
		System.out.println("YAY!!! Its Weekend");
		break;
		}
	}

}
