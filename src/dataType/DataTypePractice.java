package dataType;

import java.util.Scanner;

public class DataTypePractice {

	public static void main(String[] args) {
	//byte	
	//boolean
	//char
	//short
	//int
	//long
	//double
	//float
		
  //  byte myAge = 30;
   // boolean amI30 =true;
  //  char myClassName = 'A';
    //short studentNo = 100;
  //  double hight=5.10;
   // int myInt = 2000;
    //float myFloat=0.011f;
    //long mylong=4355353L;
    
    //system.out.printlin()
    		;
  //add
  //sub
  //mult
  //devil
   int b=10;	
   int c=9;
   int total=b+c;
   
 System.out.println(" "+total);
   int a=6;
   int d=6;
  total =a - d;
   System.out.println(" "+total);
   
   int E=10;
   int A=8;
   int totalA=E*A;
   System.out.println(" "+totalA);
   
   int C=15;
   int B=3;
   int totalAB=C/B;
   System.out.println(" "+totalAB);

   Scanner myNewScanner = new Scanner(System.in);
		
		System.out.println("this calculator can calculate only addition");
		System.out.println("please enter your frist integer value");
	int avalue = myNewScanner.nextInt();
		System.out.println("please inter your second integer value");
	int bvalue =myNewScanner.nextInt();
	int atotal = avalue +bvalue;
	System.out.println("you adding <"+avalue+">to <"+bvalue+">");
	System.out.println("Rena total number "+atotal);
	
	System.out.println(avalue+"+"+bvalue);
	
	
	System.out.println("Enter your name");
	String myName = myNewScanner.nextLine();
	System.out.println(myName);
		
System.out.println();
	}

}

   