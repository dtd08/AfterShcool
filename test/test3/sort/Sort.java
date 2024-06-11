package poly.sort;

public interface Sort {
    void ascending(int[] arr);
    void descending(int[] arr);

    // 갖다 쓸거면 쓰고 아니면 원래처럼 너가 구현해~~
    default void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
    }
}
