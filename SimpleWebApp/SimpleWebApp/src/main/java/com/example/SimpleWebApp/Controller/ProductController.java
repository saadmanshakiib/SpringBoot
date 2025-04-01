package com.example.SimpleWebApp.Controller;

import com.example.SimpleWebApp.Models.Product;
import com.example.SimpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductService service ;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductByID(@PathVariable int id){
        return service.getProductByID(id);
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }

    @PutMapping("/update/{id}")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable int id){
        service.dlt(id);
    }


}

