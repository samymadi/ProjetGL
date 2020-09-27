
package com.example.foodapp.model.checkout;

import java.util.*;
import com.example.foodapp.model.Acount.*;
import com.example.foodapp.model.Menu.*;
import com.example.foodapp.model.Panier.*;
import com.example.foodapp.model.Controllers.*;
import com.example.foodapp.model.checkout.*;

public class Order{
    //Constructor 
    public Order(double TotalPirice, Date OrderDate, List<SelectedFood> Liste_Food,CreditCard C1){
       OrderId=LastIdOrder;
       LastIdOrder++;
       this.Liste_Food =  Liste_Food;
       Order_Date=OrderDate;
       this.TotalPrice=TotalPirice;
       this.Paiement= C1;
       ConfirmationByChef=false;
       AddFoodToNewList(Liste_Food);
    }

        //Attributes
    private Long  OrderId;
    private double TotalPrice;
    private Date  Order_Date;
    private Shippement Shipping;
    private CreditCard Paiement;
    private boolean ConfirmationByChef;   
    public  List<SelectedFood> Liste_Food;
    

    private static Long LastIdOrder;   //static Attributes
    public static Order CurrentOrder;

    //Getters 

    public Long       getOrderId()      {return OrderId;}
    public double      getTotalPrice()   {return TotalPrice;}
    public Date       getOrder_Date()   {return Order_Date;}
    public Shippement getShipping()     {return Shipping;}
    public CreditCard getPaiement()     {return Paiement;}
    public boolean    getConfirmationByChef() {return ConfirmationByChef;}
    
    
    


    //Setters


    public void setOrderId(Long orderId)             {OrderId = orderId; }
    public void setTotalPrice(double totalPrice)      {TotalPrice = totalPrice;}
    public void setOrder_Date(Date order_Date)       {Order_Date = order_Date;}
    public void setShipping(Shippement shipping)     {Shipping = shipping;}
    public void setPaiement(CreditCard paiement)     {Paiement = paiement;}
    public void setConfirmationByChef(boolean confirmationByChef) {ConfirmationByChef = confirmationByChef; }

    //Methodes
    public boolean placeOrder(Address ShippementAddress){
        Shipping = new  Shippement(ShippementAddress,150);
         return Client.client.List_Orders.add(this);
               

    }

    public boolean CancelOrder(){
        Client.client.List_Orders.remove(this);
        CurrentOrder=null;
        return false;
    }

    public void AddFoodToNewList(List<SelectedFood> selectedFoods){

        for (SelectedFood selectedFood : selectedFoods) {
            Liste_Food.add(selectedFood);   
        }
    }

}



