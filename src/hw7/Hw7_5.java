package hw7;

import java.io.*;

public class Hw7_5 {

//	• 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//			型簡化本題的程式設計)

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\data\\Object.ser");

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {

				((AnimalSpeak) ois.readObject()).speak();

				System.out.println("--------------------");
			}
		} catch (Exception e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();

	}

}
