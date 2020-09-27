package com.example.foodapp.model.Controllers;

import java.util.*;
import com.example.foodapp.model.Acount.*;
import com.example.foodapp.model.Menu.*;
import com.example.foodapp.model.Panier.*;
import com.example.foodapp.model.Controllers.*;
import com.example.foodapp.model.checkout.*;



public class MenuController {

        

    public static void  InitialiseApplication(){
        new Client("User","User@gmail.com",(long)000000); //Instancier  l'utilisateur
        new ShoppingCart(); //Instancier les shopping Cart
        new Food();         //instancier la Liste des Food et ajouter des food 
        new Employes();
        new Chef("UserAdmin","Admin","UserAdmin@gmail.com");    //instancier la Liste des employes
        CreditCard.LastCardId=(long)0;
        Address.LastAddressId=(long)0;
        //
        
        
        

    }

    public static Food SearchFood(String FoodName){  //Search Food in the List if Exist return the Food else return NULL
        
        FoodName = FoodName.toLowerCase(); // Pour generaliser les recherches
        List<Food> Foods = Food.getList_Food();     
        for(Food food : Foods ){
            if(food.getFoodName().toLowerCase().equals(FoodName)) return food;
        }
        return null;
    } 



    public static boolean AddFoodTocart(Food food){ 
            for (SelectedFood selectedfood : ShoppingCart.Cart.Liste_SelectedFood) {
                if(selectedfood.getFood()==food){
                    selectedfood.UpdateQuantity(selectedfood.getQuantitySelected()+1);
                    return false;
                }
            }
        SelectedFood selected_food= new SelectedFood(food,1);  //Selling price a voir avec hichem
        return ShoppingCart.Cart.AddFood(selected_food); 
    }
//---------------------------------------------------------Format---------------------------------------------------


    public static boolean SearchBarCorrectFormat(String FoodName ){  // to check Corrct Form of input return true if  it's correct else false;
            if( FoodName==null || FoodName.isBlank() || FoodName.isEmpty() ) return false; 
              return true;
    }

    


        //Pour les test
    public static void AddFood(){
        Food.getList_Food().add(new Food("Pizza",0,0,null));
        Food.getList_Food().add(new Food("Shawarma",0,0,null));
        Food.getList_Food().add(new Food("Coca",0,0,null));
        Food.getList_Food().add(new Food("pepsI",0,0,null));
    }


}