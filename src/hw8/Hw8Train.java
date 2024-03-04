package hw8;

import java.util.Objects;

public class Hw8Train implements Comparable<Hw8Train> {

//	請設計一個Train類別,並包含以下屬性:
//		- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//		- 目的地 dest,型別為String - 票價 price,型別為double

	private int number;
	private String type;
	private String start;
	private String des;
	private Double price;

	public Hw8Train() {
	}

	public Hw8Train(int number, String type, String start, String des, Double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.des = des;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(des, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hw8Train other = (Hw8Train) obj;
		return Objects.equals(des, other.des) && number == other.number && Objects.equals(price, other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", des=" + des + ", price="
				+ price + "]";
	}

	@Override
	public int compareTo(Hw8Train train) {
		if (this.number < train.number) {
			return 1;
		} else if (this.number == train.number) {
			return 0;
		} else {
			return -1;
		}

	}
}
