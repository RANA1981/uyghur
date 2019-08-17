package dataType;

public class StringClass {

	public static void main(String[] args) {

		// String class// first and last character?and how manny characters?

		// String str1 ="hello";
		// index 01234
		// 12345
		// System.out.println(str1.charAt(0));//frist character
		// int length =str1.length();

		// System.out.println(length);// number of character
		// System.out.println(str1.charAt(length-1)); //last chanracter

		// for (int i = 0; i < str1.length();i++) {
		// System.out.println(str1.charAt(i));

		// }

		// replace statement
//		String str2 =str1.replace("h", "Hello Rena ");
//		System.out.println(str1);
//		System.out.println(str2);

		// concat statement
//	
//		String str1 = "please ";
//		String str2 ="fill";
//		String str3 ="in";
//		String str4 ="up";
//		String str5 ="your";
//		String str6 ="name";
//		
//		System.out.println(str1 + str2.concat());

		String A = "Hello java";
		String B = "Hello";
		String C = "java";
		String D = "Hello java";

		// compare A to D,
		// Create new string with B and and compare with string D

		if (B.equalsIgnoreCase(C)) {
			System.out.println("they are equal!");
		}
        
		
		String E =B + C;
		System.out.println(A);
		System.out.println(E);
		
		
	}

}
