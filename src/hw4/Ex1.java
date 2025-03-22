package hw4;

public class Ex1 {
	/*
	 * 有個一維陣列如下：{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	 */
	public static void main(String[] args) {
		int[] Array1 = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		// 計算陣列內所有數字總數
		int sum = 0;

		for (int i = 0; i < Array1.length; i++) {
			sum += Array1[i];

		}
		System.out.println(sum);

		double avg = sum / Array1.length;
		System.out.println("平均值為：" + avg);

		System.out.print("陣列內大於平均值的數字為：");
		for (int i = 0; i < Array1.length; i++) {
			if (Array1[i] > avg) {
				System.out.print(Array1[i] + " ");
			}
		}
	}

}
