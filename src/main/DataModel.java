/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Sirjan
 */
public class DataModel {
    String id,name,category,starIngredients,quantity,price,toppings;

    DataModel(){}
    DataModel(String id,String name,String category,String starIngredients,String quantity,String price,String toppings){
        this.id=id;
        this.name=name;
        this.category =category;
        this.starIngredients=starIngredients;
        this.quantity = quantity;
        this.price = price;
        this.toppings = toppings;
    }
       public String getId(){
           return id;
       }
        public String getName(){
           return name;
       }
         public String getCategory(){
           return category;
       }
          public String getStarIngredients(){
           return starIngredients;
           
       } public String getQuantity(){
           return quantity;
       
       } public String getPrice(){
           return price;
       
       } public String getToppings(){
           return toppings;
       
       }
          
}