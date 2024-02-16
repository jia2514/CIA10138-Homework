package hw6;

public class Hw6Calculator {

//	請設計三個類別Calculator.java,CalException.java與CalTest.java,在Calculator.java裡有個自訂
//	方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。 CalTest.java執行後,使用者可
//	以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:
//	1. x與y同時為0,(產生自訂的CalException例外物件)
//	2. y為負值,而導致x的y次方結果不為整數
//	3. x與y皆正確情況下,會顯示運算後結果

	private int x;
	private int y;

	public Hw6Calculator() {
	};

	public Hw6Calculator(int x, int y) throws Hw6CalException {
		this.x = x;
		setY(y);
	};

	public void setX(int x) {
		this.x = x;
	};

	public void setY(int y) throws Hw6CalException {
		if (x == 0 && y == 0)
			throw new Hw6CalException("x與y同時為0");
		else if (y < 0)
			throw new Hw6CalException("y為負值,而導致x的y次方結果不為整數");
		else
			this.y = y;
	};

	public int getX() {
		return x;
	};

	public int getY() {
		return y;
	};

	public void powerXY() {
		System.out.println(Math.pow(x, y));
	};

}
