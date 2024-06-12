package lang.object;

// == public class Parent extends Object
// 묵시적 상속
public class Parent {
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
/*
    클래스에 상속 받을 부모 클래스가 없으면 묵시적으로 Object 클래스를 상속받는다.
        - 자바가 extends Object 코드를 넣어주는 것이다.
        - extends Object는 생략하는 것을 권장한다.
        - 모든 메소드는 호출되었을 때 Object 클래스까지 찾아본다.
*/