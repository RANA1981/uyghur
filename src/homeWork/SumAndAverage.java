package homeWork;
public class SumAndAverage {
	public static void main(String[] args) {
	//	int lowerBound = 1;
	//	int upperBound = 100;
		
		//System.out.println(11+12+13+14+15+16+17+18+19+20);
		//int sum= 0;
//		for (int i = lowerBound; i <= upperBound; i++) {
//			
//			
//			sum  = sum + i;
//			
//			System.out.println("i = "+ i);
//			int 
//			System.out.println("sum = "+ sum);
//			
//		}
		
	//	while (lowerBound <= upperBound) {
		//	sum = sum + lowerBound;
		//	lowerBound++;
		//	System.out.println(lowerBound);
			
			
//		}
		
//		double average = (double)sum / (double)upperBound;
//		
//		System.out.println(average);
//		
//		
//		int a =0;
//		a++;
//		a++;
//		System.out.println(a);
		int lowerBound = 1;
		int upperBound =100;
		
		 int sum = 0;
		 
		
	
	
		
	do {
		sum = sum + lowerBound;
		
		lowerBound++;
		System.out.println(lowerBound);
		System.out.println("sum ="+ sum);
	}while(lowerBound <= upperBound);
		
	System.out.println("sum of 1 to 100 using do while loop is " + sum);
	
	double average = (double)sum / (double)upperBound;
	
	System.out.println("average is "+ average);
	
		
		
	}
}
