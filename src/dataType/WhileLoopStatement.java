package dataType;

class WhileLoopStatement {

	public static void main(String[] args) {

//		int i = 0;
//		
//		while(i < 5) {
//			System.out.println(i);
//			
//			//add statement here
//			
//			i=6;
//			System.out.println(i);
//			
//			
//		}

		int color = 0;

		while (color < 15) {
			System.out.println("from line 24 -------" + color);

			++color;

		}

		int x = 10;
		int y = 20;

		while (x < y) {
			System.out.println("This is the first print statement  "+x);
			System.out.println("This is the second print statement "+ x++);
			System.out.println("This is the third print statement  "+ x);
			System.out.println("##########################################");
//			x++;
		}

	}

}
