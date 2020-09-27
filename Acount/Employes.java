package com.example.foodapp.model.Acount;

import java.util.*;
import com.example.foodapp.model.Acount.*;
import com.example.foodapp.model.Menu.*;
import com.example.foodapp.model.Panier.*;
import com.example.foodapp.model.Controllers.*;
import com.example.foodapp.model.checkout.*;



public class Employes {
        //Constructor 

        public Employes(){
          LastEmployesId=0;
          List_Employes= new  ArrayList<Employes>();     

        }

        public Employes(String Nom , String Prenom, String Email,Restaurant_Function Function ){
                this.Nom=Nom;
                this.Prenom=Prenom;
                this.Email=Email;
                this.Function=Function;
                this.EmployesId=LastEmployesId; LastEmployesId++;
                List_Employes.add(this); 
        }


        //Attributes 

        public static List<Employes> List_Employes;
        public static long LastEmployesId;


        private long EmployesId;
        private String Nom;
        private String Prenom;
        private String Email;
        private Restaurant_Function Function;


        //Setters
        public void setNom(String nom)       {Nom = nom;}
        public void setPrenom(String prenom) {Prenom = prenom;}
        public void setEmail(String email)   {Email = email;}
        public void setFunction(Restaurant_Function function) {Function = function;}




        //Getters

        public long   getEmployesId() {return EmployesId;}
        public String getNom()      {return Nom;}
        public String getPrenom()   {return Prenom; }
        public String getEmail()    {return Email; }
        public Restaurant_Function getFunction() {return Function;}
}