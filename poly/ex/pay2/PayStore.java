package poly.ex.pay2;

public abstract class PayStore {
	// 결제 수단이 추가되거나 삭제되는 변경이 일어나면 수정하는 부분
	// 데이터를 관리하는 부분만 따로 빼서 역할을 분담하고
	// 나머지의 코드 수정이 일어나지 않도록 함
	public static Pay findPay(String option) {
		if(option.equals("kakao")) {
			return new KakaoPay(); 
		} else if(option.equals("naver")) {
			return new NaverPay();
		} else {
			// null을 리턴할 경우 시스템이 불안정해지므로(데이터끼리의 연산이 불가해짐)
			// 실패했을 경우에 return할 새 클래스를 만들어줌
			return new DefaultPay();
		}
	}
}
