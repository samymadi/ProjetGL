
package com.example.foodapp.model.checkout;

import java.util.*;
import com.example.foodapp.model.Acount.*;
import com.example.foodapp.model.Menu.*;
import com.example.foodapp.model.Panier.*;
import com.example.foodapp.model.Controllers.*;
import com.example.foodapp.model.checkout.*;


public class Shippement {
 
    public Shippement(Address Ad, float ShippingPrice){
            Ship_Address=Ad;
            this.ShippingPrice=ShippingPrice;
            Shipped=false;
            Ship_Date=new Date();
            ShipTracking=ShipTrakingPosition.Au_Restaurant;
            
    }


    //Attributes
    private Address Ship_Address;
    private boolean Shipped;
    private float ShippingPrice;
    private Date    Shipped_Date;
    private Date    Ship_Date;
    private ShipTrakingPosition  ShipTracking;

    //Getters 

      public Address getShip_Address()     {return Ship_Address;}
      public float   getShippingPrice()    {return ShippingPrice;}
      public boolean GetShipped()          {return Shipped;}
      public Date    getShipped_Date()     {return Shipped_Date;}
      public Date    Ship_Date()           {return Ship_Date;}
      public ShipTrakingPosition  getShipTracking()     {return ShipTracking;}

      //Setters 
      public void setShip_Address(Address ship_Address)              {Ship_Address = ship_Address;}
      public void setShippingPrice(float shippingPrice)              {ShippingPrice = shippingPrice;}
      public void setShipped(boolean shipped)                        {Shipped = shipped; }
      public void setShipped_Date(Date shipped_Date)                 {Shipped_Date = shipped_Date;}
      public void setShipTracking(ShipTrakingPosition shipTracking)  {ShipTracking = shipTracking;}

      

      //Methodes

       
}

