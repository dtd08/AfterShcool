package lang.object.tostring;

public class Car {
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public String carInfo() { // toString() 역할을 하는 메서드 
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }
}
