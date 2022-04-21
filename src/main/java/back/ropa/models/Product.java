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
@Table(name="product")
public class Product {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long id;

    String ref;
    LocalDate cratedate;
    LocalDate updatedate;
    String name;
    double costsale;
    double costpurchase;
    int stock;
    String description;
    char status;

    @ManyToOne
    Category category;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCostsale() {
        return costsale;
    }
    public void setCostsale(double costsale) {
        this.costsale = costsale;
    }
    public double getCostpurchase() {
        return costpurchase;
    }
    public void setCostpurchase(double costpurchase) {
        this.costpurchase = costpurchase;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public char getStatus() {
        return status;
    }
    public void setStatus(char status) {
        this.status = status;
    }
    
}
