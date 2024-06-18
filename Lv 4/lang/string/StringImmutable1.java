package lang.string;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java"); // String이 불변 객체가 아니었다면 사이드 이펙트가 일어날 수 있는 코드

        System.out.println("str = " + str); // String은 불변 객체이다.
    }
}
