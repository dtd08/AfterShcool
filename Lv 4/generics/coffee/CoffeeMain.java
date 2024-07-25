package level4.generics.coffee;

import level4.generics.user.User;
import level4.generics.user.VIPUser;

public class CoffeeMain {
    public static void main(String[] args) {
        // 타입별 클래스 사용
        CoffeeByNumber c1 = new CoffeeByNumber(10);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("디보");
        c2.ready();


        System.out.println("------------------------");


        // Object 클래스 사용
        CoffeeByName c3 = new CoffeeByName(11);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("포비");
        c4.ready();


        System.out.println("------------------------");


        // Object의 문제성
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 번호 : " + c4Name);

        // 문제가 되는 부분
//        c4Name = (String) c3.name;


        System.out.println("------------------------");


        // 제네릭 타입 사용
        Coffee<Integer> c5 = new Coffee<>(12);
        c5.ready();

        // c5를 만들때 Integer형이라고 명시했으므로 추가의 형변환이 필요 없음
        // 명시적 형변환이 필요 없다 == 안정적이다 ( 억지로 끼워 맞추지 않아 손실도 적음 )
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        // 같은 클래스로 String을 형변환 없이 사용할 수 있음
        Coffee<String> c6 = new Coffee<>("루피");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 번호 : " + c6Name);


        System.out.println("------------------------");


        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("조로"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("송하나"));
        c8.ready();


        System.out.println("------------------------");


        orderCoffee("뽀로로");
        orderCoffee("페티", "초코라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
/*
    CoffeByNumber, CoffeByNickname
    - 같은 로직인데 타입 하나가 달라서 호출해야 할 인스턴스가 다름
    - 이는 문제가 생길 가능성이 높음을 의미함

    CoffeeByName
    - Object로 인자를 받아 숫자든 별명이든 상관 없이 CoffeeByName을 호출하면 됨

    Object로 통일했을 때 문제점
    - Object로 받은 int형 변수를 String으로 형변환하여 위처럼 String 변수에 넣었을 때,
      컴파일 상에서는 문제가 없지만 런타임에서 오류가 발생함

    제네릭 사용
    - 하나의 클래스로 여러 타입을 대신할 수 있음
    - 인스턴스 생성 시 타입을 명시하므로 명시적 형변환이 필요 없음
        => 안전성 확보


 */

