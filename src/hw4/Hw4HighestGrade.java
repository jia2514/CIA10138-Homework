package hw4;

public class Hw4HighestGrade {

//	班上有8位同學,他們進行了6次考試結果如下:
//	請算出每位同學考最高分的次數
//	(提示:二維陣列)

	public static void main(String[] args) {

		int[][] totalGrades = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		
		int maxGrade;
		int maxStudent;
		int[] highestTimes = new int[8];

		for (int i = 0; i < totalGrades.length; i++) {

			maxGrade = 0;
			maxStudent = 0;

			for (int j = 0; j < totalGrades[i].length; j++) {

				if (totalGrades[i][j] > maxGrade) {
					maxGrade = totalGrades[i][j];
					maxStudent = j;
				}

			}
			highestTimes[maxStudent] += 1;

		}

		for (int k = 0; k < highestTimes.length; k++) {
			System.out.println((k + 1) + "號同學: " + (highestTimes[k]) + "次");
		}

	}

}
