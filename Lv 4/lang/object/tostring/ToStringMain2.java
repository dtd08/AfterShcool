package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog1 = new Dog("poppy1", 2);
        Dog dog2 = new Dog("poppy2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());  // Override X
        System.out.println(dog1.toString());  // Override O
        System.out.println(dog2.toString());  // Override O

        System.out.println("\n2. println 내부에서 toString이 호출됐을때");
        System.out.println(car);  // 결론은 굳이 재정의되지 않은 toString을 쓰지 않아도 된다는 것이다.
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("\n3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
