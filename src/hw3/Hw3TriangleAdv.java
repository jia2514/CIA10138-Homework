package hw3;

import java.util.Scanner;

public class Hw3TriangleAdv {

//	進階功能:加入直角三角形的判斷

	public static void main(String[] args) {

		System.out.println("請輸入三個整數:");

		int[] x = new int[3];

		for (int putInCount = 0; putInCount < x.length; putInCount++) {
			int i = 0;
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
			}
			;
			x[putInCount] = i;
		}
		;

		if ((x[0] <= 0 || x[1] <= 0 || x[2] <= 0) || ((x[0] + x[1]) <= x[2]) || ((x[1] + x[2]) <= x[0])
				|| ((x[0] + x[2]) <= x[1])) {
			System.out.println("不是三角形");
		} else if (x[0] == x[1] && x[1] == x[2]) {
			System.out.println("正三角形");
		} else if (x[0] * x[0] + x[1] * x[1] == x[2] * x[2] || x[2] * x[2] + x[1] * x[1] == x[0] * x[0]
				|| x[0] * x[0] + x[2] * x[2] == x[1] * x[1]) {
			System.out.println("直角三角形");
		} else if ((x[0] == x[1] && x[1] != x[2]) || (x[1] == x[2] && x[0] != x[1]) || (x[0] == x[2] && x[1] != x[0])) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}
		;

	}

}
