package class1;

public class ClassStart3 {
	public static void main(String[] args) {
		Student stu1 = new Student(); // 메모리에 학생 클래스를 생성하여 stu1을 담아둠
		
		stu1.stuName = "Hong gil dong"; // '.' 은 해당 메모리에 접근하는 기호
		stu1.age = 15;
		stu1.grade = 90;
		
		Student stu2 = new Student();
		
		stu2.stuName = "Jang bal jang";
		stu2.age = 16;
		stu2.grade = 80;
		
		// 클래스를 선언하는 순간(Student stu1) java heap 영역에 메모리 주소 값을 저장할 공간을 만들어줌
		// new Student() -> 필드들의 메모리 주소와 공간을 heap 영역 어딘가에 만듬
		// Student stu1 = new Student() -> 필드들의 메모리 주소를 stu1 이라는 변수에 저장함
		// 그래서 변수에 .을 찍는 순간 그 주소로 찾아가 필드를 사용할 수 있는 것임
		
		System.out.printf("이름: %s 나이: %d세 성적: %d점\n", stu1.stuName, stu1.age, stu1.grade);
		System.out.printf("이름: %s 나이: %d세 성적: %d점\n", stu2.stuName, stu2.age, stu2.grade);
	}
	
	// 클래스와 사용자 정의 타입
	// - 타입 : 데이터의 종류나 형태(ex> int == 정수타입, String == 문자열 타입)
	// - 학생(Student)라는 타입을 만들면 좋지 않을까?
	// - 클래스를 사용하면 int, String과 같은 타입을 직접 생성할 수 있음
	// - 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도(=클래스)가 필요함
	// - 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 함
	// - 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음것 정의할 수 있음
	
	// 참조값을 변수에 보관하는 이유
	// 객체를 생성하는 new Student() 코드 자체에는 이름이 없음
	// 이 코드는 단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만드는 기능만 함
	// 따라서 생성한 객체에 접근할 방법이 필요함
	// 객체를 생성할 때 반환되는 참조값(주소)를 알면 객체에 접근할 수 있음
	// 때문에 반환되는 참조값(주소)를 저장할 변수가 필요하며
	// 앞서 Student stu1로 선언한 변수(stu1)에 참조값을 저장하여 필요할 때 객체에 접근할 수 있음
	// 접근할 수 없는 방법이 없으면 java의 가비지 컬랙터가 지워버림
	
	
	// 정리
	// Student stu1 = new Student(); -> Student 객체 생성
	// Student stu1 = 0x0099ff; -> new Student() 결과로 참조값(주소) 반환
	// stu1 = 0x0099ff; -> stu1 변수에 주소값이 담김
	
	// 클래스 = 사용자 정의 타입
	// 클래스에도 배열을 도입하면 매우 편해짐
}
