package repositories;

import entities.Exam;
import entities.Person;


import javax.persistence.EntityManager;
import java.util.List;

public class ExamRepository {
    public Exam findExamById(Long id){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        return em.find(Exam.class, id);
    }

    public List<Exam> getAllModules(){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        List<Exam> exams = em.createQuery("Select b From Exam b").getResultList();
        return exams;
    }


    public void createExam (Exam exam){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(exam);
        em.getTransaction().commit();
    }

    public void updateExam(Exam exam){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.merge(exam);
        em.getTransaction().commit();
    }

    public void deleteExam(Exam exam){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        Person foundExam = em.find(Person.class, exam.getId());
        em.remove(foundExam);
        em.getTransaction().commit();
    }
}