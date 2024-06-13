package lang.immutable.address;

public class Address { // 주소값을 저장하는 공간

    private String value; // 주소값 저장 변수

    public Address(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() { // 전의 ~Info() 와 같은 기능
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
