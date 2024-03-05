package hw9;

public class Hw9BigEater implements Runnable {

//	• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	競賽過程。
//	• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//	Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//	• 參考範例:CounterRunnable.java
//	• 需留意主執行緒執行順序

	int count = 1;

	private String eater;

	public Hw9BigEater() {

	}

	public Hw9BigEater(String eater) {
		this.eater = eater;
	}

	public String getEater() {
		return eater;
	}

	public void setEater(String eater) {
		this.eater = eater;
	}

	@Override
	public void run() {

		while (count <= 10) {
			System.out.println(this.eater + "吃第" + count + "碗飯");
			count++;
			try {
				Thread.sleep((int) (Math.random() * 2501 + 500));
			} catch (Exception e) {
			}
		}
		System.out.println(this.eater + "吃完了");
	}

	public static void main(String[] args) {

		Hw9BigEater e1 = new Hw9BigEater("饅頭人");
		Thread t1 = new Thread(e1);
		Hw9BigEater e2 = new Hw9BigEater("詹姆士");
		Thread t2 = new Thread(e2);

		System.out.println("-----大胃王快食比賽開始!-----");
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("-----大胃王快食比賽結束!-----");

	}

}