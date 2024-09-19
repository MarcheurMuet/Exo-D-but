import java.util.Scanner;

public class JeuxTrouveNombre {
	
	public static void main(String[] args) {
		
		char Anwser ='Y';
		Scanner reponse = new Scanner(System.in);
		
		while (Anwser != 'N' || Anwser != 'n') {
			System.out.println("Une petite game??? Y/N");
			
			Anwser = reponse.next().charAt(0);
			if(Anwser == 'Y' || Anwser == 'y') {
				
				System.out.println("Je lance ça!");
			result ();
		} else {
			System.out.println("A+ dans le bus ^^");
			System. exit(0);
		}
	}
}
	
	public static void result() {
		int AleaNumber = 0 + (int) (Math.random() * (100));
		int Number = -1;
		int i =0;
		System.out.println("Trouve donc le nombre entre 0 et 100");
		
		while (Number != AleaNumber) {
			i = i+1;
		Scanner scanN = new Scanner(System.in);
		
		Number = scanN.nextInt();
		
			if(Number == AleaNumber){
				System.out.println("GG tu as trouvé ^^ et tout ça en " + i + " coups");
				
			} else if (Number > AleaNumber) {
				System.out.println("C'est plus petit");
			} else if (Number < AleaNumber) {
				System.out.println("C'est plus grand");
			}
		}
	}
}