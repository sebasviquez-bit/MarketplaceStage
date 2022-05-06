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

        return (WebDriver) driver.get();
    }

    public void setDriver(WebDriver driverParam) {  //call this method to set the driver object

        driver.set(new ChromeDriver());
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
        driverHelper = new DriverHelper((WebDriver) driver, baseUrl);
        //driverFactory = new DriverFactory();
        //browserFactory = new BrowserFactory();

    }
}
