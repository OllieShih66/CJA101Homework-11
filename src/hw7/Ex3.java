package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex3 {
	/*
	 * 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。 
	 * 呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
	 */
	public void copyFile(File inputFile, File outputFile) throws IOException {
	    // 步驟1: 建立 FileReader 物件，用於讀取輸入檔案的內容
	    FileReader fr = new FileReader(inputFile);
	    
	    // 步驟2: 建立 FileWriter 物件，用於將內容寫入輸出檔案
	    FileWriter fw = new FileWriter(outputFile);
	    
	    // 步驟3: 宣告一個整數變數 i，用於存儲每次讀取的字元
	    int i;
	    
	    // 步驟4: 使用 while 迴圈逐字元讀取輸入檔案，直到檔案結尾 (-1 表示 EOF)
	    while ((i = fr.read()) != -1) {
	        // 步驟4.1: 將讀取到的字元寫入輸出檔案
	        fw.write(i);
	        
	        // 步驟4.2: 將讀取到的字元打印到終端，方便檢查內容
	        System.out.print((char) i); // 將整數轉換為字元後打印
	        System.out.flush(); // 確保即時輸出到終端
	    }
	    
	    // 步驟5: 關閉 FileWriter，釋放資源並確保資料寫入完成
	    fw.close();
	    
	    // 步驟6: 關閉 FileReader，釋放資源
	    fr.close();
	}

	public static void main(String[] args) throws IOException {
	    // 步驟1: 建立讀取輸案和寫入輸出檔案的 File 物件
	    File input = new File(".\\data\\in.txt");
	    File output = new File(".\\data\\out.txt");
	    
	    // 步驟2: 建立 Ex3 類別的實例，用於呼叫 copyFile 方法
	    Ex3 e3 = new Ex3();
	    
	    // 步驟3: 呼叫 copyFile 方法，執行檔案複製操作
	    e3.copyFile(input, output);
	}

}
