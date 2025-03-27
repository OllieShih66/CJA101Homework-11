package hw5;

import java.util.Scanner;

public class Ex1 {
	
	//依照設置的寬高列印*
	public void starSquare(int width, int height) {
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= height; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		/*
		 * 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時, 即會印出對應的*長方形,如圖:
		 */
		
		//輸入寬高
		System.out.println("請輸入長方形的寬、高：");
		Scanner sc = new Scanner(System.in);
		//驗證寬高是否為整數
		if (sc.hasNextInt()) {
			int height = sc.nextInt();
			int width = sc.nextInt();
			//呼叫列印*的方法
			Ex1 square = new Ex1();
			square.starSquare(width, height);

		} else {
			System.out.println("請輸入整數");
		}

	}

}
