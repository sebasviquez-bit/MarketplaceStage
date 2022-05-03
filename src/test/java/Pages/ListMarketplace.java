package Pages;

import Helpers.BrowserFactory;
import Helpers.DriverFactory;
import Helpers.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListMarketplace {

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[1]/span[1]")
    WebElement listmarket;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]/div/ul/li[2]/div/a")
    WebElement creagroomlist;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]/div/ul/li[1]/div/a")
    WebElement creabreedlist;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]")
    WebElement creabreedlistpage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div/div[2]")
    WebElement creagroomlistpage;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]/div/ul/li[3]/div/a")
    WebElement creatrainlist;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]")
    WebElement creatrainlistpage;



    DriverHelper driverHelper;
    DriverFactory driverFactory;
    BrowserFactory browserFactory;

    WebDriver driver;
    /*Initialize WebDriver*/
    public ListMarketplace(WebDriver _driver) {

        //this.driverFactory = new DriverFactory();
        this.browserFactory = new BrowserFactory();
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }

    /*Check ListMarketplace menu*/
    public void CheckListMarketplace(){

        this.listmarket.click();
        this.creabreedlist.isDisplayed();
        this.creagroomlist.isDisplayed();
    }

    public void CheckListMarketplace1(){

        this.listmarket.click();
        this.creabreedlist.click();
        this.creabreedlistpage.isDisplayed();
    }

    public void CheckListMarketplace2(){

        this.listmarket.click();
        this.creagroomlist.click();
        this.creagroomlistpage.isDisplayed();
    }

    public void CheckListMarketplace3(){

        this.listmarket.click();
        this.creatrainlist.click();
        this.creatrainlistpage.isDisplayed();
    }




}
