package hw4;

import java.util.Arrays;

public class Hw4HighestGrade {

//	班上有8位同學,他們進行了6次考試結果如下:
//	請算出每位同學考最高分的次數
//	(提示:二維陣列)

	public void getHighestGrade(int[][] grade) {
		for (int i = 0; i < grade.length; i++) {
			Arrays.sort(grade[i]);
			int j = grade[i].length - 1;
			System.out.println((i + 1) + "號同學最高分 = " + grade[i][j]);
		}
		;

	}

	public static void main(String[] args) {

		int[][] totalGrades = { { 10, 37, 100, 77, 98, 90 }, { 35, 75, 70, 79, 70, 80 }, { 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 75 }, { 90, 64, 75, 60, 75, 50 }, { 85, 75, 70, 75, 90, 20 },
				{ 75, 70, 79, 85, 89, 99 }, { 70, 95, 90, 89, 90, 75 } };

		Hw4HighestGrade hiGd = new Hw4HighestGrade();
		hiGd.getHighestGrade(totalGrades);

	}

}
