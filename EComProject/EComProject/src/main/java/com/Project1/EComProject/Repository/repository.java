package com.Project1.EComProject.Repository;

import com.Project1.EComProject.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface repository extends JpaRepository<Product,Integer> {

}
