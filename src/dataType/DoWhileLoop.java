package dataType;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// do.. while loop

//		int value = 0;
//
//		do {
//			System.out.println("Enter a number:");
//			value = scanner.nextInt();
//		} while (value != 10);
//
//		System.out.println("congratulaton!");

		
		// for loop
//		
//	                            //  x+1 = x++
//		for (int x = 10; x < 20; x =x+1  ) {
//			System.out.println("value of x :" + x);
//		}
		
		
		Scanner table = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = table.nextInt();
        int i =2;
        int result =number * i;
        System.out.println(number + " × " + i + " = " + result);
        System.out.println("Table of " + number + " is\n");
        //for (int i = 1; i <= 10; i++) {
        //    int result = number * i;
         //   System.out.println(number + " × " + i + " = " + result);
    
        
        
		
	}

}
