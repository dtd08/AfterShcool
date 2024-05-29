package poly.ex.pay0;

public class KakaoPay {
	public boolean pay(int amount) {
		System.out.println("카카오페이 시스템과 연결합니다.");
		System.out.println(amount + "원 결제를 시도합니다.");
		return true;
	}
}

/* 
  결제수단 개발
  앞으로 계속 결제수단을 추가할 예정
  하지만 코드가 조금 개판임 <= 우리가 리팩토링할 예정
*/
