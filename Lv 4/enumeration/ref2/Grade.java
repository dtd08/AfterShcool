package enumeration.ref2;

public enum Grade {
    BASIC(10)
    , GOLD(20)
    , DIAMOND(30);

    private final int discountPercent;

    // enum 생성자는 무조건 private
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
