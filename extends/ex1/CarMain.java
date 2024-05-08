package extends1.ex1;

public class CarMain {
	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();
		
		GassCar gassCar = new GassCar();
		gassCar.move();
		gassCar.fillUp();
	}
}
