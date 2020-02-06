
public class DrawingStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* for (line going 1-5) {
 * write (line -1) spaces on output line
 * write (11-2 * line) astericks on output line
 * go to new output line		
 */
		
		
		
    for (int line = 1; line <= 5; line ++) {
    	for (int i = 1; i <= (line - 1); i++) {
        	System.out.print(" ");
        }	
    	for (int i =1; i <=(11-2 * line); i++) {
    		System.out.print("*");
    	}
    	System.out.println();
	}

}
}