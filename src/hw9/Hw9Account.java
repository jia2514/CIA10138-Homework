package hw9;

//熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領

//錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//1000元,寫一個Java程式模擬匯款10次與提款10次的情
//形。
//
//• 參考範例:TestWaitNotify.java

class Account {
	private int account = 0;

	synchronized public void deposit(int money) {
		while (account >= 3000) {
			System.out.println("媽媽看到餘額在3000以上, 停止匯款");
			System.out.println("熊大被媽媽告知帳戶已經有錢");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		account += money;
		System.out.println("媽媽存了" + money + ", 帳戶共有: " + account);
		notify();
	}

	synchronized public void withdraw(int money) {
		while (account < money) {
			System.out.println("熊大看到帳戶沒錢, 暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		account -= money;
		System.out.println("熊大領了" + money + ", 帳戶共有: " + account);
		if (account < 2000)
			System.out.println("熊大看到餘額在2000以下, 要求匯款");
		notify();
	}
}


class Mom extends Thread {
	Account account;
	public Mom(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++)
			account.deposit(2000);
	}
}

class Child extends Thread {
	Account account;
	public Child(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++)
			account.withdraw(1000);
	}
}


public class Hw9Account {
	public static void main(String[] args) {
		Account account = new Account();
		Mom mom = new Mom(account);
		Child child = new Child(account);
		mom.start();
		child.start();
	}
}
