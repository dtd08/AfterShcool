package extends1.overriding;

public class CarMain {
	public static void main(String[] args) {
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
