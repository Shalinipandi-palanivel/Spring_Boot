package com.example.WebApp.Controller;

import com.example.WebApp.Model.Product;
import com.example.WebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

//    Controller will receive data from the service
//    ProductService service = new ProductService(); - traditional way of creating object but spring will do this for us
   @Autowired
    ProductService service;

    @GetMapping("/Products")
    public List<Product> getproducts() {
        return service.getProducts();
    }

    @GetMapping("products/{productID}")
        public Product getProductById(@PathVariable int productID){
        return service.getProductById(productID);
    }

    @PostMapping("/Products")
    public void add(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/Products")
    public void updateProduct(Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/Products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }

}
