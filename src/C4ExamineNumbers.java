
import java.util.*;   // what does this do?

public class C4ExamineNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Finds the sum of a sequence of numbers and the average of the numbers entered
	// and the number of negative numbers entered
		
	System.out.println("This program adds a sequence of");
	System.out.println("numbers");
	System.out.println();
	
	Scanner console = new Scanner(System.in);  // instantiates a new scanner object?
			
	System.out.print("How many numbers do you want to have?"); // set cursor to end of input line?
	int totalNumber =console.nextInt();
	
	int negatives = 0;
	
	
	double sum = 0.0; // why a double?
	for (int i = 1; i <= totalNumber; i++) {
		System.out.println("     #" + i + "?" ); // can I use escape sequences to get curor in tight spot
		double next = console.nextDouble();
		sum += next;
		if (next < 0) {
			negatives++; 
		}
	}
	
	System.out.println();
	
	if (totalNumber <=0 ) {
		System.out.println("no numbers to average");
	} else {
		double average = sum / totalNumber;
		System.out.println("average = " + average);
		}
	
	System.out.println("sum = " + sum);
	
	System.out.println(" number of negatives = " + negatives);
	
		
		
	
	
	
	
	}

}
