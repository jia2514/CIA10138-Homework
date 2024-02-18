package hw7;

import java.io.*;

public class Hw7_1 {

//	•請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//	Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

	public static void main(String args[]) {

		int i;
		String str;
		int countChar = 0;
		int countLine = 0;

		File sample = new File("C:\\CIA101_Workspace\\CIA10138-Homework\\files\\Sample.txt");

		try {

			FileReader fr = new FileReader(sample);
			FileReader fr2 = new FileReader(sample);
			BufferedReader br2 = new BufferedReader(fr2);

			while ((i = fr.read()) != -1) {
				countChar++;
			}

			while ((str = br2.readLine()) != null) {
				countLine++;
			}

			br2.close();
			fr2.close();
			fr.close();

		} catch (IOException e) {
		}

		System.out.println("Sample.txt檔案共有" + (sample.length()) + "個位元組," + countChar + "個字元," + countLine + "列資料");

	}

}
