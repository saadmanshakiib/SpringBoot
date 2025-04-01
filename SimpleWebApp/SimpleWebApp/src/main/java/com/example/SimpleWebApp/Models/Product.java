package com.example.SimpleWebApp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {
    private String productName;
    @Id
    private int productId;
    private int productPrice;

    public Product(){};
    public Product(String productName,int productId,int productPrice){
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setProductPrice(int productPrice){
        this.productPrice = productPrice;
    }

    public String getProductName(){
        return this.productName;
    }

    public int getProductId(){
        return this.productId;
    }

    public int getProductPrice(){
        return this.productPrice;
    }
}
