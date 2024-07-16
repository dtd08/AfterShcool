package enumeration.ref1;

public class ClassGradeRefMain {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);

        // if문이 없어도 잘 나옴
        System.out.println("basic = " + basic);
    }
}
