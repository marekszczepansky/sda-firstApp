import dal.StudentDAOImpl;
import entity.Student;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FirstApp {
    private static EntityManagerFactory entityManagerFactory;

    public static void main(String[] args) {
        entityManagerFactory = Persistence.
                createEntityManagerFactory("PU1");
        StudentDAOImpl studentDAO = new StudentDAOImpl(entityManagerFactory);

        Student student = new Student();
        student.setName("test");
        student.setId(1);

        studentDAO.create(student);
    }
}
