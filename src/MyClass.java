public class MyClass {
	  int x = 5;
	  // Static vs.non static methods
	    
	  // Static method
	  static void myStaticMethod() {
	 	System.out.println("Static methods can be called without creating objects");
	 	  }

	 // Public method
	   public void myPublicMethod() {
	 	System.out.println("Public methods must be called by creating objects");
	 	  }
      
	  public static void main(String[] args) {
	  
	  MyClass myObj1 = new MyClass();  // Object 1
	  MyClass myObj2 = new MyClass();  // Object 2
	  
	  System.out.println(myObj1.x);
	  myObj2.x = 25;
	  System.out.println(myObj2.x);
	  
	 myStaticMethod();             // Call the static method
 	  // myPublicMethod(); This would compile an error

 	 MyClass myObj3 = new MyClass(); // Create an object of MyClass
 	   myObj3.myPublicMethod(); // Call the public method on the object
	}
}