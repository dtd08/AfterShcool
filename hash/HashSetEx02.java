package hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		int N = sc.nextInt();
		int[] numbers = new int[N];
		
		for(int i=0; i<N; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		// set 전체 출력
		System.out.println(set);
		System.out.println(set.toString());
		System.out.println();
		
		// Iterator로 set의 요소들 출력
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		System.out.println();
		
		// set을 오름차순으로 정렬해 배열로 만들어 저장
		int[] newNums = set.stream().sorted().mapToInt(Integer::intValue).toArray();
		
		for(int n : newNums) {
			System.out.println(n + " ");
		}
	}
}
