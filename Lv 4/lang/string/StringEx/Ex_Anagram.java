package lang.string.StringEx;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] word1 = sc.next().toCharArray();
        char[] word2 = sc.next().toCharArray();

        int cnt = word1.length + word2.length;

        for (int i = 0; i < word1.length; i++) {
            for (int j = 0; j < word2.length; j++) {
                if (word1[i] - word2[j] == 0) {
                    cnt-=2;
                    word1[i] = '_';
                    word2[j] = '@';
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
