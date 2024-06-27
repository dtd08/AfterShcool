package lang.wrapper.ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HearSeeCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<String> arr = new ArrayList<>();

        Set<String> nohear = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            nohear.add(sc.next()); // 듣지 못하는 사람의 이름을 hashset에 추가
        }

        for (int i = 0; i < M; i++) {
            String name = sc.next();
            for (int j = 0; j < N; j++) {
                if (nohear.contains(name)) {
                    arr.add(name);
                }
            }
        }

        System.out.println(arr.size());
        for (String name : arr) System.out.println(name);
        sc.close();
    }
}
