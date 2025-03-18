package hw3;

import java.util.Scanner;

public class Ex2 {
	/*
	 * 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲， 猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
	 */
	public static void main(String[] args) {
		// s1. 亂數產生正確數字
		int correct = (int) (Math.random() * 10);

		// s2. 輸入猜的數字，0~9
		System.out.println("開始猜數字吧！");
		int reply = 0;
		Scanner sc = new Scanner(System.in);

		// s3. 比較數字，因為不確定次數，所以用while
		while (true) { // 無窮迴圈，直到猜對
			if (sc.hasNextInt()) { // 驗正整數
				reply = sc.nextInt();
				if (reply >= 0 && reply <= 9) {
					if (reply == correct) {
						System.out.println("答對，正確答案是：" + correct);
						break;
					} else {
						System.out.println("答錯囉");
					}
				} else {
					System.out.println("請輸入0~9之間整數");
				}
			} else {
				System.out.println("請輸入整數");
				sc.next(); // 清除無效輸入，避免無限迴圈
			}

		}

//		使用for迴圈
//		for (int i = 1; i >= 0; i++) {
//			if (sc.hasNextInt()) {
//				reply = sc.nextInt();
//				if (reply >= 0 && reply <= 9) {
//					if (reply == correct) {
//						System.out.println("答對，正確答案是：" + correct);
//						break;
//					} else {
//						System.out.println("答錯囉");
//					}
//				} else {
//					System.out.println("請輸入0~9之間整數");
//				}
//			} else {
//				System.out.println("請輸入整數");
//				sc.next(); // 清除無效輸入，避免無限迴圈
//			}
//
//		}

		sc.close();
	}

}
