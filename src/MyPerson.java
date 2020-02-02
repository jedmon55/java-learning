public class MyPerson {
  String fname = "John";                          // a class can declare multiple fields or attributes
  String lname = "Doe";
  int age = 24;
  
  static void myMethod() {                        // methods cannot be declared within another method!
	    System.out.println("Hello World!");
  }
  public static void main(String[] args) {
    MyPerson myObj = new MyPerson();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
    
    myMethod();                                  // a method can call another method!
   
	  }
} 

         
        	  
        	