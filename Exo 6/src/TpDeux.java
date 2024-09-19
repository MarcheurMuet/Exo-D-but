import java.util.Scanner;

public class TpDeux {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Combien de menu voulez-vous?");
		int numMenus = scanner.nextInt();

		String[][] menuOptions = {
				{"[Entrée]","[1 - SALADE]", "[2 - SOUPE]", "[3 - QUICHE]", "[4 - AUCUNE]"},
				{"[Plats]","[1 - POULET]", "[2 - BOEUF]", "[3 - POISSON]", "[4 - VEGETARIEN]", "[5 - VEGAN]", "[6 - AUCUN]"},
				{"[Accompagnement]","[1 - RIZ]", "[2 - PATES]", "[3 - FRITES]", "[4 - LEGUMES]", "[5 - AUCUN]"},
				{"[Boissons]","[1 - EAU]", "[2 - EAU GAZEUSE]", "[3 - SODA]","[4 - VIN]","[5 - AUCUN]"},
				{"[Désserts]","[1 - TARTE MAISON]","[2 - MOUSSE AU CHOCO]","[3 - TIRAMISU]","[4 - AUCUNE]"}
		};
		
		for (int i = 0; i < numMenus; i++) {
			StringBuilder order = new StringBuilder();
			for (String[] options : menuOptions) {
				order.append(getChoice(options, scanner)).append(" ");
			}
			System.out.println("\nRésumé de la commande "+(i+1)+" :\n" + order +"\n");
		}
	}

	private static String getChoice(String[] options, Scanner scanner) {
		for (int i = 0; i < options.length; i++) {
			System.out.println(options[i]);
		}
		return options[scanner.nextInt()];
	}
}