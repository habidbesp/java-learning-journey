package fitness_zone.domain;

import java.util.Objects;

public class Client {
    private int id;
    private String firstname;
    private String lastname;
    private int membership;

    public Client(){}

    public Client(int id){
        this.id = id;
    }

    public Client(String firstname, String lastname, int membership){
        this.firstname = firstname;
        this.lastname = lastname;
        this.membership = membership;
    }

    public Client(int id, String firstname, String lastname, int membership){
        this(firstname, lastname, membership);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getMembership() {
        return membership;
    }

    public void setMembership(int membership) {
        this.membership = membership;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", membership=" + membership +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && membership == client.membership && Objects.equals(firstname, client.firstname) && Objects.equals(lastname, client.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, membership);
    }
}
