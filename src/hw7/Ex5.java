package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex5 {
	/*
	 * 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 
	 * (請利用多型簡化本題的程式設計)
	 */

	public static void main(String[] args) throws Exception {
		 // 步驟1: 建立 FileInputStream 物件，用於讀取序列化檔案
		FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
		
		// 步驟2: 建立 ObjectInputStream 物件，用於反序列化物件
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			 // 步驟3: 使用 while 迴圈逐個讀取並反序列化物件
			while (true)
				// 步驟3.1: 將讀取的物件轉型為 Animal 類別並呼叫 speak 方法
			((Animal) ois.readObject()).speak();
			 // 步驟4: 捕捉 EOFException，表示檔案已讀取到末尾，並顯示執行完畢訊息
		} catch (EOFException e) {
			System.out.println("執行完畢");
		}
		 // 步驟5: 關閉 ObjectInputStream 和 FileInputStream，釋放資源
		ois.close();
		fis.close();

	}

}
