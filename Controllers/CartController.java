
package Controllers;
import  java.util.*;
import  com.example.foodapp.model.Acount.*;
import  com.example.foodapp.model.Menu.*;
import  com.example.foodapp.model.Panier.*;
import  com.example.foodapp.model.Controllers.*;
import  com.example.foodapp.model.checkout.*;

public class CartController {
    

    public static boolean DeleteFood(SelectedFood food){
        return ShoppingCart.Cart.RemoveFood(food);
    }

//------------------------------------------------ Format--------------------------------------------------------
s
    public static int CorrectFormatQuantityAndUpdate(String Quantity,SelectedFood food){ //return -1  if format is incorrect, 0 and updatequantity  else
        
        if(Quantity==null || Quantity.isEmpty() || Quantity.isBlank()) return -1;
       try{
            food.UpdateQuantity(Integer.parseInt(Quantity));
            return 0;
           
          }catch(Exception ex){
            return -1;
          }
    }
}