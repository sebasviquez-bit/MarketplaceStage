package Specs;

import Helpers.DataHelper;
import Helpers.DriverHelper;
import Pages.*;
import org.openqa.selenium.WebDriver;

public class SuperBaseClass {
    //driver
    WebDriver driver;

    //pages
    SignIn signIn;
    Register register;
    Homepage homepage;
    Puppies puppies;
    Groomers groomers;
    ListMarketplace listMarketplace;
    Trainers trainers;

    //helpers
    DataHelper dataHelper;
    DriverHelper driverHelper;


    protected void InitPages(){
        signIn = new SignIn(this.driver);
        register = new Register(this.driver, driverHelper);
        homepage = new Homepage(this.driver);
        puppies= new Puppies(this.driver);
        groomers=new Groomers(this.driver);
        listMarketplace=new ListMarketplace(this.driver);
        trainers=new Trainers(this.driver);


    }
    /*Constructor*/
    protected void InitHelpers(String baseUrl){
        dataHelper = new DataHelper();
        driverHelper = new DriverHelper(driver, baseUrl);
    }
}
