package enumeration.ex2;

public class ClassGrade { // 클래스 인스턴스 이용
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    private ClassGrade() {} // 위의 인스턴스들은 같은 클래스여서 막히지 않는다.
}
/*
    앞서 본 String 처럼 아무 문자열이나 다 사용할 수 있는 것이 아니고,
    우리가 나열한 BASIC, GOLD, DIAMOND 만 사용하게 할 것이다.
    이런 것을 >>타입 안전 열거형 패턴<< 이라 한다. (= Enumeration, Enum)
 */