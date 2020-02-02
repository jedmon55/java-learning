
public class Operators {

	public static void main(String[] args) {
		
		int x, y, z;                      //declare integers
		
			                              // Add an Interger
		 x = 10;  y=20;   z=30;                      // Add integer demo
		 x += 5;                         // add 5 to x
		    System.out.println(x); // Outputs 15
		                                 // subtract integer demo
		  x -= 3;                       // subtract -1 from x
		  System.out.println(x);        // Outputs 9
		                                // division demo
		  x /= 3;                       //divide by 3
		  System.out.println(x);        //outputs 3
		                                // multiplication demo
		  x *= 4;                        // multiply by 4
		  System.out.println(x);         // outputs 16	
		                                 // increment by 1
		  x++;                           // increase by 1
		  System.out.println(x);         // outputs 17
		                                 //modulous demo
		  x%=4;                          // divide x by 4 and save remainder which is 1 in x
		  System.out.println(x);        //outputs 1
		  
		  x+=17;                        //set 17 to x
		  System.out.println(x);        //outputs 18
		                                //decrement by 1
		  x--;                           // decrease by 1
		  System.out.println(x);        //outputs 16
		  
		                                //Comparison Operators ==, !=, > , <, >=, <=
		  System.out.println(x); 
		  System.out.println(x<y);        //outputs true
		  System.out.println(x<y && y<z); //outputs true 
		  System.out.println(x);
		  System.out.println(y);
		  System.out.println(z);
		  
		  y = 2;                          //
		  System.out.println(x<y || y<z);
		  x = 70;
		  y = 50;
		  System.out.println(x<y || y<z);	  
		  
	}

}
