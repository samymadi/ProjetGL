
package Acount; 



 

//------------------------------------------------------------------------------------------------------------
public class Client{

    //Constructor

    public Client(String Name,String Email,Long Phone,List<Address> BillingAdress,List<CreditCard> List_CCs){
        this.Name=Name;
        this.Email=Email;
        this.Phone=Phone;
        this.List_CCs=List_CCs;
        this.BillingAdress=BillingAdress;
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

 



