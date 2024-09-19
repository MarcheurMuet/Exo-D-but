import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		String name = "";
		String prenom = "";
		
		System.out.println("C'est quoi ton Nom?");
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		
		System.out.println("C'est quoi ton Prénom?");
		prenom = scan.nextLine();
		
		System.out.println("Hello, quel est votre nom?" +" "+ "Salut"+ " " + name +" "+ prenom + "!");
	}
}