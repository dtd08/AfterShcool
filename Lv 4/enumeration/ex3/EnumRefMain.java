package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        
        // 동일한 클래스로부터 생성됨
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        // 참조값은 서로 다름
        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref BASIC = " + refValue(Grade.GOLD));
        System.out.println("ref BASIC = " + refValue(Grade.DIAMOND)); // BASIC, GOLD, DIAMOND 는 객체이다.
    }

    private static String refValue(Object grade) {
        // System.identityHashCode() : java가 관리하는 참조의 주소
        // Integer.toHexString() : 16진수로 변환
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
/*
    - 실행 결과를 보면 상수들이 열거형으로 선언한 타입이 Grade 타입을 사용하는 것을 확인할 수 있다.
    - 그리고 각각의 인스턴스도 서로 다른 것을 확인할 수있다.
    - 참고로 열거형은 toString()을 오버라이딩 하기 때문에 참조값을 직접 확인할 수 없다.
    - 참조값을 확인하기 위해 refValue()를 생성했다.
        - System.identityHashCode(grade) : 자바가 관리하는 객체의 참조값을 숫잣로 변환한다.
        - Integer.toHexString() : 숫자를 16진수로 변환, 우리가 일반적으로 생각하는 참조값(16진수)
    - 열거형도 클래스다. 열거형을 제공하기 위해서 제약이 추가된 클래스를 의미한다.
 */