package dal;

import entity.Student;

import java.util.List;

public interface StudentDAO {
    Student findById(int id);
    void create(Student student);
    List<Student> findAll();
}
