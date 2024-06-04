package lang.object;

// 명시적 상속
public class Child extends Parent{
    public void childMethod() {
        System.out.println("Child.chlidMethod");
    }
}
/*
    클래스에 상속 받을 부모 클래스를 명시적으로 지정하면 Object를 상속 받지 않는다.
        - 이는 다중상속이 되지 않는 자바의 특성이다.
        - 다만 부모 클래스에서 이미 Object를 상속 받았기 때문에 Object까지 접근 가능하다.
 */