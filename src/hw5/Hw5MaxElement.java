package hw5;

public class Hw5MaxElement {

//	• 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳,如圖:

	public int maxElement(int x[][]) {

		int maxElement = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				maxElement = (x[i][j] >= maxElement) ? x[i][j] : maxElement;
			}
		}

		return maxElement;
	}

	public double maxElement(double x[][]) {

		double maxElement = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				maxElement = (x[i][j] >= maxElement) ? x[i][j] : maxElement;
			}
		}

		return maxElement;
	}

	public static void main(String[] args) {

		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };

		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		Hw5MaxElement w = new Hw5MaxElement();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}

}
