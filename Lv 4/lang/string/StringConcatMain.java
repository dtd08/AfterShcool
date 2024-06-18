package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b); // 문자 합치기  // 우리가 + 연산자를 쓸 때 자바가 자동으로 concat을 이용해 문자를 연결해 줌
        String result2 = a + b; // 하지만 우리는 문자열 연산자를 쓰죠?  // 이는 자바가 사용자가 자주 쓰는 기능을 쓰기 편하도록 해준 표현식이다. (concat이랑 런타임은 별로 차이 안남)

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
