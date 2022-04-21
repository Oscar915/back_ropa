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
@Table(name="detail")
public class Detail {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long id;

    @ManyToOne
    Product product;

    @ManyToOne
    Cart cart;

    int amount;
    double cost;
    char status;
    LocalDate cratedate;
    LocalDate updatedate;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
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
