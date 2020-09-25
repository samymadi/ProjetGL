public class Food {
    //Constructor

    public Food(){

    }


    //Attributes

    private Long FoodId;
    private String FoodName;
    private FicheTechniqueFood FicheTechnique; 
    private String Unit;   // a revoir avec hichem
    private Float Uniteprice;    
    private int Quantity_In_Stock; 
   
   

    //Getters
    public Long         getFoodId           () {return FoodId;}
    public String       getFoodName         () {return FoodName;}
    public FicheTechniqueFood getFicheTechnique() {return FicheTechnique;}
    public String       getUnit             () {return Unit;}    // a revoir avce hichem
    public Float         getUniteprice       () {return Uniteprice;} 
    public int          getQuantity_In_Stock() {return Quantity_In_Stock;}
    


    //Setters
    public void setFoodId         (Long foodId)           {FoodId = foodId;}
    public void setFoodName       (String foodName)       {FoodName = foodName;}
    public void setFicheTechnique (FicheTechniqueFood ficheTechnique) {FicheTechnique = ficheTechnique;}
    public void setUnit           (String unit)           {Unit = unit;}
    

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
}