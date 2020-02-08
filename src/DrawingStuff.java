
public class DrawingStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* psuedo code for upside down code
 * for (line going 1-5) {
 * write (line -1) spaces on output line
 * write (11-2 * line) astericks on output line
 * go to new output line		
 */
		
		
		
     for (int line = 1; line <= 10; line ++) { // this loop will print ten lines of output
    	for (int i = 1; i <= (line - 1); i++) { //this loop will print 0(" ") up to 9(" ")
        	System.out.print(" ");
        }	
    	for (int i =1; i <=(21-2 * line); i++) {// this loop will print 19(*) down to 1(*)
    		System.out.print("*");
    	}
    	System.out.println();
	 }
	    	
		
/* psuedo code for upright cone
 * for(line going 1-5)
 *     write (-1*line + 6) 5->4-3 spaces
 *     write (2*line -1)1->3->5 astericks	
 */
	  
	  for (int line = 1; line <= 6; line++) {
		  for (int i = 1; i <= (-1 * line + 6); i++ ) {
			  System.out.print(" ");
		  }
		  for (int i = 1; i <= (2 * line -1); i++) {
			  System.out.print("*");
		  }		
		System.out.println();
       }
	  
	  
}
}