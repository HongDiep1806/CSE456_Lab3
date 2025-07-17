package vn.edu.eiu.cse456.repository;

import jakarta.persistence.EntityManager;
import vn.edu.eiu.cse456.entity.Student;
import vn.edu.eiu.cse456.infra.JpaUtil;

import java.util.List;

public class StudentRepository {
    public void save(Student student) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    public List<Student> findAll() {
        EntityManager em = JpaUtil.getEntityManager();
        List<Student> students = em.createQuery("select s from Student s", Student.class).getResultList();
        return students;
    }

    public void update(Student student) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Student student) {
    EntityManager em = JpaUtil.getEntityManager();
    em.getTransaction().begin();
    em.remove(student);
    em.getTransaction().commit();
    em.close();
    }
}
