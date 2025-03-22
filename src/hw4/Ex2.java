package hw4;

import java.util.Scanner;

public class Ex2 {
	/*
	 * 請建立一個字串，經過程式執行後，輸入結果是反過來的 例如String s = “Hello World”，執行結果即為dlroW olleH
	 */
	public static void main(String[] args) {

		// s1. 輸入文字並建立字串
		System.out.println("請輸入一段句子：");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// s2. 將字串轉為字元陣列
		char[] charArray = str.toCharArray();

		// s3. 利用迴圈將陣列由索引大至索引小的元素列印出來
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}

	}
}
