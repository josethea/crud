package dao;

import connection.ConnectionDatabase;
import idao.InterfaceStudentDao;
import model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements InterfaceStudentDao {

    @Override
    public boolean save(Student student) {
        boolean registrar = false;

        Statement stm;
        Connection con;

        String sql="INSERT INTO student values (" + student.getId() + ",'" + student.getName()+ "','" + student.getSchool() + "','" + student.getEmail() + "'," + student.getPhone() + ")";

        try {
            con= ConnectionDatabase.connect();
            stm= con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Student> getAll() {
        Connection co;
        Statement stm;
        ResultSet rs;

        String sql="SELECT * FROM student ORDER BY id";

        List<Student> studentsList= new ArrayList<Student>();

        try {
            co= ConnectionDatabase.connect();;
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                Student c=new Student();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setSchool(rs.getString(3));
                c.setEmail(rs.getString(4));
                c.setPhone(rs.getInt(5));
                studentsList.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método obtener");
            e.printStackTrace();
        }

        return studentsList;
    }

    @Override
    public boolean update(Student student) {
        Connection co;
        Statement stm;

        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE student SET name = '").append(student.getName()).append("', school = '").append(student.getSchool()).append("', email = '").append(student.getEmail()).append("', phone = ").append(student.getPhone()).append(" WHERE id = ").append(student.getId());

        try {
            co= ConnectionDatabase.connect();;
            stm=co.createStatement();
            stm.execute(sql.toString());
            stm.close();
            co.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método delete");
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        boolean succeed = false;

        Connection co;
        Statement stm;

        String sql="DELETE FROM student WHERE id = " + id;

        try {
            co= ConnectionDatabase.connect();;
            stm=co.createStatement();
            stm.execute(sql);
            succeed = true;
            stm.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método delete");
            e.printStackTrace();
        }

        return succeed;
    }
}
