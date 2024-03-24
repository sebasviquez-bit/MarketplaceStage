package Specs;

import Helpers.BrowserFactory;
import Helpers.DataHelper;
import Helpers.DriverFactory;

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

    DriverFactory driverFactory;
    BrowserFactory browserFactory;


    protected void InitPages() {

        signIn = new SignIn(driver.get());
        register = new Register(driver.get());
        homepage = new Homepage(driver.get());
        puppies= new Puppies(driver.get());
        groomers=new Groomers(driver.get());
        listMarketplace=new ListMarketplace(driver.get());
        trainers=new Trainers(driver.get());
        pct=new PCT(driver.get());


    }

}
