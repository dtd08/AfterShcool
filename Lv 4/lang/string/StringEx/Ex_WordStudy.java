package lang.string.StringEx;

import java.util.Scanner;

public class Ex_WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] word = sc.nextLine().toLowerCase().toCharArray();
        int cnt = 0;
        int max = -1;
        char maxAl = ' ';

        for (int i = 0; i < word.length; i++) {
            for (int j = i; j < word.length; j++) {
                if (word[i] == word[j]) { cnt++; }
            }
            System.out.println(word[i] + ": " + cnt);
            if (cnt > max) {
                max = cnt;
                maxAl = (char)(word[i]-32);
            } else if (cnt == max) {
                maxAl = '?';
                break;
            }
            cnt = 0;
        }
        System.out.println(String.valueOf(maxAl));

        sc.close();
    }
}