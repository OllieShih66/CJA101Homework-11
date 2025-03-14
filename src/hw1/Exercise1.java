package hw1;

public class Exercise1 {
	public static void main(String[] args) {
		// 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a = 12;
		int b = 6;
		int sum1 = a + b;
		int sum2 = a * b;
		System.out.println(sum1);
		System.out.println(sum2);

		// 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
		int n = 200;
		int dozen = n / 12;
		int egg = n % 12;
		System.out.println("200 顆雞蛋總共是 " + dozen + " 打" + egg + " 顆");

		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int seconds = 256559;
		int days = seconds / 86400;
		int hours = seconds % 86400 / 3600;
		int mins = seconds % 86400 % 3600 / 60;
		int sec = seconds % 86400 % 3600 % 60;
		System.out.println("256559秒為 " + days + " 天 " + hours + " 小時 " + mins + " 分 " + sec + " 秒");

		// 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double pi = 3.1415;
		int half = 5;
		double area = pi * Math.pow(half, 2);
		double perimeter = pi * half * 2;
		System.out.printf("面積：%.2f%n", area);
		System.out.printf("圓周長：%.2f%n", perimeter);

		/*
		 * 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本 金加利息共有多少錢 (用複利計算，公式請自行google)
		 */
		int fund = 1500000;
		double rate = 0.02;
		double money = (fund * Math.pow((1 + rate), 10));
		System.out.println((int)money);
		
		//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		System.out.println(5 + 5);		//數值的相加，等於10
		System.out.println( 5 + '5');	//數值和字元相加，因為5的unicode碼為35(16進位)，轉10進位為53，和5相加後為58
		System.out.println( 5 + "5");	//和字串相加時會強制轉換為字串間相加，所以是字串55
	}

}
