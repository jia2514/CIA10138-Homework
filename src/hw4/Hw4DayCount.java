package hw4;

import java.text.SimpleDateFormat;
import java.util.*;
// import java.util.Scanner;
// import java.util.Date;

public class Hw4DayCount {

//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

	public int totalDayCount(int[] dateArray) {
		int totalDay = dateArray[2];
		int monthDayArray[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int mon = 0; mon < (dateArray[1] - 1); mon++) {
			totalDay += monthDayArray[mon];
		}
		;
		if (dateArray[0] % 4 == 0 && dateArray[1] > 2) {
			totalDay += 1;
		}
		;
		return totalDay;

	}

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

		System.out.println("請輸入年份(yyyy)");
		int year = 0;
		Scanner yr = new Scanner(System.in);
		if (yr.hasNextInt()) {
			year = yr.nextInt();
		}
		;

		System.out.println("請輸入月份(MM)");
		int month = 0;
		Scanner mon = new Scanner(System.in);
		if (mon.hasNextInt()) {
			month = mon.nextInt();
		}
		;

		System.out.println("請輸入日期(dd)");
		int day = 0;
		Scanner da = new Scanner(System.in);
		if (da.hasNextInt()) {
			day = da.nextInt();
		}
		;

		String date = year + "-" + month + "-" + day;
		int[] dateArray = { year, month, day };

		Hw4DayCount ivd = new Hw4DayCount();
		if (ivd.isValidDay(date) == false) {
			System.out.println("無效日期, 請輸入有效日期");
		} else {
			System.out.println("輸入的日期為該年第" + ivd.totalDayCount(dateArray) + "天");
		}
		;

	}
}
