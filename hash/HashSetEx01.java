package hash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter1: ");
		int n = sc.nextInt();
		System.out.print("enter2: ");
		int target = sc.nextInt();
		
		System.out.print("enter3 : ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(arr, target));
		
		sc.close();
	}
	
	public static boolean solution(int[] arr, int target) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i : arr) {
			if(set.contains(target-i) && (target-i) != i) {
				return true;
			}
			set.add(i);
		}
		return false;
	}
}
