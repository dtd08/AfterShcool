package poly.overriding;

public class Child extends Parent {
	public String value ="child";
	
	@Override
	public void method() {
		System.out.println("Child.method"); // 상속 받되, 자신에게 맞게 변형 
	}
}
