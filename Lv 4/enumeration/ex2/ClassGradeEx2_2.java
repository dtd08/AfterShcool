package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        // ClassGrade newClassGrade = new ClassGrade();  
        // ClassGrade의 인스턴스를 새로 생성할 수 있는 문제가 있다.
        // 이는 생성자를 private 처리해서 막아준다.  // 이것까지 해야지 완전한 타입 안전 열거형 패턴이 완성된다.

        // int result = discountService.discount(newClassGrade, price);
        // System.out.println("newClassGrade 등급의 할인 금액 = " + result);
    }
}
/*
    타입 안전 열거형 패턴(Type-Safe Enum Patten)

    장점
    - 타입 안정성 향상
        : 정해진 객체만 사용할 수 있기 때문에 잘못된 값을 입력하는 문제를 근본적으로 방지할 수 있다.
    - 데이터 일관성
        : 정해진 객체만 사용하므로 데이터의 일관성이 보장된다.

    단점
    - 많은 코드를 작성해야 한다.
    - 생성자를 private 처리 해줘야 한다.
    (결론, 단점은 '귀찮다')
 */