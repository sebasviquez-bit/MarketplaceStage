package Pages;


import Helpers.BrowserFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Homepage {

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div.Styled__Wrapper-sc-rvwmv6-0.gffKrQ > div.Styled__Left-sc-rvwmv6-2.fHuQOa > div > div:nth-child(1) > a")
    WebElement home;

    @FindBy(css = "#center-menu > div:nth-child(1) > div.menu-item-title-container")
    WebElement puppies;

    @FindBy(css = "#center-menu > div:nth-child(2) > div.menu-item-title-container")
    WebElement groomers;

    @FindBy(css = "#center-menu > div:nth-child(3) > div.menu-item-title-container")
    WebElement trainers;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div.Styled__Wrapper-sc-rvwmv6-0.gffKrQ > div.Styled__Left-sc-rvwmv6-2.fHuQOa > div > div:nth-child(2) > a")
    WebElement akcorg;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div.Styled__Wrapper-sc-rvwmv6-0.gffKrQ > div.Styled__Left-sc-rvwmv6-2.fHuQOa > div > div:nth-child(3) > a")
    WebElement shop;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div.Styled__Wrapper-sc-rvwmv6-0.gffKrQ > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div > div.header-icon-container.user-menu > a > span")
    WebElement signin;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]/div[1]")
    WebElement toppuppies;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]/div[2]")
    WebElement topgroomers;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]/div[3]")
    WebElement toptrainers;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[1]")
    WebElement bigphoto;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.Styled__Wrapper-sc-mgfoe3-0.byCeAh > div.vertical-cards > div.find-a-puppy-wrapper > div.Styled__Wrapper-sc-1o6t5cg-0.gmrUir > div.content > a")
    WebElement findpupbut;

    @FindBy(css = "#listing-menu > div > div.menu-item-title-container > span.menu-item-title")
    WebElement listmarket;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]/div[2]/div[3]/a")
    WebElement findgroombut;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.Styled__Wrapper-sc-mgfoe3-0.byCeAh > div.vertical-cards > div:nth-child(2) > div.content > a")
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

    //DriverFactory driverFactory;
    BrowserFactory browserFactory;

    static WebDriver driver;

    /*Initialize WebDriver*/
    public Homepage(WebDriver _driver) {
        //driverFactory = new DriverFactory();
        browserFactory = new BrowserFactory();
        driver = _driver;
        PageFactory.initElements(driver, this);
    }


    /*Check Menu redirection pages*/

    private void valid1() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/"));

    }

    private void valid2() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    private void valid3() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("/subscribe/"));

    }
    /*Check Social Network pages*/
    private void validface() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://www.facebook.com/AmericanKennelClub"));

    }

    private void validtwit() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://twitter.com/"));

    }

    private void validinsta() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://www.instagram.com/americankennelclub/"));


    }

    private void validyoutu() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://www.youtube.com/user/AmericanKennelClub"));

    }

    private void validpint() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://www.pinterest.com/"));

    }


    /*Check MarketPlace homepage elements*/
    public void CheckHomepage()  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(home));
        wait.until(ExpectedConditions.visibilityOf(puppies));
        wait.until(ExpectedConditions.visibilityOf(groomers));
        wait.until(ExpectedConditions.visibilityOf(trainers));
        wait.until(ExpectedConditions.visibilityOf(akcorg));
        wait.until(ExpectedConditions.visibilityOf(shop));
        wait.until(ExpectedConditions.visibilityOf(signin));
        wait.until(ExpectedConditions.visibilityOf(listmarket));
        wait.until(ExpectedConditions.visibilityOf(bigphoto));
        wait.until(ExpectedConditions.visibilityOf(toppuppies));
        wait.until(ExpectedConditions.visibilityOf(topgroomers));
        wait.until(ExpectedConditions.visibilityOf(toptrainers));
        wait.until(ExpectedConditions.visibilityOf(findpupbut));
        wait.until(ExpectedConditions.visibilityOf(findgroombut));
        wait.until(ExpectedConditions.visibilityOf(aboutakc));
        wait.until(ExpectedConditions.visibilityOf(puppict));
        wait.until(ExpectedConditions.visibilityOf(puptext));
        wait.until(ExpectedConditions.visibilityOf(pupfindpup));
        wait.until(ExpectedConditions.visibilityOf(pupcrelist));
        wait.until(ExpectedConditions.visibilityOf(groompict));
        wait.until(ExpectedConditions.visibilityOf(groomtext));
        wait.until(ExpectedConditions.visibilityOf(groomfindgroom));
        wait.until(ExpectedConditions.visibilityOf(groomcrealist));
        wait.until(ExpectedConditions.visibilityOf(trainpict));
        wait.until(ExpectedConditions.visibilityOf(traintext));
        wait.until(ExpectedConditions.visibilityOf(traifindtrain));
        wait.until(ExpectedConditions.visibilityOf(traincrealist));
        wait.until(ExpectedConditions.visibilityOf(comments));
        wait.until(ExpectedConditions.visibilityOf(aboutamerpict));
        wait.until(ExpectedConditions.visibilityOf(foot1));
        wait.until(ExpectedConditions.visibilityOf(foot2));
        wait.until(ExpectedConditions.visibilityOf(socialfoot));
        wait.until(ExpectedConditions.visibilityOf(foot3));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 2000);");
        //wait.until(ExpectedConditions.visibilityOf(add1));

    }

    /*Check Menu elements*/
    public void CheckPupbutt(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(findpupbut)).click();
        wait.until(ExpectedConditions.visibilityOf(findpupform));

    }


    public void CheckTrainbutt(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(findtrainbut)).click();
        wait.until(ExpectedConditions.visibilityOf(findtrainform));

    }

    public void CheckAKC(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(akcorg)).click();
        valid1();

    }

    public void CheckShop(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(shop)).click();
        valid2();

    }

    public void CheckPupform2(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(pupfindpup)).click();
        wait.until(ExpectedConditions.visibilityOf(findpupform));

    }

    public void CheckGroomform2(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomfindgroom)).click();
        wait.until(ExpectedConditions.visibilityOf(findgroomform));

    }

    public void CheckTrainform2(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(traifindtrain)).click();
        wait.until(ExpectedConditions.visibilityOf(findtrainform));

    }

    public void CheckPupList(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(pupcrelist)).click();
        wait.until(ExpectedConditions.visibilityOf(creabreedlistpage));

    }

    public void CheckGroomList(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomcrealist)).click();
        wait.until(ExpectedConditions.visibilityOf(creagroomlistpage));

    }

    public void CheckTrainList(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(traincrealist)).click();
        wait.until(ExpectedConditions.visibilityOf(creatrainlistpage));

    }

    public void CheckCarrousel(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();

    }

    public void CheckNewsletter(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(newsletter)).click();
        valid3();

    }

    public void CheckGoodWorks(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(goodworks)).click();
        wait.until(ExpectedConditions.visibilityOf(goodworkpage));

    }

    public void CheckTermsofuse(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(termsofuse)).click();
        wait.until(ExpectedConditions.urlContains("/terms-of-use/"));

    }

    public void CheckPrivacy(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(privacy)).click();
        wait.until(ExpectedConditions.urlContains("/privacy/"));

    }

    public void CheckFacebook(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(facebook)).click();
        validface();

    }

    public void CheckTwitter(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(twitter)).click();
        validtwit();

    }

    public void CheckInstagram(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(instagram)).click();
        validinsta();

    }

    public void CheckYoutube(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(youtube)).click();
        validyoutu();

    }

    public void CheckPinterest(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(pinterest)).click();
        validpint();

    }




}


















