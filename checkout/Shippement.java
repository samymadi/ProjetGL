
package checkout;

import java.util.*;
public class Shippement {
 
    public Shippement(){
            Ship_Date=new Date();
    }


    //Attributes
    private Long    ShipId;
    private Address Ship_Address;
    private boolean Shipped;
    private Date    Shipped_Date;
    private Date    Ship_Date;
    private ShipTrakingPosition  ShipTracking=ShipTrakingPosition.Au_Restaurant;

    //Getters 

      public Long    getShipId()           {return ShipId;}
      public Address getShip_Address()     {return Ship_Address;}
      public boolean GetShipped()          {return Shipped;}
      public Date    getShipped_Date()     {return Shipped_Date;}
      public Date    Ship_Date()           {return Ship_Date;}
      public ShipTrakingPosition  getShipTracking()     {return ShipTracking;}

      //Setters 

      public void setShipId(Long shipId)                             {ShipId = shipId;  }
      public void setShip_Address(Address ship_Address)              {Ship_Address = ship_Address;}
      public void setShipped(boolean shipped)                        {Shipped = shipped; }
      public void setShipped_Date(Date shipped_Date)                 {Shipped_Date = shipped_Date;}
      public void setShipTracking(ShipTrakingPosition shipTracking)  {ShipTracking = shipTracking;}

      

      //Methodes

      public double GetShippingPrice(){
            return 0;
      }

      public String ShippTracking(){
            return null;
      }   
}