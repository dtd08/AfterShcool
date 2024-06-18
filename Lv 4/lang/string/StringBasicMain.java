package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello"; // 리터럴 방식
        String str2 = new String("hello"); // 객체 방식

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
// String 사용법에는 쌍따옴표 사용법, 객체 생성법이 있다.
// String은 클래스이다! int, boolean과 같은 기본형이 아니라 참조형이다.
// 따라서 str1 변수에는 String 인스턴스의 참조값만 들어갈 수 있다.
// 그러면 String str1 = "hello"; 문장은 뭔가 어색해 보인다.
// String str1 = "hello";  // 사용자가 입력한 코드
// String str1 = new String("hello");  // 자바가 자동으로 변환해주는 코드
// 그럼 두 선언방식의 차이점은 뭘까?
// 만약 쌍따옴표 방식을 쓰게 된다면 자바에서 String 풀 영역에서 메모리 영역을 공유한다. (객체 생성법은 공유 안함. 그냥 냅다 새로운 메모리에 넣음)
// 즉, String 또한 사이드 이펙트, 불변 객체와 연관이 있다!