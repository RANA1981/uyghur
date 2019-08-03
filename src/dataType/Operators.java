package dataType;

public class Operators {

	public static void main(String[] args) {
//		
//// increment & decrement
//
//		 int y =5;
//		
//       //.  y=y+1; //6
//
//         
//         System.out.println(y);
//         
//         System.out.println(++y);
//         
//         System.out.println("This is from line 17 ---"+  y);
//         
//         System.out.println("This is from line 19 ---"+  y++);
//         
//         System.out.println("This is from line 21 ---"+y);
//		
//         
//         
//         int B = 2;                                    
//         
//         System.out.println(B);
//         System.out.println(++B);
//         System.out.println(B++);
//         System.out.println(B);

		// MODULA
		// 23 has 3
//	int value=23;
//	
//	
//	int results = value %6; //results is
//	
//	int value1 = 17;
//	int anotherValue= 5;
//	int results1= value1 % anotherValue;
//	
//	System.out.println(results1);

//	int apple=27;
//	int apple1=6;
//	
//	int results2= apple % apple1;
//	System.out.println(results2);

//	byte apple=27;
//	byte apple1=6;
//	
//	byte results2= (byte) (apple % apple1);
//	System.out.println(results2);

//	int pear =100;
//	 int pear1=25;

//	 int results3 =pear % pear1;
		// System.out.println(results3);

//		//Addiotn
//	int add1=50+10;
//	int add2=add1+66;
//	int add3=add2+add2;
//	 System.out.println(add3);
//	 

//	 
//	 
//	    //subration
//	 int sub1=1000-10;
//	 int sub2=sub1-5;
//	 int sub3=sub2-sub2;
//	 System.out.println(sub3);

		// assignment operators
		// int num1=4;
//	 int num2=10;

		// .out.println(num1 += num2);//num1 =num1 +num2
//	 System.out.println(num2 += num1);//num2  =num2 +num1

		int orange1 = 20;
		int orange2 = 20;
		orange1 = orange1 + orange2;
		System.out.println(orange1);
		System.out.println(orange2);

//System.out.println(orange1+=orange2); //40
		System.out.println(orange1 += orange2); // 60
		System.out.println(orange2 += orange1); // 80
		System.out.println(orange1 -= orange1); // 0 orange1 = orange1 - orange1
		System.out.println(orange1 += orange2); // 80 orange1 = orang1 + orange2

		// Try Above Operators with '*' and '/'

		int multiplyValue = 6;
		int multiplyNumber = 8;

		System.out.println(multiplyValue *= multiplyNumber);// multiplyValue =48
		System.out.println(multiplyValue /= multiplyNumber);// multiplyNumber=6

		int a = 3;
		int v = 5;

		System.out.println(a -= v);// a=-2
		System.out.println(v -= a);
		System.out.println(a -= v);

	}

}
