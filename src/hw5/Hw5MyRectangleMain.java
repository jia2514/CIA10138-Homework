package hw5;

public class Hw5MyRectangleMain {

//	• 請另外建立一個MyRectangleMain類別,此類別只有main方法
//	(1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
//	(2) 使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果

	public static void main(String[] args) {

		Hw5MyRectangle mrt1 = new Hw5MyRectangle();
		mrt1.setWidth(10);
		mrt1.setDepth(20);
		System.out.println(mrt1.getArea());

		Hw5MyRectangle mrt2 = new Hw5MyRectangle(10, 20);
		System.out.println(mrt2.getArea());

	}

}
