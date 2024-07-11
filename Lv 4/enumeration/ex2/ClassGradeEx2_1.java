package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
/*
    참조값을 비교하는 것이기 때문에 문자열처럼 오타나 유효하지 않는 값이 들어갈 걱정이 덜하다.
 */