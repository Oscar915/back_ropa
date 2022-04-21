package back.ropa.models;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rol")
public class Rol {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long id;

    String name;
    String description;
    LocalDate cratedate;
    LocalDate updatedate;
    char status;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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
    public char getStatus() {
        return status;
    }
    public void setStatus(char status) {
        this.status = status;
    }
}
