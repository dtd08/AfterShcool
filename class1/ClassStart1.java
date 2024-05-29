package class1;

public class ClassStart1 {
	// 학생 정보 출력 프로그램
	// 두 명의 학생 정보를 출력하는데, 각 학생은 이름, 나이, 성적을 가지고 있음
	
	/* 1. 홍길동, 15, 90
	 * 2. 장발장, 16, 80
	 * 
	 * 출력 : 이름: [이름] 나이: [나이]세 성적: [성적]점
	 */
	
	// 변수를 사용하여 학생 정보를 저장하고 출력해보자
	public static void main(String[] args) {
		String stuName1 = "Honggildong";
		int age1 = 15;
		int grade1 = 90;
		
		String stuName2 = "Jangbaljang";
		int age2 = 16;
		int grade2 = 80;
		
		System.out.printf("이름: %d 나이: %d세 성적: %d점", stuName1, age1, grade1);
		System.out.printf("이름: %d 나이: %d세 성적: %d점", stuName2, age2, grade2);
		
		// 위 방식은 학생이 늘어날 때 마다 변수와 출력하는 코드를 추가해야 하는 문제점이 있음
		// 위 문제를 배열을 사용해 해결해보자
	}
	
	
}
