package level4.generics;

public class GenericsMain1 {
    public static void main(String[] args) {
        // 기본 타입은 제네릭을 쓸 수 없음
        // wrapper 타입만 가능
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // 제네릭 기호
    // T : Type ( 어떤 타입이든 )
    // E : Element
    // K : Key
    // V : Value       -> Map에서 쓰임

    // 제네릭 메서드 생성
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
