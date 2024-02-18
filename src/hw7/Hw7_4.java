package hw7;

import java.io.*;

public class Hw7_4 {

//	• 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

	public static void main(String[] args) throws IOException {

		File dir = new File("C:\\data");
		if (!dir.exists()) {
			dir.mkdir();
		}

		File file = new File("C:\\data\\Object.ser");

		Animal[] animal = new Animal[4];
		animal[0] = new Dog("斑斑");
		animal[1] = new Dog("點點");
		animal[2] = new Cat("小條");
		animal[3] = new Cat("小紋");

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < animal.length; i++)
			oos.writeObject(animal[i]);

		oos.close();
		fos.close();

	}

}
