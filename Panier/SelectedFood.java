

package Panier;

import  java.util.*;
import  com.example.foodapp.model.Acount.*;
import  com.example.foodapp.model.Menu.*;
import  com.example.foodapp.model.Panier.*;
import  com.example.foodapp.model.Controllers.*;
import  com.example.foodapp.model.checkout.*;

public class SelectedFood {
    //Constructor 

    public SelectedFood(Food food,int _QuantitySelected){
            QuantitySelected=_QuantitySelected;
            SellingPrice=food.getUniteprice();  //Remplacer la prix le reel voir avec hichem
            this.food=food;
    }

    //Attributes
    private Food  food;
    private int   QuantitySelected;
    private float SellingPrice;
    

    //Getters
    public Food  getFood()             {   return food;}
    public int   getQuantitySelected() {   return QuantitySelected;}
    public float getSellingPrice()     {   return SellingPrice;}


    //Setters
    public void setSellingPrice(float sellingPrice) {SellingPrice = sellingPrice;}
    
    //Methodes

    public boolean UpdateQuantity(int Quantity){  //update quantity if quantity is 0 remove the product from the Cart
        if(Quantity <0) return false;
           else if(Quantity==0){  
                ShoppingCart.Cart.Liste_SelectedFood.remove(this); return true;
            }
                QuantitySelected=Quantity;
                return true;
    }

    
    











}