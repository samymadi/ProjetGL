
package Acount;

import  java.util.*;
import  com.example.foodapp.model.Acount.*;
import  com.example.foodapp.model.Menu.*;
import  com.example.foodapp.model.Panier.*;
import  com.example.foodapp.model.Controllers.*;
import  com.example.foodapp.model.checkout.*;



public class Chef extends server { //Cette sera insrancié une fois 
    

        //Constructor 

        public Chef(){
            chef =this;
            Liste_Employes= new ArrayList<Employes>();
        }

        //Attributes


        private String Name;
        private String Email;

        public static Chef chef;
        public static List<Employes> Liste_Employes;

        //Getters

        public String getName () {return Name;}
        public String getEmail() {return Email; }


        //Setters
        public void setName (String name)  {Name = name; }
        public void setEmail(String email) {Email = email;}


        //Methodes 

        public boolean AddEmployes(Employes employes){
            return  Liste_Employes.add(employes);
        }

        public boolean RemoveEmployes(Employes employes){
            return Liste_Employes.remove(employes);
        }

        public void ConfirmOrder(Order order){
                order.setConfirmationByChef(true);
        }

        public List LesPlatslesMieuxNotés(){
                
            List liste = new ArrayList<Food>();
             for (Food food : Food.getList_Food()) {
                 if(food.getFicheTechnique().getNote()==(double)Note.Bon ); 
             }
        }

}