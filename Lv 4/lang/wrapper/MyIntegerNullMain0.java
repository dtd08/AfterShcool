package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0)); // 0
        System.out.println(findValue(intArr, 1)); // 1
        System.out.println(findValue(intArr, 100)); // -1  // -1과 100이 구분되지 않음

    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1; // '없다'라는 것을 표현할 다른 방법이 없기 때문에 위처럼 헷갈리는 상황이 생김
    }
}
/*
    입력 값이 -1 이면 -1을 반환한다.
    그런데 배열에 없는 값인 100을 입력해도 같은 -1을 반환한다.
    입력 값이 -1 일 때를 생각해보면, 배열에 -1 값이 있어서 -1을 출력한 것인지, 값이 없어서 -1을 반환한 것인지 명확하지 않다.
*/