package hw5;

import java.util.Scanner;

public class Hw5Square {

//	• 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//	圖:

	
	public void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			;
			System.out.print('\n');
		}
		;

	}

	public static void main(String[] args) {

		System.out.println("請輸入寬與高");
		
		int width = 0;
		Scanner wd = new Scanner(System.in);
		if (wd.hasNextInt()) {
			width = wd.nextInt();
		}
		;

		int height = 0;
		Scanner ht = new Scanner(System.in);
		if (ht.hasNextInt()) {
			height = ht.nextInt();
		}
		;

		Hw5Square sq = new Hw5Square();
		sq.starSquare(width, height);

	}

}
