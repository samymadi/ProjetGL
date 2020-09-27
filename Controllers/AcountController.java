
package Controllers;

import  java.util.*;
import  com.example.foodapp.model.Acount.*;
import  com.example.foodapp.model.Menu.*;
import  com.example.foodapp.model.Panier.*;
import  com.example.foodapp.model.Controllers.*;
import  com.example.foodapp.model.checkout.*;


public  class AcountController {
    





//----------------------------------------------------Format-----------------------------------------------------

        public static int CorrectFormatAndUpdateInformation_Address(String Street,String City ,String State){
                
            if(Street== null || Street.isEmpty() || Street.isBlank()) return -1;
            if(City== null  || City.isEmpty() || City.isBlank())       return -1;
            if(State== null || State.isEmpty() || State.isBlank())    return -1;
            
            
            return -1;
        } 
}