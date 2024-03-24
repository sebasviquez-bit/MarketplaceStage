package Model;

public class User {

    public String firstName;
    public String lastName;
    public String username;

    public String password;
    public String password1;
    public String password2;


    /*Fill User Login and Register*/
    public User(String firstName, String lastName, String username, String password1, String password2){
        firstName = firstName;
        lastName = lastName;
        username = username;
        password1 = password1;
        password2 = password2;
    }

    public User(String username, String password){
        username = username;
        password = password;
    }

}
