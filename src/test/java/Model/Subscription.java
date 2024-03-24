package Model;

public class Subscription {

    public String Email;
    public String Password;
    public String CreditCard;
    public String ExpDate;
    public String CVV;
    public String FirstName;
    public String LastName;
    public String Address;
    public String ZIP;
    public String Phone;
    public String Kenname;
    public String Weblink;
    public String Descken;
    public String Breedsince;
    public String Website;
    public String Address2;
    public String ZIP2;
    public String Phone2;


    /*Fill Subscription Breeder*/
        public Subscription(String Email, String Password, String CreditCard, String ExpDate, String CVV, String FirtsName, String LastName, String Address, String ZIP, String Phone, String Kenname, String Weblink, String Descken, String Breedsince, String Website, String Address2, String ZIP2, String Phone2){

            Email=Email;
            Password=Password;
            CreditCard=CreditCard;
            ExpDate=ExpDate;
            CVV=CVV;
            FirstName=FirtsName;
            LastName=LastName;
            Address=Address;
            ZIP=ZIP;
            Phone=Phone;
            Kenname=Kenname;
            Weblink=Weblink;
            Descken=Descken;
            Breedsince=Breedsince;
            Website=Website;
            Address2=Address2;
            ZIP2=ZIP2;
            Phone2=Phone2;

        }

    }
