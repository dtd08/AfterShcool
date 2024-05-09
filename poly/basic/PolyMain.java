package poly.basic;

public class PolyMain {
//	1. 객체지향 프로그래밍의 대표적인 특성 : 캡슐화, 상송, 다형성...
//	2. 다형성은 객체지향 프로그래밍의 꽃이라 불린다.
//	3. 다형성은 이름 그대로 '다양한 형태', '여러 형태'를 뜻한다.
//	4. 프로그래밍에서 다형성은 한 객체가 여러 타입의 객체로 취급될 수 있는 능력을 뜻한다.
//	5. 하나의 객체는 하나의 타입으로 고정되어 있는데 다형성을 사용하면 하나의 객체가 다른 타입으로 사용될 수 있다는 뜻이다.

//	다형성의 2가지 핵심 이론
//	1. 다형성 참조
//	2. 메서드 오버라이딩
	
	public static void main(String[] args) {
		// 부모 변수가 부모 인스턴스 참조
		System.out.println("Parent -> Parent");
		Parent parent = new Parent(); // 메모리 공간에 Parent만 인스턴스화
		parent.parentMethod();
		

		// 자식 변수가 자식 인스턴스 참조
		System.out.println("Child -> Child");
		Child child = new Child(); // 메모리 공간에 Child와 Parent를 인스턴스화(인스턴스화 될 때 부모의 생성자도 부르기 때문)
		child.parentMethod();
		child.childMethod();
		
		
		// 부모 변수가 자식 인스턴스 참조(다형적 참조) -> 부모는 자식을 품을 수 있다.
		System.out.println("Parent -> Child");
		Parent poly = new Child(); // Child의 생성자 호출 -> super 생성자 호출 => Parent와 Child 둘 다 생성됨  
		// 생성됐긴 하지만 Parent만 참조하기 때문에 자식의 것을 가져올 수 없음(후에 어떻게 가져오는지 배움)
		poly.parentMethod();
		//poly.childMethod();  // 자식의 기능은 호출할 수 없다.
		
		//Child child = new Parent();  // 자식은 부모를 담을 수 없다.
		
		// 자식이 부모를 참조한다 => 업캐스팅(생략 가능)
		// 부모 타입을 일시적으로 자식 타입으로 바꾼다 => 다운캐스팅(자식의 메소드나 필드 참조 가능)
	}
}
