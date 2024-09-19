import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		
		String str1 = "bonjour";
		String str2 = "la promo";
		
		String str3 = String.join(str1,"Est-ce que vous êtes motivé ?");
		System.out.println(str3);
		
		String str = "il fait beau aujourd'hui";
		System.out.println(str + "\n - quel mot recherchez vous ?");
		Scanner scan = new Scanner(System.in);
		String kb = scan.next();
		
		if(str.toLowerCase().contains(kb.toLowerCase()))	System.out.println(kb + " est bien dans la phrase");
		else System.out.println(kb + " n'est pas dans la phrase");
		
		System.out.println("par quel mot souhaitez vous remplacer le mot s'il existe ?");
		String replace = scan.next();
		if(str.toLowerCase().contains(kb.toLowerCase()))	{
			str = str.replace(kb, replace);
			System.out.println(str);
		}	
		scan.close();					
	}
}
