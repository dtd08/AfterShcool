package class1;

public class ClassStart4 {
	public static void main(String[] args) {
		Student stu1 = new Student();
		
		stu1.stuName = "Hong gil dong"; 
		stu1.age = 15;
		stu1.grade = 90;
		
		Student stu2 = new Student();
		
		stu2.stuName = "Jang bal jang";
		stu2.age = 16;
		stu2.grade = 80;
		
		Student[] students = new Student[2];
		students[0] = stu1;
		students[1] = stu2;
		
		System.out.println(students[0].stuName);
	}
	
	// System.out.println(students[0].stuName); -> 배열 접근 시작
	// System.out.println(005[0].stuName); -> [0]를 이용하여 005 배열의 0번 요소에 접근
	// System.out.println(001.stuName); -> .(dot)을 이용하여 참조값으로 객체에 접근
	//System.out.println("홍길동");
	
}
