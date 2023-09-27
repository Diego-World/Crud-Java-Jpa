package com.gouveia.crud.crudjpa.model;

import jakarta.persistence.*;

@Entity // This annotaion means that this class can be mapped to database records.
@Table(name = "Products")
public class Watch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String productName;
    private Double Price;

    public Watch() {
    }

    public Watch(Long id, String brand, String productName, Double price) {
        this.id = id;
        this.brand = brand;
        this.productName = productName;
        Price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
}
