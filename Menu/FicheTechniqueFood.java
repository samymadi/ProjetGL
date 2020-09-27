
package com.example.foodapp.model.Menu;
import java.util.*;
import com.example.foodapp.model.Acount.*;
import com.example.foodapp.model.Menu.*;
import com.example.foodapp.model.Panier.*;
import com.example.foodapp.model.Controllers.*;
import com.example.foodapp.model.checkout.*;


public class FicheTechniqueFood {
    //constructor 
     public FicheTechniqueFood(Conditionnement _conditionnement,FoodType _FoodType, FoodCategory _Category, float _Note,String[] _Ingrédients,String _Description){
         conditionnement=_conditionnement;
         FoodType=_FoodType;
         Category=_Category;
         Note=_Note;
         Ingrédients=_Ingrédients;
         Description=_Description;
     }

    


    //Attributes 

    private Conditionnement conditionnement;
    private FoodType FoodType;
    private FoodCategory Category;
    private String Description;
    private float Note;
    private String[] Ingrédients;


    //Getters
    
    public FoodType        getFoodType         () {return FoodType;}
    public Conditionnement getConditionnement  () {return conditionnement;}
    public FoodCategory    getCategory         () {return Category;}
    public String          getDescription      () {return Description;}
    public float            getNote             () {return Note;}
    public String[]        getIngrédients      () {return Ingrédients; }
    
    


    //Setters


    public void setFoodType       (FoodType foodType)               {FoodType = foodType; }
    public void setConditionnement(Conditionnement conditionnement) {this.conditionnement = conditionnement; }
    public void setCategory       (FoodCategory category)           {Category = category;}
    public void setDescription    (String description)              {Description = description;}
    public void setNote           (float Note)                       {this.Note = Note;}



    //Methodes 
     
}