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

        int cnt = 0;
        int strike, ball;
        strike = ball = 0;
        boolean ch = true;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    if (k == i || k == j || i == j) continue;

                    for (int l = 0; l < N; l++) {
                        int x = arr[l][0] / 100;
                        int y = (arr[l][0] / 10) % 10;
                        int z = arr[l][0] % 10;

                        if(i == x) strike++;
                        else if (i == y || i == z) ball++;
                        if(j == y) strike++;
                        else if (j == x || j == z) ball++;
                        if(k == z) strike++;
                        else if (k == x || k == y) ball++;


                        if (strike != arr[i][1] || ball != arr[i][2]) {
                            ch = false;
                            break;
                        }
                    }
                    if (ch) cnt++;
                }
            }
        }

    }
}
// 삼중 for문으로 뽑은 숫자와 민혁이가 질문한 숫자를 비교해서 strike, ball을 체크하고
// 그 갯수를 입력받은 대답과 비교해서 같지 않으면 멈추고 다음 숫자, 같으면 모두 통과하고 cnt++ 하는 코드를 짜고 싶었다만..
// 시간과 지능의 부족으로 인해 코드를 완성하지 못하고 정답을 공개 당했다...
// 하지만 내가 생각한 알고리즘과 선생님께서 풀이해주신 코드가 비슷하기 때문에 선생님의 코드를 따라 마무리하는 것으로 만족하겠다.
