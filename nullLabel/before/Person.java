package nullLabel.before;

public class Person {

    private Label name;
    private Label mail;


    public Person(Label mail, Label name) {
        this.mail = mail;
        this.name = name;
    }

    public Person(Label name) {
        this(name, null); // mail을 적지 않는 경우 null로 처리
    }

    public void display {
        if (name != null) { // name이 없다고 가정
            name.display();
        }
        if (mail != null) {
            mail.display();
        }
    }

    @Override
    public String toString() {
        String result = "[Person :";

        result += "name = ";
        if(name == null) {
            result += "\"(none)\""
        } else {
            result += name;
        }

        result += " mail = ";
        if(mail == null) {
            result += "\"(none)\""
        } else {
            result += name;
        }

        return result + "]";
    }
}