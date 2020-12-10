import java.util.List;

public class Goldilocks {
	
	
	static int[] weights = {30, 130, 90, 150, 120, 200, 110};
	static int[] temps = {50, 60, 100, 70, 50, 90, 20};
	
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("We require two inputs.");
			return;
		}
		int weight = Integer.parseInt(args[0]);
		int temp = Integer.parseInt(args[1]); 
		
		System.out.print("Good chairs: ");
		for (int i = 0; i < weights.length; i++) {
			if (checkValid(i, weight, temp)) {
				System.out.print((i + 1) + " ");
			}
		}
		
	}
	
	public static boolean checkValid(int chair, int weight, int temp) {
		boolean valid = true;
		if (weights[chair] < weight) {
			valid = false;
		} 
		if (temps[chair] > temp) {
			valid = false;
		}
		return valid;
	}
	
}