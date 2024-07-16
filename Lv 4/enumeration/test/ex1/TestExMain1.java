package enumeration.test.ex1;

public class TestExMain1 {
    public static void main(String[] args) {
       AuthGrade[] grades = AuthGrade.values();

       for (AuthGrade grade : grades) {
           System.out.println(grade.name());
           System.out.println("level : " + grade.getLevel());
           System.out.println("desc : " + grade.getDescription());
           System.out.println("-----------------------------------------");
       }
    }
}
