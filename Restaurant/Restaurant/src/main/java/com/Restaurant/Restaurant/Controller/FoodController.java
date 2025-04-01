package com.Restaurant.Restaurant.Controller;

import com.Restaurant.Restaurant.Models.Food;
import com.Restaurant.Restaurant.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {

    @Autowired
    FoodService service;

    @GetMapping("/foods")
    public List<Food> showFoods(){
        return service.getAllFoods();
    }

    @GetMapping("/find/{code}")
    public Food getFoodByCode(@PathVariable int code){
            return service.getFoodByID(code);
    }

    @PostMapping("/add")
    public void addFoods(@RequestBody Food food){
        service.addFoods(food);
    }

    @DeleteMapping("/delete/{code}")
    public void delete(@PathVariable int code){
        service.delete(code);
    }

    @PutMapping("/update/{code}")
    public void update(@RequestBody Food food){
            service.update(food);
    }
}
