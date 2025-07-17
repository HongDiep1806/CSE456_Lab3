package vn.edu.eiu.cse456.repository;

import jakarta.persistence.EntityManager;
import vn.edu.eiu.cse456.entity.Major;
import vn.edu.eiu.cse456.infra.JpaUtil;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public class MajorRepo {
    public static void save(Major major) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(major);
        em.getTransaction().commit();
        em.close();
    }

    public static List<Major> findAll() {
        EntityManager em = JpaUtil.getEntityManager();
        List<Major> majors = em.createQuery("select m from Major m", Major.class).getResultList();
        return majors;
    }

    public static void update(Major major) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(major);
        em.getTransaction().commit();
        em.close();
    }

    public static void delete(Major major) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.remove(major);
        em.getTransaction().commit();
        em.close();
    }
}
