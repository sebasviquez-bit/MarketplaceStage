package Pages;

import Helpers.BrowserFactory;
import Helpers.DriverHelper;
import Model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/a/span")
    WebElement iconsignin;

    @FindBy(css = "#gigya-login-form > div:nth-child(3) > div.gigya-layout-row.gigya-layout-row-login-create-account > a")
    WebElement CreateAccount;

    @FindBy(xpath = "//*[@id='gigya-register-form']/div[1]/div[5]/div[2]/input")
    WebElement password2;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[4]/div[1]/input")
    WebElement firstName;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[5]/div[1]/input")
    WebElement lastName;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[3]/input")
    WebElement userName;

    @FindBy(xpath = "//*[@id='gigya-register-form']/div[1]/div[4]/div[2]/input")
    WebElement password1;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[5]/div/input")
    WebElement registrarse;

    DriverHelper driverHelper;
    //DriverFactory driverFactory;
    BrowserFactory browserFactory;


    WebDriver driver;

    // Initalize WebDriver*/
    public Register(WebDriver _driver){

        //this.driverFactory = new DriverFactory();
        this.browserFactory = new BrowserFactory();
        this.driver = _driver;
        //this.driverHelper = _driveHelper;
        PageFactory.initElements(driver,this);
    }

    // Register user*/
    public void registerUser(User _testUser)  {
        this.iconsignin.click();
        this.CreateAccount.click();
        this.userName.sendKeys(_testUser.username);
        this.firstName.sendKeys(_testUser.firstName);
        this.lastName.sendKeys(_testUser.lastName);
        this.password1.sendKeys(_testUser.password1);
        this.password2.sendKeys(_testUser.password2);
        this.registrarse.click();
        this.iconsignin.isDisplayed();
    }

}
