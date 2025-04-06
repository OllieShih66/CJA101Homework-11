package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
 * 注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
 */

//定義Animal介面，為下一題目使用多型呼叫方法
interface Animal {
	void speak();
}

//定義 Cat 類別，實現 Serializable 介面，支援物件序列化
class Cat implements Serializable, Animal {
	private static final long serialVersionUID = 1L;
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}

//定義 Dog 類別，實現 Serializable 介面，支援物件序列化
class Dog implements Serializable,Animal {
	private static final long serialVersionUID = 2L;
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}

public class Ex4 {
	public static void main(String[] args) throws Exception {

		// 步驟1: 建立目錄物件，檢查資料夾是否存在，不存在則建立
		File dir = new File("C:\\data\\");

		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("已新增資料夾");
		} else {
			System.out.println("資料夾已存在");
		}

		// 步驟2: 建立檔案物件，指定序列化檔案的路徑與名稱
		File f = new File("C:\\data\\Object.ser");

		// 步驟3: 建立 Cat 和 Dog 物件並初始化名稱
		Cat c = new Cat("Pinky");
		Dog d = new Dog("Puni");

		// 步驟4: 使用 try-with-resources 管理資源，自動關閉流物件
		try (FileOutputStream fos = new FileOutputStream(f); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// 步驟5: 將 Cat 和 Dog 物件序列化並寫入檔案
			oos.writeObject(c);
			oos.writeObject(d);
			System.out.println("物件成功寫入 C:\\data\\Object.ser");
		} catch (IOException e) {
			// 步驟6: 處理可能的 IO 異常並打印錯誤訊息
			System.out.println(e.getMessage());
		}

	}

}
