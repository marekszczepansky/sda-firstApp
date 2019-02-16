package dal;

import entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    EntityManagerFactory entityManagerFactory;

    public StudentDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public Student findById(int id) {
        return null;
    }

    public void create(Student student) {
        // EntityManager to de facto sesja
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(student);
            transaction.commit();
        } catch (Exception e) {
            entityManager.close();
        }
    }

    public List<Student> findAll() {
        return null;
    }
}
