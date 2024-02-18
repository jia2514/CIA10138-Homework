package hw5;

public class Hw5RandAvg {

//	• 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:

	public void randAvg() {

		System.out.println("本次亂數結果:");

		int[] randAvg = new int[10];
		int index;
		int randomNum;
		int repeatNum = 0;
		double sum = 0;

		for (index = 0; index < randAvg.length;) {

			randomNum = (int) (Math.random() * 101);

			for (int j = 0; j <= index; j++) {

				if (randomNum == randAvg[j]) {
					repeatNum = randAvg[j];
					break;
				}
			}

			if (randomNum == repeatNum)
				continue;

			randAvg[index] = randomNum;
			System.out.print(randAvg[index] + " ");
			sum += randAvg[index];
			index++;

		}
		System.out.print('\n');
		System.out.println(sum / 10);

	}
	
	

	public static void main(String[] args) {
		Hw5RandAvg sa = new Hw5RandAvg();
		sa.randAvg();
	}

}
