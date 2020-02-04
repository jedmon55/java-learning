
public class Chapter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//jshell
    // how do I get jshell to work in eclipse?
		
	//Data types
	System.out.println ("\n*********Data Types*********");   // header on operators
	int i;   //two bytes
	int y;   
	int z;
	double d;  // four bytes
	char character; // 1 byte
	boolean tf; // 1 byte true or false
	float f; // four bytes
	long l; // ? bytes
	short s; // ? bytes
	
	System.out.println("what does 1000 look like in different data types?");
	i=1000;
	System.out.println("1000 in interger = " + i);
	d=1000;
	System.out.println("1000 in double = " + d);
	f=1000;
	System.out.println("1000 in floating point = " + f);
	l=1000;
	System.out.println("1000 in long = " + l);
	s=1000;
	System.out.println("1000 in short = " + s);
	System.out.println("\n");
	
	System.out.println("what does 100000000 look like in different data types?");
	i=1000000000;
	System.out.println("1000000000in interger = " + i);
	d=1000000000;
	System.out.println("1000000000 in double = " + d);
	f=1000000000;
	System.out.println("1000000000 in floating point = " + f);
	l=1000000000;
	System.out.println("1000000000 in long = " + l);
	s=10000;
	System.out.println("1000000000 in short = " + s);
	System.out.println("can't store 1000000000 in a short");
	System.out.println("\n");

    y=1000;
    z=1000;
	System.out.println(y);
	System.out.println(z);
	
	System.out.println ("\n*********Operators*********");   // header on operators
    
	//Operators - don't need to demonstrate since these are demo'd in the operators class
	
	// For Loop Demo
	System.out.println ("\n*********For Loop*********");   // header on operators
	
    for (int isquarred = 1; isquarred<=5; isquarred++) {
    	System.out.println(isquarred + " squarred = " + (isquarred*isquarred));
    	System.out.println("\n");
    }
		
		
		
	}

}
