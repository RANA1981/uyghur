package dataType;

import java.util.Scanner;

public class SwitchStatementCode {

	public static void main(String[] args) {
		Scanner  AGE= new Scanner(System.in);
		
		System.out.println("Enter you age");
		
		int age =AGE.nextInt();
		
//		int age = 65;
		
		if(age<18 && age>= 0) {
			System.out.println("you are under 18");} 
		else if (age >= 18 && age < 65) {
			System.out.println("you are eligible for vote.");}
		
		else if (age>65) {
			System.out.println("stay healthy!!");}
		
		else {System.out.println("please give a valid age.");}
		
		 

//		Scanner Brithday = new Scanner(System.in);
//		System.out.println("Entr a number .");
//
//		int day = Brithday.nextInt();
//
//		if (day > 5) {
//			System.out.println("try againt");
//		} else if (day < 7) {
//			System.out.println("try one more time.");
//		} else {
//			System.out.println("no worries,come back later");
//		}

//		int day =Brithday.nextInt();
//		switch (day) {
//		
//	
//		
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//            System.out.println("Tuesday");
//            break;
//		case 3:
//            System.out.println("Wednesday");
//            break;
//		case 4:
//            System.out.println("Thursday");
//            break;
//		case 5:
//            System.out.println("Friday");
//            break;
//		case 6:
//            System.out.println("Saturday");
//            break;
//		case 7:
//            System.out.println("Sunday");
//            break;
//            
//            default:
//            	System.out.println("this number is not valid");
		//

	}

}
