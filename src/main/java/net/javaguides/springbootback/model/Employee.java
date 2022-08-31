package net.javaguides.springbootback.model;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue
    private long id;
    @Column(name="first_Name")
    private String firstName;
    @Column(name="last_Name")
    private String lastName;
    @Column(name="email_Id")
    private String emailId;

    @Column(name = "title_name")
    private String title;

    @Column(name = "phone_name")
    private String phone;

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public Employee(long id, String firstName, String lastName, String emailId, String title,String phone) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.title = title;
        this.phone = phone;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
