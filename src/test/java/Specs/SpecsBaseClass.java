package Specs;

import Helpers.BrowserFactory;
import Helpers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static Helpers.DriverFactory.getInstance;

public class SpecsBaseClass extends SuperBaseClass {

    @BeforeMethod
    void InitializeTests() throws MalformedURLException {

        driver.set(BrowserFactory.createInstance("chrome"));
        DriverFactory.getInstance().setDriver(driver.get());

        (driver.get()).navigate().to("https://stage.marketplace.akc.org/");
        //InitHelpers();
        InitPages();
        (driver.get()).manage().window().maximize();
        (driver.get()).manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void CleanUpDriver(){
        //driver.switchTo().defaultContent();
        DriverFactory.getInstance().removeDriver();
        //driver.quit();
    }


}

