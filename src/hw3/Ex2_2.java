package hw3;

import java.util.Scanner;

public class Ex2_2 {
	// 進階，產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
	public static void main(String[] args) {
		// s1. 亂數產生正確數字

		int correct = (int) (Math.random() * 101);

		// s2. 輸入猜的數字，0~100
		System.out.println("開始猜數字");
		int reply = 0;
		Scanner sc = new Scanner(System.in);

		// s3. 比較數字，因為不確定次數，所以用while
		while (true) { // 無窮迴圈，直到猜對
			if (sc.hasNextInt()) { // 驗正整數
				reply = sc.nextInt();
				if (reply >= 0 && reply <= 100) {
					if (reply == correct) {
						System.out.println("答對，正確答案是：" + correct);
						break;
					} else if (reply > correct) {
						System.out.println("答錯囉，比答案大");
					} else {
						System.out.println("答錯囉，比答案小");
					}
				} else {
					System.out.println("請輸入0~100之間整數");
				}
			} else {
				System.out.println("請輸入整數");
				sc.next(); // 清除無效輸入，避免無限迴圈
			}

		}

		sc.close();
	}
}
