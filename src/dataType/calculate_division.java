package dataType;
import java.util.Scanner;

public class calculate_division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner myNewScanner = new Scanner(System.in);
				
				System.out.println("this calculator can calculate only division");
				System.out.println("please enter your frist integer value");
			double avalue = myNewScanner.nextDouble();
				System.out.println("please inter your second integer value");
			double bvalue =myNewScanner.nextDouble();
			
			double atotal = (avalue /bvalue);
			
			System.out.println("you dividing <"+avalue+">to <"+bvalue+">");
			System.out.println("Rena total number "+atotal);
			
			System.out.println(avalue+"/"+bvalue);
			
			
			System.out.println("Enter your name");
			String myName = myNewScanner.nextLine();
			System.out.println(myName);
	}

}
