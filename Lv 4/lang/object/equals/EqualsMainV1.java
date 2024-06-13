package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");


        // String의 equals는 Object의 메소드를 String에 맞게 오버라이딩한 것
        System.out.println("identity = " + (user1 == user2));  // fasle
        System.out.println("equality = " + user1.equals(user2));  // false
    }
}
/*
동일성 비교
user1 == user2
X001 == X002
false

Object.equals() 메서드
public boolean equals(Object obj) {
    return (this == obj);
}

동등성 비교
user1.equals(user2)
return (user1 == user2)
return (X001 == X002)
false

즉, Object가 기본으로 제공하는 equals()는 == 으로 동일성 비교를 제공한다.
 */
