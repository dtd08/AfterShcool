package poly.ex3;

public class Dog extends Animal{ // 오버라이딩 전까지 오류가 뜬다 (컴파일 불가)
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
