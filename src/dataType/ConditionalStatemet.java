package dataType;

import java.util.Scanner;

public class ConditionalStatemet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Conditional Statement
		// if(){}
		// else
		// <,>,<=,>=
		// !
//		int a = 1;
//		int b = 2;
//		int c = 29;
//		boolean conditionCheck = a == b;
//
//		if (conditionCheck) {
//			System.out.println("hello RENA");
//
//		} else {
//			System.out.println("two numbers no equal");
//		}
//
//		if (a == b) {
//			System.out.println("wrong");
//		} else if (b == c) {
//			System.out.println("right");
//		} else if (c == 29) {
//			System.out.println("You are right!!!");
//		} else {
//			System.out.println("two numbers no equal");
//		}
//
//	
//	if (a>b) {System.out.println("good");
//	}
//	else if  (b==a){ System.out.println("good job");
//	}
//	 else if (b==b){System.out.println("great");
//	 }

		Scanner weightVerification = new Scanner(System.in);

		System.out.println("please enter your weight in kg?");
		int userEnteredWight = weightVerification.nextInt();

		if (userEnteredWight >= 80 && userEnteredWight <= 100) {
			System.out.println("please lose weight");
		} else if (userEnteredWight >= 58 && userEnteredWight <= 75) {
			System.out.println("you are healthy!!!!");

		} else if (userEnteredWight >= 45 && userEnteredWight <= 57) {
			System.out.println("please eat chick fil A...");
		}else if(userEnteredWight >= 7 && userEnteredWight <= 44) {
			System.out.println("you are a kid!!");
		}
		else {System.out.println("You brocked my scale");}

	}

}
