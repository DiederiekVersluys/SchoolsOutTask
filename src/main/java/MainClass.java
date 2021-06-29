import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {
    public static void main(String[] args) {

        EMFactory.getEMF();
        
        //UserService userService = new UserService();
        UserRepository userRepositroy = new UserRepository();
        Person person = new Person();
        User user = new User();

        em.getTransaction().begin();


        em.getTransaction().commit();

    }

}
