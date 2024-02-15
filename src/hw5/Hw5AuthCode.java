package hw5;

public class Hw5AuthCode {

//	• 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:

	public void genAuthCode() {

		int count = 0;

		while (count != 7) {
			int randomNum = (int) (Math.random() * 123);

			if (randomNum >= 0 && randomNum <= 9) {
				count++;
				System.out.print(randomNum);

			} else if ((randomNum >= 65 && randomNum <= 90) || (randomNum >= 97 && randomNum <= 122)) {
				count++;
				System.out.print((char) randomNum);
			} else {
				continue;
			}

		}

	}

	public static void main(String[] Args) {

		System.out.println("本次隨機產生驗證碼為:");

		Hw5AuthCode ac = new Hw5AuthCode();

		ac.genAuthCode();

	}

}
