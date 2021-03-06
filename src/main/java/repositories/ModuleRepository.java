package repositories;

import entities.Module;
import entities.Person;

import javax.persistence.EntityManager;
import java.util.List;

public class ModuleRepository {
    public Module findModuleById(Long id){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        return em.find(Module.class, id);
    }

    public List<Module> getAllModules(){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        List<Module> modules = em.createQuery("Select b From Module b").getResultList();
        return modules;
    }


    public void createModule (Module module){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(module);
        em.getTransaction().commit();
    }

    public void updateModule(Module module){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.merge(module);
        em.getTransaction().commit();
    }

    public void deleteModule(Module module){
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        Person foundModule = em.find(Person.class, module.getId());
        em.remove(foundModule);
        em.getTransaction().commit();
    }
}
