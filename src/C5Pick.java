import java.util.*;

public class C5Pick {

	// Picks a random number from 1-10 until a given value is chosen
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("This program picks numbers"
			+ " from");
	System.out.println("1 - 10 until a particular");
	System.out.println("number comes up.");
	System.out.println();

	Scanner console = new Scanner(System.in);
	Random r = new Random();
	
	System.out.print("Pick a number between 1 and 10 --> "); // if number entered is above 10 the pgm will enter 
	                                                         // an infinite loop
	int number = console.nextInt();
	
	int result = -1;         // set to -1 to make sure we enter the loop
	int count = 0;
		
	while (result != number) {
			result = r.nextInt(10) + 1; // random number from 1 - 10
			System.out.println("next number = " + result);
			count++;	
		}
	
		System.out.println("Your number came up after " + count + " times");
	
	}
}
	


