package com.example.WebApp.Model;

import com.example.WebApp.Repository.Productrepo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@Component
@Entity//which creates class for all the object
public class Product {

    @Id // make productID as primary key
    private int productID;
    private String prodName;
    private int price;

//     This constructor is must to add here, without this it gives you error and fails to start
    public Product(){
            }

//    Getter-Setter

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //Constructor

    public Product(int productID, String prodName, int price) {
        this.productID = productID;
        this.prodName = prodName;
        this.price = price;
    }
}
