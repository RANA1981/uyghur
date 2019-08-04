package dataType;

public class TheArithmaticOperator {

	public static void main(String[] args) {
		
		int aA =10;
		int bB =20;
		int cC =25;
		int dD=25;
		
		System.out.println("a+b= " + (aA + bB));
		System.out.println("a-b= " + (aA - bB));
		System.out.println("a *b = " + (aA * bB));
		System.out.println("b / a = " + (bB / aA));
		System.out.println("b % a = " + (bB % aA));
		System.out.println("c % a = " + (cC % aA));
		System.out.println("a++   =" +  (aA++)  );	
		System.out.println("b--   =" +(bB--)  ) ;
		
		//check the difference in d++ and ++d
		
		
		  System.out.println("d++ =" + (dD++));
	        System.out.println("++d =" + (++dD));
		
	        
	        
	}

}
