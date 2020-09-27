
package com.example.foodapp.model.Acount;

import java.util.*;
import com.example.foodapp.model.Acount.*;
import com.example.foodapp.model.Menu.*;
import com.example.foodapp.model.Panier.*;
import com.example.foodapp.model.Controllers.*;
import com.example.foodapp.model.checkout.*;



public class Chef extends Livreur { //Cette sera insrancié une fois 
    

        //Constructor 

        public Chef(String Nom, String Prenom,String Email){
            super(Nom,Prenom,Email);
            setFunction(Restaurant_Function.Chef);
            Liste_Employes= new ArrayList<Employes>();
            Liste_Order = new ArrayList<Order>(); 
            chef=this;
            Liste_Employes.add(this);    
        
        }

        //Attributes



        public static Chef chef;
        public static List<Employes> Liste_Employes;
        public static List<Order> Liste_Order;

        


        //Methodes 

        //Gestion des Comptes

        public boolean RemoveEmployes(Employes employes){
            return Liste_Employes.remove(employes);
        }

        

        //Statistiques

        public List<Food> LesPlatslesMieusNotés(){   //Recuperer La listes des MeuilleursPalats

            float GreatestNote=0;   
            List<Food> liste = new ArrayList<Food>();
             for (Food food : Food.getList_Food()) {
                 if(food.getFicheTechnique().getNote() > GreatestNote) GreatestNote= food.getFicheTechnique().getNote();
             }

             for (Food food : Food.getList_Food()) {
                 if(food.getFicheTechnique().getNote()==GreatestNote) liste.add(food);
             }

            return liste; 
        }

        public List<Livreur> Le_livreur_du_mois(){
            List<Livreur> Liste = new ArrayList<Livreur>();
            int Nombre=0;
                for (Employes livreur : List_Employes) {
                    if(livreur instanceof Livreur){
                        if(((Livreur)livreur).getNombre_De_livraison() > Nombre)
                            Nombre=((Livreur)livreur).getNombre_De_livraison();
                }
            }
                for (Employes livreur : List_Employes) {
                    if(livreur instanceof Livreur){
                            if(((Livreur)livreur).getNombre_De_livraison()==Nombre){
                                Liste.add((Livreur)livreur);
                            }
                    }
                }
               return Liste; 
        }

       

        


        //Controlle Taches


        public boolean AttribuerUneLivraison(Livreur L, Shippement Sh){
            
           return L.getList_Shippement().add(Sh);
        }

        public void ConfirmOrder(Order order){
            order.setConfirmationByChef(true);
        }

}