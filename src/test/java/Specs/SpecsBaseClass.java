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

    @Parameters({"browserName", "baseUrl"})
    @BeforeMethod
    void InitializeTests(String browserName, String baseUrl) throws MalformedURLException {

        driver.set(BrowserFactory.createInstance("chrome"));
        DriverFactory.getInstance().setDriver((WebDriver) driver);
        driver = (ThreadLocal) DriverFactory.getInstance().getDriver();

        //driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        //driver = new SafariDriver();
        ((WebDriver) driver).manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        ((WebDriver) driver).navigate().to("https://stage.marketplace.akc.org/");
        //InitHelpers(baseUrl);
        InitPages();;
        ((WebDriver) driver).manage().window().maximize();
    }

    @AfterMethod
    public void CleanUpDriver(){
        //driver.switchTo().defaultContent();
        DriverFactory.getInstance().removeDriver();
        //driver.quit();
    }


}
