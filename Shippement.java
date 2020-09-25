
public class Shippement {
 
    public Shippement(){

    }


    //Attributes
    private Long    ShipId;
    private Address Ship_Address;
    private boolean Shipped;
    private Date    Shipped_Date;
    private Time    Shipped_Time;
    private String  ShipTracking;

    //Getters 

      public Long    getShipId()           {return ShipId;}
      public Address getShip_Address()     {return Ship_Address;}
      public boolean GetShipped()          {return Shipped;}
      public Date    getShipped_Date()     {return Shipped_Date;}
      public Time    getShipped_Time()     {return Shipped_Time;}
      public String  getShipTracking()     {return ShipTracking;}

      //Setters 

      public void setShipId(Long shipId)                {ShipId = shipId;  }
      public void setShip_Address(Address ship_Address) {Ship_Address = ship_Address;}
      public void setShipped(boolean shipped)           {Shipped = shipped; }
      public void setShipped_Date(Date shipped_Date)    {Shipped_Date = shipped_Date;}
      public void setShipped_Time(Time shipped_Time)    {Shipped_Time = shipped_Time;}
      public void setShipTracking(String shipTracking)  {ShipTracking = shipTracking;}

      

      //Methodes

      public double GetShippingPrice(){

      }

      public String ShippTracking(){

      }   
}