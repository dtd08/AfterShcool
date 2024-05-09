package extends1.ex2;

public class ElectricCar extends Car{
	// 전기차 클래스는 extends Car를 사용해서 부모 클래스인 Car를 상속 받는다.
	// 상속 덕분에 전기차 클래스에서도 move()를 사용할 수 있다.
	// 부모에게서 받아 더 확장한 클래스이기 때문에 확장의 뜻을 가진 extends를 쓴 것이다.
	
	public void charge() {
		System.out.println("충전합니다.");
	}
}
