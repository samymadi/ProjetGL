
package com.example.foodapp.model.Acount;

import java.util.*;
import com.example.foodapp.model.Acount.*;
import com.example.foodapp.model.Menu.*;
import com.example.foodapp.model.Panier.*;
import com.example.foodapp.model.Controllers.*;
import com.example.foodapp.model.checkout.*;


public class Livreur extends Employes {
    
    //Constructor 

    public Livreur(){
        
    }
    public Livreur(String Nom,String Prenom,String Email){
       super(Nom,Prenom,Email,Restaurant_Function.Livreur);
       List_Shippement = new ArrayList<Shippement>();
       Nombre_De_livraison=0;
       List_Employes.add(this);
    }


   //Attributes 

   public static List<Livreur> List_Livreur;

   private List<Shippement> List_Shippement;
   private int Nombre_De_livraison;

   //Getters

    public List<Shippement> getList_Shippement() {return List_Shippement;}
    public int getNombre_De_livraison()          {return Nombre_De_livraison;}

   //Setters

   public void setNombre_De_livraison(int nombre_De_livraison) { Nombre_De_livraison = nombre_De_livraison;}

   //Methodes

   public void setShipTraking(Shippement shippement,ShipTrakingPosition Position){
        
      shippement.setShipTracking(Position);

        if(Position==ShipTrakingPosition.Arrivé){ //Si le livreur est Arrivé Confirmer la livrison et la supprimer de sa liste de livraison
             shippement.setShipped(true);
             shippement.setShipped_Date(new Date());
             List_Shippement.remove(shippement); 
             Nombre_De_livraison++;      
            }
   }

   
}