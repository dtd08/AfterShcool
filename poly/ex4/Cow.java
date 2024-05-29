package poly.ex4;

public class Cow implements InterfaceAnimal{
	@Override
	public void sound() {
		System.out.println("음메");
	}
	
	@Override
	public void move() {
		System.out.println("송아지 이동");
	}
}
