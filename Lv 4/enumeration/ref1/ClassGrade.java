package enumeration.ref1;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    // 타입 안전 열거형을 만들 땐 엉뚱한 값이 삽입되는걸 막기 위해 꼭 생성자는 private로!
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
// 상수를 정의할 때 각각의 등급에 따른 할인율이 생김