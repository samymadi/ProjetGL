
import java.util.*;

public class ShoppingCart{

    //Contructor 

    ShoppingCart(){

    }

    //Attributes 

     List<SelectedFood> Liste_SelectedFood;


    //Methodes 

    public boolean AddFood(SelectedFood Food){
       return  true;// Liste_SelectedFood.add(Food);
    }

    public boolean RemoveFood(SelectedFood Food){
        return  true;//Liste_SelectedFood.remove(Food);
    }

    public double GetTotalPrice(){
            return 0;
    }


}

