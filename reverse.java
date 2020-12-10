

public class reverse{
	
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Please initiate with an integer argument.");
			return;
		}
		int place = Integer.parseInt(args[0]);
		
		System.out.println(reverseFactorial(place));
	}
	
	public static String reverseFactorial(int fact) {
		
		int internal = fact;
		int i = 1;
		
		do {
			
			if (internal%i == 0) {
				internal = internal/i;
				i++;
			} else {
				return("This number was not a factorial product.");
			}
			
			
			
			
			
			
		} while(internal != i);
		return (fact + " is " + internal + "!");
	}
	
}