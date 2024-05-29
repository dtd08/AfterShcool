package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;
	
	// 생성자
	// 클래스 앞에 접근제어를 명시하지 않으면 클래스를 따라감
	public MemberConstruct(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	// 생성자 오버로딩
	MemberConstruct(String name, int age) {
		this(name, age, 50);
	}
}
