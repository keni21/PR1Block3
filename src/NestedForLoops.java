

public class NestedForLoops {

	public static void main(String[] args) {
		
		for(int i=0;i < 5; i++) {
			
			System.out.println("outer loop run "+(i+1));
			
			for(int j=0;j<3; j++) {
				System.out.println("\t inner loop run "+(j+1));
			}
			
			System.out.println("\t inner loop finished");
		}
		
		System.out.println("outer loop finished");
		
	}
	
}
