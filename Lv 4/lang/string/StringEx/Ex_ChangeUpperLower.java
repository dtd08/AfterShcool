package lang.string.StringEx;

import java.util.Scanner;

public class Ex_ChangeUpperLower {
    public static void main(String[] args) {
        // 영어 소문자 - 대문자 아스키코드 = 32
        Scanner sc = new Scanner(System.in);
        char[] word = sc.next().toCharArray();

        for (int i = 0; i < word.length; i++) {
            if (word[i] >= 'a' && word[i] <= 'z') {
                word[i] -= 32;
            } else word[i] += 32;
        }
        System.out.println(word);

        sc.close();
    }
}
