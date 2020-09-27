

package Panier ;
import  java.util.*;
import  com.example.foodapp.model.Acount.*;
import  com.example.foodapp.model.Menu.*;
import  com.example.foodapp.model.Panier.*;
import  com.example.foodapp.model.Controllers.*;
import  com.example.foodapp.model.checkout.*;


public class ShoppingCart{

    //Contructor 
    public static ShoppingCart Cart ;
    public ShoppingCart(){
            Liste_SelectedFood = new ArrayList<SelectedFood>();
            Cart=this;
    }

    //Attributes 

     public List<SelectedFood> Liste_SelectedFood; 


    //Methodes 

    public boolean AddFood(SelectedFood Food){
      return Liste_SelectedFood.add(Food);
    }

    public boolean RemoveFood(SelectedFood Food){   
      return Liste_SelectedFood.remove(Food);
    }

    public double GetTotalPrice(){
            double TotalPrice=0;

            for(SelectedFood selectedFood : Liste_SelectedFood) {
                TotalPrice+=selectedFood.getFood().getUniteprice(); // a revoir avec Hichemmmm *****
            }

            return TotalPrice;
    }

    public void GoToCheckout(CreditCard C1){

      Order.CurrentOrder= new Order(GetTotalPrice(),new Date(),Liste_SelectedFood,C1);
    }


}

