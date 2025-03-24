package hw4;

import java.util.Scanner;

public class Ex5 {
	/*
	 * 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天 例：輸入 1984 9 8
	 * 三個號碼後，程式會顯示「輸入的日期為該年第252天」 須考慮到閏年，以及2月不會超過29天
	 */
	public static void main(String[] args) {
		System.out.println("請輸入日期：");
		Scanner sc = new Scanner(System.in);

		// 驗證輸入是否為整數
		if (sc.hasNextInt()) {
			int[] date = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
			int year = date[0];
			int month = date[1];
			int day = date[2];
			// 驗證是否為有效日期
			if (year >= 1000 && month >= 1 && month <= 12 && day <= getDateinMonth(year, month)) {
				System.out.println("輸入的日期為該年第" + getCalculateDays(year, month, day) + "天");

			} else {
				System.out.println("請輸入有效日期");
			}

		} else

		{
			System.out.println("請輸入整數");
		}
	}

	// 判斷是否為閏年
	private static boolean isLeapYear(int year) {
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}

	// 取得每月天數，用來驗證輸入日期之有效性
	private static int getDateinMonth(int year, int month) {
		// 每個月份有幾天
		int[] daysofMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// true,該年事閏年且2月時回傳29
		if (isLeapYear(year) && month == 2) {
			return 29;
		}
		return daysofMonth[month - 1]; // 因為索引值有0，1月份要回傳daysifMonth[0]
	}

	// 計算該日期是該年的第幾天
	private static int getCalculateDays(int year, int month, int day) {
		int[] daysofMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 如果是閏年的2月要回傳29
		if (isLeapYear(year)) {
			daysofMonth[1] = 29;
		}
		int days = 0;
		for (int i = 0; i < month - 1; i++) {
			// 計算到前一個月份累計的天數
			days += daysofMonth[i];
		}

		return days += day;
	}

}
