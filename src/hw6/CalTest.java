package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Scanner sc = new Scanner(System.in);
		try {
			int x;
			int y;
			System.out.println("請輸入x：");
			// 嘗試讀取整數，已經透過例外處理驗證是否為整數了，所以不用再hasNextInt()
			try {
				x = sc.nextInt(); 
			} catch (InputMismatchException e) {
				throw new Exception("請輸入整數！");
			}
			System.out.println("請輸入y：");
			try {
				y = sc.nextInt();
			} catch (InputMismatchException e) {
				throw new Exception("請輸入整數！");
			}

			int result = c1.powerXY(x, y);
			System.out.println(x + "的" + y + "次方為" + result);

		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
