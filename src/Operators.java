
public class Operators {

	public static void main(String[] args) {
		                                  //Operators
		
		 System.out.println ("\nSection on Operators");   // header on operators

		
		int x, y, z;                      //declare integers
		
			                              // Add an Interger
	      x = 10;  y=20;   z=30;          // Add integer demo
		  x += 5;                         // add 5 to x
		    System.out.println(x);       // Outputs 15
		                                 // subtract integer demo
		  x -= 3;                       // subtract -1 from x
		  System.out.println(x);        // Outputs 9
		                                // division demo
		  x /= 3;                       // divide by 3
		  System.out.println(x);        // outputs 3
		                                // multiplication demo
		  x *= 4;                        // multiply by 4
		  System.out.println(x);         // outputs 16	
		                                 // increment by 1
		  x++;                           // increase by 1
		  System.out.println(x);         // outputs 17
		                                 // modulous demo
		  x%=4;                          // divide x by 4 and save remainder which is 1 in x
		  System.out.println(x);        // outputs 1
		  
		  x+=17;                        // set 17 to x
		  System.out.println(x);        // outputs 18
		                                // decrement by 1
		  x--;                           // decrease by 1
		  System.out.println(x);        //o utputs 17
		  
		                                // Comparison Operators ==, !=, > , <, >=, <=
		  System.out.println ("\nSection on Comparison Operators");   // header on comparison operators

		  System.out.println(x); 
		  System.out.println(x<y);        // outputs true
		  System.out.println(x<y && y<z); // outputs true 
		  System.out.println(x);          // outputs 17
		  System.out.println(y);          // outputs 20
		  System.out.println(z);          // outputs 30
		                                  // Comparing variables
		  y = 2;                          // set y to 2
		  System.out.println(x<y || y<z);
		  x = 70;
		  y = 50;
		  System.out.println(x<y || y<z);  // 70<2 50 or 50<30 which is false
		  
		                                      // Strings
		  System.out.println ("\nSection on Strings");   // header on strings

		  String FirstName = ("Jeffrey ");    // initialize to Jeff
		  String MiddleName = ("Edward ");    // initialize to Edward
		  String LastName = ("Dowds");        //initialize to Dowds
		  System.out.println (FirstName + MiddleName + LastName); // Output Jeffrey Edward Dowds
		  System.out.println (FirstName + MiddleName + LastName ); // Output Jeffrey Edward Dowds
		  System.out.println (FirstName.toUpperCase());           //convert first name to upper case
		  System.out.println (FirstName.toLowerCase());          // convert first name to lower case
		  System.out.println (FirstName.length());              //lenght of string and output 8
          System.out.println (FirstName.indexOf("rey"));        // character location of "rey"
		  System.out.println (FirstName + MiddleName + LastName.toUpperCase()); // Output Jeffrey Edward Dowds
          System.out.println (FirstName.concat(MiddleName)+ LastName); // use concat method to put two strings together 
		  
                                               // Special Characters
          
		  System.out.println ("\nSection on Special Characters");   // header on special characters
		  
		  System.out.println ("Going to kick \"ass\" at Java");   // demo special char \
		  System.out.println ("Demonstrating inserting a new line \n");   // demo on new line
		  System.out.println ("Did I put a new line in? I did");   // verifying I put a new line in
		  
		  System.out.println ("Demonstrating puting a carriage return in vs. a new line \r");   // demo carriage return
		  System.out.println ("Did I put a carriage return in? I did not what is a carriage return?");   // verifying I put a new line in
		  
		  
		  System.out.println (FirstName + LastName + " getting good at Java");   // concatenating strings

                                          // Java math
		  
		  System.out.println ("\nSection on Java Math");   // header on Java Math
          int a = 16;
          int b = 32;
          int c = 64;
          int d = -128;
          System.out.println(Math.min(a,b));
          System.out.println(Math.max(a, b));
          System.out.println(Math.sqrt(c));
          System.out.println(Math.abs(d));
          
        		  
        		  
	}

}
