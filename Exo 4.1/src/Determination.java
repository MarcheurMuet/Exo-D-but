public class Determination {
	public static void main(String[] args) {
		int table[] = { -5, 2, -8, 31, 15, 4 };
		displayTab(table);
		fonction(table);
		displayTab(table);
	}
	
	static void fonction(int[] tab) {
		int tmp = 0;
		for (int notes = 0; notes < tab.length; notes++) {
			for (int i = 1; i < (tab.length - notes); i++) {
				if (tab[i - 1] > tab[i]) {					
					tmp = tab[i - 1];
					tab[i - 1] = tab[i];
					tab[i] = tmp;
				}
			}
		}
	}

	static void displayTab(int[] tab) {
		for (int notes = 0; notes < tab.length; notes++) {
			System.out.print(tab[notes] + " ");
		}
		System.out.println();
	}
}
