package com.example.WebApp.Repository;

import com.example.WebApp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //takes all the implementation of spring data JPA
public interface Productrepo extends JpaRepository<Product,Integer> {
}
