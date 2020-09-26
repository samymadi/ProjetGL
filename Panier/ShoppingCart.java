

package Panier ;
import java.util.*;

public class ShoppingCart{

    //Contructor 
    public static ShoppingCart Cart ;
    public ShoppingCart(){
            Liste_SelectedFood = new ArrayList<SelectedFood>();
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


}

