public class Calculator {
	
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("We require three inputs.");
			return;
		}
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]); 
		int third = Integer.parseInt(args[2]); 
}
	
	public static void checkPlus(int first,int second,int third) {
		if (first + second == third) {
			System.out.println(first + " + " + second + "=" + third);
		
		} else if (first + third == second){
			
			System.out.println(first + " + " + third + "=" + second);
			
		}else if (second + third == first) {
			
			System.out.println(second + " + " + third + "=" + first);
		
		}
	}
	
	public static void checkSub(int first,int second,int third) {
		
		int[] list = {first,second,third};
		int max = 0;
		int mid = 0;
		int small = 0;
		
		max = list[0];
		if (list[1] > max) {
			mid = max;
			max = list[1]
		}else {
			mid = list[1];
		}
		if (list[2] > max) && (list[2] > mid)) {
			small = mid;
			mid = max;
			max = list[2];
		} else if ((list[2] < max) && (list[2] > mid)){
			small = mid;
			mid = list[2];
		} else {
			small = list[2];
		}
		
		if (max - mid == small) {
			System.out.println(max + "-" + mid + "=" +small);
		}
	}
	
	public static void chekMult(int first,int second,int third) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}