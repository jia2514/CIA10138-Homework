package hw4;

public class Hw4No1ToNo3 {

	public int vowel(String letter) {
		int count = 0;
		String[] vow = { "a", "e", "i", "o", "u" };
		for (int n = 0; n < vow.length; n++) {
			if (letter.equals(vow[n])) {
				count++;
			}
			;
		}
		return count;
	}

	public static void main(String[] args) {

//1.有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)

		int sum = 0;
		int i;
		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (i = 0; i < x.length; i++) {
			sum += x[i];
		}

		int avg = sum / (i + 1);

		System.out.println("平均值 = " + avg);

		System.out.print("大於平均值的元素 = ");

		for (i = 0; i < x.length; i++) {
			if (x[i] > avg) {
				System.out.print(x[i] + " ");
			}
		}

		System.out.print('\n');
		System.out.println("======================================================");

//2.請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)

		String str = "Hello World";

		for (int j = str.length() - 1; j >= 0; j--) {
			System.out.print(str.substring(j, j + 1));
		}
		;

		System.out.print('\n');
		System.out.println("======================================================");

//3.有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)

		String[] star = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int countVw = 0;

		Hw4No1ToNo3 vw = new Hw4No1ToNo3();

		for (int k = 0; k < star.length; k++) {
			for (int m = 0; m < star[k].length(); m++) {
				countVw += vw.vowel(star[k].substring(m, m + 1));
			}
		}

		System.out.println("共有" + countVw + "個母音");
	}
}
