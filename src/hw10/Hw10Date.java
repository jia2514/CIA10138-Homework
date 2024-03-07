package hw10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hw10Date {

//	• 請設計一隻程式,讓使用者輸入日期(年月日,例如:20110131)後,可以轉成想要的輸出格式化成(1)
//	年/月/日(2)月/日/年(3)日/月/年三選一,而輸入非指定日期數字格式會顯示出提示訊息如圖
//	(提示:TestFormatter.java, Java API文件,判斷格式可用正規表示法)

	public boolean isValidDay(String date) {
		Date validDay = null;
		SimpleDateFormat vd = new SimpleDateFormat("yyyy-MM-dd");
		vd.setLenient(false);
		try {
			validDay = vd.parse(date);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		boolean str = true;

		while (str) {
			System.out.println("請輸入日期(年月日, 例如:20110131): ");

			Scanner sc = new Scanner(System.in);

			try {
				SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");
				sd.setLenient(false);
				Date date = sd.parse(sc.next());

				System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年: ");
				Scanner sc2 = new Scanner(System.in);

				int i = sc2.nextInt();
				switch (i) {
				case 1:
					System.out.printf("%1$tY/%1$tm/%1$td%n", date);
					break;
				case 2:
					System.out.printf("%1$tm/%1$td/%1$tY%n", date);
					break;
				case 3:
					System.out.printf("%1$td/%1$tm/%1$tY%n", date);
					break;
				}
				str = false;

			} catch (ParseException e) {
				System.out.println("日期格式不正確或沒有這個日期, 請再輸入一次!");
			}

		}
	}

}
