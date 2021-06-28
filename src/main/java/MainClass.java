import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("diederiekDatabase");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();


        em.getTransaction().commit();

    }

}
