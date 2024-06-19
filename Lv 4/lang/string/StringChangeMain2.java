package lang.string;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String str = " Java Programming ";

        System.out.println("소문자로 변환: " + str.toLowerCase());
        System.out.println("대문자로 변환: " + str.toUpperCase());
        System.out.println("공백 제거(trim): " + str.trim()); // trim이 일반적으로 더 자주 쓰임
        System.out.println("공백 제거(strip): " + str.strip());
        System.out.println("앞 공백 제거: " + str.stripLeading());
        System.out.println("뒤 공백 제거: " + str.stripTrailing());
    }
}