package enumeration.ex3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;
        
        // enum switch 변경 가능
        if (grade == Grade.BASIC) discountPercent = 10;
        else if (grade == Grade.GOLD) discountPercent = 20;
        else if (grade == Grade.DIAMOND) discountPercent = 30;
        else discountPercent = 1;

        return price * discountPercent / 100;
    }
}
