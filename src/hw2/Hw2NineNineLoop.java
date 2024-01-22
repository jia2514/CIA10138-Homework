package hw2;

public class Hw2NineNineLoop {

	public static void main(String[] args) {

		System.out.println("請建立一個TestNineNine.java程式,可輸出九九乘法表");
		System.out.println("使用for迴圈 + while迴圈");

		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(j + "x" + i + "=" + j * i + "\t");
				j++;
			}
			;
			System.out.print('\n');
		}
		;

		System.out.println("======================================================");
		System.out.println("使用for迴圈 + do while迴圈");

		for (i = 1; i <= 9; i++) {
			j = 1;
			do {
				System.out.print(j + "x" + i + "=" + j * i + "\t");
				j++;
			} while (j <= 9);
			;
			System.out.print('\n');
		}
		;

		System.out.println("======================================================");
		System.out.println("使用while迴圈 + do while迴圈");

		i = 1;
		while (i <= 9) {
			j = 1;
			do {
				System.out.print(j + "x" + i + "=" + j * i + "\t");
				j++;
			} while (j <= 9);
			;
			System.out.print('\n');
			i++;
		}
		;

	}

}
