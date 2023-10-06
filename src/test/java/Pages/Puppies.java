package Pages;


import Helpers.BrowserFactory;
import Helpers.DriverHelper;
import Model.Listing;
import Model.Subscription;
import Model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.Keys.ENTER;

public class Puppies {


    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/a/span")
    WebElement iconsignin;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > a > span")
    WebElement afterSignInUser;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.Styled__Wrapper-sc-7bo7op-0.llObZX > div > div:nth-child(2) > div.menu-item-title-container > span.menu-item-title")
    WebElement puppies;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.Styled__Wrapper-sc-7bo7op-0.llObZX > div > div:nth-child(2) > div.menu-item-dropdown-container > div > ul > li:nth-child(2) > div.title-container > a")
    WebElement findapuppy;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.Styled__Wrapper-sc-7bo7op-0.llObZX > div > div:nth-child(2) > div.menu-item-dropdown-container > div > ul > li:nth-child(4) > div > a")
    WebElement resourcesForGettingPup;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/ul/li[3]/div/a")
    WebElement akcmarkforpup;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/ul/li[4]/div/a")
    WebElement readyforapup;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/ul/li[5]/div/a")
    WebElement choosingabreed;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/ul/li[6]/div/a")
    WebElement questaskbreeder;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/ul/li[7]/div/a")
    WebElement prepforpup;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.Styled__Wrapper-sc-7bo7op-0.llObZX > div > div:nth-child(2) > div.menu-item-dropdown-container > div > ul > li:nth-child(3) > div > a")
    WebElement viewallbreeds;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.Styled__Wrapper-sc-7bo7op-0.llObZX > div > div:nth-child(2) > div.menu-item-dropdown-container > div > ul > li:nth-child(7) > div > a")
    WebElement listlitmark;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.Styled__Wrapper-sc-7bo7op-0.llObZX > div > div:nth-child(2) > div.menu-item-dropdown-container > div > ul > li:nth-child(8) > div > a")
    WebElement breedersfaq;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.Styled__Wrapper-sc-7bo7op-0.llObZX > div > div:nth-child(2) > div.menu-item-dropdown-container > div > ul > li:nth-child(8) > div > a")
    WebElement findpuprighthome;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/ul/li[1]")
    WebElement pupseek;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div/ul/li[9]")
    WebElement forbreeders;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form")
    WebElement searchpuppage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div/div[1]/p")
    WebElement akcmarkforpuppage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div/div[1]/div[1]")
    WebElement readyforpuppage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div/div[1]/div[2]")
    WebElement choosebreedpage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div/div[2]/div")
    WebElement qaskbreedpage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div/div[1]/div[1]/h2")
    WebElement preppuppage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div")
    WebElement viewallbreedpage;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.marketplace__top-image > section > div > div.intro-wrapper > div:nth-child(2) > div:nth-child(2) > div > a")
    WebElement listlitmarkpage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div/div/div[3]/div[1]/h3")
    WebElement breedfaqpage;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.Styled__Wrapper-sc-52pjsc-0.czcNBr.static-page.advice.advice__find-puppies > div > div > div > div:nth-child(1) > h2")
    WebElement findpuprighthomepage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[1]/div/h1")
    WebElement topheader;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[1]/div/h2")
    WebElement topsubheader;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]")
    WebElement findpupform;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form/div[1]/div[1]/span")
    WebElement looking;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-12ya1n7-1.hPPdjj > div.Styled__DesktopSearchWrapper-sc-12ya1n7-4.eBgJpD > form > div:nth-child(1) > div.search-breed > div > div > div.css-1hwfws3")
    WebElement breedform;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form/div[1]/div[3]/div/div[1]/div[1]")
    WebElement genderform;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form/div[1]/div[4]/div[1]/div/div/div[1]/div[1]")
    WebElement zipform;

    @FindBy(id = "location__radius")
    WebElement distanceform;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form/div[1]/div[4]/div[2]")
    WebElement distancearrow;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form/div[2]/p/span[1]")
    WebElement options;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[1]/p/span")
    WebElement availability;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[1]/div[1]/label/span[2]")
    WebElement nowtext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[1]/div[1]/label/span[1]")
    WebElement now;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[1]/div[2]/label/span[2]")
    WebElement comingtext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-12ya1n7-1.hPPdjj > div.Styled__DesktopSearchWrapper-sc-12ya1n7-4.eBgJpD > form > div:nth-child(3) > div > div:nth-child(1) > div:nth-child(3) > label > span.checkbox__visual-input")
    WebElement coming;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[2]/p/span")
    WebElement dogsize;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[2]/div[1]/label/span[2]")
    WebElement smalltext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[2]/div[1]/label/span[1]")
    WebElement small;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[2]/div[2]/label/span[2]")
    WebElement mediumtext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-12ya1n7-1.hPPdjj > div.Styled__DesktopSearchWrapper-sc-12ya1n7-4.eBgJpD > form > div:nth-child(3) > div > div:nth-child(2) > div:nth-child(3) > label > span.checkbox__visual-input")
    WebElement medium;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[2]/div[3]/label/span[2]")
    WebElement largetext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[2]/div[3]/label/span[1]")
    WebElement large;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[3]/p")
    WebElement images;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[3]/div/label/span[2]")
    WebElement inlisttext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[3]/div/label/span[1]")
    WebElement inlist;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[4]/p/span[1]")
    WebElement bod;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[4]/div[2]/label/span[2]")
    WebElement bomtext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[4]/div[2]/label/span[1]")
    WebElement bom;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[4]/div[3]/label/span[2]")
    WebElement bwhtext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[4]/div[3]/label/span[1]")
    WebElement bwh;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[5]/p/span[1]")
    WebElement champion;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[5]/div[2]/label/span[2]")
    WebElement yestext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[5]/div[2]/label/span[1]")
    WebElement yes;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[6]/p/span[1]")
    WebElement club;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[6]/div[2]/label/span[2]")
    WebElement nationaltext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[3]/div/div[6]/div[2]/label/span[1]")
    WebElement national;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > section > div.Styled__Wrapper-sc-12ya1n7-1.hPPdjj > div.Styled__DesktopSearchWrapper-sc-12ya1n7-4.eBgJpD > form > div:nth-child(3) > div > div:nth-child(7) > div:nth-child(4) > label > span:nth-child(3)")
    WebElement specialtext;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > section > div.Styled__Wrapper-sc-12ya1n7-1.hPPdjj > div.Styled__DesktopSearchWrapper-sc-12ya1n7-4.eBgJpD > form > div:nth-child(3) > div > div:nth-child(7) > div:nth-child(4) > label > span.checkbox__visual-input")
    WebElement special;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > section > div.Styled__Wrapper-sc-12ya1n7-1.hPPdjj > div.Styled__DesktopSearchWrapper-sc-12ya1n7-4.eBgJpD > form > div:nth-child(3) > div > div:nth-child(7) > div:nth-child(5) > label > span:nth-child(3)")
    WebElement licensetext;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > section > div.Styled__Wrapper-sc-12ya1n7-1.hPPdjj > div.Styled__DesktopSearchWrapper-sc-12ya1n7-4.eBgJpD > form > div:nth-child(3) > div > div:nth-child(7) > div:nth-child(5) > label > span.checkbox__visual-input")
    WebElement license;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div[1]/form/div[4]/div/button")
    WebElement findpupformbut;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-wis0mx-2.dakhfk > div.Styled__RowResults-sc-wis0mx-4.botkTX > div > div:nth-child(3) > div:nth-child(1) > a:nth-child(2) > div > div.breeder-litter-card__img > div.media-wrap > img")
    WebElement SERPResult;
    //

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[3]/p/a")
    WebElement listcreateform;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[4]/h2")
    WebElement purebreed;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[4]/div[2]/p")
    WebElement purebreedtext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[4]/div[1]/div[2]")
    WebElement purebreedimage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/div/div/div/div/div[2]/div/div/blockquote")
    WebElement recomenda;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/div/div/button[2]")
    WebElement carrousel;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/h2")
    WebElement howfind;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[1]/div[1]")
    WebElement bulldog;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[2]/div[1]")
    WebElement cavalier;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[3]/div[1]")
    WebElement yorkshire;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[10]/div/a")
    WebElement registered;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[1]/div[2]/p[1]")
    WebElement registeredtext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[2]/div[2]/h3")
    WebElement kennel;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[2]/div[2]/p[1]")
    WebElement kenneltext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[3]/div[2]/h3")
    WebElement breededu;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[3]/div[2]/p[1]")
    WebElement breededutext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[7]/h2")
    WebElement getready;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[7]/div[1]/a[1]")
    WebElement siberian;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[7]/div[1]/a[2]")
    WebElement howdecide;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[7]/div[2]/a[1]")
    WebElement beagle;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[7]/div[2]/a[2]")
    WebElement thingsconsi;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[7]/div[3]/a[1]")
    WebElement dachshund;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-mly9p1-0.hTJaOs > div:nth-child(4) > a.home-puppies-find-right-puppy__item-link")
    WebElement newcheck;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[7]/div[4]/a[1]")
    WebElement pug;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[7]/div[4]/a[2]")
    WebElement questask;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/h2")
    WebElement howfindright;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div[1]/div[2]/h3")
    WebElement akcbom;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div[1]/div[2]/p")
    WebElement akcbomtext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-ysw841-0.cWfaAR > div:nth-child(2) > div.image-container > small")
    WebElement pembroke;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div[2]/div[2]/h3")
    WebElement akcbwh;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div[1]/div[2]/p/a")
    WebElement morebom;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div[2]/div[2]/p")
    WebElement akcbwhtext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-ysw841-0.cWfaAR > div:nth-child(3) > div.image-container > img")
    WebElement husky;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div[3]/div[2]/h3")
    WebElement akcclub;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-ysw841-0.cWfaAR > div:nth-child(3) > div.content > p > a.card-link")
    WebElement morebwh;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div[3]/div[2]/p")
    WebElement akcclubtext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-ysw841-0.cWfaAR > div:nth-child(4) > div.image-container > img")
    WebElement beagle2;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div[3]/div[2]/p/a")
    WebElement moreclub;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div[4]/div[2]/h3")
    WebElement akcchampion;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div[4]/div[2]/p")
    WebElement akcchampiontext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-ysw841-0.cWfaAR > div:nth-child(5) > div.image-container > img")
    WebElement shepherd;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div[4]/div[2]/p/a")
    WebElement morechampion;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[10]/h2")
    WebElement howregister;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[10]/div/p")
    WebElement howregistertext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[10]/div/a")
    WebElement regpuppy;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/h2")
    WebElement mostpop;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/div/div/div/div[4]/div/a")
    WebElement labrador;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/div/div/div/div[5]/div/a")
    WebElement golden;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/div/div/div/div[6]/div/a")
    WebElement french;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/div/div/div/div[7]/div/a")
    WebElement german;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/div/div/div/div[8]/div/a")
    WebElement poodle;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/div/div/div/div[9]/div/a")
    WebElement bull;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/div/div/div/div[10]/div/a")
    WebElement york;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/div/div/div/div[11]/div/a")
    WebElement australian;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/div/div/div/div[12]/div/a")
    WebElement welsh;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/div/div/div/div[13]/div/a")
    WebElement sibe;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/div/button[2]")
    WebElement carrousel2;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section[2]/ul")
    WebElement listbreeds;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[11]/h2")
    WebElement howcan;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[11]/div/p")
    WebElement howcantext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[11]/div/a")
    WebElement crealist;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-wis0mx-2.dakhfk > div.Styled__Row-sc-wis0mx-3.iMbWQH > div > section > ul")
    WebElement searchlistpageult;

    @FindBy(xpath = "//h1[contains(text(),'Puppies for Sale')]")
    WebElement searchlistPageTitle;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-wis0mx-2.dakhfk > div.Styled__Row-sc-wis0mx-3.iMbWQH > div > section > ul > li.active > span")
    WebElement searchlistpageone;

    @FindBy(xpath = "//h1[contains(text(),'Affenpinscher Puppies For Sale')]")
    WebElement AffensPuppiesForSale;

    @FindBy(id = "react-select-2-option-2")
    WebElement affens;

    @FindBy(id = "react-select-3-option-1")
    WebElement female;

    @FindBy(id = "react-select-2-option-117")
    WebElement germanspitz;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-wis0mx-2.dakhfk > div > h3")
    WebElement searchlistnopage;

    @FindBy(id = "location__zip")
    WebElement zipfield;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/ol/li[3]/div/div/p/a")
    WebElement creabreedlistpage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div")
    WebElement topbanner;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div/button")
    WebElement topbannersigin;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.Styled__Wrapper-sc-12ya1n7-1.hPPdjj > div.Styled__DesktopSearchWrapper-sc-12ya1n7-4.eBgJpD > form > div:nth-child(1) > div.Styled__ButtonWrapper-sc-12ya1n7-0.bfeWiF > button")
    WebElement topbannealert;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(1) > a")
    WebElement breedinfo1;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > ul > li.tabs__single-tab.is-active > a")
    WebElement breedtrait;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > ul > li:nth-child(6) > a")
    WebElement natiobreed;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > ul > li:nth-child(2) > a")
    WebElement descrip;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > ul > li:nth-child(3) > a")
    WebElement histjob;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > ul > li:nth-child(4) > a")
    WebElement health;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > ul > li:nth-child(5) > a")
    WebElement rescue;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > div > div > div > div.panel-flex__main > div > div.Styled__Side-sc-fpru5x-2.Styled__Right-sc-fpru5x-4.eFFiAq")
    WebElement breedPhotoTab;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > div > div > div > div.panel-flex__main > figure > div")
    WebElement breedVideo;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > div > div > div > div.panel-flex__aside.panel-contain > div > div > ul > li:nth-child(1) > strong")
    WebElement breedtraittext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > div > div > div > div.panel-flex__aside.panel-contain > div > div > div > div:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement natiobreedtext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > div > div > div > div.panel-flex__aside.panel-contain > div > div > p")
    WebElement descriptext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > div > div > div > div.panel-flex__aside.panel-contain > div > div > div > p:nth-child(3)")
    WebElement histjobtext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > div > div > div > div.panel-flex__aside.panel-contain > div > div > ul > li:nth-child(2)")
    WebElement healthtext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > div > div > div > div.panel-flex__aside.panel-contain > div > div > div > div:nth-child(1) > ul > li:nth-child(1)")
    WebElement rescuetext;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-wis0mx-2.dakhfk > div.Styled__RowResults-sc-wis0mx-4.botkTX > div > div:nth-child(3) > div > a:nth-child(1)")
    WebElement listdisp;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-wis0mx-2.dakhfk > div.Styled__RowResults-sc-wis0mx-4.botkTX > div > div:nth-child(3) > div > a > div > div.breeder-litter-card__details > div:nth-child(1)")
    WebElement listdisptext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-wis0mx-2.dakhfk > div.Styled__RowResults-sc-wis0mx-4.botkTX > div > div:nth-child(3) > div > div > a > p")
    WebElement puppyvisor;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-wis0mx-2.dakhfk > div.Styled__RowResults-sc-wis0mx-4.botkTX > div > div:nth-child(3) > div > div > a > div > button")
    WebElement puppyvisorbut;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-wis0mx-2.dakhfk > div.Styled__Row-sc-wis0mx-3.jsoIAI > div > div > p")
    WebElement bottombanner;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-wis0mx-2.dakhfk > div.Styled__Row-sc-wis0mx-3.jsoIAI > div > div > button")
    WebElement bottombannersigin;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-2s5xjd-0.jSFbPo > h2")
    WebElement expotherbreeds;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-2s5xjd-0.jSFbPo > div > a:nth-child(1) > div")
    WebElement otherbreed1;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-2s5xjd-0.jSFbPo > div > a:nth-child(2) > div")
    WebElement otherbreed2;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-2s5xjd-0.jSFbPo > div > a:nth-child(3) > div")
    WebElement otherbreed3;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-2s5xjd-0.jSFbPo > div > a:nth-child(1) > h4")
    WebElement otherbreed1text;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-2s5xjd-0.jSFbPo > div > a:nth-child(2) > h4")
    WebElement otherbreed2text;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(3) > div.Styled__Wrapper-sc-2s5xjd-0.jSFbPo > div > a:nth-child(3) > h4")
    WebElement otherbreed3text;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.Styled__BreederHero-sc-13i5cmk-0.jPeWTZ > div.breeder-hero__details > div > h1")
    WebElement listingname;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div[2]/div[4]/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div")
    WebElement listingpict;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__BreederHero-sc-13i5cmk-0.jPeWTZ > div.breeder-hero__details > div > div.breeder-details__address > span")
    WebElement listingtext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__BreederHero-sc-13i5cmk-0.jPeWTZ > div.breeder-hero__details > div > div.breeder-details__wrapper > a > button")
    WebElement listingmsgbut;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.flexible-content > div.main-content > div:nth-child(1) > div > div.section-title.section-title--centered-at-medium")
    WebElement aboutbreeder;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.flexible-content > div:nth-child(2) > div > div.contact-form-desktop > div:nth-child(2) > div > form > div.Styled__Title-sc-ne7im0-1.dLOvJX")
    WebElement listingcreateacc;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.flexible-content > div.main-content > div:nth-child(2) > div > div.section-title.section-title--centered-at-medium")
    WebElement breederprof;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.flexible-content > div:nth-child(2) > div > div.contact-form-desktop > div:nth-child(2) > div > form > button")
    WebElement createaccbut;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.flexible-content > div:nth-child(2) > div > div.contact-form-desktop > div:nth-child(2) > div > button")
    WebElement signinbut;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.flexible-content > div:nth-child(2) > div > div.contact-form-desktop > div:nth-child(2) > div > form > div.text-center.report-listing > a")
    WebElement reportissue;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div[2]/div[1]")
    WebElement pupfindetext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div")
    WebElement pupfindpict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div[1]")
    WebElement pufindtm;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[1]/h3")
    WebElement pupcounselor;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[1]/div")
    WebElement pupcounselortext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[3]")
    WebElement pupcounspict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[2]/h3/span")
    WebElement whatsinclu;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[2]/ul")
    WebElement whatsinclutext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[2]/div[2]")
    WebElement onetimefee;

    @FindBy(id = "landing-puppy-visor__card-2-button")
    WebElement onetimefeebut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/h1")
    WebElement howakcpupvis;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[2]")
    WebElement pupvisorworks;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[3]/h1/div")
    WebElement whysignup;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[3]/div[1]")
    WebElement whysignuptext;

    @FindBy(id = "puppyvisor-lp-getstartedbottom")
    WebElement whysignupbut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[3]/div[3]/a")
    WebElement pupvistermscond;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.marketplace__top-image > section > div > div:nth-child(1) > h2")
    WebElement advertlitters;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.marketplace__top-image > section > img")
    WebElement advertlitterspict;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.marketplace__top-image > section > div > div.intro-wrapper > div:nth-child(1) > div > span > div")
    WebElement StartHere;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > section > div:nth-child(3) > div.plan__column-content > div:nth-child(2) > div:nth-child(2) > div > div")
    WebElement actpaidlit;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.marketplace__top-image > section > div > div.intro-wrapper > div:nth-child(2) > div:nth-child(2) > div > a")
    WebElement creanewlit;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.marketplace__top-image > section > div > div.intro-wrapper > div:nth-child(2) > div:nth-child(3) > a > div")
    WebElement GoToMyAccountPage;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > section > div:nth-child(1) > div.plan__column-content > div:nth-child(1) > h2")
    WebElement monthlyPlanTitle;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > section > div.plan__column-container.promo > div.plan__column-content > div:nth-child(1) > h2")
    WebElement annualPlanTitle;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > section > div.plan__column-container.promo > div.plan__column-content > div:nth-child(2) > div:nth-child(2) > div > div")
    WebElement getAnnualplanbut;
    //

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > section > div:nth-child(3) > div.plan__column-content > div:nth-child(1) > h2")
    WebElement singleLitterListing;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__FAQWrap-sc-1411r4a-0.ksriNi > div > h2")
    WebElement FAQsBreederListingTitle;
    //

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/ol/li[3]/div/div/p/a")
    WebElement manmylist;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/ol/li[4]/div/div/p[1]/a")
    WebElement purchsubs;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/ol/li[4]/div/div/p[2]/a")
    WebElement marksubs;

    @FindBy(css = "#gigya-login-form > div:nth-child(1) > div.gigya-composite-control.gigya-composite-control-textbox > input")
    WebElement userName;

    @FindBy(css = "#gigya-login-form > div:nth-child(1) > div.gigya-composite-control.gigya-composite-control-password.custom-mrg-top-20 > input")
    WebElement passwordlog;

    @FindBy(css = "#gigya-login-form > div:nth-child(3) > div.gigya-composite-control.gigya-composite-control-submit > input")
    WebElement ingresar;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > a")
    WebElement logged;

    @FindBy(xpath = "//input[@name='litter_number']")
    WebElement litternumber;

    @FindBy(xpath = "//input[@name='dam_registration_number']")
    WebElement damnumber;

    @FindBy(xpath = "//input[@name='dam_certificate_issue_date']")
    WebElement damdate;

    @FindBy(xpath = "//button[@class='sc-kGXeez beRUWI button']")
    WebElement creabutton;

    @FindBy(xpath = "//input[@name='card_number']")
    WebElement creditcard;

    @FindBy(xpath = "//input[@placeholder='mm/yy']")
    WebElement expdate;

    @FindBy(xpath = "//input[@name='card_cvv']")
    WebElement cvv;

    @FindBy(xpath = "//input[@name='coupon']")
    WebElement coupon;

    @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstname2;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastname2;

    @FindBy(xpath = "//input[@name='address']")
    WebElement billaddress;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[1]/div[13]/div/div/div/div/div[1]")
    WebElement billzip;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement billzipsub;

    @FindBy(id = "react-select-2-input")
    WebElement billzip2;

    @FindBy(xpath = "//input[@placeholder='City']")
    WebElement city;

    @FindBy(xpath = "//input[@placeholder='State']")
    WebElement state;

    @FindBy(xpath = "//input[@placeholder='(xxx) - xxx - xxxx']")
    WebElement phone;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[2]/div")
    WebElement summary;

    @FindBy(id = "onboarding-breeders-listing-payment__submit")
    WebElement purchnow;

    @FindBy(id = "onboarding-breeders-storefront-payment__submit")
    WebElement purchnowsub;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[1]/div[2]/div/div/div/div[1]/div[1]")
    WebElement variety;

    @FindBy(id = "react-select-2-option-1")
    WebElement variety2;

    @FindBy(xpath = "//textarea[@name='description']")
    WebElement listdesc;

    @FindBy(xpath = "//input[@name='litter_number']")
    WebElement litternum;

    @FindBy(xpath = "//input[@name='litter_dob']")
    WebElement litterdob;

    @FindBy(xpath = "//body/div[@class='layout cmw']/div/div[@class='marketplace-homepage']/div[@class='dashboard account-index']/div[@class='page-container']/div[@class='page-layout']/main[@class='main-content']/section[@class='dashboard__section']/div[@class='pure-g onboarding']/section[@class='onboarding__form pure-u-4-5']/div[@class='listing-customize']/form[@class='pure-form-stacked']/div[@class='pure-g']/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement males;

    @FindBy(xpath = "//body/div[@class='layout cmw']/div/div[@class='marketplace-homepage']/div[@class='dashboard account-index']/div[@class='page-container']/div[@class='page-layout']/main[@class='main-content']/section[@class='dashboard__section']/div[@class='pure-g onboarding']/section[@class='onboarding__form pure-u-4-5']/div[@class='listing-customize']/form[@class='pure-form-stacked']/div[@class='pure-g']/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement females;

    @FindBy(xpath = "//input[@name='price']")
    WebElement price;

    @FindBy(xpath = "//textarea[@name='health_vaccines']")
    WebElement healthvacc;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/h4")
    WebElement textimportant;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[2]/div[1]/div/label/span[1]")
    WebElement firstcheck;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[2]/div[1]/div/label/span[2]")
    WebElement firstchecktext;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[2]/div[2]/div/label/span[1]")
    WebElement secondcheck;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[2]/div[2]/div/label/span[2]")
    WebElement secondchecktext;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[2]/div[3]/div/label/span[1]")
    WebElement thirdcheck;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[2]/div[3]/div/label/span[2]")
    WebElement thirdchecktext;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[2]/div[4]/div/label/span[1]")
    WebElement fourcheck;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[2]/div[4]/div/label/span[2]")
    WebElement fourcheck2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[2]/div[5]/div/label/span[1]")
    WebElement fivecheck;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div[2]/div[5]/div/label/span[2]")
    WebElement fivecheck2;

    @FindBy(id = "onboarding-breeders-listing-customize__submit")
    WebElement continue2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/section[1]/div/div/div")
    WebElement addfile;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/header/h1")
    WebElement addphovid;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/p[1]")
    WebElement uploadmess;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/div/form/input")
    WebElement youtu2;

    @FindBy(id = "images")
    WebElement selimages;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]")
    WebElement inputimages;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/div/div[3]/input")
    WebElement inputimages2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/div/div[4]/div/div/div/div[1]/div[1]")
    WebElement inputbreeder;

    @FindBy(id = "react-select-2-option-1")
    WebElement selbreederimages;

    @FindBy(xpath = "//*[@id='react-root']/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/a")
    WebElement saveimages;

    @FindBy(id = "onboarding-breeders-listing-media__submit")
    WebElement continue3;

    @FindBy(xpath = "//a[@class='submit']")
    WebElement contyou;

    @FindBy(xpath = "//body/div[@class='layout cmw']/div[@id='react-root']/div[@class='marketplace-homepage']/div[@class='dashboard account-index']/div[@class='page-container']/div[@class='page-layout']/main[@class='main-content']/section[@class='dashboard__section']/div[@class='pure-g onboarding']/section[@class='onboarding__form pure-u-4-5']/div[@class='listing-media breeders']/div[@class='sc-jAaTju fNjBos active']/a[1]//*[local-name()='svg']")
    WebElement closediag;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/div[1]/a[1]/*[1]")
    WebElement closediag2;

    @FindBy(xpath = "//input[@name='name']")
    WebElement kenname;

    @FindBy(xpath = "//input[@name='url']")
    WebElement weblink;

    @FindBy(xpath = "//textarea[@name='description']")
    WebElement descken;

    @FindBy(xpath = "//input[@placeholder='mm/yyyy']")
    WebElement breedsince;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[5]/div/div/div/div[1]/div[1]")
    WebElement ibreed;

    @FindBy(xpath = "//*[@id='react-select-2-option-0']")
    WebElement optaffen;

    @FindBy(xpath = "//input[@name='external_website']")
    WebElement website;

    @FindBy(xpath = "//*[@id='onboarding-breeders-storefront-profile__submit']")
    WebElement continue4;

    @FindBy(xpath = "//*[@id='onboarding-breeders-storefront-contact__submit']")
    WebElement continue5;

    @FindBy(xpath = "//*[@id='onboarding-breeders-storefront-tell-us__submit']")
    WebElement continue6;

    @FindBy(xpath = "//*[@id='onboarding-breeders-storefront-media__submit']")
    WebElement continue7;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section/div/form/div[1]/ol/li[1]/div")
    WebElement monthplan;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section/div/form/div[1]/ol/li[1]/div/div/button")
    WebElement monthplanbut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section/div/form/div[1]/ol/li[2]/div")
    WebElement annualplan;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section/div/form/div[1]/ol/li[2]/div/div/button")
    WebElement annualplanbut;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
    WebElement billaddress2;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > div > div > ul > li:nth-child(1) > a")
    WebElement dashbreed;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > div > div > ul > li:nth-child(1) > a")
    WebElement dashhomeDropdown;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > div > div > ul > li:nth-child(1) > a")
    WebElement dashhome;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > div > div.select-to-bar-nav > div.show-at-medium > div > a:nth-child(2)")
    WebElement dashmessenger;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > div > div > ul > li:nth-child(4) > a")
    WebElement dashmanmypag;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > div > div > ul > li:nth-child(3) > a")
    WebElement dashmanmylist;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > div > div.select-to-bar-nav > div.show-at-medium > div > a:nth-child(5)")
    WebElement dashquestion;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > div > div.select-to-bar-nav > div.show-at-medium > div > a:nth-child(6)")
    WebElement dashaccount;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > div > div.select-to-bar-nav > div.show-at-medium > div > a:nth-child(8)")
    WebElement dashmypage;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(2) > h4")
    WebElement profperf;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(2) > div > div.dashboard__performance-details > div > div:nth-child(2) > h4")
    WebElement namedash;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(2) > div > div.dashboard__performance-details > div > div:nth-child(2) > p:nth-child(2)")
    WebElement joinedin;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(2) > div > div.dashboard__performance-details > div > div:nth-child(2) > p:nth-child(4)")
    WebElement status;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(2) > div > div.dashboard__performance-details > div > div:nth-child(2) > a:nth-child(6)")
    WebElement changePlan;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(2) > div > div.dashboard__performance-details > div > div.profile-details__section.breeders > a")
    WebElement editdash;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(2) > div > div.dashboard__performance-stats > div > p:nth-child(2) > span:nth-child(1)")
    WebElement profileviews;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(2) > div > div.dashboard__performance-stats > div > p:nth-child(3) > span")
    WebElement totalinquiries;

    @FindBy(xpath = "//div[contains(text(),'Purchase a Marketplace Subscription')]")
    WebElement purchmarksub;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[3]/div/div[1]/div[2]/div[2]/div[2]/div[1]")
    WebElement monthlydash;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]")
    WebElement yeardash;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(4) > div.listing-table__wrap > div.listing-table__title > div")
    WebElement publishedlist;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(4) > div.listing-table__wrap > div.listing-table > div.show-at-medium > table > tbody > tr:nth-child(1) > td:nth-child(8) > button")
    WebElement editListingButton;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(4) > div.listing-table__wrap > div.listing-table__title > a")
    WebElement seealllist;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(4) > div.listing-table__wrap > div.listing-table > div.listing-table__add > a > span")
    WebElement createanewlisting;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(5) > div > div > h4")
    WebElement usersadmin;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section:nth-child(5) > div > div > p:nth-child(2)")
    WebElement activeadmin;

    @FindBy(css = "#breeders-storefront-invite-user > div > div > div > div")
    WebElement newadmin;

    @FindBy(css = "#breeders-storefront-invite-user > div > div > button")
    WebElement addadmin;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > div > div > ul > li:nth-child(2) > a")
    WebElement messengertab;

    @FindBy(xpath = "//html/body/div[4]/div/div/div[5]/div/div/main/section/div/div/div[1]/div[1]/img")
    WebElement imgmess;

    @FindBy(xpath = "//html/body/div[4]/div/div/div[5]/div/div/main/section/div/div/div[1]/div[1]/div")
    WebElement usermess;

    @FindBy(id = "conversations-scrolled-element")
    WebElement convchannel;

    @FindBy(xpath = "//html/body/div[4]/div/div/div[5]/div/div/main/section/div/div/div[1]/div[2]/div[2]/div/a")
    WebElement otheruserconv;

    @FindBy(xpath = "//html/body/div[4]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[2]/img")
    WebElement imgothuser;

    @FindBy(xpath = "//html/body/div[4]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[1]/p")
    WebElement conversation;

    @FindBy(xpath = "//html/body/div[4]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[3]/div[2]/span")
    WebElement messmenu;

    @FindBy(xpath = "//html/body/div[4]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[3]/div[1]/ul/div/a[1]/li")
    WebElement messquestion;

    @FindBy(xpath = "//html/body/div[4]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[3]/div[1]/ul/div/div/li/span")
    WebElement messblock;

    @FindBy(xpath = "//html/body/div[4]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[3]/div[1]/ul/div/a[2]/li")
    WebElement delconv;

    @FindBy(xpath = "//html/body/div[4]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[3]/div[1]/div/form/div[1]/label")
    WebElement messupfile;

    @FindBy(id = "show-emoji-menu")
    WebElement messemoji;

    @FindBy(xpath = "//html/body/div[4]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[3]/div[1]/div/form/div[3]/textarea")
    WebElement messtextarea;

    @FindBy(css = "#chat-view > div:nth-child(20) > div > div > div.plane-text-message > p")
    WebElement responsemess;

    @FindBy(css = "#chat-view > div:nth-child(22) > div > div > div.plane-text-message > p")
    WebElement sentmess;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div.listing-storefront-edit__tertiary-nav > section > ul > li.is-active > span")
    WebElement profileman;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[2]/a")
    WebElement contactman;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[3]/a")
    WebElement tellusman;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[4]/a")
    WebElement phvidman;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/div[1]/h4")
    WebElement yourbreedprof;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div")
    WebElement kennameman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement weblinkman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/textarea[1]")
    WebElement descripman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement breedsinceman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
    WebElement breedman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement websiteman;

    @FindBy(id = "breeders-storefront-profile__submit")
    WebElement savebutman;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/section/button[2]")
    WebElement backtoacct;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/div[1]/h4")
    WebElement continfoman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div")
    WebElement fullnameman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div")
    WebElement addressman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement zipman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement cityman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement stateman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div")
    WebElement phoneman;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement emailman;

    @FindBy(id = "breeders-storefront-contact__submit")
    WebElement savebutman2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/div[1]/h4")
    WebElement tellusmoreman;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]")
    WebElement nationalclubman;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[3]")
    WebElement specialtyman;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[4]")
    WebElement licensedman;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[5]")
    WebElement mydogsman;

    @FindBy(id = "breeders-storefront-tell-us__submit")
    WebElement savebutman3;

    @FindBy(css = "#breeders-listing-media > div.NewMediaManagerWrapper-sc-1bpwivz-0.hBtNrY.active.addMediaRedesign > div > section > div > ul > li > form > label > svg")
    WebElement dragDropFileIcon;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div.listing-media.breeder-media > section > div > button")
    WebElement ContinueButton;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/section[1]/div/div[1]/div")
    WebElement addmorefilesman;

    @FindBy(id = "breeders-storefront-media__submit")
    WebElement savebutman4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section/div[1]/a")
    WebElement upgrto;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div.text-center > a")
    WebElement crealitterbutton;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div.listing-item > div.listing-item__header > div.listing-item__title")
    WebElement namelitter;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div.listing-item > div.listing-item__header > div.listing-item__view-state__wrap > div > div.listing-item__view-state-bubble.listing-item__view-state-bubble--active")
    WebElement publishedlitter;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div.listing-item > div.listing-item__header > div.listing-item__view-state__wrap > div > div.listing-item__view-state-bubble.is-disabled")
    WebElement unpublishedlitter;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div.listing-item > div.listing-item__header > div.listing-item__view-state__wrap > div > div:nth-child(3)")
    WebElement expiredlitter;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div.listing-item > div.tabbed-litter-display > div.tabbed-litter-display__tabs.show-at-small > div > ul > li.mp-tabs__single-tab.coming-soon > a")
    WebElement comingsoon;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div.listing-item > div.tabbed-litter-display > div.tabbed-litter-display__tabs.show-at-small > div > ul > li.mp-tabs__single-tab.is-active > a")
    WebElement dayslitter;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div.listing-item > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.euUzqQ.puppy-litter-hero > div.puppy-litter-hero__slider > div > div > div > div")
    WebElement litterpicture;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div.listing-item > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.euUzqQ.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-info > div.puppy-litter-info__title")
    WebElement litterheader;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(6) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.euUzqQ.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-hero__edit-options > div > div > div.edit-menu__handle > a")
    WebElement editlitter;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(6) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.euUzqQ.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-hero__edit-options > div > div > div.edit-menu > ul > div > li:nth-child(1) > a")
    WebElement viewlisting;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(6) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.euUzqQ.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-hero__edit-options > div > div > div.edit-menu > ul > div > li:nth-child(2) > a")
    WebElement editlisting;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(6) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.euUzqQ.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-hero__edit-options > div > div > div.edit-menu > ul > div > li:nth-child(3) > a")
    WebElement unpublishlisting;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(6) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.euUzqQ.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-info")
    WebElement moreinfolisting;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(6) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.euUzqQ.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-info > div:nth-child(9)")
    WebElement infolisting;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(6) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.euUzqQ.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-info > div.puppy-litter-info__last-edited")
    WebElement lasteditedlist;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section/h4")
    WebElement mybuyerheader;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section/p[1]")
    WebElement mybuyertext;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/div[1]/div/label[1]/span")
    WebElement allbreedscheck;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/div[1]/div/label[2]/span")
    WebElement spebreedscheck;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/div[1]/label/span[1]")
    WebElement publiccheck;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/div[1]/label/span[2]")
    WebElement publictext;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/div[1]/div/label[1]")
    WebElement allbreedtext;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/div[1]/div/label[2]")
    WebElement spebreedtext;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/div[2]/h5")
    WebElement questintro;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/textarea[1]")
    WebElement introtext;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/div[2]/section/div[2]/h5")
    WebElement questions;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/div[2]/section/div[4]/div/div[3]/label")
    WebElement typequestiontext;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/form[1]/div[2]/section[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement typequestion;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/div[2]/section/div[4]")
    WebElement movequestion;

    @FindBy(id = "close")
    WebElement closequestion;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/div[2]/section/div[4]/div/div[4]/label")
    WebElement messagetext;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/form[1]/div[2]/section[1]/div[4]/div[1]/div[4]/div[1]/textarea[1]")
    WebElement messagearea;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/div[2]/section/div[4]/div/div[5]/label/span[1]")
    WebElement requiredcheck;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/div[2]/section/div[4]/div/div[5]/label/span[2]")
    WebElement requiredtext;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/div[2]/section/button")
    WebElement addquestionbut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/section/button[1]")
    WebElement savequestion;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.styled__AccordionToTabs-sc-142z30j-0.cZbGfv > div > div.styled__Tab-sc-142z30j-1.eLAvZF > h4")
    WebElement changepassheader;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.styled__AccordionToTabs-sc-142z30j-0.cZbGfv > div > div.styled__Tab-sc-142z30j-1.eLAvZF > h4")
    WebElement changepasstext;

    @FindBy(css = "#_8b90 > div:nth-child(2) > label")
    WebElement oldpassword;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")
    WebElement newpassword;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]")
    WebElement confirmpassword;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/div/div[1]/div/form/section/button[1]")
    WebElement changepassbut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/section/ul/li[2]/a")
    WebElement paymethods;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div/div[1]/div/div[2]")
    WebElement sucesslisting;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div/div[2]")
    WebElement successsubsc;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div[5]/div/div/main/div/div[2]/div[2]/div/a[4]")
    WebElement manageMyListings;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(2) > a")
    WebElement createLitterListing;

    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[4]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement BreederOcto6;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div > div.Styled__PuppyLitterHero-sc-1g1ebi4-0.fatWE > div.puppy-litter-hero__details > div > div.puppy-litter-info__wrapper > a > button")
    WebElement messageBreederButton;

    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[6]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[4]/div[1]/input[1]")
    WebElement messageBreederUserInput;

    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[6]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[1]/input[1]")
    WebElement messageBreederPasswordInput;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.Styled__Wrapper-sc-go6uf2-0.rCOYJ > div > div.show-at-medium > div > a.anchored-nav__anchor.text-white.px3.toggled")
    WebElement RFGPAbout;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.Styled__Wrapper-sc-go6uf2-0.rCOYJ > div > div.show-at-medium > div > a:nth-child(2)")
    WebElement RFGPReadyForAPup;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.Styled__Wrapper-sc-go6uf2-0.rCOYJ > div > div.show-at-medium > div > a:nth-child(3)")
    WebElement RFGPCChossingBreed;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.Styled__Wrapper-sc-go6uf2-0.rCOYJ > div > div.show-at-medium > div > a:nth-child(4)")
    WebElement RFGPCQuestionsBreeder;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.Styled__Wrapper-sc-go6uf2-0.rCOYJ > div > div.show-at-medium > div > a:nth-child(5)")
    WebElement RFGPCPuppyCheckList;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.section-1 > div.text-wrap > a")
    WebElement RFGPCFindPuppyButton;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.section-2 > div.text-wrap > p:nth-child(3) > a")
    WebElement RFGPCQuestionsAskBreeder;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.section-3 > div.img-wrap > div:nth-child(1) > a")
    WebElement RFGPCAKCBreederOfMerit;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.section-3 > div.img-wrap > div:nth-child(2) > a")
    WebElement RFGPCAKCBredWithHEART;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.section-3 > div.img-wrap > div:nth-child(3) > a")
    WebElement RFGPCNationalBreedClubMember;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.section-4 > div.img-wrap > img")
    WebElement RFGPCCanineCollege;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div[4]/div/div[2]/div/div[7]/div[1]/p[2]/a")
    WebElement RFGPCKennelInspectionsLearnMore;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1mgo9gi-0.cGhLjQ.static-page > div > div.section-6 > div.text-wrap > p:nth-child(3) > a")
    WebElement RFGPCDNAProfiling;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div.listing-media.breeder-media > section > a")
    WebElement backToMyAccount;

    @FindBy(css = "#breeders-listing-media > div.NewMediaManagerWrapper-sc-1bpwivz-0.hBtNrY.active.addMediaRedesign > div > div > div > input[type=text]")
    WebElement AddYouTubeLinksInput;

    @FindBy(css = "#breeders-listing-media > div.NewMediaManagerWrapper-sc-1bpwivz-0.hBtNrY.active.addMediaRedesign > div > div > div > button")
    WebElement AddYouTubeLinksButton;

    @FindBy(css = "#breeders-storefront-tell-us-more > div > div:nth-child(6) > div.Styled__FormElement-sc-1he89oj-0.gyzjZo.form-element > div > label:nth-child(1) > span")
    WebElement YesToRegPappers;

    @FindBy(css = "#breeders-storefront-tell-us-more > div > div:nth-child(6) > div.Styled__FormElement-sc-1he89oj-0.gyzjZo.form-element > div > label:nth-child(3) > span")
    WebElement NoToRegPappers;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement TellUsWhyInput;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.Styled__Wrapper-sc-12ya1n7-1.hPPdjj > div:nth-child(2) > div > div")
    WebElement SaveSearchConfirmation;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[4]/input")
    WebElement password;



    DriverHelper driverHelper;
    //DriverFactory driverFactory;
    BrowserFactory browserFactory;

    WebDriver driver;

    public Puppies(WebDriver _driver) {

        //this.driverFactory = new DriverFactory();
        this.browserFactory = new BrowserFactory();
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }

    /*Check Puppies Menu*/
    public void CheckPuppies() {

        this.puppies.click();
        this.findapuppy.isDisplayed();
        this.resourcesForGettingPup.isDisplayed();
        this.listlitmark.isDisplayed();
        this.breedersfaq.isDisplayed();
        this.findpuprighthome.isDisplayed();

    }

/*Check Menu redirection after click*/
    public void CheckPuppies1() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy));
        this.findapuppy.click();
        wait.until(ExpectedConditions.visibilityOf(searchpuppage));


    }

    public void CheckPuppies2() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        wait.until(ExpectedConditions.elementToBeClickable(akcmarkforpup));
        this.akcmarkforpup.click();
        wait.until(ExpectedConditions.visibilityOf(akcmarkforpuppage));


    }

    public void CheckPuppies3() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        wait.until(ExpectedConditions.elementToBeClickable(readyforapup));
        this.readyforapup.click();
        wait.until(ExpectedConditions.visibilityOf(readyforpuppage));


    }

    public void CheckPuppies4() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        wait.until(ExpectedConditions.elementToBeClickable(choosingabreed));
        this.choosingabreed.click();
        wait.until(ExpectedConditions.visibilityOf(choosebreedpage));


    }

    public void CheckPuppies5() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        wait.until(ExpectedConditions.elementToBeClickable(questaskbreeder));
        this.questaskbreeder.click();
        wait.until(ExpectedConditions.visibilityOf(qaskbreedpage));

    }

    public void CheckPuppies6() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        wait.until(ExpectedConditions.elementToBeClickable(viewallbreeds)); //Replace locator
        this.viewallbreeds.click();
        wait.until(ExpectedConditions.urlContains("/dog-breeds/"));

    }

    public void CheckPuppies7() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        wait.until(ExpectedConditions.elementToBeClickable(listlitmark));
        this.listlitmark.click();
        wait.until(ExpectedConditions.visibilityOf(listlitmarkpage));

    }

    public void CheckPuppies8() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        wait.until(ExpectedConditions.elementToBeClickable(findpuprighthome));
        this.findpuprighthome.click();
        wait.until(ExpectedConditions.visibilityOf(findpuprighthomepage));

    }

    public void CheckPuppies9() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        wait.until(ExpectedConditions.elementToBeClickable(prepforpup));
        this.prepforpup.click();
        wait.until(ExpectedConditions.visibilityOf(preppuppage));

    }

    public void CheckPuppies10() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        wait.until(ExpectedConditions.elementToBeClickable(breedersfaq));
        this.breedersfaq.click();
        wait.until(ExpectedConditions.visibilityOf(breedfaqpage));
        
    }

    public void CheckPuppies11() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        wait.until(ExpectedConditions.elementToBeClickable(resourcesForGettingPup));
        this.resourcesForGettingPup.click();
        wait.until(ExpectedConditions.urlContains("/about-akc-marketplace"));

    }


    /*Check Visibility of elements in Puppies Homepage*/
    public void CheckPuppiesHome() {

        this.puppies.click();
        this.findapuppy.click();
        this.topheader.isDisplayed();
        this.topsubheader.isDisplayed();
        this.findpupform.isDisplayed();
        this.looking.isDisplayed();
        this.breedform.isDisplayed();
        this.genderform.isDisplayed();
        this.zipform.isDisplayed();
        this.distanceform.isDisplayed();
        this.distancearrow.isDisplayed();
        this.options.isDisplayed();
        this.options.click();
        this.availability.isDisplayed();
        this.nowtext.isDisplayed();
        this.now.isDisplayed();
        this.comingtext.isDisplayed();
        this.coming.isDisplayed();
        this.dogsize.isDisplayed();
        this.smalltext.isDisplayed();
        this.small.isDisplayed();
        this.mediumtext.isDisplayed();
        this.medium.isDisplayed();
        this.largetext.isDisplayed();
        this.large.isDisplayed();
        this.images.isDisplayed();
        this.inlisttext.isDisplayed();
        this.inlist.isDisplayed();
        this.bod.isDisplayed();
        this.bomtext.isDisplayed();
        this.bom.isDisplayed();
        this.bwhtext.isDisplayed();
        this.bwh.isDisplayed();
        this.champion.isDisplayed();
        this.yestext.isDisplayed();
        this.yes.isDisplayed();
        this.club.isDisplayed();
        this.nationaltext.isDisplayed();
        this.national.isDisplayed();
        this.specialtext.isDisplayed(); //change this locator
        this.special.isDisplayed();
        this.licensetext.isDisplayed();
        this.license.isDisplayed();
        this.findpupformbut.isDisplayed();
        this.listcreateform.isDisplayed();
        this.purebreed.isDisplayed();
        this.purebreedtext.isDisplayed();
        this.purebreedimage.isDisplayed();
        this.recomenda.isDisplayed();
        this.carrousel.isDisplayed();
        this.howfind.isDisplayed();
        this.bulldog.isDisplayed();
        this.cavalier.isDisplayed();
        this.yorkshire.isDisplayed();
        this.registered.isDisplayed();
        this.registeredtext.isDisplayed();
        this.kennel.isDisplayed();
        this.kenneltext.isDisplayed();
        this.breededu.isDisplayed();
        this.breededutext.isDisplayed();
        this.getready.isDisplayed();
        this.siberian.isDisplayed();
        this.howdecide.isDisplayed();
        this.beagle.isDisplayed();
        this.thingsconsi.isDisplayed();
        this.dachshund.isDisplayed();
        this.newcheck.isDisplayed();
        this.pug.isDisplayed();
        this.questask.isDisplayed();
        this.howfindright.isDisplayed();
        this.akcbom.isDisplayed();
        this.akcbomtext.isDisplayed();
        this.pembroke.isDisplayed();
        this.akcbwh.isDisplayed();
        this.morebom.isDisplayed();
        this.akcbwhtext.isDisplayed();
        this.husky.isDisplayed();
        this.akcclub.isDisplayed();
        this.morebwh.isDisplayed();
        this.akcclubtext.isDisplayed();
        this.beagle2.isDisplayed();
        this.moreclub.isDisplayed();
        this.akcchampion.isDisplayed();
        this.akcchampiontext.isDisplayed();
        this.shepherd.isDisplayed();
        this.morechampion.isDisplayed();
        this.howregister.isDisplayed();
        this.howregistertext.isDisplayed();
        this.regpuppy.isDisplayed();
        this.mostpop.isDisplayed();
        //this.carrousel2.isDisplayed();
        //this.labrador.isDisplayed();
        //this.golden.isDisplayed();
        //this.french.isDisplayed();
        //this.carrousel2.click();
        //this.german.isDisplayed();
        //this.poodle.isDisplayed();  * Elements not displayed on stage.
        //this.bull.isDisplayed();
        //this.carrousel2.click();
        //this.york.isDisplayed();
        //this.australian.isDisplayed();
        //this.welsh.isDisplayed();
        //this.carrousel2.click();
        //this.sibe.isDisplayed();
        //this.listbreeds.isDisplayed();
        this.howcan.isDisplayed();
        this.howcantext.isDisplayed();
        this.crealist.isDisplayed();


    }

    /*Check BOM page*/
    private void validbom() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/breeder-programs/akc-breeder-of-merit-program/"));

    }
    /*Check BWH page*/
    private void validbwh() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/akc-bred-with-heart-program/"));

    }
    /*Check Clubs page*/
    private void validclubs() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/clubs-delegates/clubs/about-clubs/"));

    }
    /*Check Champions page*/
    private void validchamp() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/sports/conformation/"));

    }
    /*Check Register Dog page*/
    private void validreg() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/register/dog/"));

    }
    /*Check Puppyvisor page*/
    private void validpupvisor() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://stage.marketplace.akc.org/puppyvisor"));

    }
    /*Check  Subscription FAQ page*/
    private void validmarksub() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://stage.marketplace.akc.org/breeders-faq#before-you-purchase"));

    }

    /*Check SERP results*/
    public void CheckSearchBreed() {

        this.puppies.click();
        this.findapuppy.click();
        this.findpupformbut.click();
        this.searchlistpageult.isDisplayed();

    }

    public void CheckSearchBreed1() {

        this.puppies.click();
        this.findapuppy.click();
        this.breedform.click();
        this.affens.click();
        this.findpupformbut.click();
        this.searchlistpageone.isDisplayed();

    }

    public void CheckSearchBreed2() {

        this.puppies.click();
        this.findapuppy.click();
        this.breedform.click();
        this.affens.click();
        this.genderform.click();
        this.female.click();
        this.findpupformbut.click();
        this.AffensPuppiesForSale.isDisplayed();

    }

    public void CheckSearchBreed3() {

        this.puppies.click();
        this.findapuppy.click();
        this.breedform.click();
        this.germanspitz.click();
        this.genderform.click();
        this.female.click();
        this.zipform.click();
        this.zipfield.sendKeys("80012");
        this.findpupformbut.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchlistnopage));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");

        //this.searchlistnopage.isDisplayed();

    }

    public void CheckSearchBreedNow() {

        this.puppies.click();
        this.findapuppy.click();
        this.options.click();
        this.now.click();
        this.findpupformbut.click();
        this.searchlistpageult.isDisplayed();

    }


    public void CheckSearchBreedSmall() {
        this.puppies.click();
        this.findapuppy.click();
        this.options.click();
        this.small.click();
        this.findpupformbut.click();
        this.searchlistpageult.isDisplayed();

    }



    public void CheckSearchBreedLarge() {

        this.puppies.click();
        this.findapuppy.click();
        this.options.click();
        this.large.click();
        this.findpupformbut.click();
        this.searchlistpageult.isDisplayed();

    }


    public void CheckSearchBreedInList() {

        this.puppies.click();
        this.findapuppy.click();
        this.options.click();
        this.inlist.click();
        this.findpupformbut.click();
        this.searchlistpageult.isDisplayed();

    }

    public void CheckSearchBreedBom() {

        this.puppies.click();
        this.findapuppy.click();
        this.options.click();
        this.bom.click();
        this.findpupformbut.click();
        this.searchlistPageTitle.isDisplayed(); //Set Breed of Merit breeders before running the test.

    }


    public void CheckSearchBreedBwh() {
        this.puppies.click();
        this.findapuppy.click();
        this.options.click();
        this.bwh.click();
        this.findpupformbut.click();
        this.searchlistPageTitle.isDisplayed();

    }


    public void CheckSearchBreedYes() {

        this.puppies.click();
        this.findapuppy.click();
        this.options.click();
        this.yes.click();
        this.findpupformbut.click();
        this.searchlistPageTitle.isDisplayed(); //There are no Champion bloodlines listed in stage

    }


    public void CheckSearchBreedNational() {

        this.puppies.click();
        this.findapuppy.click();
        this.options.click();
        this.national.click();
        this.findpupformbut.click();
        this.searchlistPageTitle.isDisplayed();

    }


    public void CheckSearchBreedSpecial() {

        this.puppies.click();
        this.findapuppy.click();
        this.options.click();
        this.special.click();
        this.findpupformbut.click();
        this.searchlistPageTitle.isDisplayed(); //Fails in stage, there are no AKC Speciality clubs listed

    }


    /*Check picture display in carrousel*/
    public void CheckCarrousel() {

        this.puppies.click();
        this.findapuppy.click();
        this.carrousel.click();
        this.carrousel.click();
        this.carrousel.click();
        this.carrousel.click();
        this.carrousel.click();
        this.carrousel.click();
        this.carrousel.click();


    }
    /*Check Additional Pages*/
    public void CheckHowDecide() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        this.findapuppy.click();
        this.howdecide.click();
        wait.until(ExpectedConditions.urlContains("choosing-a-breed"));


    }

    public void CheckThingsto() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        this.findapuppy.click();
        this.thingsconsi.click();
        wait.until(ExpectedConditions.visibilityOf(readyforpuppage));


    }

    public void CheckOwner() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        this.findapuppy.click();
        this.newcheck.click();
        wait.until(ExpectedConditions.urlContains("preparing-for-puppy"));


    }

    public void CheckQuestionAsk() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        this.findapuppy.click();
        this.questask.click();
        wait.until(ExpectedConditions.visibilityOf(qaskbreedpage));


    }

    public void CheckBOM() {

        this.puppies.click();
        this.findapuppy.click();
        this.morebom.click();
        validbom();

    }

    public void CheckBwh() {

        this.puppies.click();
        this.findapuppy.click();
        this.morebwh.click();
        validbwh();


    }

    public void CheckClub() {

        this.puppies.click();
        this.findapuppy.click();
        this.moreclub.click();
        validclubs();


    }

    public void CheckChamp() {

        this.puppies.click();
        this.findapuppy.click();
        this.morechampion.click();
        validchamp();


    }


    public void CheckRegister() {

        this.puppies.click();
        this.findapuppy.click();
        this.registered.click();
        validreg();


    }

    public void CheckCreateaList() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        this.findapuppy.click();
        this.crealist.click();
        wait.until(ExpectedConditions.urlContains("/advertise/breeders"));


    }

    /*Check SERP page results*/
    public void CheckSearchBreedListingPage()  {

        this.puppies.click();
        this.findapuppy.click();
        this.breedform.click();
        this.affens.click();
        this.findpupformbut.click();
        this.topbanner.isDisplayed();
        this.topbannersigin.isDisplayed();
        this.topbannealert.isDisplayed();
        this.breedinfo1.isDisplayed();
        this.breedtrait.isDisplayed();
        this.natiobreed.isDisplayed();
        this.descrip.isDisplayed();
        this.histjob.isDisplayed();
        this.health.isDisplayed();
        this.rescue.isDisplayed();
        this.breedVideo.isDisplayed();
        this.breedPhotoTab.isDisplayed();
        this.breedtrait.click();
        this.breedtraittext.isDisplayed();
        this.natiobreed.click();
        this.natiobreedtext.isDisplayed();
        this.descrip.click();
        this.descriptext.isDisplayed();
        this.histjob.click();
        this.histjobtext.isDisplayed();
        this.health.click();
        this.healthtext.isDisplayed();
        this.rescue.click();
        this.rescuetext.isDisplayed();
        this.listdisp.isDisplayed();
        this.listdisptext.isDisplayed();
        //this.puppyvisor.isDisplayed(); CMS Settings. This is not being displayed on stage for this breed,
        //this.puppyvisorbut.isDisplayed();
        this.bottombanner.isDisplayed();
        this.bottombannersigin.isDisplayed();
        this.expotherbreeds.isDisplayed();
        this.otherbreed1.isDisplayed();
        this.otherbreed2.isDisplayed();
        this.otherbreed3.isDisplayed();
        this.otherbreed1text.isDisplayed();
        this.otherbreed2text.isDisplayed();
        this.otherbreed3text.isDisplayed();


    }

    /*Check Breeder page*/
    public void CheckSearchBreedList()  {

        this.puppies.click();
        this.findapuppy.click();
        this.breedform.click();
        this.affens.click();
        this.findpupformbut.click();
        this.listdisp.isDisplayed();
        this.listdisptext.isDisplayed();
        this.listdisp.click();
        this.listingname.isDisplayed(); //this failed because of coming soon listing
        this.listingpict.isDisplayed(); //Need to change the video for a picture for the listing.
        this.listingtext.isDisplayed();
        this.listingtext.click();
        this.listingmsgbut.isDisplayed();
        this.aboutbreeder.isDisplayed();
        //this.listingcreateacc.isDisplayed();
        this.breederprof.isDisplayed();
        //this.createaccbut.isDisplayed(); This component was changed, we need to replace this element for "Login to get in touch"
        this.signinbut.isDisplayed();
        //this.reportissue.isDisplayed();

    }

    /*Check Puppyvisor page elements*/
    public void CheckPuppyvisorPage() {

        this.puppies.click();
        this.findapuppy.click();
        this.breedform.click();
        this.affens.click();
        this.findpupformbut.click();
        this.puppyvisor.isDisplayed();
        this.puppyvisorbut.click();
        validpupvisor();
        this.pupfindetext.isDisplayed();
        this.pupfindpict.isDisplayed();
        this.pufindtm.isDisplayed();
        this.pupcounselor.isDisplayed();
        this.pupcounselortext.isDisplayed();
        this.pupcounspict.isDisplayed();
        this.whatsinclu.isDisplayed();
        this.whatsinclutext.isDisplayed();
        this.onetimefee.isDisplayed();
        this.onetimefeebut.isDisplayed();
        this.howakcpupvis.isDisplayed();
        this.pupvisorworks.isDisplayed();
        this.whysignup.isDisplayed();
        this.whysignuptext.isDisplayed();
        this.whysignupbut.isDisplayed();
        this.pupvistermscond.isDisplayed();


    }
    /*Check advertise breeders page*/
    public void CheckBreederListingPage() {

        this.puppies.click();
        this.findapuppy.click();
        this.crealist.click();
        this.advertlitters.isDisplayed();
        this.advertlitterspict.isDisplayed();
        this.StartHere.isDisplayed();
        this.creanewlit.isDisplayed();
        this.GoToMyAccountPage.isDisplayed();
        this.monthlyPlanTitle.isDisplayed();
        this.annualPlanTitle.isDisplayed();
        this.getAnnualplanbut.isDisplayed();
        this.singleLitterListing.isDisplayed();
        this.FAQsBreederListingTitle.isDisplayed();
        //this.purchsubs.isDisplayed();
        //this.marksubs.click();
        //validmarksub();

    }

    /*SignIn User*/
    public void signInBreeder(User _testUser) {

        this.puppies.click();
        this.findapuppy.click();
        this.crealist.click();
        this.actpaidlit.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashhome.isDisplayed();
        //this.actpaidlit.click();
        //this.litternumber.isDisplayed();
        //this.damnumber.isDisplayed();
        //this.damdate.isDisplayed();


    }

    /*ActivateListing*/
    public void ActListing(Listing _testListing) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        this.findapuppy.click();
        this.crealist.click();
        this.actpaidlit.click();
        this.userName.sendKeys(_testListing.Email);
        this.passwordlog.sendKeys(_testListing.Password);
        this.ingresar.click();
        this.logged.isDisplayed();
        this.actpaidlit.click();
        this.litternumber.sendKeys(_testListing.LitNum);
        this.damnumber.sendKeys(_testListing.DamRegNum);
        this.damdate.sendKeys(_testListing.DamCertDate);
        this.creabutton.click();
        this.creditcard.sendKeys("4111111111111111");
        this.expdate.sendKeys(_testListing.ExpDate);
        this.cvv.sendKeys(_testListing.CVV);
        this.firstname2.sendKeys(_testListing.FirstName);
        this.lastname2.sendKeys(_testListing.LastName);
        this.billaddress.sendKeys(_testListing.Address);
        this.billzip.click();
        this.billzip2.sendKeys(_testListing.ZIP);
        wait.until(ExpectedConditions.visibilityOf(city));
        this.coupon.isDisplayed();
        this.state.isDisplayed();
        this.phone.sendKeys(_testListing.Phone);
        this.summary.isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(purchnow));
        this.purchnow.click();
        this.variety.click();
        this.variety2.click();
        this.listdesc.sendKeys(_testListing.Desc);
        this.litternum.isDisplayed();
        this.litterdob.isDisplayed();
        this.males.isDisplayed();
        this.females.isDisplayed();
        this.price.sendKeys(_testListing.Price);
        this.healthvacc.sendKeys(_testListing.Healthvac);
        this.textimportant.isDisplayed();
        this.firstcheck.click();
        this.firstchecktext.isDisplayed();
        this.secondcheck.click();
        this.secondchecktext.isDisplayed();
        this.thirdcheck.click();
        this.thirdchecktext.isDisplayed();
        this.fourcheck.click();
        this.fourcheck2.isDisplayed();
        this.fivecheck.click();
        this.fivecheck2.isDisplayed();
        this.continue2.click();
        this.addfile.isDisplayed();
        this.addfile.click();
        wait.until(ExpectedConditions.visibilityOf(addphovid));
        this.uploadmess.isDisplayed();
        this.youtu2.isDisplayed();
        this.youtu2.sendKeys(_testListing.Youtube);
        this.youtu2.sendKeys(ENTER);
        this.contyou.click();
        wait.until(ExpectedConditions.elementToBeClickable(closediag));
        this.closediag.click();
        wait.until(ExpectedConditions.elementToBeClickable(addfile));
        this.addfile.click();
        this.selimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\boxer2.jpg");
        this.inputimages.sendKeys("Breed picture");
        this.saveimages.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closediag));
        this.closediag.click();
        wait.until(ExpectedConditions.elementToBeClickable(continue3));
        this.continue3.click();
        this.kenname.sendKeys(_testListing.Kenname);
        this.weblink.sendKeys(_testListing.Weblink);
        this.descken.sendKeys(_testListing.Descken);
        this.breedsince.sendKeys(_testListing.Breedsince);
        this.ibreed.click();
        this.optaffen.click();
        this.website.sendKeys(_testListing.Website);
        this.continue4.click();
        this.continue5.click();
        this.continue6.click();
        this.addfile.click();
        this.selimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\linkedinimage.jpg");
        this.inputimages2.sendKeys("Breeder picture");
        this.inputbreeder.click();
        sleep(2000);
        this.selbreederimages.click();
        this.saveimages.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closediag2));
        this.closediag2.click();
        wait.until(ExpectedConditions.elementToBeClickable(continue7));
        this.continue7.click();
        this.sucesslisting.isDisplayed();


    }
    /*Create listing*/
    public void CreaListing(Listing _testListing) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        this.findapuppy.click();
        this.crealist.click();
        this.creanewlit.click();
        this.userName.sendKeys(_testListing.Email);
        this.passwordlog.sendKeys(_testListing.Password);
        this.ingresar.click();
        wait.until(ExpectedConditions.elementToBeClickable(manageMyListings));
        //this.logged.isDisplayed();
        this.manageMyListings.click();
        wait.until(ExpectedConditions.elementToBeClickable(createLitterListing));
        this.createLitterListing.click();
        this.litternumber.sendKeys(_testListing.LitNum);
        this.damnumber.sendKeys(_testListing.DamRegNum);
        this.damdate.sendKeys(_testListing.DamCertDate);
        this.creabutton.click();
        this.creditcard.sendKeys("4111111111111111");
        this.expdate.sendKeys(_testListing.ExpDate);
        this.cvv.sendKeys(_testListing.CVV);
        this.firstname2.sendKeys(_testListing.FirstName);
        this.lastname2.sendKeys(_testListing.LastName);
        this.billaddress.sendKeys(_testListing.Address);
        this.billzip.click();
        this.billzip2.sendKeys(_testListing.ZIP);
        wait.until(ExpectedConditions.visibilityOf(city));
        this.coupon.isDisplayed();
        this.state.isDisplayed();
        this.phone.sendKeys(_testListing.Phone);
        this.summary.isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(purchnow));
        this.purchnow.click();
        this.variety.click();
        this.variety2.click();
        this.listdesc.sendKeys(_testListing.Desc);
        this.litternum.isDisplayed();
        this.litterdob.isDisplayed();
        this.males.isDisplayed();
        this.females.isDisplayed();
        this.price.sendKeys(_testListing.Price);
        this.healthvacc.sendKeys(_testListing.Healthvac);
        this.textimportant.isDisplayed();
        this.firstcheck.click();
        this.firstchecktext.isDisplayed();
        this.secondcheck.click();
        this.secondchecktext.isDisplayed();
        this.thirdcheck.click();
        this.thirdchecktext.isDisplayed();
        this.fourcheck.click();
        this.fourcheck2.isDisplayed();
        this.fivecheck.click();
        this.fivecheck2.isDisplayed();
        this.continue2.click();
        this.addfile.isDisplayed();
        this.addfile.click();
        wait.until(ExpectedConditions.visibilityOf(addphovid));
        this.uploadmess.isDisplayed();
        this.youtu2.isDisplayed();
        this.youtu2.sendKeys(_testListing.Youtube);
        this.youtu2.sendKeys(ENTER);
        this.contyou.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closediag));
        this.closediag.click();
        wait.until(ExpectedConditions.elementToBeClickable(addfile));
        this.addfile.click();
        this.selimages.sendKeys("/Users/sebastian.viquez/Documents/NYCATS-QA-branch-A/src/test/java/Resources/image.png");
        this.inputimages.sendKeys("Breed picture");
        this.saveimages.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closediag));
        this.closediag.click();
        wait.until(ExpectedConditions.elementToBeClickable(continue3));
        this.continue3.click();
        this.kenname.sendKeys(_testListing.Kenname);
        this.weblink.sendKeys(_testListing.Weblink);
        this.descken.sendKeys(_testListing.Descken);
        this.breedsince.sendKeys(_testListing.Breedsince);
        this.ibreed.click();
        this.optaffen.click();
        this.website.sendKeys(_testListing.Website);
        this.continue4.click();
        this.continue5.click();
        this.continue6.click();
        this.addfile.click();
        this.selimages.sendKeys("/Users/sebastian.viquez/Documents/NYCATS-QA-branch-A/src/test/java/Resources/image.png");
        this.inputimages2.sendKeys("Breeder picture");
        this.inputbreeder.click();
        this.selbreederimages.click();
        sleep(2000);
        this.saveimages.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closediag2));
        this.closediag2.click();
        wait.until(ExpectedConditions.elementToBeClickable(continue7));
        this.continue7.click();
        this.sucesslisting.isDisplayed();


    }
    /*Purchase Suscription*/
    public void PurchaseSubs(Subscription _testSubscription) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        this.findapuppy.click();
        this.crealist.click();
        this.purchsubs.click();
        this.userName.sendKeys(_testSubscription.Email);
        this.passwordlog.sendKeys(_testSubscription.Password);
        this.ingresar.click();
        this.logged.isDisplayed();
        this.purchsubs.click();
        this.monthplan.isDisplayed();
        this.monthplanbut.isDisplayed();
        this.annualplan.isDisplayed();
        this.annualplanbut.click();
        this.creditcard.sendKeys("4111111111111111");
        this.expdate.sendKeys(_testSubscription.ExpDate);
        this.cvv.sendKeys(_testSubscription.CVV);
        this.firstname2.sendKeys(_testSubscription.FirstName);
        this.lastname2.sendKeys(_testSubscription.LastName);
        this.billaddress.sendKeys(_testSubscription.Address);
        this.billzip.click();
        this.billzip2.sendKeys(_testSubscription.ZIP);
        wait.until(ExpectedConditions.visibilityOf(city));
        this.coupon.isDisplayed();
        this.state.isDisplayed();
        this.phone.sendKeys(_testSubscription.Phone);
        this.summary.isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(purchnowsub));
        this.purchnowsub.click();
        wait.until(ExpectedConditions.visibilityOf(kenname));
        this.kenname.sendKeys(_testSubscription.Kenname);
        this.weblink.sendKeys(_testSubscription.Weblink);
        this.descken.sendKeys(_testSubscription.Descken);
        this.breedsince.sendKeys(_testSubscription.Breedsince);
        this.ibreed.click();
        this.optaffen.click();
        this.website.sendKeys(_testSubscription.Website);
        this.continue4.click();
        wait.until(ExpectedConditions.visibilityOf(billaddress2));
        this.billaddress2.sendKeys(_testSubscription.Address2);
        this.billzipsub.click();
        this.billzip2.sendKeys(_testSubscription.ZIP2);
        this.city.isDisplayed();
        this.state.isDisplayed();
        this.billaddress2.click();
        wait.until(ExpectedConditions.elementToBeClickable(continue5));
        this.continue5.click();
        wait.until(ExpectedConditions.elementToBeClickable(continue6));
        this.continue6.click();
        this.addfile.click();
        this.selimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\linkedinimage.jpg");
        this.inputimages2.sendKeys("Breeder picture");
        this.inputbreeder.click();
        this.selbreederimages.click();
        sleep(2000);
        this.saveimages.click();
        wait.until(ExpectedConditions.elementToBeClickable(closediag2));
        this.closediag2.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(continue7));
        this.continue7.click();
        this.successsubsc.isDisplayed();




    }
    /*Purchase Monthly Subscription*/
    public void PurchaseSubsMonth(Subscription _testSubscription) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.puppies.click();
        this.findapuppy.click();
        this.crealist.click();
        this.purchsubs.click();
        this.userName.sendKeys(_testSubscription.Email);
        this.passwordlog.sendKeys(_testSubscription.Password);
        this.ingresar.click();
        this.logged.isDisplayed();
        this.purchsubs.click();
        this.monthplan.isDisplayed();
        this.monthplanbut.isDisplayed();
        this.annualplan.isDisplayed();
        this.monthplanbut.click();
        this.creditcard.sendKeys("4111111111111111");
        this.expdate.sendKeys(_testSubscription.ExpDate);
        this.cvv.sendKeys(_testSubscription.CVV);
        this.firstname2.sendKeys(_testSubscription.FirstName);
        this.lastname2.sendKeys(_testSubscription.LastName);
        this.billaddress.sendKeys(_testSubscription.Address);
        this.billzip.click();
        this.billzip2.sendKeys(_testSubscription.ZIP);
        wait.until(ExpectedConditions.visibilityOf(city));
        this.coupon.isDisplayed();
        this.state.isDisplayed();
        this.phone.sendKeys(_testSubscription.Phone);
        this.summary.isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(purchnowsub));
        this.purchnowsub.click();
        wait.until(ExpectedConditions.visibilityOf(kenname));
        this.kenname.sendKeys(_testSubscription.Kenname);
        this.weblink.sendKeys(_testSubscription.Weblink);
        this.descken.sendKeys(_testSubscription.Descken);
        this.breedsince.sendKeys(_testSubscription.Breedsince);
        this.ibreed.click();
        this.optaffen.click();
        this.website.sendKeys(_testSubscription.Website);
        this.continue4.click();
        wait.until(ExpectedConditions.visibilityOf(billaddress2));
        this.billaddress2.sendKeys(_testSubscription.Address2);
        this.billzipsub.click();
        this.billzip2.sendKeys(_testSubscription.ZIP2);
        this.city.isDisplayed();
        this.state.isDisplayed();
        this.billaddress2.click();
        wait.until(ExpectedConditions.elementToBeClickable(continue5));
        this.continue5.click();
        wait.until(ExpectedConditions.elementToBeClickable(continue6));
        this.continue6.click();
        this.addfile.click();
        this.selimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\linkedinimage.jpg");
        this.inputimages2.sendKeys("Breeder picture");
        this.inputbreeder.click();
        this.selbreederimages.click();
        sleep(2000);
        this.saveimages.click();
        wait.until(ExpectedConditions.elementToBeClickable(closediag2));
        this.closediag2.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(continue7));
        this.continue7.click();
        this.successsubsc.isDisplayed();


    }
    /*Check Breeder Dashboard elements*/
    public void VerifiyDashboard(User _testUser)  {

        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.dashhome.isDisplayed();
        this.dashmessenger.isDisplayed();
        this.dashmanmypag.isDisplayed();
        this.dashmanmylist.isDisplayed();
        this.dashquestion.isDisplayed();
        this.dashaccount.isDisplayed();
        this.dashmypage.isDisplayed();
        this.profperf.isDisplayed();
        this.namedash.isDisplayed();
        this.joinedin.isDisplayed();
        this.status.isDisplayed();
        this.changePlan.isDisplayed(); //check this plan with new user
        this.editdash.isDisplayed();
        this.profileviews.isDisplayed();
        this.totalinquiries.isDisplayed();
        //this.purchmarksub.isDisplayed(); //Removing these because account already has a subscription
        //this.monthlydash.isDisplayed();
        //this.yeardash.isDisplayed();
        this.publishedlist.isDisplayed(); //FIX THIS LOCATOR
        this.editListingButton.isDisplayed();
        this.seealllist.isDisplayed();
        this.createanewlisting.isDisplayed();
        this.usersadmin.isDisplayed();
        this.activeadmin.isDisplayed();
        this.newadmin.isDisplayed();
        this.addadmin.isDisplayed();


    }
    /*Check Messenger elements*/
    public void VerifiyMessenger(User _testUser)  {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        //this.dashbreed.click();
        this.messengertab.click();
        this.imgmess.isDisplayed();
        this.usermess.isDisplayed();
        this.convchannel.isDisplayed();
        this.otheruserconv.click();
        this.imgothuser.isDisplayed();
        this.conversation.isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(messmenu));
        this.messmenu.click();
        this.messquestion.isDisplayed();
        this.messblock.isDisplayed();
        this.delconv.isDisplayed();
        this.messupfile.isDisplayed();
        this.messemoji.isDisplayed();
        this.messtextarea.isDisplayed();
        this.responsemess.isDisplayed();
        this.sentmess.isDisplayed();

    }

       //Sends message to breeder account from Findpuppy's page
        public void messageBreeder(User _testUser){

        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.puppies.click();
        this.findapuppy.click();
        this.findpupformbut.click();
        this.SERPResult.click(); //check on this find the respn why its not clicking
        this.messageBreederButton.click();

        //

        }


    /*Check ManageMyPage elements*/
    public void VerifiyManmypage(User _testUser)  {

        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashmanmypag.click();
        this.profileman.isDisplayed();
        this.contactman.isDisplayed(); //change this locator
        this.tellusman.isDisplayed();
        this.phvidman.isDisplayed();
        this.yourbreedprof.isDisplayed();
        this.kennameman.isDisplayed();
        this.weblinkman.isDisplayed();
        this.descripman.isDisplayed();
        this.breedsinceman.isDisplayed();
        this.breedman.isDisplayed();
        this.websiteman.isDisplayed();
        this.backtoacct.isDisplayed();
        this.savebutman.click();
        this.contactman.click();
        this.continfoman.isDisplayed();
        this.fullnameman.isDisplayed();
        this.addressman.isDisplayed();
        this.zipman.isDisplayed();
        this.cityman.isDisplayed();
        this.stateman.isDisplayed();
        this.phoneman.isDisplayed();
        this.emailman.isDisplayed();
        this.savebutman2.click();
        this.tellusman.click();
        this.tellusmoreman.isDisplayed();
        this.nationalclubman.isDisplayed();
        this.specialtyman.isDisplayed();
        this.licensedman.isDisplayed();
        this.mydogsman.isDisplayed();
        this.savebutman3.click();
        this.phvidman.click();
        this.dragDropFileIcon.isDisplayed();
        this.ContinueButton.isDisplayed();
        this.backToMyAccount.isDisplayed();
        this.AddYouTubeLinksInput.isDisplayed();
        this.AddYouTubeLinksButton.isDisplayed();
        this.ContinueButton.click();


    }
    /*Check ManageMy List elements*/
    public void VerifiyManmylisting(User _testUser)  {

        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashmanmylist.click();
        this.upgrto.isDisplayed(); //This won't show if you already have an annual plan
        this.crealitterbutton.isDisplayed();
        this.namelitter.isDisplayed();
        this.publishedlitter.isDisplayed();
        this.unpublishedlitter.isDisplayed();
        this.expiredlitter.isDisplayed();
        this.comingsoon.isDisplayed();
        this.dayslitter.isDisplayed();
        this.litterpicture.isDisplayed();
        this.litterheader.isDisplayed();
        this.editlitter.click(); //this is expected to fail if the listing moves from current DOM location.
        this.viewlisting.isDisplayed();
        this.editlisting.isDisplayed();
        //this.editListingButton.isDisplayed();
        this.unpublishlisting.isDisplayed();
        this.moreinfolisting.click();
        this.infolisting.isDisplayed();
        this.lasteditedlist.isDisplayed();



    }
    /*Check MyPage*/
    private void validmypage() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://stage.marketplace.akc.org/breeder/"));

    }
    /*Check BuyerQuestionnaire elements*/
    public void VerifiyMyBuyerQuest(User _testUser)  {

        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.dashquestion.click();
        this.mybuyerheader.isDisplayed(); //check this
        this.mybuyertext.isDisplayed();
        this.allbreedscheck.isDisplayed();
        this.allbreedtext.isDisplayed();
        this.spebreedscheck.isDisplayed();
        this.spebreedtext.isDisplayed();
        this.publiccheck.isDisplayed();
        this.publictext.isDisplayed();
        this.questintro.isDisplayed();
        this.introtext.isDisplayed();
        this.addquestionbut.isDisplayed();
        this.addquestionbut.click();
        this.questions.isDisplayed();
        this.typequestiontext.isDisplayed();
        this.typequestion.isDisplayed();
        this.movequestion.isDisplayed();
        this.closequestion.isDisplayed();
        this.messagetext.isDisplayed();
        this.messagearea.isDisplayed();
        this.requiredcheck.isDisplayed();
        this.requiredtext.isDisplayed();
        this.savequestion.isDisplayed();



    }
    /*Check MyAccount elements*/
    public void VerifiyMyAcoount(User _testUser)  {

        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.dashaccount.click();
        this.changepassheader.isDisplayed(); //There is an issue on stage when going to Dashboard > Account menu
        this.changepasstext.isDisplayed();
        //this.oldpassword.isDisplayed(); //update this one
        //this.newpassword.isDisplayed();
        //this.confirmpassword.isDisplayed();
        //this.changepassbut.isDisplayed();
        //this.paymethods.isDisplayed();

    }
    /*Check MyPage elements*/
    public void VerifiyMyPage(User _testUser)  {

        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.dashmypage.click();
        validmypage();
    }

    public void ResourcesForGettingPupAboutPage(){  //Fix this test

        this.puppies.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(resourcesForGettingPup));
        this.resourcesForGettingPup.click();
        this.RFGPAbout.isDisplayed();
        this.RFGPReadyForAPup.isDisplayed();
        this.RFGPCChossingBreed.isDisplayed();
        this.RFGPCQuestionsBreeder.isDisplayed();
        this.RFGPCPuppyCheckList.isDisplayed();
        this.RFGPCFindPuppyButton.isDisplayed();
        this.RFGPCQuestionsAskBreeder.isDisplayed();
        this.RFGPCAKCBreederOfMerit.isDisplayed();
        this.RFGPCAKCBredWithHEART.isDisplayed();
        this.RFGPCNationalBreedClubMember.isDisplayed();
        this.RFGPCCanineCollege.isDisplayed();
        this.RFGPCKennelInspectionsLearnMore.isDisplayed();
        this.RFGPCDNAProfiling.isDisplayed();

    }

    public void VerifyTellUsMore(User _testUser) {

        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashmanmypag.click();
        this.tellusman.click(); //check this
        this.NoToRegPappers.click();
        this.YesToRegPappers.click();
        this.savebutman3.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(NoToRegPappers));
        this.NoToRegPappers.click();
        this.TellUsWhyInput.click();
        this.TellUsWhyInput.sendKeys("123456789");
        wait.until(ExpectedConditions.elementToBeClickable(savebutman3));
        this.savebutman3.click();

    }

    public void CheckAlertMe() throws InterruptedException {

        this.iconsignin.click();
        this.userName.sendKeys("sxv+5@akc.org");
        this.password.sendKeys("CypresHill2*");
        this.ingresar.click();
        sleep(4000);
        this.puppies.click();
        this.findapuppy.click();
        this.breedform.click();
        this.affens.click();
        this.findpupformbut.click();
        this.topbannealert.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(SaveSearchConfirmation));

    }


}