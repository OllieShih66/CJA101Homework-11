package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex2 {
	/*
	 * 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用append功能讓每次執行結果都能被保存起來)
	 */
	public static void main(String[] args) throws IOException {
		// 步驟1: 建立一個名為data的目錄
		File d = new File("C:\\CJA101_Workspace\\Homework-11\\data");
		d.mkdir();

		// 步驟2: 在指定路徑中建立Data.txt檔案
		File f = new File(".\\data\\Data.txt");
		f.createNewFile();

		// 步驟3: 建立FileOutputStream，設定為附加模式(append=true)，使新資料能夠保留舊資料
		FileOutputStream fos = new FileOutputStream(".\\data\\Data.txt", true);

		// 步驟4: 建立PrintStream物件，方便寫入文字資料
		PrintStream ps = new PrintStream(fos);

		// 步驟5: 使用迴圈產生10個隨機整數
		for (int i = 1; i <= 10; i++) {
			// 步驟5.1: 產生1到1000之間的隨機整數
			int num = (int) (Math.random() * 1000 + 1);
			// 步驟5.2: 將隨機數寫入檔案，每個數字一
			ps.println(num);

		}
		// 步驟6: 關閉資源，釋放系統資源並確保資料寫入完成
		ps.close();
		fos.close();
	}

}
