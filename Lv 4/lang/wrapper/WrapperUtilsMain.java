package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 숫자, 래퍼 객체 변환
        Integer i2 = Integer.valueOf("10"); // 문자열, 래퍼 객체 변환
        int intValue = Integer.valueOf("10"); // 문자열 전용, 기본형 변환

        // 비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult: " + compareResult);


        // 산술 연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
/*
    valueOf() : 래퍼 타입 반환. 숫자, 문자열 모두 사용함
    parseInt() : 문자의 기본형 반환
    compareTo() : 내 값과 인수로 넘어온 값을 비교한다. 내 값이 크면 1, 같으면 0, 작으면 -1을 반환한다.
    Integer.sum(), Integer.min(), Integer.max(): static 메서드이다. 간단한 덧셈, 작은 값, 큰 값을 연산할 수 있다.
*/