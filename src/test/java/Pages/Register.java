package Pages;

import Helpers.BrowserFactory;

import Model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div.Styled__Wrapper-sc-rvwmv6-0.gffKrQ > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div > div.header-icon-container.user-menu > a > span")
    WebElement iconsignin;

    @FindBy(css = "#gigya-login-form > div:nth-child(3) > div.gigya-layout-row.gigya-layout-row-login-create-account > a")
    WebElement CreateAccount;

    @FindBy(css = "#gigya-register-form > div:nth-child(1) > div:nth-child(7) > div.gigya-composite-control.gigya-composite-control-password > input")
    WebElement password2;

    @FindBy(css = "#gigya-register-form > div:nth-child(1) > div:nth-child(6) > div.gigya-composite-control.gigya-composite-control-textbox > input")
    WebElement firstName;

    @FindBy(css = "#gigya-register-form > div:nth-child(1) > div:nth-child(7) > div.gigya-composite-control.gigya-composite-control-textbox > input")
    WebElement lastName;

    @FindBy(css = "#gigya-register-form > div:nth-child(1) > div:nth-child(5) > input")
    WebElement userName;

    @FindBy(css = "#gigya-register-form > div:nth-child(1) > div:nth-child(6) > div.gigya-composite-control.gigya-composite-control-password > input")
    WebElement password1;

    @FindBy(css = "#gigya-register-form > div:nth-child(5) > div > input")
    WebElement registrarse;


    //DriverFactory driverFactory;
    BrowserFactory browserFactory;


    WebDriver driver;

    // Initalize WebDriver*/
    public Register(WebDriver _driver){

        //driverFactory = new DriverFactory();
        browserFactory = new BrowserFactory();
        driver = _driver;
        //driverHelper = _driveHelper;
        PageFactory.initElements(driver,this);
    }

    // Register user*/
    public void registerUser(User _testUser)  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        wait.until(ExpectedConditions.elementToBeClickable(CreateAccount)).click();
        userName.sendKeys(_testUser.username);
        firstName.sendKeys(_testUser.firstName);
        lastName.sendKeys(_testUser.lastName);
        password1.sendKeys(_testUser.password1);
        password2.sendKeys(_testUser.password2);
        wait.until(ExpectedConditions.elementToBeClickable(registrarse)).click();
        wait.until(ExpectedConditions.visibilityOf(iconsignin));
    }

}
