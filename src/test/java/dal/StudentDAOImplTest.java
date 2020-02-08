package dal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDAOImplTest {

    private StudentDAOImpl subject;

    @BeforeEach
    void setUp() {
        subject = new StudentDAOImpl(null);
    }

    @Test
    void findById() {
        assertNull(subject.findById(0));
    }

    @AfterEach
    void tearDown() {
    }
}
