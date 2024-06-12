package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object obj = new Object(); // Objecct 인스턴스도 만들 수 있다 == 추상클래스가 아니다.

        Object[] objects = {dog, car, obj};
        size(objects);
    }

    private static void size(Object[] obj) {
        System.out.println("전달된 객체의 수: " + obj.length);
    }
}
