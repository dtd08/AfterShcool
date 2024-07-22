package enumeration.test;

import java.util.*;
import java.util.stream.Collectors;

public class Yosepuseu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int N = sc.nextInt(); // 원래 총 인원수
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < K; j++) {
                q.add(q.poll());
            }
            ans[i] = q.poll();
        }

        // 단순하게 출력하기
        System.out.print("<");
        for (int i = 0; i < ans.length; i++) {
            if (i == ans.length-1) System.out.print(ans[i]);
            else System.out.print(ans[i] + ", ");
        }
        System.out.print(">");

        System.out.println();

        // 간지나게 출력하기
        // stream은 공부하면 좋음 (다만 좀 방대함)
        System.out.print("<" + Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + ">");
    }
}
