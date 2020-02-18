
import java.util.Scanner;

public class C5WhileDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// this code divides an integer entered from the console by 2 until zero is reached. 
	// Not sure how "number" ever gets to zero
	Scanner console = new Scanner(System.in);	// create console object

	
	                                           // read from console
	System.out.print("Enter integer: ");
	int number = console.nextInt();             // set number outside of loop

	
	
	while (number > 0 ) {
		number = number /2;           // update number within loop so that test will eventually fail
	    System.out.println(number); 
	    }
		

}
}

