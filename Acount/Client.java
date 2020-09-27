
package com.example.foodapp.model.Acount;
import java.util.*;
import com.example.foodapp.model.Acount.*;
import com.example.foodapp.model.Menu.*;
import com.example.foodapp.model.Panier.*;
import com.example.foodapp.model.Controllers.*;
import com.example.foodapp.model.checkout.*;


//------------------------------------------------------------------------------------------------------------
public class Client{
        public static Client client; 
    //Constructor
   
    public Client(String Name,String Email,Long Phone){
        this.Name=Name;
        this.Email=Email;
        this.Phone=Phone;
        client=this;    
        List_CCs= new ArrayList<CreditCard>();
        BillingAdress= new ArrayList<Address>();
        List_Orders = new ArrayList<Order>();
    }
        
    //Attributes

    private String Name;
    private String Email;
    private Long Phone;
    public  List<Address> BillingAdress;
    public  List<CreditCard> List_CCs;
    public  List<Order>  List_Orders;


    //Getters

    public String getName (){return Name;}
    public String getEmail(){return Email;}
    public Long   getPhone(){ return Phone;}
 
    //Setters

    public void setName (String name)   {Name = name;}
    public void setEmail(String email) {Email = email;}
    public void setPhone(Long phone)   {Phone = phone;}

    //Methodes

    public Boolean AddCard(CreditCard Card){  //Ajouter une Carte 
          return  List_CCs.add(Card);
    }

    public Boolean AddAdress(Address _Address){  //Ajouter une Adresse 
        return BillingAdress.add(_Address);
    }
    public boolean AddOrder(Order _Order){  //Ajouter un Article
            return List_Orders.add(_Order);
    }


}

//------------------------------------------------------------------------------------------------------------------

 



