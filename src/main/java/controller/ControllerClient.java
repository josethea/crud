package controller;

import dao.StudentDaoImpl;
import idao.InterfaceStudentDao;
import model.Student;
import vista.ViewClient;

import java.util.List;

public class ControllerClient {
//    private ViewClient viewClient = new ViewClient();
    public ControllerClient() {

    }

    public void save(Student student) {
        InterfaceStudentDao dao = new StudentDaoImpl();
        dao.save(student);
    }

    public List<Student> getAll() {
        InterfaceStudentDao dao = new StudentDaoImpl();
        return dao.getAll();
    }

    public boolean delete(int id) {
        InterfaceStudentDao dao = new StudentDaoImpl();
        return dao.delete(id);
    }

    public boolean update(Student student) {
        InterfaceStudentDao dao = new StudentDaoImpl();
        return dao.update(student);
    }
}
