package class1;

public class ClassStart5 {
	public static void main(String[] args) {
		// 리팩토링
		// 1. 선언 단일화
		//	: 배열로만 접근할 수 있게 단일화
		// 2. 출력문구를 반복문을 통해 심플하게 변경
		
		Student[] students = new Student[2];
		
		students[0] = new Student();
		students[1] = new Student();
		
		students[0].stuName = "Hong gil dong"; 
		students[0].age = 15;
		students[0].grade = 90;
		
		students[1].stuName = "Jang bal jang";
		students[1].age = 16;
		students[1].grade = 80;
		
		for(int i=0; i<students.length; i++) {
			System.out.printf("이름: %s 나이: %d세 성적: %d점\n", students[i].stuName, students[i].age, students[i].grade);
		}
		
		for(Student s : students) {
			System.out.printf("이름: %s 나이: %d세 성적: %d점\n", s.stuName, s.age, s.grade);
		}
	}
	
}
