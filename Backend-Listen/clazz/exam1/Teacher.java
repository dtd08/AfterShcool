package clazz.exam1;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String subject;
    private int experience;
    private List<Student> students;


    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setTeacher(this);
    }

    public void showInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: "+ experience + " years");

    }

    public void showStudents() {
        System.out.println(name + " teaches the following students: ");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
