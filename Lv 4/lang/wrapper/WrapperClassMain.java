package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        // Integer newInteger = new Integer(10);  // 9 버전 이후로 지원하지 않는 문법
        Integer newInteger1 = 10;
        Integer newInteger2 = Integer.valueOf(10);

        Long newLong1 = 100L;
        Long newLong2 = Long.valueOf(10);
    }
}
