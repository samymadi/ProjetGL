import java.util.*;
import Controllers.*;
import checkout.*;
import Panier.*;
import Acount.*;
import Menu.*;




class Main{
    
    public static void main( String[]  args){
        Food.LastId=0;
        Address.LastAddressId=0;
        Food.List_Food= new ArrayList<Food>();
        MenuController.AddFood();
        ShoppingCart.Cart = new ShoppingCart();
        

        

        
    
        
        
    
    }
}



