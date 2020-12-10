public class dogs {
	
	public static void main(String[] args) {
		// take in dog position in arguments
		if (args.length < 1) {
			System.out.println("Please initiate with an integer argument.");
			return;
		}
		int place = Integer.parseInt(args[0]);
		
		for (int i = 1; i <= 100; i++) {
			if (i != place) {
				System.out.print(translate(i) + " ");
			}
		}
		
		
	}
	
	
	public static String translate(int place) {
		
		String lit = place + "";
		
		int endInt = place % 10;
		
		if ((endInt == 1 && place != 11) || (endInt == 2  && place != 12) || (endInt == 3 && place != 13)) {
			if (endInt == 1) {
				lit = lit + "st";
			} else if (endInt == 2) {
				lit = lit + "nd";
			} else if (endInt == 3) {
				lit = lit + "rd";
			}
		} else {
			lit = lit + "th";
		}
		return lit;
	}
}