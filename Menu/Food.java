 
package Menu;
import Panier.*;

import java.util.*;

public class Food {

    public static List<Food> List_Food;
     
    //Constructor
    public Food(){}
    public Food(String _FoodName,float _Uniteprice,int _Quantity_In_Stock, FicheTechniqueFood _FicheTechnique){
        FoodName=_FoodName;
        Uniteprice= _Uniteprice;
        Quantity_In_Stock=_Quantity_In_Stock;
        FicheTechnique=_FicheTechnique;
        FoodId=LastId;
        LastId++;  
        List_Food.add(this);    
        
    }


  


    //Attributes
    
    public static int LastId;   //Initialiser la variable statique a 0 au debut du programme;

    private int FoodId;
    private String FoodName;
    private Float Uniteprice;    
    private int Quantity_In_Stock; 
    private FicheTechniqueFood FicheTechnique; 
   
   

    //Getters

    public int         getFoodId           () {return FoodId;}
    public String       getFoodName         () {return FoodName;}
    public FicheTechniqueFood getFicheTechnique() {return FicheTechnique;}
    public Float        getUniteprice       () {return Uniteprice;} 
    public int          getQuantity_In_Stock() {return Quantity_In_Stock;}
    
    public static List<Food> getList_Food() {return List_Food;}
    


    //Setters

    public void setFoodId         (int foodId)           {FoodId = foodId;}
    public void setFoodName       (String foodName)       {FoodName = foodName;}
    public void setFicheTechnique (FicheTechniqueFood ficheTechnique) {FicheTechnique = ficheTechnique;}
    

    //Methodes

    public boolean UpdatePrice(Float New_Price){
        if(New_Price <=0) return false;
                Uniteprice=New_Price; return true;
         
    }
    public boolean Restock(int Quantity){
        if(Quantity <=0) return false;
            Quantity_In_Stock=Quantity;
            return true;
         
    }

    public float CalculerLePrix(){
            return 0.0; // a revoir;
    }

    
}