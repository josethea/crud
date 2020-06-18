package vista;

import model.Student;

import java.util.List;

public class ViewClient {
    public void viewStudent(Student student) {
        System.out.println("Student => " + student);
    }

    public void viewStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println("Student => " + student);
        }
    }
}
