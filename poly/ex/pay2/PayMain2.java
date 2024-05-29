package poly.ex.pay2;

import java.util.Scanner;

public class PayMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PayService payService = new PayService();

		String option = "";
		int amount = 0;
		
		while(true) {
			System.out.println("결제 수단을 입력하세요: ");
			option = sc.next();
			
			if(option.equals("exit")) {
				break;
			}
			
			System.out.println("결제 금액을 입력하세요: ");
			amount = sc.nextInt();
			
			payService.proccessPay(option, amount);
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
