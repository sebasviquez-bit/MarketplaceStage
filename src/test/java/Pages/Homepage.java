package Pages;


import Helpers.BrowserFactory;
import Helpers.DriverHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Homepage {

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/span/a")
    WebElement home;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/span[1]")
    WebElement puppies;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/span[1]")
    WebElement groomers;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[1]/span[1]")
    WebElement trainers;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[3]/a/span")
    WebElement akcorg;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[2]/a/span")
    WebElement shop;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/a/span")
    WebElement signin;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]/div[1]")
    WebElement toppuppies;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]/div[2]")
    WebElement topgroomers;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]/div[3]")
    WebElement toptrainers;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[1]")
    WebElement bigphoto;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]/div[1]/div[3]/a")
    WebElement findpupbut;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[1]/span[1]")
    WebElement listmarket;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]/div[2]/div[3]/a")
    WebElement findgroombut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]/div[3]/div[3]/a")
    WebElement findtrainbut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[1]")
    WebElement aboutakc;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-2dbv9q-0.jmpWJy > div:nth-child(2) > div.image-container > img")
    WebElement puppict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[2]/div[2]")
    WebElement puptext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[2]/div[2]/a")
    WebElement pupfindpup;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[2]/div[2]/small/a")
    WebElement pupcrelist;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-2dbv9q-0.jmpWJy > div.Styled__Wrapper-sc-13lpz7m-0.fJSjAr.content-left > div.image-container > img")
    WebElement groompict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[3]/div[2]")
    WebElement groomtext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[3]/div[2]/a")
    WebElement groomfindgroom;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[3]/div[2]/small/a")
    WebElement groomcrealist;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[4]/div[2]")
    WebElement traintext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-2dbv9q-0.jmpWJy > div:nth-child(4) > div.image-container > img")
    WebElement trainpict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[4]/div[2]/a")
    WebElement traifindtrain;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[4]/div[2]/small/a")
    WebElement traincrealist;

    @FindBy(xpath = "//*[@id='google_ads_iframe_/120519536/MP.Homepage_0__container__']")
    WebElement add1;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[5]/div/div/div/div/div[2]/div/div")
    WebElement comments;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-13lpz7m-0.fJSjAr.content-left > div.image-container > img")
    WebElement aboutamerpict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form")
    WebElement findpupform;

    @FindBy(xpath = "//html/body/main/div/div/div[5]/div[1]/div/div[2]")
    WebElement foot1;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-r5ynjl-0.kfkVMp > div.Styled__MenuFooter-sc-r5ynjl-4.kkOdzE > div > div.Styled__FooterLinksWrapper-sc-r5ynjl-2.eLqWgq.site-footer__wrap.site-footer__links-wrap.site-footer__wrap--no-flex")
    WebElement foot2;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-r5ynjl-0.kfkVMp > div.Styled__MenuFooter-sc-r5ynjl-4.kkOdzE > div > div.Styled__FooterSocialWrapper-sc-r5ynjl-1.duYsZV.site-footer__wrap.site-footer__social.site-footer__wrap--ac.bpm-py16 > div.Styled__SocialLinksWrapper-sc-r5ynjl-3.ikLeni.site-footer__wrap-inner.bpm-flex-shrink-0")
    WebElement socialfoot;

    @FindBy(xpath = "//html/body/main/div/div/div[5]/div[2]/div/div/div[1]/span")
    WebElement foot3;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form")
    WebElement findgroomform;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.marketplace__top-image > section > div > div:nth-child(1) > h2")
    WebElement creabreedlistpage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[2]")
    WebElement creagroomlistpage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div/form")
    WebElement findtrainform;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[2]/div")
    WebElement creatrainlistpage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[5]/div/div/button[2]")
    WebElement carrousel;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-r5ynjl-0.kfkVMp > div.Styled__MenuFooter-sc-r5ynjl-4.kkOdzE > div > div.Styled__FooterLinksWrapper-sc-r5ynjl-2.eLqWgq.site-footer__wrap.site-footer__links-wrap.site-footer__wrap--no-flex > div:nth-child(3) > div > span > ul > li:nth-child(1) > a")
    WebElement newsletter;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-r5ynjl-0.kfkVMp > div.Styled__MenuFooter-sc-r5ynjl-4.kkOdzE > div > div.Styled__FooterLinksWrapper-sc-r5ynjl-2.eLqWgq.site-footer__wrap.site-footer__links-wrap.site-footer__wrap--no-flex > div:nth-child(3) > div > span > ul > li:nth-child(2) > a")
    WebElement goodworks;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-r5ynjl-0.kfkVMp > div.Styled__MenuFooter-sc-r5ynjl-4.kkOdzE > div > div.Styled__FooterLinksWrapper-sc-r5ynjl-2.eLqWgq.site-footer__wrap.site-footer__links-wrap.site-footer__wrap--no-flex > div:nth-child(4) > div > span > ul > li:nth-child(1) > a")
    WebElement termsofuse;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-r5ynjl-0.kfkVMp > div.Styled__MenuFooter-sc-r5ynjl-4.kkOdzE > div > div.Styled__FooterLinksWrapper-sc-r5ynjl-2.eLqWgq.site-footer__wrap.site-footer__links-wrap.site-footer__wrap--no-flex > div:nth-child(4) > div > span > ul > li:nth-child(2) > a")
    WebElement privacy;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div/div[1]/div[1]/h2")
    WebElement goodworkpage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div/div/h2[1]")
    WebElement termsofusepage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div/h2")
    WebElement privacypage;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-r5ynjl-0.kfkVMp > div.Styled__MenuFooter-sc-r5ynjl-4.kkOdzE > div > div.Styled__FooterSocialWrapper-sc-r5ynjl-1.duYsZV.site-footer__wrap.site-footer__social.site-footer__wrap--ac.bpm-py16 > div.Styled__SocialLinksWrapper-sc-r5ynjl-3.ikLeni.site-footer__wrap-inner.bpm-flex-shrink-0 > div > div > a:nth-child(1) > svg")
    WebElement facebook;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-r5ynjl-0.kfkVMp > div.Styled__MenuFooter-sc-r5ynjl-4.kkOdzE > div > div.Styled__FooterSocialWrapper-sc-r5ynjl-1.duYsZV.site-footer__wrap.site-footer__social.site-footer__wrap--ac.bpm-py16 > div.Styled__SocialLinksWrapper-sc-r5ynjl-3.ikLeni.site-footer__wrap-inner.bpm-flex-shrink-0 > div > div > a:nth-child(2)")
    WebElement twitter;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-r5ynjl-0.kfkVMp > div.Styled__MenuFooter-sc-r5ynjl-4.kkOdzE > div > div.Styled__FooterSocialWrapper-sc-r5ynjl-1.duYsZV.site-footer__wrap.site-footer__social.site-footer__wrap--ac.bpm-py16 > div.Styled__SocialLinksWrapper-sc-r5ynjl-3.ikLeni.site-footer__wrap-inner.bpm-flex-shrink-0 > div > div > a:nth-child(3)")
    WebElement instagram;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-r5ynjl-0.kfkVMp > div.Styled__MenuFooter-sc-r5ynjl-4.kkOdzE > div > div.Styled__FooterSocialWrapper-sc-r5ynjl-1.duYsZV.site-footer__wrap.site-footer__social.site-footer__wrap--ac.bpm-py16 > div.Styled__SocialLinksWrapper-sc-r5ynjl-3.ikLeni.site-footer__wrap-inner.bpm-flex-shrink-0 > div > div > a:nth-child(4)")
    WebElement youtube;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-r5ynjl-0.kfkVMp > div.Styled__MenuFooter-sc-r5ynjl-4.kkOdzE > div > div.Styled__FooterSocialWrapper-sc-r5ynjl-1.duYsZV.site-footer__wrap.site-footer__social.site-footer__wrap--ac.bpm-py16 > div.Styled__SocialLinksWrapper-sc-r5ynjl-3.ikLeni.site-footer__wrap-inner.bpm-flex-shrink-0 > div > div > a:nth-child(5)")
    WebElement pinterest;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.page-home__top-stories.backdrop > div > div.grid.grid-4-up.grid--flush > div:nth-child(1) > div > div.content-card__body > a")
    WebElement ArticleImage1;
    //

    //------------//

    DriverHelper driverHelper;
    //DriverFactory driverFactory;
    BrowserFactory browserFactory;

    static WebDriver driver;

    /*Initialize WebDriver*/
    public Homepage(WebDriver _driver) {
        //this.driverFactory = new DriverFactory();
        this.browserFactory = new BrowserFactory();
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }


    /*Check Menu redirection pages*/

    private void valid1() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/"));

    }

    private void valid2() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    private void valid3() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/subscribe/"));

    }
    /*Check Social Network pages*/
    private void validface() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://www.facebook.com/AmericanKennelClub"));

    }

    private void validtwit() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://twitter.com/akcdoglovers"));

    }

    private void validinsta() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://www.instagram.com/americankennelclub/"));


    }

    private void validyoutu() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://www.youtube.com/user/AmericanKennelClub"));

    }

    private void validpint() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://www.pinterest.com/"));

    }


    /*Check MarketPlace homepage elements*/
    public void CheckHomepage()  {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.home.isDisplayed();
        this.puppies.isDisplayed();
        this.groomers.isDisplayed();
        this.trainers.isDisplayed();
        this.akcorg.isDisplayed();
        this.shop.isDisplayed();
        this.signin.isDisplayed();
        this.listmarket.isDisplayed();
        this.bigphoto.isDisplayed();
        this.toppuppies.isDisplayed();
        this.topgroomers.isDisplayed();
        this.toptrainers.isDisplayed();
        this.findpupbut.isDisplayed();
        this.findgroombut.isDisplayed();
        this.aboutakc.isDisplayed();
        this.puppict.isDisplayed();
        this.puptext.isDisplayed();
        this.pupfindpup.isDisplayed();
        this.pupcrelist.isDisplayed();
        this.groompict.isDisplayed();
        this.groomtext.isDisplayed();
        this.groomfindgroom.isDisplayed();
        this.groomcrealist.isDisplayed();
        this.trainpict.isDisplayed();
        this.traintext.isDisplayed();
        this.traifindtrain.isDisplayed();
        this.traincrealist.isDisplayed();
        this.comments.isDisplayed();
        this.aboutamerpict.isDisplayed();
        this.foot1.isDisplayed();
        this.foot2.isDisplayed();
        this.socialfoot.isDisplayed();
        this.foot3.isDisplayed();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 2000);");
        wait.until(ExpectedConditions.visibilityOf(add1));
        this.add1.isDisplayed();
    }

    /*Check Menu elements*/
    public void CheckPupbutt(){

        this.findpupbut.click();
        this.findpupform.isDisplayed();

    }



    public void CheckTrainbutt(){

        this.findtrainbut.click();
        this.findtrainform.isDisplayed();

    }

    public void CheckAKC(){

        this.akcorg.click();
        valid1();

    }

    public void CheckShop(){

        this.shop.click();
        valid2();

    }

    public void CheckPupform2(){

        this.pupfindpup.click();
        this.findpupform.isDisplayed();

    }

    public void CheckGroomform2(){

        this.groomfindgroom.click();
        this.findgroomform.isDisplayed();

    }

    public void CheckTrainform2(){

        this.traifindtrain.click();
        this.findtrainform.isDisplayed();

    }

    public void CheckPupList(){

        this.pupcrelist.click();
        this.creabreedlistpage.isDisplayed();

    }

    public void CheckGroomList(){

        this.groomcrealist.click();
        this.creagroomlistpage.isDisplayed();

    }

    public void CheckTrainList(){

        this.traincrealist.click();
        this.creatrainlistpage.isDisplayed();

    }

    public void CheckCarrousel(){

        this.carrousel.click();
        this.carrousel.click();
        this.carrousel.click();
        this.carrousel.click();
        this.carrousel.click();
        this.carrousel.click();
        this.carrousel.click();

    }

    public void CheckNewsletter(){

        this.newsletter.click();
        valid3();

    }

    public void CheckGoodWorks(){

        this.goodworks.click();
        this.goodworkpage.isDisplayed();

    }

    public void CheckTermsofuse(){

        this.termsofuse.click();
        this.termsofusepage.isDisplayed();

    }

    public void CheckPrivacy(){

        this.privacy.click();
        this.privacypage.isDisplayed();

    }

    public void CheckFacebook(){

        this.facebook.click();
        validface();

    }

    public void CheckTwitter(){

        this.twitter.click();
        validtwit();

    }

    public void CheckInstagram(){

        this.instagram.click();
        validinsta();

    }

    public void CheckYoutube(){

        this.youtube.click();
        validyoutu();

    }

    public void CheckPinterest(){

        this.pinterest.click();
        validpint();

    }




}


















