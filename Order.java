
import java.util.*;
import java.time.*;


public class Order{
    //Constructor 
    public Order(float TotalPirice, Date OrderDate){
       OrderId=LastIdOrder;
       LastIdOrder++;
    }

        //Attributes
    private Long  OrderId;
    private float TotalPrice;
    private float ShippingPrice;
    private Date  Order_Date;
    private Shippement Shipping;
    private CreditCard Paiement;
    private boolean ConfirmationByChef;   
    public  List<SelectedFood> Liste_Food;

    private static Long LastIdOrder;   //static Attributes

    //Getters 

    public Long       getOrderId()      {return OrderId;}
    public float      getTotalPrice()   {return TotalPrice;}
    public float      getShippingPrice(){return ShippingPrice;}
    public Date       getOrder_Date()   {return Order_Date;}
    public Shippement getShipping()     {return Shipping;}
    public CreditCard getPaiement()     {return Paiement;}
    
    


    //Setters


    public void setOrderId(Long orderId)             {OrderId = orderId; }
    public void setTotalPrice(float totalPrice)      {TotalPrice = totalPrice;}
    public void setShippingPrice(float shippingPrice){ShippingPrice = shippingPrice;}
    public void setOrder_Date(Date order_Date)       {Order_Date = order_Date;}
    public void setShipping(Shippement shipping)     {Shipping = shipping;}
    public void setPaiement(CreditCard paiement)     {Paiement = paiement;}

    //Methodes
    public boolean placeOrder(){

    }

    public boolean CancelOrder(){

    }

}



