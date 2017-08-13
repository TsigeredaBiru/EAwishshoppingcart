package edu.mum.entity;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private int productId;
    private double price;
    @Enumerated(EnumType.STRING)
    private ProductType type;
    private String description;
    @Lob
    byte[] image;

    public Product() {
        super();
    }

    public Product(double price, ProductType type, String description, byte[] image) {
        this.price = price;
        this.type = type;
        this.description = description;
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

}