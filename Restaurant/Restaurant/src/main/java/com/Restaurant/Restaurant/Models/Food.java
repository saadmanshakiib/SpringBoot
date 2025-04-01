package com.Restaurant.Restaurant.Models;

public class Food {
    private int price;
    private String name;
    private int code;
    private double rating;

    public Food(String name,int code,int price,double rating){
        this.name = name;
        this.code = code;
        this.price = price;
        this.rating = rating;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setCode(int code){
        this.code = code;
            }

            public void setPrice(int price){
        this.price = price;
            }

            public void setRating(double rating){
        this.rating = rating;
            }

            public String getName(){return this.name;}
                public int getPrice(){return this.price;}
            public int getCode(){return this.code;}
            public double getRating(){return this.rating;};


    public void addFood(Food food){

    }
}
