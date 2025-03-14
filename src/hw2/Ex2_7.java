package hw2;

public class Ex2_7 {
	public static void main(String[] args) {
		/*
		 * 請設計一隻Java程式，輸出結果為以下：
			A
 			BB
 			CCC
 			DDDD
 			EEEEE
 			FFFFFF
		 */
		
		for (char i = 65; i <= 70; i++) {
				for (int n = 1; n <= i - 64; n++) {
					//控制執行次數，當i = 65(A)時，要執行一次，所以n應該是 i - 65
					System.out.print(i);
					
				}	System.out.println();
				
			}
		
	}

}
