package hw4;

import java.util.Scanner;

public class Ex4 {
	/*
	 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下：
	 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事 有錢可借他;並且統計有錢可借的總人數: 例如輸入 1000
	 * 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] money = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };

		// 判斷輸入是否為整數
		if (sc.hasNextInt()) {
			int value = sc.nextInt();

			int count = 0;
			// 將輸入金額和錢比較
			System.out.print("有錢可借的員工編號: ");
			for (int i = 0; i < money.length; i++) {
				if (value <= money[i][1]) {
					System.out.print(money[i][0] + " ");
					count++;
				}
			}
			System.out.print("共" + count + "人！");
		}
		System.out.println("請輸入整數");

	}

}
