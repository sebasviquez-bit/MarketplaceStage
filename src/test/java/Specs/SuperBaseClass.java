package Specs;

import Helpers.BrowserFactory;
import Helpers.DataHelper;
import Helpers.DriverFactory;
import Helpers.DriverHelper;
import Pages.*;
import org.openqa.selenium.WebDriver;

public class SuperBaseClass {
    //driver
    public WebDriver driver = null;




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
    DriverFactory driverFactory;
    BrowserFactory browserFactory;


    protected void InitPages(){

        signIn = new SignIn((WebDriver) this.driver);
        register = new Register((WebDriver) this.driver);
        homepage = new Homepage((WebDriver) this.driver);
        puppies= new Puppies((WebDriver) this.driver);
        groomers=new Groomers((WebDriver) this.driver);
        listMarketplace=new ListMarketplace((WebDriver) this.driver);
        trainers=new Trainers((WebDriver) this.driver);


    }
    /*Constructor*/
    protected void InitHelpers(String baseUrl){

        dataHelper = new DataHelper();
        //driverHelper = new DriverHelper(driver, baseUrl);
        driverFactory = new DriverFactory();
        browserFactory = new BrowserFactory();

    }
}
