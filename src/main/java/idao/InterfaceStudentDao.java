package idao;

import model.Student;

import java.util.List;

public interface InterfaceStudentDao {
    public boolean save(Student student);
    public List<Student> getAll();
    public boolean update(Student student);
    public boolean delete(int id);
}
