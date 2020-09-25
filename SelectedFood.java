
public class SelectedFood {
    //Constructor 

    public SelectedFood(int _QuantitySelected, float _SellingPrice){
            QuantitySelected=_QuantitySelected;
            SellingPrice=_SellingPrice;
    }

    //Attributes

    private int   QuantitySelected;
    private float SellingPrice;
    

    //Getters

    public int   getQuantitySelected() {   return QuantitySelected;}
    public float getSellingPrice()     {    return SellingPrice;}


    //Setters
    public void setSellingPrice(float sellingPrice) {SellingPrice = sellingPrice;}
    
    //Methodes

    public boolean UpdateQuantity(int Quantity){
        if(Quantity <=0) return false;
                QuantitySelected=Quantity;
                return true;
    }
    











}