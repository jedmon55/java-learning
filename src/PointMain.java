
public class PointMain {
	/* this program demonstrates the technique of object oriented programming vs. procedural programming.
	It is a "main" program that calls a class Point that contains methods and data. It attempts to demonstrate the concept of 
	a coding technique puts data and methods in the same class so that calling pgms only need to understand the "contract" with the class and don
	need to understand the internal workings of the class. */
	 
	
	
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                             // create two point objects
		                                     // I believe this is a client program that is instantiating the point object twice
		
		Point p1 = new Point ();             // instantiate the object Point first time
		p1.x = 7;
		p1.y = 2;
		
		Point p2 = new Point();            // instantiate the object Point second time
		p2.x = 4;
		p2.y = 3;
		
		
		
		System.out.println ("p1 is (" + p1.x + ", " + p1.y + ")");
		double dist1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y);   // what is the purpose of sqrt?
		System.out.println("distance from origin = " + dist1); // what was the coordinates of origin?
		System.out.println("\n");
		
		System.out.println ("p2 is (" + p2.x + ", " + p2.y + ")");
		double dist2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
		System.out.println("distance from origin = " + dist2); 
		System.out.println("\n");
		System.out.println();
		
		                            //translate each point to a new location without calling the 
		                            // Point class
		p1.x +=11;
		p1.y += 6;
		p2.x += 1;
		p2.y += 7;
		
		                            // print points again after resetting coordinates
		
		System.out.println ("p1 is (" + p1.x + ", " + p1.y + ")");
		dist1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y);   
		System.out.println("distance from origin = " + dist1); 
		System.out.println("\n");
		
		System.out.println ("p2 is (" + p2.x + ", " + p2.y + ")");
		dist2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
		System.out.println("distance from origin = " + dist2); 
		System.out.println("\n");
		System.out.println();
		
		                                   // calling a translate static method in Point
		                                   // this probably translates from (0,0) since p3 never set
		Point p3 = new Point ();           // instantiate the object Point third time and
                                           // do not initialize variable - it is already initialized to 0.
                                           // print each point and its distance from the origin
		p3.translate(10, 12);       
		System.out.println ("p3 is (" + p3.x + ", " + p3.y + ")");
		double dist3 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
		System.out.println("distance from origin = " + dist3); 
		System.out.println("\n");
		System.out.println();
	
		   
		                            // set p3 to (2,2) and recalc and print
		
		
		p3.translate(-1, -1);       
		System.out.println ("p3 is (" + p3.x + ", " + p3.y + ")");
		dist3 = Math.sqrt(p3.x * p3.x + p3.y * p3.y);
		System.out.println("distance from origin = " + dist3); 
		System.out.println("\n");
		System.out.println();
		
		                                     // this example demos using method on Point class to calc distance
		                                     // it is better to put the methof with the data rather than in every calling pgm
		
		System.out.println ("p3 is (" + p3.x + ", " + p3.y + ")");
		System.out.println("distance from origin = " + p3.distanceFromOrigin()); 
	
		
		Point p4 = new Point ();
		
	}

}
