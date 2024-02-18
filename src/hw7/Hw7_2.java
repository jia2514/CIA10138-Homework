package hw7;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hw7_2 {

//	• 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//			append功能讓每次執行結果都能被保存起來)

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("C:\\CIA101_Workspace\\CIA10138-Homework\\files\\Data.txt",
					true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);

			Set set = new HashSet();
			while (set.size() != 6) {
				int r = (int) (Math.random() * 49) + 1;
				set.add(r);
			}

			Iterator objs = set.iterator();
			while (objs.hasNext())
				ps.print(objs.next() + " " + '\t');

			ps.print('\n');

			ps.close();
			bos.close();
			fos.close();

		} catch (IOException e) {
			System.err.println(e);
		}

	}
}
