package back.ropa.models;


import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;                    


@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long id;

    String name;
    String lastname;
    String email;
    String password;
    char status;
    LocalDate cratedate;
    LocalDate updatedate;

    @ManyToOne
    Rol rol;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public char getStatus() {
        return status;
    }
    public void setStatus(char status) {
        this.status = status;
    }
    public LocalDate getCratedate() {
        return cratedate;
    }
    public void setCratedate(LocalDate cratedate) {
        this.cratedate = cratedate;
    }
    public LocalDate getUpdatedate() {
        return updatedate;
    }
    public void setUpdatedate(LocalDate updatedate) {
        this.updatedate = updatedate;
    }
}
