
public class LoopDemos {

	public static void main(String[] args) {
		
		for(int i=1; i <= 10; i++) {
			System.out.println("Durchlauf "+i);
		}
		
		System.out.println("Zahlen 20..90 aber nur jede 5. Zahl");
		for(int i=20;i<=90;i+=5) {
			System.out.println(i);
		}
		
		System.out.println("Zahlen 1..100 aber nur jene die durch 3 teilbar sind");
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		 
		System.out.println("Zahlen 1..100 aber nur jene die durch 3 teilbar sind");
		System.out.println("und Abbruch sobald die 10. Zahl gefunden wurde");
		int z=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);
				z++;
			}
			if(z == 10) {
				break;
			}	
		}
		
		System.out.println("Ausgabe aller Zahlen zwischen zw. 1..100,");
		System.out.println("jedoch jene ausschließen, die durch 5 teilbar sind");
		System.out.println("oder zw. 40..70 (inkl.) liegen");
		for(int i=1;i<=100;i++) {
			
			if( (i >= 40 && i <= 70) || (i % 5 == 0) ) {
				continue;
			}
			
			System.out.println(i);
		}
		
	}
	
}
