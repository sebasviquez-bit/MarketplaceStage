package Pages;

import Helpers.DataHelper;
import Model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {


    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[3]/input")
    WebElement userName;


    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[4]/input")
    WebElement password;


    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[3]/div/input")
    WebElement ingresar;


    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/a/span")
    WebElement iconsignin;

    @FindBy(css = "#react-root > div > div.sc-iwsKbI.fSqOjx > div.sc-VigVT.gTgUxQ > div > div.header-bar > div.header-icon-container.user-menu > div > a")
    WebElement logged;


    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/ul/li[1]/a")
    WebElement dash;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/ul/li[2]/a")
    WebElement mess;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/ul/li[3]/a")
    WebElement ml;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/ul/li[4]/a")
    WebElement mmp;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/ul/li[5]/a")
    WebElement mbq;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/ul/li[6]/a")
    WebElement mp;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/ul/li[7]/a")
    WebElement logout;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]")
    WebElement gigyabox;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[4]/label/span/a")
    WebElement forgot;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[3]/label/a")
    WebElement signup;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/h2")
    WebElement signinlogo;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[2]/div")
    WebElement otheroption;






    WebDriver driver;
    DataHelper dataHelper;


    /*Initialize WebDriver*/
    public SignIn(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    /*Check SignIn*/
    public void signInUser(User _testUser) {

        this.iconsignin.click();
        this.gigyabox.isDisplayed();
        this.signup.isDisplayed();
        this.forgot.isDisplayed();
        this.signinlogo.isDisplayed();
        this.otheroption.isDisplayed();
        this.userName.sendKeys(_testUser.username);
        this.password.sendKeys(_testUser.password);
        this.ingresar.click();
        this.logged.isDisplayed();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();




    }




}
