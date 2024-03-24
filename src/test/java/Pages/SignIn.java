package Pages;

import Helpers.BrowserFactory;
import Helpers.DataHelper;
import Model.User;
import Specs.SpecsBaseClass;
import io.cucumber.core.gherkin.Feature;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SignIn {

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[3]/input")
    WebElement userName;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[4]/input")
    WebElement password;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[3]/div/input")
    WebElement ingresar;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/a/span")
    WebElement iconsignin;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > a > span")
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

    @FindBy(css = "#gigya-login-form > div:nth-child(3) > div.gigya-layout-row.gigya-layout-row-login-create-account > a")
    WebElement CreateAccount;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/h2")
    WebElement signinlogo;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[2]/div")
    WebElement otheroption;


    //----------------//

    WebDriver driver;

    //Helpers//

    DataHelper dataHelper;
    //DriverFactory driverFactory;
    BrowserFactory browserFactory;


    /*Initialize WebDriver*/
    public SignIn(WebDriver _driver){
        //driverFactory = new DriverFactory();
        browserFactory = new BrowserFactory();
        driver = _driver;
        PageFactory.initElements(driver,this);
    }


    /*Check SignIn*/
    public void signInUser(User _testUser) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        wait.until(ExpectedConditions.visibilityOf(gigyabox));
        wait.until(ExpectedConditions.visibilityOf(CreateAccount));
        wait.until(ExpectedConditions.visibilityOf(forgot));
        wait.until(ExpectedConditions.visibilityOf(signinlogo));
        wait.until(ExpectedConditions.visibilityOf(otheroption));
        userName.sendKeys(_testUser.username);
        password.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        wait.until(ExpectedConditions.visibilityOf(logged));
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();

    }

        @Given("The user is on the login modal")
        public void the_user_is_on_the_login_modal() {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
            throw new io.cucumber.java.PendingException();
        }
        @When("User enters credentials")
        public void user_enters_credentials(User _testUser) {
            userName.sendKeys(_testUser.username);
            password.sendKeys(_testUser.password);
            throw new io.cucumber.java.PendingException();
        }
        @When("User clicks the SignIn button")
        public void user_clicks_the_sign_in_button() {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
            throw new io.cucumber.java.PendingException();
        }
        @Then("User logs in")
        public void user_logs_in() {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(logged));
            Actions action = new Actions(driver);
            action.moveToElement(logged).perform();
            action.moveToElement(logged).click();
            throw new io.cucumber.java.PendingException();
        }






}
