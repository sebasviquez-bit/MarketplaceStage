package Helpers;

import org.openqa.selenium.WebDriver;

public class DriverHelper {

    public WebDriver driver;

    public String baseUrl;


    public DriverHelper(WebDriver webDriver) {

            driver = webDriver;
            this.baseUrl = baseUrl;
        }
}


