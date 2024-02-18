package hw7;

import java.io.*;

public class Hw7_3 {

//	• 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案

	public void copyFile(File x, File y) throws IOException {

		FileReader in = new FileReader(x);
		FileWriter out = new FileWriter(y);

		int c;

		while ((c = in.read()) != -1) {
			out.write(c);
		}

		in.close();
		out.close();

	}

}
