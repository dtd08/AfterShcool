package level4.generics.coffee;

import level4.generics.user.User;

public class CoffeeByUser <T extends User> { // 타입 제한  // User와 관련된 타입만 사용 가능
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
