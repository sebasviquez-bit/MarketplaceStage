package Specs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SpecsBaseClass extends SuperBaseClass {

    @BeforeMethod public void InitializeTests(Method method) {

        //driver = getDriver(method.getName());
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        //driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        InitHelpers("https://stage.marketplace.akc.org/");
        //InitHelpers("https://marketplace.akc.org/");
        InitPages();

        driver.manage().window().maximize();
        driver.get(driverHelper.baseUrl);
        //driver.switchTo().defaultContent();
    }

    @AfterMethod public  void CleanUpDriver(){
        //driver.switchTo().defaultContent();
        driver.quit();
    }


}
