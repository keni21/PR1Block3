

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		//Deklaration, Erzeugung und Initialisierung 
		int[] numA = new int[3];
		numA[0] = 3;
		numA[1] = 4;
		numA[2] = 5;

		//Kurzform durch Literale Initialisierung
		int[] numB = {7,1,3};
		
		//elementweise Addition
		System.out.println("+ "
				+ (numA[0]+numB[0])+","
				+ (numA[1]+numB[1])+","
				+ (numA[2]+numB[2]));
		
		//elementweise Multiplikation
		System.out.println("* "
				+ (numA[0]*numB[0])+","
				+ (numA[1]*numB[1])+","
				+ (numA[2]*numB[2]));
		
	}

}
