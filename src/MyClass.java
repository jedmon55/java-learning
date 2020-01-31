public class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
    
    int myInt = 10;            // Integer demo
    System.out.println(myInt); // Outputs 10
    
    float myFloat = 10.37f;     // Float demo
    System.out.println(myFloat); // Outputs 10.37
    
    short myShort = 10000;     // Short demo
    System.out.println(myShort); // Outputs 10000
   
    byte myByte = 100;            // Byte demo
    System.out.println(myByte); // Outputs 100
    
    long myLong = -10000000000L; // long demo
    System.out.println(myLong); // Outputs -10000000000
    // don't understand doubles
    
    double myDouble = 19.99d;    // double demo
    System.out.println(myDouble);  // Outputs ?
   
    boolean myBoolean = true;    // boolean demo
    System.out.println(myBoolean); //outputs true
   
    char myChar = 'F';                // char demo
    System.out.println(myChar);    //outputs F
    
    String myString = "yippee";    // String demo
    System.out.println(myString);  //outputs yippee
   
    int myNum = 1000;               
    double myDoubleNum = myNum; // Automatic casting: int to double
    System.out.println(myNum);      // Outputs 1000
    System.out.println(myDoubleNum);   // Outputs 1000
    
    double myDouble2 = 9.78;
    int myInt2 = (int) myDouble2; // Manual casting: double to int

    System.out.println(myDouble2);   // Outputs 9.78
    System.out.println(myInt2);      // Outputs 9
  
  }
  
  /* void dataTypeTest() {
	  System    
  }    */
}



/* int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double

System.out.println(myInt);      // Outputs 9
System.out.println(myDouble);   // Outputs 9.0  */