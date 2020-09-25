
import java.util.*;

public class ShoppingCart{

    //Contructor 

    ShoppingCart(){

    }

    //Attributes 

     List<SelectedFoods> Liste_SelectedFood;


    //Methodes 

    public boolean AddFood(SelectedFoods Food){
       return  true;// Liste_SelectedFood.add(Food);
    }

    public boolean RemoveFood(SelectedFoods Food){
        return  true;//Liste_SelectedFood.remove(Food);
    }

    public double GetTotalPrice(){
            return 0;
    }


}

