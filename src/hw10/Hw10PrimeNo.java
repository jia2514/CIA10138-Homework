package hw10;

import java.util.Set;
import java.util.TreeSet;

public class Hw10PrimeNo {

//	• 請設計一隻程式,用亂數產生5個介於1~100之間的整數,而輸出結果可以判斷出這5個整數為是否
//	為質數 (提示:Math類別)

	public void primeNo(int num) {
		int count = 0;
		if (num == 1) {
			System.out.println(num + "不是質數也不是合數");
		} else {
			for (int i = 1; i <= Math.sqrt(num); i++) {
				if (num % i == 0)
					count += 1;
			}
			if (count == 1) {
				System.out.println(num + "是質數");
			} else {
				System.out.println(num + "不是質數");
			}
		}
	}

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		while (set.size() < 5) {
			set.add(new Integer((int) (Math.random() * 100 + 1)));
		}

		Hw10PrimeNo cal = new Hw10PrimeNo();

		for (Object obj : set) {
			cal.primeNo((int) obj);
		}

	}

}
