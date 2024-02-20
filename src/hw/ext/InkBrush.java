package hw.ext;

public class InkBrush extends Pen {

	private double price;
	private String kind = "InkBrush";

	public void write() {
		System.out.println("分類為" + kind);
		System.out.println("沾墨汁再寫");
	}

	public InkBrush(String brand, double price) {
		super(brand, price);
		this.price = price * 0.9;
	}

	public double getPrice() {
		return price;
	}

}
