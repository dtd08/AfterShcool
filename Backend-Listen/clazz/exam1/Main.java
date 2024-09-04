package clazz.exam1;

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
        for (Teacher t: teachers) {
            t.showInfo();
            t.showStudents();
            t.teach();
            System.out.println();
        }

        System.out.println("=== Student Info ===");
        for (Student s: students) {
            s.showInfo();
            System.out.println();
        }
    }
}