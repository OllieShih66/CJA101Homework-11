package hw5;

public class Ex5 {
	/*
	 * 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能， 請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
	 * 此驗證碼內容包含了英文大小寫與數字的亂數組合
	 */

	// 隨機產生數字
	public static char number() {
		return (char) (Math.random() * 10 + 48);
	}

	// 隨機產生大寫英文
	public static char uppercase() {
		return (char) (Math.random() * 26 + 65);
	}

	// 隨機產生小寫英文
	public static char lowercase() {
		return (char) (Math.random() * 26 + 97);
	}

	public static void main(String[] args) {
		
		System.out.println("本次隨機產生驗證碼為：");

		for (int i = 1; i <= 8; i++) {
			// 將每個方法產生結果放入陣列中
			char[] array = { number(), uppercase(), lowercase() };
			// 隨機產生陣列索引
			int j = (int) (Math.random() * 3);
			// 列印出陣列中的值
			System.out.print(array[j]);
		}

	}

}
