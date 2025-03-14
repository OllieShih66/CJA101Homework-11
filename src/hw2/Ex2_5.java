package hw2;

public class Ex2_5 {
	public static void main(String[] args) {
		/*
		 * 阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。 請設計一隻程式， 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		 */
		int count = 0; // 計算總共有幾個
		for (int x = 1; x <= 39; x++) { // 因為十位數不能是4，所以最多其實只有到39
			if (x % 10 != 4) {
				System.out.print(x + " ");
				count++; // 每跑出一個就記一次
			}

		}
		System.out.println();
		System.out.println("總共有" + count + "個");
		System.out.println("=====================================");

		// 計算10位數不等於4，且個位數不等於4
		int count1 = 0;
		for (int x1 = 1; x1 <= 49; x1++) {
			int ten = x1 / 10; // 十位數
			int one = x1 % 10; // 個位數
			if (ten != 4 && one != 4) {
				System.out.print(x1 + " ");
				count1 ++;
			}
		}
		System.out.println();
		System.out.println("總共有" + count1 + "個");

	}

}
