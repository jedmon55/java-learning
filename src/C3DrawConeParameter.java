
public class C3DrawConeParameter {

	public static final int SUB_HEIGHT = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		drawLine();
	 	drawTop();
	 	drawBottom();
	 	drawLine();
	 	
	}



	//Draw a solid line
	//Draw top half of cone
	//Draw bottom half of cone
	//Draw a solid line
		
	//Draw a line method
			public static void drawLine() {
			System.out.print("+");
			for ( int i=1; i <= (2 * SUB_HEIGHT); i++) {
				System.out.print ("-");
				}
			System.out.println("+");
			}	
	//Draw top half of hour glass method
		//Draw top half of hour glass
		//Write a bar on the output line
		//write some spaces on the output line
		//write a back slash on the output line
		//write some dots on the output line
		//write a forward slash on the output line
		//write a bar on the output line
		//go to a new line
		/* for (line going 1-3)
		 * write a bar on the output line
		 * write (line-1) spaces on the output line
		 * write a back slash on the output line
		 * write (6-2*line) dots on the output line
		 * write a slash on the output line
		 * write (line-1) spaces on the output line
		 * write a bar on the output line
		 * go to a new line of output
		 */
		/* for (line going 1 to 3)  {                 loop of 3
		 * write a bar on the output line             no loop
		 * write (line -1) spaces on the output line  loop of 2
		 * write back slash on output line            no loop
		 * write (6-2*line) on the output line        loop of 4
		 * write forward slash on output line         no loop
		 * write (line-1) spaces on output line       loop of 2
		 * write bar on output line                   no loop
		 * go to new line of output
		 */
			

			public static void drawTop() {
				
				for ( int line = 1; line <= SUB_HEIGHT; line++) {            // setup loop of 20 by +1
					System.out.print("|");                          
					writeSpaces (line - 1);
					
					System.out.print ("\\");
					int dots = 2 * SUB_HEIGHT - 2 * line;
					writePeriod(dots);
					System.out.print("/");
					writeSpaces (line - 1);
					System.out.print("|");
					System.out.println();
				}
	}

			// draw bottom
			
			public static void drawBottom() {
				
				for ( int line = 1; line <= SUB_HEIGHT; line++) {            // setup loop of 4
					System.out.print("|"); 
					writeSpaces (SUB_HEIGHT - line);    // spaces decrement by 1 from 3 to 1
					System.out.print ("/");
					writePeriod(2 * (line - 1));                     // dots increase by 2 from 0 to 6
					System.out.print("\\");
					writeSpaces (SUB_HEIGHT - line); // spaces decrement by 1 from 3 to 1
					System.out.print("|");
					System.out.println();
				    }
			}
	
			public static void writeSpaces (int number) {
				for (int i = 1; i <= number; i++)
					System.out.print(" ");
			}

			public static void writePeriod (int number) {
				for (int i = 1; i <= number; i++)
					System.out.print(".");
			}
          //draw line
			

}