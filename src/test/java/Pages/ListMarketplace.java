package Pages;

import Helpers.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListMarketplace {

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[1]/span[1]")
    WebElement listmarket;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]/div/ul/li[2]/div/a")
    WebElement creagroomlist;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]/div/ul/li[1]/div/a")
    WebElement creabreedlist;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.marketplace__top-image > section > div > div:nth-child(1) > h2")
    WebElement creabreedlistpage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div/div[2]")
    WebElement creagroomlistpage;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]/div/ul/li[3]/div/a")
    WebElement creatrainlist;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]")
    WebElement creatrainlistpage;




    //DriverFactory driverFactory;
    BrowserFactory browserFactory;

    WebDriver driver;
    /*Initialize WebDriver*/
    public ListMarketplace(WebDriver _driver) {

        //driverFactory = new DriverFactory();
        browserFactory = new BrowserFactory();
        driver = _driver;
        PageFactory.initElements(driver, this);
    }

    /*Check ListMarketplace menu*/
    public void CheckListMarketplace(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(listmarket)).click();
        wait.until(ExpectedConditions.visibilityOf(creabreedlist));
        wait.until(ExpectedConditions.visibilityOf(creagroomlist));
    }

    public void CheckListMarketplace1(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(listmarket)).click();
        wait.until(ExpectedConditions.elementToBeClickable(creabreedlist)).click();
        wait.until(ExpectedConditions.visibilityOf(creabreedlistpage));
    }

    public void CheckListMarketplace2(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(listmarket)).click();
        wait.until(ExpectedConditions.elementToBeClickable(creagroomlist)).click();
        wait.until(ExpectedConditions.visibilityOf(creagroomlistpage));
    }

    public void CheckListMarketplace3(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(listmarket)).click();
        wait.until(ExpectedConditions.elementToBeClickable(creatrainlist)).click();
        wait.until(ExpectedConditions.visibilityOf(creatrainlistpage));
    }


}
