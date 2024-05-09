package extends1.ex2;

public class CarMain {
	public static void main(String[] args) {
		// 부모 클래스(슈퍼 클래스): 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공하는 클래스 (Car.java)
		// 자식 클래스(서브 클래스): 부모 클래스로부터 필드와 메서드를 상속받는 클래스 (ElectricCar.java, GassCar.java)
		
		// 자바는 다중 상속을 지원하지 않는다. 그래서 extends 대상은 하나만 선택할 수 있다. (단일 상속)
		// 왜냐면 부모 클래스에서 공통된 필드나 메서드가 있을 경우, 그 점을 해결할 수 없기 때문에 다중 상속을 받을 수 없다. (다른 언어는 지원함)
		// 하지만 인터페이스의 다중 구현을 사용하면 다중 상속과 같은 기능을 사용할 수 있다.
		
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();
		
		GassCar gassCar = new GassCar();
		gassCar.move();
		gassCar.fillUp();
	}
}
