package edu.mum.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Sushan on 8/12/2017.
 */
@Entity
public class Shipping {

    @Id @GeneratedValue
    private int id;
    @Temporal(TemporalType.DATE)
    private Date  estimatedDate;
    private float shippingCost;

    public Shipping() {
    }

    public Shipping(Date estimatedDate, float shippingCost) {
        this.estimatedDate = estimatedDate;
        this.shippingCost = shippingCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEstimatedDate() {
        return estimatedDate;
    }

    public void setEstimatedDate(Date estimatedDate) {
        this.estimatedDate = estimatedDate;
    }

    public float getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(float shippingCost) {
        this.shippingCost = shippingCost;
    }
}
