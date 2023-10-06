package Specs;

import Helpers.BrowserFactory;
import Helpers.DataHelper;
import Helpers.DriverFactory;
import Helpers.DriverHelper;
import Pages.*;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperBaseClass {
    //driver
    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public Eyes eyes;

    //pages
    SignIn signIn;
    Register register;
    Homepage homepage;
    Puppies puppies;
    Groomers groomers;
    ListMarketplace listMarketplace;
    Trainers trainers;
    PCT pct;

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
        pct=new PCT(this.driver.get());


    }
    /*Constructor*/
    protected void InitHelpers(){

        dataHelper = new DataHelper();
        driverHelper = new DriverHelper(this.driver.get());
        //driverFactory = new DriverFactory();
        //browserFactory = new BrowserFactory();

    }
}
