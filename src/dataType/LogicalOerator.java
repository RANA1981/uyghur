package dataType;

public class LogicalOerator {

	public static void main(String[] args) {

//		int intValueA = 20;
//		int intValueB = 20;
//		int intValueC = 5;
//
//		// and &&
//
//		            //true                 //true
//		if (intValueA > intValueB && intValueA > intValueC) {
//			System.out.println("you are right ");
//		} else {
//			System.out.println("please check your numbers.");
//		}
//		          //true                      //false
//		

		// false //false
		// false //true
		// true //true
		int red = 15;

		int blue = 16;
		// false //false
//		if (red > blue && red < blue) {
//			System.out.println("you are wrong  ");
//		} else {
//			System.out.println("you are right");
//		}
		// false //true
		// if (red > blue && red == blue) {
		// System.out.println("you are wrong");
		// } else {
		// System.out.println("you are right ");
		// }
		// true //true

		// logical Or operator || (A true || B false / A false ||b true)

		int intValueA = 20;
		int intValueB = 20;
		int intValueC = 5;

		// true //false
		if (intValueA >= intValueB || intValueA < intValueC) {
			System.out.println("you are right");

		} else {
			System.out.println("please check your number");
		}
		
		

	}

}
