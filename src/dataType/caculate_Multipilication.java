package dataType;
import java.util.Scanner;

public class caculate_Multipilication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);

		//i m testing 
		//i am testing again

		   Scanner myNewScanner = new Scanner(System.in);
				
				System.out.println("this calculator can calculate only multipilication");
				System.out.println("please enter your frist integer value");
			int avalue = myNewScanner.nextInt();
				System.out.println("please inter your second integer value");
			int bvalue =myNewScanner.nextInt();
			int atotal = avalue +bvalue;
			System.out.println("you are multiplaying <"+avalue+">to <"+bvalue+">");
			System.out.println("Rena total number "+atotal);
			
			System.out.println(avalue+"*"+bvalue);
			
			
			System.out.println("Enter your name");
			String myName = myNewScanner.nextLine();
			System.out.println(myName);





	}

}
