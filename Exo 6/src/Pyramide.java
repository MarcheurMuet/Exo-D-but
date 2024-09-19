import java.util.Scanner;

public class Pyramide {

	public static void main(String[] args) {
		
		int Nombre = 0;
		int NombreMax = 1;
		int espace = 0;
		int etoiles = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("mettez le nombre d'étages ^^");
		
		NombreMax = scan.nextInt(); // ici on définit le nombre d'étages
		
		System.out.println("\n"); // le FAMEUX \n pour ne pas se casser les yeux
		
        for (Nombre = 0; Nombre < NombreMax; Nombre++) {
            for (espace = 0; espace < NombreMax - Nombre; espace++) {
                System.out.print(" "); // paramètrage des espaces
            }
            for (etoiles = 0; etoiles <= Nombre; etoiles++) {	
                System.out.print("* "); // paramètrages des étoiles
            }
            System.out.println(""); // paramètres des sauts des lignes
        }
        System.out.println("\nil y a donc bien "+  Nombre + " étages");
    }
}