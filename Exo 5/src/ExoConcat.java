
public class ExoConcat {	
	public static void main(String[] args) {	
		String Mot [] = { "a","+aya+","kayak","-kk-","ELU par cette crapule","toto","ottO","a++a","sos"};
		for(String str : Mot) {
			if(isPalindrome(str))	System.out.println(str + " est un palindrome");
			else System.out.println(str + " n'est pas un palindrome");
		}
	}
	
	public static boolean isPalindrome(String str) {	
		str = str.replaceAll(" ", "");
		if(!isLetters(str)) return false;
		StringBuilder strb = new StringBuilder(str);
		String strInverse = strb.reverse().toString();
		return str.equalsIgnoreCase(strInverse) ? true : false;
	}
	
	public static boolean isLetters(String str) {		
		for (int Letters = 0; Letters < str.length(); Letters++) {
			if(Character.isLetter(str.charAt(Letters)) == false)
				return false;
		}
		return true;
	}
}
