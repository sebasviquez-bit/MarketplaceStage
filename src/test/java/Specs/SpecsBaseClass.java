package Specs;

import Helpers.BrowserFactory;
import Helpers.DriverFactory;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.StdoutLogHandler;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.ArrayList;


public class SpecsBaseClass extends SuperBaseClass {

    @BeforeMethod
    void InitializeTests() {

        driver.set(BrowserFactory.createInstance("chrome"));
        DriverFactory.getInstance().setDriver(driver.get());
        (driver.get()).navigate().to("https://stage.marketplace.akc.org/");
        //((JavascriptExecutor) driver.get()).executeScript("window.open()");
        //ArrayList<String> tabs = new ArrayList<>((driver.get()).getWindowHandles());
        //(driver.get()).switchTo().window(tabs.get(0));
        //(driver.get()).navigate().refresh();
        //InitHelpers();
        InitPages();
        (driver.get()).manage().window().maximize();
        (driver.get()).manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //(driver.get()).manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);


        this.eyes = new Eyes();
        this.eyes.setApiKey("yxgKHBE8Ivs0ofLuixQ8ouFuuDr0chkYR1003A0P1cbbU110");   //MP APY KEY
        //this.eyes.setConfiguration(VisualGridConfig.getGrid());
        this.eyes.setLogHandler(new StdoutLogHandler());
        this.eyes.setForceFullPageScreenshot(true);
        this.eyes.setStitchMode(StitchMode.CSS);
        this.eyes.setMatchLevel(MatchLevel.CONTENT);
        //this.eyes.setSendDom(true); //RCA related


    }

    @AfterMethod
    public void CleanUpDriver(){
        //driver.switchTo().defaultContent();
        DriverFactory.getInstance().removeDriver();
        //driver.quit();
    }


}

