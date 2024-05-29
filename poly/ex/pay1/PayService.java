package poly.ex.pay1;

public class PayService {
	private Pay[] pays = {new KakaoPay(), new NaverPay()};

	public boolean proccessPay(String option, int amount) {

		System.out.println("결제를 시작합니다: option: " + option + ", amount: " + amount);

		for(Pay pay : pays) {
			if(option.equals(pay.getName())) {
				pay.pay(amount);
				System.out.println("결제를 성공했습니다.");
				return true;
			}
		}

		System.out.println("결제 수단이 없습니다.");
		System.out.println("결제에 실패했습니다.");
		return false;
	}
}
