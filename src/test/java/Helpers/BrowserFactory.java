package Helpers;

import Specs.SuperBaseClass;
import org.apache.commons.exec.CommandLine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory extends SuperBaseClass {

    public static WebDriver createInstance(String browserName)  {

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


    private static FirefoxDriver getFFInstance() {
        return new FirefoxDriver();
    }

        private static ChromeDriver getChromeInstance() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            //options.addArguments("--load-extension=/Users/sebastian.viquez/Library/Application Support/Google/Chrome/Default/Extensions/bkdgflcldnnnapblkhphbgpggdiikppg/2023.7.19_0");
            return new ChromeDriver(options);
        }

    private static SafariDriver getSafariInstance() {
        return new SafariDriver();
    }

    private static EdgeDriver getEdgeInstance() {
        return new EdgeDriver();
    }

}


