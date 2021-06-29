import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class User {
    private String login;
    private String passwordHash;
    private boolean active;
    @OneToOne(cascade = {CascadeType.REMOVE, cascadeTypde.PERSIST})
    private Person person;

    private User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
