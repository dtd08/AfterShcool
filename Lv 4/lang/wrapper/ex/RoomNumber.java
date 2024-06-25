package lang.wrapper.ex;

import java.util.Scanner;

public class RoomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solution(sc.nextLong()));
    }

    private static int solution(Long value) {
        char[] nums = String.valueOf(value).toCharArray();
        int[] needNum = new int[8];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '9') {
                needNum[5]++;
            } else {
                needNum[nums[i] - '1']++;
            }
        }
        needNum[5] = (needNum[5] / 2) + (needNum[5] % 2);

        for (int i : needNum) {
            max = Math.max(max, i);
        }

        return max;
    }
}
