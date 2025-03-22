package hw3;

import java.util.Scanner;

public class Ex1 {
	/*
	 * 請設計一隻程式，使用者輸入三個數字後， 輸出結果會為正三角形、等腰三角形、 其它三角形或不是三角形，如圖示結果：
	 * (提示：Scanner，三角形成立條件，判斷式if else)
	 */

//	x=邊1；y=邊2；z=邊3

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] side = new int[3];

		System.out.println("請輸入邊長：");
		for (int i = 0; i < 3; i++) {

			if (sc.hasNextInt()) {
				side[i] = sc.nextInt();
			} else {
				System.out.println("請輸入整數！");
				break;
			}

		}

		if (side[0] + side[1] <= side[2] || side[0] + side[2] <= side[1] || side[1] + side[2] <= side[0] || side[0] <= 0
				|| side[1] <= 0 || side[2] <= 0) {
			System.out.println("不是三角形");
		} else if (side[0] == side[1] && side[1] == side[2]) {
			System.out.println("正三角形");
		} else if (side[0] == side[1] || side[1] == side[2] || side[1] == side[2]) {
			System.out.println("等腰三角形");
		} else if (Math.pow(side[0], 2) + Math.pow(side[1], 2) == Math.pow(side[2], 2)
				|| Math.pow(side[1], 2) + Math.pow(side[2], 2) == Math.pow(side[0], 2)
				|| Math.pow(side[0], 2) + Math.pow(side[2], 2) == Math.pow(side[1], 2)) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}
		sc.close();	
	}

}
