package poly.sort;

import java.util.Scanner;

public class SortTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sort[] sorts = {new BubbleSort("BubbleSort"), new HeapSort("HeapSort"), new QuickSort("QuickSort")};
        int[] nums = new int[5];

        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("[1] : BubbleSort");
        System.out.println("[2] : HeapSort");
        System.out.println("[3] : QuickSort");

        int choice = sc.nextInt();

        selectedSort(choice, nums, sorts);
    }

    private static void selectedSort(int choice, int[] nums, Sort[] sorts) {
        choice--;
        sorts[choice].ascending(nums);
        sorts[choice].descending(nums);
        sorts[choice].description();
    }
}
