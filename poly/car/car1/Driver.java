package poly.car1;

public class Driver {
	
	private Car car; // 다형성을 활용할 필드 선언  // 부모는 자식 타입을 받을 수 있으므로 이 필드 하나면 됨(중복 제거)
	
	public void setCar(Car car) {
		System.out.println("자동차를 설정합니다: " + car); // 참조하는 객체 주소 호출됨 -> toString 메소드를 오버라이딩하면 원하는 모양으로 출력할 수 있음
		this.car = car;
	}
	
	public void drive() { // 인스턴스 하나에는 타입 하나 == 중복 제거
		System.out.println("자동차를 운전합니다.");
		car.startEngine();
		car.pressAccelerator();
		car.offEngine();
	}
}
