package hw5;

public class Ex2 {
	int[] Array = new int[10];

	public void getArray() {
		for (int i = 0; i < Array.length; i++) {
			Array[i] = (int) (Math.random() * 101); // 0~100
		}

	}

	public void randAvg() {
		// 計算陣列內所有數字總數
		int sum = 0;
		for (int i = 0; i < Array.length; i++) {
			sum += Array[i];

		}

		// 列印陣列
		System.out.print("本次亂數結果：");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}

		System.out.println();
		System.out.println("總和為：" + sum);

		double avg = (double)sum / Array.length;
		System.out.println("平均值為：" + avg);

	}

	public static void main(String[] args) {

		Ex2 result = new Ex2();
		result.getArray();
		result.randAvg();
	}

}
