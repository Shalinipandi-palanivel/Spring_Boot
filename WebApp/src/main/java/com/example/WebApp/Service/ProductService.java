package com.example.WebApp.Service;

import com.example.WebApp.Model.Product;
import com.example.WebApp.Repository.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    Productrepo repo; //connects with the Repository interface ProductRepo

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Laptop",20000),
//                                           new Product(102,"Desktop", 30000),
//                                           new Product(103,"Mobile",50000)));

    //The above list of products are created in the database with the help of spring data jpa

    public List<Product> getProducts(){
//        return products;
        return repo.findAll(); // returns all the products
    }

    public Product getProductById(int productID){
//        return products.stream()
//                .filter(product->product.getProductID() == productID)
//                .findFirst().orElse(new Product(100,"System",2000));
        //all the above code is made simple in one line with the help of spring data jpa
        return repo.findById(productID).orElse(new Product()); // filters the product
    }

    public void addProduct(Product prod){
//        products.add(prod);
        repo.save(prod);//add the products in product list
    }

    public void updateProduct(Product prod) {
//        int index = 0;
//        for(int i=0; i<products.size(); i++)
//            if(products.get(i).getProductID() == prod.getProductID())
//                index = i;
//
//        products.set(index,prod);

        repo.save(prod);
        }

    public void deleteProduct(int prodId) {
//        int index = 0;
//        for(int i=0; i<products.size(); i++)
//            if(products.get(i).getProductID() == prodId)
//                index = i;
//
//        products.remove(index);

        repo.deleteById(prodId);

    }
}



