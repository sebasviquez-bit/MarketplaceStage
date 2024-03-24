package Pages;

import Helpers.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PCT {

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/section[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement Password;

    @FindBy(css = "#login > section > button")
    WebElement LoginButton;

    @FindBy(css = "#content-table > tbody > tr")
    WebElement BreederTableRow;

    @FindBy(css = "#react-root > div > header > div.main-content > div.user-options > a")
    WebElement Logout;


    //DriverHelper driverHelper;
    BrowserFactory browserFactory;

    WebDriver driver;

    public PCT(WebDriver _driver) {

        //driverFactory = new DriverFactory();
        browserFactory = new BrowserFactory();
        driver = _driver;
        PageFactory.initElements(driver, this);
    }

    public void PCTLoginGermanPinscher(String sPassword) {

        driver.navigate().to("https://stage.marketplace.akc.org/parent-club-tool/116/german-pinscher/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(Password));
        Password.sendKeys(sPassword);
        wait.until(ExpectedConditions.elementToBeClickable(LoginButton)).click();
        wait.until(ExpectedConditions.urlContains("/parent-club-tool/116/german-pinscher/member-management"));
        wait.until(ExpectedConditions.visibilityOf(BreederTableRow));

    }

    public void PCTLoginFoxTerrier() {

        driver.navigate().to("https://stage.marketplace.akc.org/parent-club-tool/228/smooth-fox-terrier/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(Password));
        Password.sendKeys("bf3ee843e45b");
        wait.until(ExpectedConditions.elementToBeClickable(LoginButton)).click();
        wait.until(ExpectedConditions.urlContains("/parent-club-tool/228/smooth-fox-terrier/member-management"));
        wait.until(ExpectedConditions.elementToBeClickable(Logout)).click();

    }





}
