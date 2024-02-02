package hw4;

import java.util.Scanner;

public class Hw4BorrowMoney {

//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下:
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//		(提示:Scanner,二維陣列)

	public void lender(int borrowMoney, int[][] colleague) {
		int i = 1;
		int count = 0;
		
		System.out.print("員工編號: ");
		
		for (int j = 0; j < colleague[i].length; j++) {
			if (colleague[i][j] >= borrowMoney) {
				System.out.print(colleague[i - 1][j] + " ");
				count++;
			} else {
				continue;
			}
			;
		}
		;

		System.out.print("共" + count + "人!");

	};

	public static void main(String[] args) {

		int[][] colleague = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		System.out.println("阿文, 你要借多少錢?");
		
		int borrowmoney = 0;
		Scanner bm = new Scanner(System.in);
		if (bm.hasNextInt()) {
			borrowmoney = bm.nextInt();
		}
		;

		Hw4BorrowMoney ld = new Hw4BorrowMoney();
		ld.lender(borrowmoney, colleague);

	}

}
