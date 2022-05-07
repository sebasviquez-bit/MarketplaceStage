package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public DriverFactory() {

        //Do not allow to initialize this class from the outside
    }

    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance() {

        return instance;
    }

    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>(); //thread local driver object for Webdriver

    public WebDriver getDriver() {

        return driver.get();
    }

    public void setDriver(WebDriver driverParam) {  //call this method to set the driver object

        driver.set(driverParam);
    }


    public void removeDriver(){

        driver.get().quit();
        driver.remove();

    }

}