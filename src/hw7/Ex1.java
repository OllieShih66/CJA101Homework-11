package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {
	/*
	 * 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息： Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
	 */
	public static void main(String[] args) {
		// 步驟1: 初始化變數
		int x = 0; // 用於計算文件中的字元數
		int y = 0; // 用於計算文件中的行數
		String str; // 儲存每次讀取的一行文字
		int i; // 儲存每次讀取的一個字元的 ASCII 值
		
		// 定義文件物件，指向目標文件
		File f = new File("C:\\Users\\TMP-214\\Downloads\\Sample.txt"); 

		try {
			// 步驟2: 計算文件中的字元數	
			FileReader fr1 = new FileReader("C:\\Users\\TMP-214\\Downloads\\Sample.txt"); // 建立 FileReader 對象，用於讀取文件內容
			BufferedReader br1 = new BufferedReader(fr1); // 使用 BufferedReader 包裝 FileReader，提升讀取效率

			while ((i = br1.read()) != -1) { // 每次讀取一個字元，直到文件結尾 (-1)
				x++; // 每讀取一個字元，計數器 x 加 1
				// System.out.print((char)i); 
			}

			// 步驟3: 計算文件中的行數
			// 因為前面使用 read()方法讀取文件時，已經讀到文件尾末了，需要重新讀取文件內容
			FileReader fr2 = new FileReader("C:\\Users\\TMP-214\\Downloads\\Sample.txt"); 
																							
			BufferedReader br2 = new BufferedReader(fr2); 

			while ((str = br2.readLine()) != null) { // 每次讀取一行文字，直到文件結尾 (null)
				y++; // 每讀取一行，計數器 y 加 1
				// System.out.println(str); // (註解掉) 可用於輸出每行文字
			}

			// 步驟4: 關閉資源 
			br2.close(); 
			fr1.close(); 
			br1.close(); 
			fr2.close(); 
		} catch (FileNotFoundException e) {
			System.out.println("找不到檔案"); 

		} catch (IOException e) {
			System.out.println("讀取文件時發生錯誤！"); 

		}

		// 步驟5: 輸出統計結果
		System.out.println("Sample.txt檔案共有" + f.length() + "個位元組，" + x + "個字元，" + y + "列資料");
		// f.length(): 獲取文件大小（以位元組為單位）
	}

}
