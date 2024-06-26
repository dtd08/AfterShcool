package lang.wrapper.ex;

import java.util.Scanner;

public class EatOrGetEaten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] cnt = new int[T];
        int[] groupA;
        int[] groupB;
        for (int i = 0; i < T; i++) {
            groupA = new int[sc.nextInt()];
            groupB = new int[sc.nextInt()];

            for (int j = 0; j < groupA.length; j++) {
                groupA[j] = sc.nextInt();
            }

            for (int j = 0; j < groupB.length; j++) {
                groupB[j] = sc.nextInt();
            }

            for (int j = 0; j < groupA.length; j++) {
                for (int k = 0; k < groupB.length; k++) {
                    if (groupA[j] <= groupB[k]) continue;
                    cnt[i]++;
                }
            }
            System.out.println(cnt[i]);
        }
        for(int i : cnt) {
            System.out.println(i);
        }
    }
}
