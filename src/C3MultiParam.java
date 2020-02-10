
public class C3MultiParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Draw V with > and < signs
		System.out.println();
		System.out.println("Demo of WriteChars Method");
		System.out.println();
		writeChars ('=', 20);
		System.out.println();
		for (int i = 1; i <= 10; i++) {
		writeChars ('>', i);
		writeChars (' ', 20 - 2 * i);
		writeChars ('<', i);
		System.out.println();
		}
		
		//Draw Box
		drawBox (10, 40);
		

		// Math class
		// Math.sqrt
		System.out.println();
		System.out.println("Demo of Math Class");
		System.out.println();
		for (int i=1; i <= 20; i++) {
			double root = Math.sqrt(i);
			System.out.println ("sqrt(" + i + ") = " + root); 
		}

	
	
	}
	
	public static void drawBox(int height, int width) {
		// draw top of a box
		System.out.println();
		System.out.println();
		System.out.println("Demo of drawBox Method");
		System.out.println();
		writeChars ('*', width);
		
		
		//draw middle lines or side of box
		for (int i = 1; i <= height; i++) {
			System.out.println ();
			System.out.print('*');
			writeChars (' ', width - 2);
			System.out.print('*');
		}
			
		// draw bottom of box
		System.out.println();
		writeChars ('*', width);
		System.out.println();	
			
	}
	
	
	public static void writeChars (char ch, int number) {
	for (int i = 1; i <= number; i++) {
		System.out.print(ch);
	}
	}
	
}
