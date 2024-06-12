package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Dog();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
//        부모는 자식을 참조할 수 없다. (자식은 부모를 참조할 수 있다 => 상향 참조)
//        dog.sound();  // 컴파일 오류, Object에서 sound()가 없다.
//        car.move();   // 컴파일 오류, Object에서 move()가 없다.

        // 객체에 맞는 다운캐스팅 (java 16 버전부터 가능)
        if(obj instanceof Dog dog) { // instanceof : ~로 대체하다
            dog.sound();
        } else if(obj instanceof Car car) {
            car.move();
        }
    }
}
