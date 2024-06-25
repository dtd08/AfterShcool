package lang.wrapper.ex;

import java.util.Arrays;
import java.util.Scanner;

public class NumBassBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[N][3];
        System.out.println(N + "번 반복");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(sc.nextLine().split(" ")[j]);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
