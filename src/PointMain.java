
public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                             // create two point objects
		Point p1 = new Point ();             // really do not know what point is doing
		p1.x = 7;
		p1.y = 2;
		
		Point p2 = new Point();
		p2.x = 4;
		p2.y = 3;
		
		                                   // print each point and its distance from the origin
		
		System.out.println ("p1 is (" + p1.x + ", " + p1.y + ")");
		double dist1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y);   // what is the purpose of sqrt?
		System.out.println("distance from origin = " + dist1); 
		
		System.out.println ("p2 is (" + p2.x + ", " + p2.y + ")");
		double dist2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
		System.out.println("distance from origin = " + dist2); 
		
		System.out.println();
		
		                                    //translate each point to a new location
		p1.x +=11;
		p1.y += 6;
		p2.x += 1;
		p2.y += 7;
		
		                                   // print points again
		
		System.out.println ("p1 is (" + p1.x + ", " + p1.y + ")");
		System.out.println ("p2 is (" + p2.x + ", " + p2.y + ")");
		
	}

}
