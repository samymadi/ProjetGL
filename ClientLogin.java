

import java.util.*;

class ClientLogin{
    //Constructor  
    public ClientLogin(String Username ,String Password ){
        
        this.Username= Username;
        this.Password= Password;
    }
    //Attributes
        private long LoginId;
        private long ClientId;
        private String Username;
        private String Password;


     //Getters
        public long   getLoginId ()  {return LoginId;}
        public long   getClientId()  {return ClientId;}
        public String getUsername()  {return Username;}
        public String getPassword()  {return Password;}
     //Setters   
        public void setLoginId (long loginId)     {LoginId = loginId;}
        public void setClientId(long clientId)   {ClientId = clientId;}
        public void setUsername(String username) {Username = username;}
        public void setPassword(String password) { Password = password;}
        
      //Methodes  
    protected Boolean Connected(){     //Verifier si le mot de passe et le UserName sont correctes
      return true;  //Client _Client  = AccesDataBase();

    } 
    protected Boolean disconneted(){   //Se déconnecter
        return true;
    }         
}