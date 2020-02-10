import java.util.Scanner;

	
public class C3ScannerDemo {
		
		public static void main(String[] args) {
		Scanner console = new Scanner(System.in); // does this create the first object?
		
		// obtain values
		System.out.println("This program computes monthly " +
		                   "mortgae payments.");
		System.out.print("Loan Amount      : ");
		double loan = console.nextDouble();
		System.out.print("Number of Years  : ");
		int years = console.nextInt();
		System.out.print("Interest Rate    : ");
		double rate = console.nextDouble();
		System.out.println();
		
		// compute result and report
		int n = 12 * years;
		double c = rate / 12.0 / 100.0;
		double payment = loan * c * Math.pow(1 + c, n) /
                         (Math.pow(1+c,  n) - 1);
        System.out.println ("Payment = $" + (int) payment);
        
		
		}

}
