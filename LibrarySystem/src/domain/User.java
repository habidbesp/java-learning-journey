package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User implements Serializable {
    private final String ID_USER;
    private String firstname;
    private String lastname;
    private List<Loan> loans;

    public User(){
        this.ID_USER = UUID.randomUUID().toString();
    }

    public User(String firstname, String lastname){
        this();
        this.firstname = firstname;
        this.lastname = lastname;
        this.loans = new ArrayList<>();
    }

    public String getIdUser() {
        return this.ID_USER;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID_USER='" + ID_USER + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", loans=" + loans +
                '}';
    }

    public String writeUser(){
        return  ID_USER + "," + firstname + "," + lastname + "," + loans;
    }
}
