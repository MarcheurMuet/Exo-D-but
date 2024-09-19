import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {

		
		System.out.println("Met moi un Nombres STP ^^");
		
		char Anwser ='Y';
		int Number = 0;
		Scanner scan = new Scanner(System.in);
		
		while (Anwser != 'N' || Anwser != 'n') {
			
			if (Anwser == 'N' || Anwser == 'n'){
				System.out.println("C'est finito ^^");
				System. exit(0);
				}
			
			Number = scan.nextInt();
			if (Character.isDigit(Number) && Number == 0) {
				System.out.println("Ce chiffre est nul");
			} else if (Number > 0){
				System.out.println("Ce chiffre est positif");
			} else if (Number < 0) {
				System.out.println("Ce chiffre est négatif");
			}
			
			if (Number % 2 == 0) {
				System.out.println("Ce nombre est paire");
			} else {
				System.out.println("Ce nombre est impaire");
			}
			System.out.println("Veux tu continuer ? Y/N");
			Anwser = scan.next().charAt(0);
		}
	}
}