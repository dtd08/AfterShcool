package lang.string.stringEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_SaltBoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sNow = sc.nextLine().split(":");
        String[] sBoom = sc.nextLine().split(":");

        int boom[] = new int[3];
        int remain, cycle;
        for (int i = 0; i < sNow.length; i++) {
            remain = Integer.parseInt(sBoom[i]) - Integer.parseInt(sNow[i]);
            cycle = 24;
            if (i > 0) cycle = 60;
            boom[i] = (cycle + remain) % cycle;
            if (i!=0 && remain < 0) boom[i-1]--;
        }

        for (int i=0; i< boom.length; i++) {
            if (i != 2) {
                if (boom[i] < 10) System.out.print("0" + boom[i] + ":");
                else System.out.print(boom[i] + ":");
            } else {
                if (boom[i] < 10) System.out.print("0" + boom[i]);
                else System.out.print(boom[i]);
            }
        }
    }
}
