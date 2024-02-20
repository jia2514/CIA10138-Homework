package hwext;

public class PenMain {

	public static void main(String[] args) {

		Pen[] pc = new Pen[4];
		pc[0] = new Pencil("PcOne", 15.0);
		pc[1] = new Pencil("PcTwo", 20.0);
		pc[2] = new InkBrush("IBOne", 30.0);
		pc[3] = new InkBrush("IBTwo", 40.0);

		for (int i = 0; i < pc.length; i++) {
			System.out.println("品牌: " + pc[i].getBrand());
			System.out.println("售價: " + pc[i].getPrice());
			pc[i].write();
			System.out.println("----------------------");
		}

	}

}
