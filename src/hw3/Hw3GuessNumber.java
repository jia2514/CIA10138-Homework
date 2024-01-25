package hw3;

import java.util.Scanner;

public class Hw3GuessNumber {

//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:

	public static void main(String[] args) {

		int num;
		num = (int) (Math.random() * 10);

		System.out.println("開始猜數字吧!");

		for (;;) {
			int i = 0;
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
			}
			;

			if (i != num) {
				System.out.println("猜錯囉");
				continue;
			}
			;
			if (i == num) {
				System.out.println("答對了, 答案就是" + num);
				break;
			}
			;
		}

	}

}
