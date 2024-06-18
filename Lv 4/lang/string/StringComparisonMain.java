package lang.string;

public class StringComparisonMain {
    // 문자열 비교
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2)); // false
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); // 대소문자 구분 X  // true
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); // 사전순으로 순서 차
        System.out.println("'str1' compareTo 'str2': " + str1.compareTo(str2));
        System.out.println("'str1' compareToIgnoreCase 'str2': " + str1.compareToIgnoreCase(str2)); // 사전순으로 대소구분 없이 순서 차
        System.out.println("str1 starts whith 'hello': " + str1.startsWith("hello")); // 접두사 확인
        System.out.println("str1 ends whith 'Java!': " + str1.endsWith("Java!")); // 접미사 확인
    }
}
