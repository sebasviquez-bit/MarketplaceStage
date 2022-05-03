package Specs;

import Helpers.BrowserFactory;
import Helpers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static Helpers.DriverFactory.getInstance;

public class SpecsBaseClass extends SuperBaseClass {

    @Parameters({"browserName", "baseUrl"})
    @BeforeMethod
    void InitializeTests(String browserName, String baseUrl) throws IOException {

        driver = BrowserFactory.createInstance(browserName);
        DriverFactory.getInstance().setDriver(driver);
        driver = DriverFactory.getInstance().getDriver();

        //driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        //driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.navigate().to("https://stage.marketplace.akc.org/");
        //InitHelpers();
        InitPages();
        //driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void CleanUpDriver(){
        //driver.switchTo().defaultContent();
        DriverFactory.getInstance().removeDriver();
        //driver.quit();
    }


}
