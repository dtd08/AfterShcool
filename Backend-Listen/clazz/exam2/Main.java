package clazz.exam2;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 10, "S12345"),
                new Student("Bob", 11, "S54321"),
                new Student("Charlie", 12, "S67890")
        };

        Teacher[] teachers = {
                new Teacher("Mr. Smith", "Math", 5),
                new Teacher("Ms. Johnson", "English", 10)
        };

        teachers[0].addStudent(students[0]);
        teachers[0].addStudent(students[1]);
        teachers[1].addStudent(students[2]);

        System.out.println("=== Teacher Info ===");
        showInfo(teachers);

        System.out.println("=== Student Info ===");
        showInfo(students);
    }

    public static void showInfo(Person[] people) {
        for (Person p: people) {
            p.showInfo();

            if(p instanceof Teacher) {
                ((Teacher)p).showStudents();
                ((Teacher)p).teach();
            }

            System.out.println();
        }
    }
}