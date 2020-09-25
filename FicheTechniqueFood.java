

public class FicheTechniqueFood {
    //constructor 
    public FicheTechniqueFood(){

    }


    //Attributes 

    private Conditionnement Conditionnement;
    private FoodType FoodType;
    private FoodCategory Category;
    private String Description;
    private Avis Avis;


    //Getters
    
    public FoodType        getFoodType         () {return FoodType;}
    public Conditionnement getConditionnement  () {return Conditionnement;}
    public FoodCategory    getCategory         () {return Category;}
    public String          getDescription      () {return Description;}
    public Avis            getAvis             () {return Avis;}
    
    


    //Setters


    public void setFoodType       (FoodType foodType)               {FoodType = foodType; }
    public void setConditionnement(Conditionnement conditionnement) {Conditionnement = conditionnement; }
    public void setCategory       (FoodCategory category)           {Category = category;}
    public void setDescription    (String description)              {Description = description;}
    public void setAvis           (Avis avis)                       {Avis = avis;}

    
}