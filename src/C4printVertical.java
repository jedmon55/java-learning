
public class C4printVertical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		printVertical("test");
	
	}

	public static void printVertical(String message) {
		for (int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			System.out.println(ch);
		}
	}
	
	
	
}
