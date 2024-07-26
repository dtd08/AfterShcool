package test2;

public class TestTransportMain2 {
    public static void main(String[] args) {
        TransportManager<Movable> transportManager = new TransportManager<>();
        Movable[] movables = {
            new Car(50.0, FuelType.GASOLINE),
            new Bicycle(3),
            new Train(),
            new Motorcycle(10.0, FuelType.DIESEL)
        };

        Double distance = 0.0;

        for (int i = 0; i < movables.length; i++) {
            switch (movables[i].getTransportType()) {
                case CAR:
                    distance = 20.567;
                    break;
                case BICYCLE:
                    distance = 10.234;
                    break;
                case TRAIN:
                    distance = 100.789;
                    break;
                case MOTORCYCLE:
                    distance = 5.5;
                    break;
            }

            transportManager.setTransport(movables[i]);
            transportManager.moveTransport(distance);

            if (movables[i].getTransportType() == TransportType.CAR) {
                System.out.println("남은 연료: " + ((Car)movables[i]).getRemainingFuel());
            } else if (movables[i].getTransportType() == TransportType.MOTORCYCLE) {
                System.out.println("남은 연료: " + ((Motorcycle)movables[i]).getRemainingFuel());
            }
            System.out.println("교통수단 종류: " + movables[i].getTransportType().getDescription());


            if (i != movables.length-1) {
                System.out.println("--------------------------------");
            }
        }
    }
}