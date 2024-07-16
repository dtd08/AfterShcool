package enumeration.ref2;

public class DiscountService {

    // 캡슐화가 제대로 되지 않음
    // 계산 방법도 공개되어있고, enum의 필드값도 보임
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
