package com.Restaurant.Restaurant.Service;

import com.Restaurant.Restaurant.Models.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoodService {
List<Food> foods = new ArrayList<>(Arrays.asList(new Food("Burger",101,340,4.5),
            new Food("Pizza",102,400,4.7)));


            public List<Food> getAllFoods(){
                return foods;
            }


            public void addFoods(Food food){
            foods.add(food);
            }


    public void delete(int code) {
        int i;
        for (int j = 0; j < foods.size(); j++)
            if (foods.get(j).getCode() == code) {
                i = j;
                foods.remove(i);
            }
    }

    public void update(Food food){
                    int i;
                    for(int j=0;j<foods.size();j++) {
                        if (foods.get(j).getCode() == food.getCode()) {
                            i = j;
                            foods.set(i,food);
                        }
                    }
    }

    public Food getFoodByID(int code){
 return foods.stream().filter(f->f.getCode() == code).findFirst().orElse(new Food("Nothing",0,0,0));
    }

}
