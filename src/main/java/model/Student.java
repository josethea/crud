package model;

public class Student {
    private int id;
    private String school;
    private String name;
    private String email;
    private Integer phone;

    public Student() {
    }

    public Student(int id, String name, String school, String email, Integer phone) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.email = email;
        this.phone = phone;
    }

    public Student(String name, String email) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
