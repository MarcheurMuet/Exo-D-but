import java.util.Scanner;

public class Professor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String response = "o";		
		System.out.println("Souhaitez vous saisir les notes d'un élèves O/N ?");	
		response = scan.nextLine();
		
		while(response.equalsIgnoreCase("o")){
			System.out.println("saisir nom : ");		
			String Nom = scan.nextLine();
			System.out.println("saisir prénom : ");
			String Prénom = scan.nextLine();				
			System.out.println(Nom + " " + Prénom + " -> moyenne : " + enterScores(scan));
			System.out.print("souhaitez vous saisir les notes d'un autre élève O/N ?");
			response = scan.next();	
			scan.nextLine();	
			}		
		System.out.println("au revoir professeur");		
		scan.close();		
	}
	
	public static double enterScores(Scanner scan) {
		double moyenne = 0;
		int counter = 0;
		
		System.out.println("Saisissez chaque note suivie par la touche entrée,"
				+ " lorsque vous avez fini taper stop puis entrée, Attention : écrire 15,5 et pas 15.5 ");
		while(scan.hasNextDouble()) {			 
			moyenne += scan.nextDouble();
			counter ++;
		}
		scan.next();
		return counter > 0 ? moyenne/counter : 0;		
	}
}