package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BrowserFactory {

    public static WebDriver createInstance(String browserName) throws IOException {

        browserName = browserName.toLowerCase();

        if(browserName.equals("chrome"))
            return getChromeInstance();
        if(browserName.equals("safari"))
            return getSafariInstance();
        if(browserName.equals("edge"))
            return getEdgeInstance();
        else
            return getFFInstance();


    }

    public static RemoteWebDriver GetRemoteBrowser(String browserName) throws MalformedURLException {

        DesiredCapabilities capabillities = new DesiredCapabilities();
        RemoteWebDriver driver = null;


        switch (browserName) {
            case "firefox":
                capabillities.setBrowserName(BrowserType.FIREFOX);
                new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabillities);
                break;
        }

        switch (browserName) {
            case "chrome":
                capabillities.setBrowserName(BrowserType.CHROME);
                new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabillities);
                break;
            default:
        }

        capabillities.setJavascriptEnabled(true);
        driver = new RemoteWebDriver(capabillities);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    private static FirefoxDriver getFFInstance() {
        return new FirefoxDriver();
    }

    private static ChromeDriver getChromeInstance() {
        return new ChromeDriver();
    }

    private static SafariDriver getSafariInstance() {
        return new SafariDriver();
    }

    private static EdgeDriver getEdgeInstance() {
        return new EdgeDriver();
    }

}
