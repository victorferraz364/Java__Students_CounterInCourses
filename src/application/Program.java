package application;

import java.util.HashSet;
import java.util.Set;


import entities.Course;
import entities.Student;

public class Program {
    public static void main(String[] args) {
    	Student student1 = new Student("João");
    	Student student2 = new Student("Maria");
    	Student student3 = new Student("Pedro");

        Course curso1 = new Course("Matemática");
        Course curso2 = new Course("História");
        Course curso3 = new Course("Ciências");

        curso1.setStudent(student1);
        curso1.setStudent(student2);

        curso2.setStudent(student2);
        curso2.setStudent(student3);

        curso3.setStudent(student1);
        curso3.setStudent(student2);
        curso3.setStudent(student3);

        Set<Student> singleStudent = new HashSet<>();
        singleStudent.addAll(curso1.getStudent());
        singleStudent.addAll(curso2.getStudent());
        singleStudent.addAll(curso3.getStudent());

        System.out.println("alunos únicos no sistema: " + singleStudent.size());
    }
}