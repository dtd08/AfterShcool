package enumeration.ex2;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        double discountPrice = 0;

        if (classGrade == ClassGrade.BASIC) { // 참조값 확인
            discountPrice = 0.1;
        }
        else if (classGrade == ClassGrade.GOLD) {
            discountPrice = 0.2;
        }
        else if (classGrade == ClassGrade.DIAMOND) {
            discountPrice = 0.3;
        }
        else System.out.println("잘못된 입력값입니다.");

        return (int)(price * discountPrice);
    }
}
