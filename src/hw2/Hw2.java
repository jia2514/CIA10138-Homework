package hw2;

import javax.xml.stream.XMLInputFactory;

public class Hw2 {

	public static void main(String[] args) {

		System.out.println("請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)");

		int sum = 0;
		for (int i1 = 2; i1 <= 1000; i1 += 2) {
			sum += i1;
		}
		System.out.println("偶數和 = " + sum);
		;

		System.out.println("======================================================");

		System.out.println("請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)");

		int multi = 1;
		for (int i2 = 1; i2 <= 10; i2++) {
			multi *= i2;
		}
		System.out.println("連乘積 = " + multi);
		;

		System.out.println("======================================================");

		System.out.println("請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)");

		multi = 1;
		int i3 = 1;
		while (i3 <= 10) {
			multi *= i3;
			i3++;
		}
		;
		System.out.println("連乘積 = " + multi);
		;

		System.out.println("======================================================");

		System.out.println("請設計一隻Java程式,輸出結果為以下: ");

		for (int i4 = 1; i4 <= 10; i4++) {
			System.out.print(i4 * i4 + " ");
		}
		;
		System.out.print("\n");

		System.out.println("======================================================");

		System.out.println("阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?");

		for (int i5 = 1; i5 <= 49; i5++) {
			if (i5 / 10 == 4)
				continue;
			if (i5 % 10 == 4)
				continue;
			System.out.print(i5 + " ");
		}
		;
		System.out.print("\n");

		System.out.println("======================================================");

		System.out.println("請設計一隻Java程式,輸出結果為以下:");
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		int i6, j6;
		for (i6 = 10; i6 >= 1; i6--) {
			for (j6 = 1; j6 <= i6; j6++) {
				System.out.print(j6 + " ");
			}
			;
			System.out.print("\n");
		}
		;

		System.out.println("======================================================");

		System.out.println("請設計一隻Java程式,輸出結果為以下:");
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF

		int i7, j7;
		for (i7 = 1; i7 <= 6; i7++) {
			for (j7 = 1; j7 <= i7; j7++) {
				switch (i7) {
				case 1:
					System.out.print('A');
					break;
				case 2:
					System.out.print('B');
					break;
				case 3:
					System.out.print('C');
					break;
				case 4:
					System.out.print('D');
					break;
				case 5:
					System.out.print('E');
					break;
				case 6:
					System.out.print('F');
					break;

				}
				;

//				if (i7 == 1) {
//					System.out.print('A');
//				}
//				;
//				if (i7 == 2) {
//					System.out.print('B');
//				}
//				;
//				if (i7 == 3) {
//					System.out.print('C');
//				}
//				;
//				if (i7 == 4) {
//					System.out.print('D');
//				}
//				;
//				if (i7 == 5) {
//					System.out.print('E');
//				}
//				;
//				if (i7 == 6) {
//					System.out.print('F');
//				}
//				;
			}
			;
			System.out.print("\n");
		}
		;

	}

}
