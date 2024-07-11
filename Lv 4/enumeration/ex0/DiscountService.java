package enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price) {
        double discountPrice = 0;

        if (grade.equals("BASIC")) discountPrice = 0.1;
        else if (grade.equals("GOLD")) discountPrice = 0.2;
        else if (grade.equals("DIAMOND")) discountPrice = 0.3;
        else System.out.println("잘못된 입력값");

        return (int)(price * discountPrice);
    }
}

/*
    고객을 3등급으로 나누고, 상품 구매 시 등급별로 할인을 적용한다. 할인 시 소수점 이하는 버린다.

    1. BASIC : 10% 할인
    2. GOLD : 20% 할인
    3. DIAMOND : 30% 할인

    회원 등급과 가격을 입력하면 할인 금액을 계산해주는 클래스를 만들어보자.
    예를 들어 GOLD, 10000 을 입력하면 할인 대상인 2000 을 반환한다.
 */
