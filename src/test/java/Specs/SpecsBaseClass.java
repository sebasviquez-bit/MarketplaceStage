package Specs;

import Helpers.BrowserFactory;
import Helpers.DriverFactory;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.StdoutLogHandler;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


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
        (driver.get()).manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //(driver.get()).manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        eyes = new Eyes();
        //eyes = new Eyes(new VisualGridRunner(7));
        //eyes.setApiKey("TFEmYnRT4Jkaz1ElA0OGm103pHyrUvV7V0WH2JQS6jt2g110");
        eyes.setApiKey("yxgKHBE8Ivs0ofLuixQ8ouFuuDr0chkYR1003A0P1cbbU110");
        //eyes.setConfiguration(VisualGridConfig.getGrid());
        eyes.setLogHandler(new StdoutLogHandler());
        eyes.setForceFullPageScreenshot(true);
        eyes.setStitchMode(StitchMode.CSS);
        //eyes.setMatchLevel(MatchLevel.IGNORE_COLORS);
        eyes.setSendDom(true); //RCA related


    }

    @AfterMethod
    public void CleanUpDriver(){
        //driver.switchTo().defaultContent();
        DriverFactory.getInstance().removeDriver();
        //driver.quit();
    }


}

