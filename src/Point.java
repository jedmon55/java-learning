
public class Point {
	int x;
	int y;

	/* the purpose of this program is to demonstrate how to construct a class, e.g., Point,
	 *  with methods and data . First, the Point class will be constructed with just fields, then methods will be added, then 
	 *  constructors will be inserted into client code, and then encapsulation will be applied */
	 
	                                // each point object will have two variables inside it (x and y)
	                                // the point class defines a new class of objects for client programs to use
	                                // what does point do? nothing but it will
	                               
	
	                                // first let's add the fields
	
	                                // it doesn't look like Point does anything beyond the code that is written here
	                         
	
	
	                                // static means the method belongs to the Point class and not an
	                                // object of the Point class - this is very important
	                                // void means the method does not have a return value
	                                // locate methods outside the main method but call them within main method
	                                // there are no methods in this class - yet!
	
	                                // Mutator method
    public void translate (int dx, int dy) {
    	x =+ dx;
    	y =+ dy;
    }
	                               // Accessor method
    
	public double distanceFromOrigin() {
		return Math.sqrt(x*x + y*y);
	}
	
	

}	
	
	
	

