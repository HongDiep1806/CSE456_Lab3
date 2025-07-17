package vn.edu.eiu.cse456.repository;

import jakarta.persistence.EntityManager;
import vn.edu.eiu.cse456.entity.School;
import vn.edu.eiu.cse456.infra.JpaUtil;

import java.util.List;

public class SchoolRepo {
    public static void save(School school) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(school);
        em.getTransaction().commit();
        em.close();
    }

    public static List<School> findAll() {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        List<School> schools = em.createQuery("select s from School s", School.class).getResultList();
        return schools;
    }

    public static void update(School school) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(school);
        em.getTransaction().commit();
        em.close();
    }

    public static void delete(School school) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.remove(school);
        em.getTransaction().commit();
        em.close();
    }
}
