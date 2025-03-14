package hw2;

public class Ex2_2 {
	public static void main(String[] args) {
		// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
				int sum2 = 1;
				for (int a = 1; a <= 10; a++) {
					sum2 *= a;
				}
				System.out.println(sum2);
	}

}
