package hw3;

import java.util.Scanner;

public class Hw3GuessNumberAdv {

//進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案
	
	public static void main(String[] args) {

		int num;
		num = (int) (Math.random() * 101);

		System.out.println("開始比大小吧!");

		for (;;) {
			int i = 0;
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
			}
			;

			if (i > num) {
				System.out.println("大於");
				continue;
			}
			;
			if (i < num) {
				System.out.println("小於");
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
