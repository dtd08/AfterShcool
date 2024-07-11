package enumeration.ex1;

public class DiscountService {

    public int discount(String grade, int price) {
        double discountPrice = 0;

        if (grade.equals(StringGrade.BASIC)) {
            discountPrice = 0.1;
        }
        else if (grade.equals(StringGrade.GOLD)) {
            discountPrice = 0.2;
        }
        else if (grade.equals(StringGrade.DIAMOND)) {
            discountPrice = 0.3;
        }
        else System.out.println("잘못된 입력값입니다.");

        return (int)(price * discountPrice);
    }
}