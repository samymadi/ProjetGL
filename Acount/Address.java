
package  com.example.foodapp.model.Acount;

import java.util.*;
import com.example.foodapp.model.Acount.*;
import com.example.foodapp.model.Menu.*;
import com.example.foodapp.model.Panier.*;
import com.example.foodapp.model.Controllers.*;
import com.example.foodapp.model.checkout.*;

public class Address{
    //Constrcutor

    public Address(String _Street, String _City, String _State){
        Street=_Street;
        City=_City;
        State=_State;
        AddressId=LastAddressId; LastAddressId++;
        
        
    }

//Attributes
public  static Long LastAddressId;

private Long   AddressId;
private String Street;
private String City;
private String State;

//Getters

public long   getAddressId() {return AddressId;}
public String getStreet   () {return Street;}
public String getCity     () {return City;}
public String getState    () {return State;}

//Setters
public void setAddressId(long addressId) {AddressId = addressId;}
public void setStreet   (String street)  {Street = street;}
public void setCity     (String city)    {City = city;}
public void setState    (String state)   {State = state;}


}   