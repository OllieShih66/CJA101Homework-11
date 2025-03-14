package hw2;

public class exercise1 {
	/*
	 * • 請建立一個TestNineNine.java程式，可輸出九九乘法表 • 一：使用for迴圈+ while迴圈 • 二：使用for迴圈+ do
	 * while迴圈 • 三：使用while迴圈+ do while迴圈
	 */
	public static void main(String[] args) {
		// while + for
		int i = 1, j = 1;
		while (i <= 9) {
			for (j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
			i++;
		}

//		for + while
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}
//			System.out.println();
//			
//		}
		System.out.println("======================================================================");

		// for + do while
		for (int a = 1; a <= 9; a++) {
			int b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			} while (b <= 9);
			System.out.println();
		}

		// do while + for
//		int a1 = 1;
//		do {
//			for (int b1 = 1; b1 <= 9; b1++) {
//				System.out.print(a1 + "*" + b1 + "=" + a1 * b1 + "\t");
//				b1++;
//			}
//			System.out.println();
//			a1++;
//		} while (a1 <= 9);

		System.out.println("======================================================================");

		// while + do while
		int x = 1, y = 1;
		while (x <= 9) {
			do {
				System.out.print(x + "*" + y + "=" + x * y + "\t");
				y++;
			} while (y <= 9);
			y = 1;
			System.out.println();
			x++;
		}

		// do while + while
//		int x1 = 1, y1 = 1;
//		do {
//			y1 = 1;
//			while (y1 <= 9) {
//				System.out.print(x1 + "*" + y1 + "=" + x1 * y1 + "\t");
//				y1++;
//			}
//			System.out.println();
//			x1++;
//		} while (x1 <= 9);
	}

}
