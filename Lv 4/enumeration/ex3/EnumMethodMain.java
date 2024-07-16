package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        // 모든 Enum (배열)반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        // 하나씩 출력
        for (Grade value : values) {
            // name : enum의 이름
            // ordinal : enum의 인덱스
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // String -> Enum 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 오버라이딩 가능  // name과 다른 점
    }
}
/*
    모든 열거형은 java.lang.Enum 클래스를 자동으로 상속받는다.
    따라서 해당 클래스가 제공하는 기능들을 사용할 수 있다.


    사용된 코드 설명
    1. Arrays.toString() : 배열의 참조값이 아니라 배열 내부의 값을 출력할 때 사용함
    2. values() : 모든 Enum 상수를 포함하는 배열을 반환함
    3. name() : Enum 상수의 이름을 문자열로 반환함
    4. ordinal() : Enum 상수의 선언 순서(0부터 시작)을 반환함
    5. toString() : Enum 상수의 이름을 문자열로 반환함.
                    name() 과 유사하지만, toString()은 직접 오버라이딩 할 수 있음

    주의!! - ordinal()은 가급적 사용하지 않는 것이 좋다. 확장성이 좋은 Enum 특성상 순서는 자주 변할 가능성이 높기 때문

*/