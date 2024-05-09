package extends1.ex3;

public class CarMain {
	public static void main(String[] args) {
		// 부모 자식 관계는 한 단계에서 그치지 않음
		// 최상위 부모 -> 부모 -> 자식(최하위)
		
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();
		electricCar.openDoor();
		
		GassCar gassCar = new GassCar();
		gassCar.move();
		gassCar.fillUp();
		gassCar.openDoor();
	}
}
