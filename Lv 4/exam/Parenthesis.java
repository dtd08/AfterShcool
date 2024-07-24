package seoyoung_exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        ArrayList<Character> parenthesis = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            int j = 0;
            parenthesis.clear();

            for (char c : str.toCharArray()) {

                if (j != 0 && c == ')' && parenthesis.get(j-1) != c) {
                    parenthesis.remove(--j);
                }
                else {
                    parenthesis.add(c);
                    j++;
                }
            }

            if (parenthesis.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
