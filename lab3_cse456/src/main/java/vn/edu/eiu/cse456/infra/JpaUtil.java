package vn.edu.eiu.cse456.infra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.swing.text.html.parser.Entity;

public class JpaUtil {
    private  static final EntityManagerFactory emf;
    static {
        try {
            emf = Persistence.createEntityManagerFactory("pu1-student-major-relationship");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    private JpaUtil() {}
    public static EntityManager getEntityManager() {return emf.createEntityManager();}
}
