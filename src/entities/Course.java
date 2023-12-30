package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
    String nome;
    Set<Student> students;

    public Course(String nome) {
        this.nome = nome;
        this.students = new HashSet<>();
    }
    public void setStudent(Student student) {
        students.add(student);
    }

    public Set<Student> getStudent() {
        return students;
    }
}