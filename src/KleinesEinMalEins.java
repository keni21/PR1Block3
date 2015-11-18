
public class KleinesEinMalEins {

	public static void main(String[] args) {
		
		//This is a classic nested for-loop 
		//each running from 1 .. 10 thereby 
		//producing the needed multiplications
		for(int zeile=1; zeile <= 10; zeile++) {
			for(int spalte=1; spalte <= 10; spalte++) {
				//do NOT use println-method in this inner for-loop run
				System.out.print(zeile*spalte+"\t");
			}
			//change the line for the next outer for-loop run 
			System.out.println();
		}
		
	}

}
