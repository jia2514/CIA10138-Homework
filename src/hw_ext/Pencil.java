package hw_ext;

public class Pencil extends Pen {

	private double price;
	private String kind = "Pencil";
	
	public void write() {
		System.out.println("分類為" + kind);
		System.out.println("削鉛筆再寫");
	}
	
	public Pencil(String brand, double price) {
		super(brand, price);
		this.price = price * 0.8;
	}

	public double getPrice() {
		return price;
	}
	
}
