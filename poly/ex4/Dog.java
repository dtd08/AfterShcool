package poly.ex4;

public class Dog implements InterfaceAnimal{ // 오버라이딩 전까지 오류가 뜬다 (컴파일 불가)
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	@Override
	public void move() {
		System.out.println("고양이 이동");
	}
}
