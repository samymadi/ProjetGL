
package Acount;

public class CreditCard{
    //Constructor 

    public CreditCard(String CardName, String CardNum,Date ExpDate){
            this.CardId=LastCardId; LastCardId++;
            this.CardName=CardName;
            this.CardNum=CardNum;
            this.ExpDate=ExpDate;
    }

           //Attributes   
           public static Long LastCardId;
           
           private Long   CardId;
           private String CardName;
           private String CardNum;
           private Date   ExpDate;
           
           //Getters
           
           public Long   getCardId  ()  {return CardId;}
           public String getCardName()  {return CardName;}
           public String getCardNum ()  {return CardNum;}
           public Date   getExpDate ()  {return ExpDate;}
           
           //Setters
           public void setCardId  (Long cardId)     {CardId = cardId;}
           public void setCardName(String cardName) {CardName = cardName;}
           public void setCardNum (String cardNum)  {CardNum = cardNum;}
           public void setExpDate (Date expDate)    {ExpDate = expDate;}


}