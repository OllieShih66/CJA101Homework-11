package hw2;

public class Ex2_4 {
	public static void main(String[] args) {
		/*
		 * 請設計一隻Java程式，輸出結果為以下： 1 4 9 16 25 36 49 64 81 100
		 */
		int sum4 = 0;
		for (int n = 1; n <= 10; n++) {
			sum4 += 2 * n - 1;
			System.out.print(sum4 + " ");
		}
		System.out.println();
		System.out.println("=================");

		// 每個數字為n的次方時

		for (int n1 = 1; n1 <= 10; n1++) {
			System.out.print((int) Math.pow(n1, 2) + " ");

		}
	}

}
