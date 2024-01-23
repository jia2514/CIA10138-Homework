package hw1;

public class Hw1 {
	public static void main(String[] args) {

		System.out.println("請設計一隻Java程式,計算12,6這兩個數值的和與積");
		System.out.print('\n');

		int num1 = 12, num2 = 6;
		System.out.println("和 = " + (num1 + num2));
		System.out.println("積 = " + num1 * num2);

		System.out.println("======================================================");

		System.out.println("請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)");
		System.out.print('\n');

		int total = 200, dozen = 12;
		System.out.print(total / dozen + " 打 ");
		System.out.print(total % dozen + " 顆 " + '\n');

		System.out.println("======================================================");

		System.out.println("請由程式算出256559秒為多少天、多少小時、多少分與多少秒");
		System.out.print('\n');

		int sec = 256559, minsec = 60, hoursec = 60 * 60, daysec = 24 * hoursec;

		System.out.print(sec / daysec + " 天 ");
		System.out.print(sec % daysec / hoursec + " 小時 ");
		System.out.print(sec % hoursec / minsec + " 分 ");
		System.out.print(sec % minsec + " 秒 " + '\n');

		System.out.println("======================================================");

		System.out.println("請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長");
		System.out.print('\n');

		final double pi = 3.1415; 
		int radius = 5;

		System.out.println("圓面積 = " + pi * Math.pow(radius, 2));
		System.out.println("圓周長 = " + radius * 2 * pi);

		System.out.println("======================================================");

		System.out.println("某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,\n" + "本金加利息共有多少錢 (用複利計算,公式請自行google)");
		System.out.print('\n');

		double pv = 1_500_000, year = 10, rate = 0.02;
		System.out.println("本利和 = " + pv * Math.pow((1 + rate), year));

		System.out.println("======================================================");

		System.out.println("請寫一隻程式,利用System.out.println()印出以下三個運算式結果:\n" + "5 + 5\n" + "5 + ‘5’\n" + "5 + “5”\n"
				+ "並請用註解各別說明答案的產生原因");
		System.out.print('\n');

		System.out.println(5 + 5);
		System.out.println("(5 + 5) //5為整數數值進行計算");
		System.out.println(5 + '5');
		System.out.println("(5 +'5') //'5'為字元，十進位為數值為53，以數值53進行計算");
		System.out.println(5 + "5");
		System.out.println("(5 +\"5\") //\"5\"為字串，以字串進行串接");
	}
}
