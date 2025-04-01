package com.example.SimpleWebApp.Repository;


import com.example.SimpleWebApp.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
