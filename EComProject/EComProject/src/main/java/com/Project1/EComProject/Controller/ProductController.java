package com.Project1.EComProject.Controller;

import com.Project1.EComProject.Models.Product;
import com.Project1.EComProject.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api")

public class ProductController {
    @Autowired
   private ProductService service;

    @GetMapping("/about")
    public String meet(){
        return "I am okay!";
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        Product product = service.getProductByID(id);
        if(product != null){
            return new ResponseEntity<>(service.getProductByID(id),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile){
            try{
                Product product1 = service.addProduct(product,imageFile);
                return new ResponseEntity<>(product1,HttpStatus.CREATED);
            }
            catch (Exception e){
                return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
        }
}
