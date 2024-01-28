package hw3;

import java.util.Scanner;

public class Hw3LotteryAdv {

//	進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複	

	public void printArray(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " " + '\t');
			count++;
		}
		;
	}

	public static void main(String[] args) {

		System.out.println("阿文...請輸入你討厭哪個數字?");

		int hateNum = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			hateNum = sc.nextInt();
		}
		;

		int randomNum;
		int repeatNum = 0;
		int[] x = new int[6];

		for (int count = 0; count <= 5;) {

			randomNum = (int) (Math.random() * 49) + 1;

			if ((randomNum / 10 == hateNum) || (randomNum % 10 == hateNum))
				continue;

			for (int index = 0; index < x.length; index++) {
				if (randomNum == x[index]) {
					repeatNum = x[index];
					break;
				}
			}
			;

			if (randomNum == repeatNum)
				continue;

			x[count] = randomNum;
			count++;

		}
		;

		Hw3LotteryAdv arr = new Hw3LotteryAdv();

		arr.printArray(x);

	}

}
