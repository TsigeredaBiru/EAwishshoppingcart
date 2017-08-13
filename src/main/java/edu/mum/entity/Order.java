package edu.mum.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordertable")
public class Order {
    @Id @GeneratedValue
    private int orderId;
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @ManyToOne
    @JoinTable(name = "user_order")
    private User user;
    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLines;
    @OneToOne
    private Shipping shipping;

    public Order() {
    }

    public Order(Date orderDate, User user, List<OrderLine> orderLines, Shipping shipping) {
        this.orderDate = orderDate;
        this.user = user;
        this.orderLines = orderLines;
        this.shipping = shipping;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }
}
