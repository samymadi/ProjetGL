class Address{
    //Constrcutor

    public Address(){

    }

//Attributes

private Long   AddressId;
private String Street;
private String City;
private String State;

//Getters

public Long   getAddressId() {return AddressId;}
public String getStreet   () {return Street;}
public String getCity     () {return City;}
public String getState    () {return State;}

//Setters
public void setAddressId(Long addressId) {AddressId = addressId;}
public void setStreet   (String street)  {Street = street;}
public void setCity     (String city)    {City = city;}
public void setState    (String state)   {State = state;}


}   