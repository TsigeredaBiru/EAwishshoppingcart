package edu.mum.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Sushan on 8/12/2017.
 */
@Entity
public class Shipping {

    @Id @GeneratedValue
    private int shipId;
    @Temporal(TemporalType.DATE)
    private Date  estimatedDate;
    private float shippingCost;

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
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
