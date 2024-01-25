package hw3;

import java.util.Scanner;

public class Hw3Lottery {

//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數,如圖:

	public int[][] getArray(int x[]) {
		int[][] array = new int[8][6];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = x[(i * 6 + j)];
			}
			;
		}
		;
		return array;
	}

	public void printArray(int[][] array) {
		int count = 0;
		int numA = 1;

		for (int i = 0; i < array.length; i++) {

			if (numA == 0) {
				break;
			}

			for (int j = 0; j < array[i].length; j++) {

				numA = array[i][j];

				if (numA == 0) {
					System.out.print("總共有" + count + "數字可選\n");
					break;
				}
				System.out.print(numA + " " + '\t');
				count++;

			}
			;

			System.out.print('\n');

		}
		;
	}

	public static void main(String[] args) {

		System.out.println("阿文...請輸入你討厭哪個數字?");

		int i = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			i = sc.nextInt();
		}
		;

		Hw3Lottery arr = new Hw3Lottery();

		int index = 0;
		int[] x = new int[50];

		for (int num = 1; num <= 49; num++) {
			if ((num / 10 == i) || (num % 10 == i))
				continue;
			x[index] = num;
			index++;
		}
		;

		int[][] y = arr.getArray(x);
		arr.printArray(y);

	}

}
