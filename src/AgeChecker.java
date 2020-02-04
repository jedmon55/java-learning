
public class AgeChecker {

	 // Create a static method MyMethod that returns a int value after adding 5
		static int myMethod(int x) {
			 return 5 + x;
		}

		// Create a checkAge() method with an integer variable called age
		  static void checkAge(int age) {

		    // If age is less than 18, print "access denied"
		    if (age < 18) {
		      System.out.println("Access denied - You are not old enough!");
		      System.out.println("\n");

		    // If age is greater than 18, print "access granted"
		    } else {
		      System.out.println("Access granted - You are old enough!");
		      System.out.println("\n");
		    }
		 // Outputs "Access granted - You are old enough!"
		  }	  
				
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkAge(20); // Call the checkAge method and pass along an age of 20 and then print the result
		
	}

}
