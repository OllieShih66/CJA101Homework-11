package hw4;

public class Ex6 {
	/*
	 * 班上有8位同學，他們進行了6次考試結果如下： 請算出每位同學考最高分的次數
	 */
	public static void main(String[] args) {
		// s1. 列出所有同學的成績
		int[][] scores = { { 10, 37, 100, 77, 98, 90 }, { 35, 75, 70, 95, 70, 80 }, { 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 100 }, { 90, 64, 75, 60, 75, 50 }, { 85, 75, 70, 75, 90, 20 },
				{ 75, 70, 79, 85, 89, 99 }, { 70, 95, 90, 89, 90, 75 } };

		// s2. 用陣列記錄每位同學獲得最高分的次數
		int[] highScoreCount = new int[8]; // 8 位同學，初始值為 0

		// s3. 比較每位同學成績並獲得最高數
		for (int j = 0; j < scores[0].length; j++) {
			int maxScore = scores[0][j]; // 先假設最高分是第一位同學，並且開始比較
			for (int i = 0; i < scores.length; i++) {
				if (scores[i][j] > maxScore) {
					maxScore = scores[i][j]; // 和其他同學比較
				}

			}

			// s4. 計算每位同學考最高分的次數
			for (int i = 0; i < scores.length; i++) {
				if (scores[i][j] == maxScore) {
					highScoreCount[i]++;
				}
			}

		}

		// s5. 列印出每位同學最高分次數
		for (int i = 0; i < highScoreCount.length; i++) {
			System.out.println("同學 " + (i + 1) + "： " + highScoreCount[i] + " 次");
		}
	}
}
