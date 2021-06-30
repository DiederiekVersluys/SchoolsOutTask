package entities;

import entities.Course;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String firstName;
    private String familyName;
    @Transient
    private Gender gender;
    @ManyToOne(cascade = CascadeType.DETACH)
    private Course courseActive;
    @ManyToOne
    private List<Course> courseHistory;

    public Person() {
    }



    public Person(int id, String firstName, String familyName, Gender gender, Course course) {
        this.id = id;
        this.firstName = firstName;
        this.familyName = familyName;
        this.gender = gender;
        this.courseActive = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Course getCourse() {
        return courseActive;
    }

    public void setCourse(Course course) {
        this.courseActive = course;
    }

    public List<Course> getCourseHistory() {
        return courseHistory;
    }

    public void setCourseHistory(List<Course> courseHistory) {
        this.courseHistory = courseHistory;
    }




}
