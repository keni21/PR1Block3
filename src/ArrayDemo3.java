

public class ArrayDemo3 {

	public static void main(String[] args) {
		
		int[] numbers = {4,17,31,0,5,9,24,90,7,88};
		
		long sum = 0;
		for(int n=0; n < numbers.length; n++) {
			sum += numbers[n];
		}
		System.out.println("SUM: "+sum);
		
		int check = 90;
		
		System.out.println("contains "+check+"? "+
				containsNumber(numbers, check));
		
		check = 10;
		System.out.println("contains "+check+"? "+
				containsNumber(numbers, check));
	
	}
	
	public static boolean containsNumber(int[] numbers, int n) {
		
		for(int i=0; i < numbers.length; i++) {
			if(numbers[i] == n) {
				return true;
			}
		}
		
		return false;
	}

}
