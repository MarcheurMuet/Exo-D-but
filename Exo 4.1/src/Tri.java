import java.util.ArrayList;
import java.util.Collections;

public class Tri {
	public static void main(String[] args) {
		ArrayList<String> promo = new ArrayList<String>();
		
		promo.add("luke");
		promo.add("chubaka");
		promo.add("6po");
		promo.add("r2d2");
		promo.add("han");
		promo.add("yoda");
		promo.add("anakin");
		
		System.out.println(promo);
		
		promo.sort(null);		
		System.out.println(promo);
		
		promo.sort(Collections.reverseOrder());
		System.out.println(promo);
	}
}