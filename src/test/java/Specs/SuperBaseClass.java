package Specs;

import Helpers.BrowserFactory;
import Helpers.DataHelper;
import Helpers.DriverFactory;
import Helpers.DriverHelper;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperBaseClass {
    //driver
    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver() {

        return driver.get();
    }

    public void setDriver(WebDriver driverParam) {  //call this method to set the driver object

        driver.set(driverParam);
    }

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

        signIn = new SignIn(this.driver.get());
        register = new Register(this.driver.get());
        homepage = new Homepage(this.driver.get());
        puppies= new Puppies(this.driver.get());
        groomers=new Groomers(this.driver.get());
        listMarketplace=new ListMarketplace(this.driver.get());
        trainers=new Trainers(this.driver.get());


    }
    /*Constructor*/
    protected void InitHelpers(String baseUrl){

        dataHelper = new DataHelper();
        driverHelper = new DriverHelper(driver.get(), baseUrl);
        //driverFactory = new DriverFactory();
        //browserFactory = new BrowserFactory();

    }
}
