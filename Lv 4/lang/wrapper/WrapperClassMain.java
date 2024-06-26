package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);  // 9 버전 이후로 지원하지 않는 문법
        Integer integerObj = Integer.valueOf(10);

        Long longObj = 100L;
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);


        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue(); // 객체 안에 있는 값 읽어오기
        System.out.println("intValue = " + intValue);

        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);


        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj)); // 주소값 비교
        System.out.println("equals() : " + (newInteger.equals(integerObj))); // 안에 있는 값 비교
    }
}

/*
    래퍼 클래스 생성 = 박싱(Boxing)
    - 기본형을 래퍼 클래스로 변경하는 것을 마치 박스에 물건을 넣는 것 같다 해서 박싱(Boxing)이라고 한다.
    - new Integer(10)은 사용하면 안된다. 현재까지 작동은 하지만, 향후 제거될 예정이다.
    - 대신에 Integer.valueOf(10)을 사용하면 된다.
        - 내부에서 new Integer(10)을 사용해서 객체를 생성하고 돌려준다.
    - 추가로 Integer.valueOf() 에는 성능 최적화 기능이 있다.
        - 개발자들이 주로 사용하는 -128 ~ 127 범위의 Integer 클래스를 미리 생성해준다.
        - 해당 범위의 값을 조회하면 미리 생성된 Integer 객체를 반환한다.
        - 해당 범위의 값이 없으면 new Integer()를 호출한다.
            - 마치 문자열 풀과 비슷하게 자주 사용하는 숫자를 미리 생성해두고 재사용한다.

    intValue() = 언박싱(Unboxing)
    - 래퍼 클래스에 들어있는 기본형 값을 다시 꺼내는 메서드이다.
    - 박스에 들어있는 물건을 꺼내는 것 같다고 해서 언박싱(Unboxing)이라 한다.

    비교는 equals() 사용
    - 래퍼 클래스는 객체이기 때문에 == 비교를 하면 인스턴스의 참조값을 비교한다.
    - 래퍼 클래스는 내부 값을 비교하도록 equals()를 재정의해두었다. 따라서 값을 비교하여면 equals()를 사용해야 한다.

    참고로 래퍼 클래스는 객체를 그대로 출력하도 내부에 있는 값을 문자로 출력하도록 toString()도 재정의했다.
*/