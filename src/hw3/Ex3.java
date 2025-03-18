package hw3;

import java.util.Scanner;

public class Ex3 {
	/*
	 * 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4， 但這次他想要依心情決定討厭哪個數字，
	 * 請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)， 畫面會顯示他可以選擇的號碼與總數，如圖：
	 */
	public static void main(String[] args) {
		// s1. 輸入 1~9，驗證是否為1~9的整數
		System.out.println("阿文請輸入：");
		Scanner sc = new Scanner(System.in);
		int count = 0;
		if (sc.hasNextInt()) {
			int number = sc.nextInt();
			if (number >= 1 && number <= 9) {
				System.out.println("阿文不想要有：" + number);
				// s2. 列出1~49內排除不想要的數字的所有數字
				for (int i = 1; i <= 49; i++) {
					int no = i % 10;
					int ten = i / 10;
					if (no != number && ten != number) { // 個位數和十位數都不能和number一樣
						System.out.print(i + " ");
						// s3. 計算總數，要符合判斷式條件才可記數，放在這裡才適合
						count++;
					}

				}

				System.out.println();
				System.out.println("總共有：" + count + "個數字可以選");

			}
		} else {
			System.out.println("請輸入整數");
		}

		sc.close();
	}

}
