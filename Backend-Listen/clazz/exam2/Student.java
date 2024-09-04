package clazz.exam2;

public class Student implements Person {
    private String name;
    private int grade;
    private String studentId;
    private Teacher teacher;

    public Student(String name, int grade, String studentId) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(name + "is studying");
    }

    @Override
    public void showInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + studentId);
        if (teacher != null) System.out.println("Teacher: " + teacher.getName());
        else System.out.println("No teacher assigned");
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getStudentId() {
        return studentId;
    }
}
