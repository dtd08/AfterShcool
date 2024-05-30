package nullLabel.after;

public class Person {

    private Label name;
    private Label mail;


    public Person(Label mail, Label name) {
        this.mail = mail;
        this.name = name;
    }

    public Person(Label name) {
        this(name, new NullLabel()); // mail을 적지 않는 경우 null로 처리
    }

    public void display {
        name.display();
        mail.display();
    }

    @Override
    public String toString() {
        String result = "[Person : name = " + name + ", mail = " + mail + "]";
        return result;
    }
}