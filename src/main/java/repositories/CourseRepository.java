package repositories;

import entities.Course;
import entities.Module;
import entities.Person;
import repositories.EMFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepository {

    public Course findCourseById(Long id){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        return em.find(Course.class, id);
    }

    public List<Course> getAllCourses(){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        List<Course> courses = em.createQuery("Select b From Course b").getResultList();
        return courses;
    }


    public void createCourse (Course course){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
    }

    public void updateCourse(Course course){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.merge(course);
        em.getTransaction().commit();
    }

    public void deleteCourse(Course course){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        Person foundCourse = em.find(Person.class, course.getId());
        em.remove(foundCourse);
        em.getTransaction().commit();
    }
}