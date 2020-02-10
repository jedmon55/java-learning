
import java.util.Scanner;

public class C4LogicOptions {

	
	// this code deos not work! Chapter 8 will explain why
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner console = new Scanner(System.in); // does this create the first object?
	System.out.print("yes or no? ");
	String s = console.next();
	if (s == "yes") {
		processYes();
	} else if (s == "no") {
		processNo();
	} 		else {
		System.out.println("You didn't type yes or no");
	}
	}
	public static void processYes() {
		System.out.println("True");
	}
	
	public static void processNo() {
		System.out.println("False");
	}
	
	


}
