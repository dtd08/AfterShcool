package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value;

        // Wrapper -> Primitive
        int unboxedValue = boxedValue;

        System.out.println("boxed value : " + boxedValue);
        System.out.println("unboxed value : " + unboxedValue);
    }
}
/*
   - 오토 박싱과 오토 언박싱은 컴파일럭 ㅏ개발자 대신 valueOf, xxxValue() 드으이 코드를 추가해주는 기능
   - 덕분에 기본형과 래퍼형을 서로 편하게 변환할 수 있다.
*/