package poly.car1;

// 기본적인 클래스 활용
public class CarMain1 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Car k3Car = new K3Car();
		driver.setCar(k3Car); // 의존주입
		driver.drive();
		
		Car model3Car = new Model3Car();
		driver.setCar(model3Car);
		driver.drive(); // 무슨 자동차가 들어왔는지 판별할 필요없이 쉽게 교체 가능
		
	}
}
