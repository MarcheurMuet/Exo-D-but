import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		
		char Anwser = '?';
		int Premier = 0;
		int Second = 0;
		int result = 0;
		
		System.out.println("Que veux tu faire?");
		
		//Les différents types de demandes ^^
		
		System.out.println("Addition = a/A");
		System.out.println("Soustraction = s/S");
		System.out.println("Multiplication = m/M");
		System.out.println("Division = d/D");
		
		Scanner scan = new Scanner(System.in);
		Anwser = scan.next().charAt(0);
		
		System.out.println("Ok quels sont les nombres Captain?");
		
		Premier = scan.nextInt();
		
		Second = scan.nextInt();
		
		//Début du "IF ELSE"
		
		if (Anwser == 'a' || Anwser == 'A') {
			
			System.out.println("Voilà le résultat de l'addition"); //l'Addition
			
			result = (Premier + Second);
			System.out.println(result);
			System.exit(0);
			
		} else if (Anwser == 's' || Anwser == 'S') {
			
			System.out.println("Voilà le résultat de la soustraction :"); //la soustraction
			
			result = (Premier - Second);
			System.out.println(result);
			System.exit(0);
			
		} else if (Anwser == 'm' || Anwser == 'M') {
			
			System.out.println("Voilà le résultat de la multiplication :"); //la multiplication.
			
			result = (Premier * Second);
			System.out.println(result);
			System.exit(0);
			
		} else if (Anwser == 'd' || Anwser == 'D') {
			
			if(Second != 0) {
				System.out.println("Voilà le résultat de la division :"); //la division.
				result = (Premier / Second);
				System.out.println(result);
				System.exit(0);
			} else {
				System.out.println("Frérot on peut pas diviser par zéro -_-"); //l'erreur de diviser par zéro.
				System.exit(0);
			}
		} else {
			System.out.println("J'ai pas compris X_X"); //l'erreur tout court.
			System. exit(0);
		}
	}
}