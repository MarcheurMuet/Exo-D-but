public class Score {
	public static void main(String[] args) {
		double [] scores = { 10,13,17,20,8.5};
		
		displayScores(scores);
		System.out.println();
		
		System.out.println("Max = " + maxScores(scores));
		System.out.println("Min = " + minScores(scores));
		System.out.println("Moy = " + averageScores(scores));		
	}
	
	public static void displayScores(double [] scores) {
		for(double n : scores)	System.out.print(n + "  ");
	}

	public static double maxScores(double [] scores) {
		double max = scores[0];
		for(int Score = 1 ; Score < scores.length ; Score++) {
			if(max < scores[Score])
				max = scores[Score];
		}
		return max;
	}
	public static double minScores(double [] scores) {
		double min = scores[0];
		for(int Score = 1 ; Score < scores.length ; Score++) {
			if(min > scores[Score])
				min = scores[Score];
		}
		return min;
	}
	public static double averageScores(double [] scores) {
		double moy = 0;
		for(int Score = 0 ; Score < scores.length ; Score++) {
			moy += scores[Score];
		}
		return moy/scores.length;
	}
}

