package level4.generics;

public class GenericsMain {
    public static void main(String[] args) {
        int[] iArray = {1,2,3,4,5};
        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);
    }

    // int형 배열의 값을 하나씩 출력하는 코드
    private static void printIntArray(int[] iArray) {
        for (int i: iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // double형 배열의 값을 하나씩 출력하는 코드
    // 로직은 위 메서드와 같은데 인자의 타입이 달라 새로 만들어야 함
    private static void printDoubleArray(double[] dArray) {
        for (double d: dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    // 문자열 배열의 값을 하나씩 출력하는 코드
    // 역시나 인자의 타입이 달라 새로 만들어주었다.
    private static void printStringArray(String[] sArray) {
        for (String s: sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // 코드가 중복될 뿐만 아니라 유지보수도 힘듦
}
