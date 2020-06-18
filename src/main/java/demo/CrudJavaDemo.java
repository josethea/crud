package demo;

import controller.ControllerClient;
import model.Student;

import java.util.List;

public class CrudJavaDemo {
    public static void main(String[] args) {
//        Student student = new Student(2, "Albertortas", "MUM", "tulokito2@gmail.com", 333);

        Student student = new Student(1, "Maytita", "Mercedes", "papidekilder@gmail.com", 666);
        ControllerClient controller = new ControllerClient();
        controller.update(student);
//        controller.save(student);

//        List<Student> studentList = controller.getAll();
//        System.out.println("Hello world");

//        controller.delete(2);
    }
}
