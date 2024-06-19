package lang.string;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드
        String numString = String.valueOf(num); // 숫자 -> 문자열
        System.out.println("숫자의 문자열 값: " + numString);

        String boolString = String.valueOf(bool); // boolean -> 문자열
        System.out.println("논리형의 문자열 깂: " + boolString);

        String objString = String.valueOf(obj); // 객체 -> 문자열(주소값)
        System.out.println("객체의 문자열 깂: " + objString);

        String numString2 = num + "";
        System.out.println("빈 문자열 + 숫자형: " + numString2);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 바열로 전한: " + strCharArray);
        for(char c : strCharArray) {
            System.out.println(c);
        }
    }
}