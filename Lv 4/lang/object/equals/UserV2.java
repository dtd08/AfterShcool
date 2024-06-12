package lang.object.equals;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj;  // 부모 타입의 인스턴스가 자식에게 접근하기 위해 다운캐스팅
        return id.equals(user.id);
    }
}
