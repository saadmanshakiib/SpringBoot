package com.example.SimpleWebApp.Service;

import com.example.SimpleWebApp.Models.Product;
import com.example.SimpleWebApp.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
     ProductRepo repo;

    //List<Product>  products = new ArrayList<>(Arrays.asList(new Product("iphone",101,1760000),new Product("Macbook",102,238000),new Product("Laptop",103,78000)));


    public List<Product> getProducts(){
    return repo.findAll();
}

    public Product getProductByID(int id) {
    //return products.stream().filter(p->p.getProductId() == id ).findFirst().orElse(new Product("Nothing",id,0000));
    return repo.findById(id).orElse(new Product("nothing",000,000));
    }

    public void addProduct(Product product){
//products.add(product);
        repo.save(product);
    }

    public void updateProduct(Product product){
        /*int i;
        for(int j=0;j<products.size();j++){
            if(products.get(j).getProductId() == product.getProductId()){
                i = j;
                products.set(i,product);
            }
        }*/
        repo.save(product);
    }

    public void dlt(int code) {
       /* int j;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProductId() == code){
                j = i;
                products.remove(j);
            }
        }
    }*/
        repo.deleteById(code);
    }
}
