package Pages;


import Helpers.BrowserFactory;
import Model.Listing;
import Model.Subscription;
import Model.User;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.Keys.ENTER;

public class Puppies {


    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div.Styled__Wrapper-sc-rvwmv6-0.gffKrQ > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div > div.header-icon-container.user-menu > a > span")
    WebElement iconsignin;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > a > span")
    WebElement afterSignInUser;

    @FindBy(css = "#center-menu > div:nth-child(1) > div.menu-item-title-container > span.menu-item-title")
    WebElement puppies;

    @FindBy(css = "#center-menu > div:nth-child(1) > div.menu-item-dropdown-container > div > ul > li:nth-child(2) > div > a")
    WebElement findapuppy;

    @FindBy(css = "#center-menu > div:nth-child(1) > div.menu-item-dropdown-container > div > ul > li:nth-child(4) > div > a")
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

    @FindBy(css = "#center-menu > div:nth-child(1) > div.menu-item-dropdown-container > div > ul > li:nth-child(7) > div > a")
    WebElement listlitmark;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.Styled__Wrapper-sc-7bo7op-0.llObZX > div > div:nth-child(2) > div.menu-item-dropdown-container > div > ul > li:nth-child(8) > div > a")
    WebElement breedersfaq;

    @FindBy(css = "#center-menu > div:nth-child(1) > div.menu-item-dropdown-container > div > ul > li:nth-child(8) > div > a")
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

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > section > div.Styled__Wrapper-sc-12ya1n7-1.hPPdjj > div.Styled__DesktopSearchWrapper-sc-12ya1n7-4.eBgJpD > form > div:nth-child(1) > div.search-breed")
    WebElement breedform;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > section > div.Styled__Wrapper-sc-12ya1n7-1.hPPdjj > div.Styled__DesktopSearchWrapper-sc-12ya1n7-4.eBgJpD > form > div:nth-child(1) > div.search-breed > div > div > div.css-1hwfws3")
    WebElement breedformInput;

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

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div:nth-child(2) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > ul > li.tabs__single-tab.is-active > a")
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

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div:nth-child(2) > div.Styled__Wrapper-sc-10glndu-0.cqXIeS > div:nth-child(2) > div > div > div > div > div > div.panel-flex__aside.panel-contain > div > div > ul")
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

    @FindBy(css = "#toggler > div > div.puppy-litter-hero__details > div > div.puppy-litter-info__title")
    WebElement listingname;

    @FindBy(css = "#toggler > div > div.puppy-litter-hero__slider > div > div > div.gallery-wrap-div > div.slick-slider.slider-container.slick-initialized > div > div > div.slick-slide.slick-active.slick-current > div > div > div.image")
    WebElement listingpict;

    @FindBy(css = "#toggler > div > div.Styled__Wrapper-sc-1uhl27o-0.fnULiI.slider-wrapper > div > div.track-wrap > div.track > div.slick-slider.slider-container.slick-initialized > div > div > div.slick-slide.slick-active.slick-current > div > div > div.image")
    WebElement ListingCarouselOpen;

    @FindBy(css = "#toggler > div > div.Styled__Wrapper-sc-1uhl27o-0.fnULiI.slider-wrapper > div > div.track-wrap > div.arrow-container > span:nth-child(2) > svg > use")
    WebElement CarouselRightArrow;

    @FindBy(css = "#toggler > div > div.Styled__Wrapper-sc-1uhl27o-0.fnULiI.slider-wrapper > div > div.track-wrap > div.arrow-container > span:nth-child(1) > svg > use")
    WebElement CarouselLeftArrow;

    @FindBy(css = "#toggler > div > div.Styled__Wrapper-sc-1uhl27o-0.fnULiI.slider-wrapper")
    WebElement closeCarousel;

    @FindBy(xpath = "//a[contains(text(),'GMAIL161 >')]")
    WebElement listingBreederLink;

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

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div.Styled__Wrapper-sc-rvwmv6-0.gffKrQ > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div > div.header-icon-container.user-menu > div > a > div > img")
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

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div.Styled__Wrapper-sc-rvwmv6-0.gffKrQ > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div > div.header-icon-container.user-menu > div > div > div > ul > li:nth-child(1) > a")
    WebElement dashbreed;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > div > div > ul > li:nth-child(1) > a")
    WebElement dashhomeDropdown;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > div > div.select-to-bar-nav > div.show-at-medium > div > a:nth-child(1)")
    WebElement dashhome;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > div > div.select-to-bar-nav > div.show-at-medium > div > a:nth-child(2)")
    WebElement dashmessenger;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > div > div.select-to-bar-nav > div.show-at-medium > div > a:nth-child(3)")
    WebElement dashmanmypag;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > div > div.select-to-bar-nav > div.show-at-medium > div > a:nth-child(4)")
    WebElement dashmanmylist;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div.Styled__Wrapper-sc-rvwmv6-0.gffKrQ > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div > div.header-icon-container.user-menu > div > div > div > ul > li:nth-child(3) > a")
    WebElement dashmanmylistFromUserDropdown;

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

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div.listing-storefront-edit__tertiary-nav > section > ul > li:nth-child(2) > a")
    WebElement contactman;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div.listing-storefront-edit__tertiary-nav > section > ul > li:nth-child(3) > a")
    WebElement tellusman;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div.listing-storefront-edit__tertiary-nav > section > ul > li:nth-child(4) > a")
    WebElement phvidman;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div.storefront-profile > div.dashboard__section-heading > h4")
    WebElement yourbreedprof;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[1]/div[1]/label[1]")
    WebElement kennameman;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[1]/div[1]/label[1]")
    WebElement weblinkman;

    @FindBy(xpath = "//body[1]/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/textarea[1]")
    WebElement descripman;

    @FindBy(xpath = "//body[1]/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement breedsinceman;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement breedman;

    @FindBy(xpath = "//body[1]/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement websiteman;

    @FindBy(id = "breeders-storefront-profile__submit")
    WebElement savebutman;

    @FindBy(css = "#breeders-storefront-profile > section > button.Button-sc-4rk3o3-1.frUmtp.button")
    WebElement backtoacct;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div.storefront-contact > div.dashboard__section-heading > h4")
    WebElement continfoman;

    @FindBy(xpath = "//body[1]/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement fullnameman;

    @FindBy(xpath = "//body[1]/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
    WebElement addressman;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement zipman;

    @FindBy(xpath = "//body[1]/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement cityman;

    @FindBy(xpath = "//body[1]/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement stateman;

    @FindBy(xpath = "//body[1]/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
    WebElement phoneman;

    @FindBy(xpath = "//body[1]/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement emailman;

    @FindBy(id = "breeders-storefront-contact__submit")
    WebElement savebutman2;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div.storefront-tell-us-more > div.dashboard__section-heading > h4")
    WebElement tellusmoreman;

    @FindBy(css = "#breeders-storefront-tell-us-more > div > div:nth-child(1) > div.FormElement-sc-1vjtnrg-0.hDZwUR.form-element > label > span.checkbox__visual-input")
    WebElement nationalclubCheckBox;
    @FindBy(css = "#parentClubBreed1 > div > div.css-1hwfws3 > div.css-pyq77v-singleValue")
    WebElement nationalclubman;

    @FindBy(css = "#breeders-storefront-tell-us-more > div > div:nth-child(2) > div.FormElement-sc-1vjtnrg-0.hDZwUR.form-element > label > span.checkbox__visual-input")
    WebElement specialtyCheckBox;

    @FindBy(xpath = "//body/div[12]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]")
    WebElement specialtyman;

    @FindBy(css = "#breeders-storefront-tell-us-more > div > div:nth-child(3) > div.FormElement-sc-1vjtnrg-0.hDZwUR.form-element > label > span.checkbox__visual-input")
    WebElement licensedCheckBox;
    @FindBy(css = "#akcLicensed1 > div > div.css-1hwfws3")
    WebElement licensedman;

    @FindBy(css = "#breeders-storefront-tell-us-more > div > div:nth-child(4) > div.FormElement-sc-1vjtnrg-0.hDZwUR.form-element > label > span.checkbox__visual-input")
    WebElement mydogsmanCheckBox;
    @FindBy(css = "#competeIn > div.css-1i23654-control > div.css-1hwfws3")
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

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(4) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.bVIWDN.puppy-litter-hero > div.puppy-litter-hero__slider > div > div > div > div")
    WebElement litterpicture;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(4) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.bVIWDN.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-info > div.puppy-litter-info__title")
    WebElement litterheader;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(4) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.bVIWDN.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-hero__edit-options > div > div > div.edit-menu__handle")
    WebElement editlitter;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(4) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.bVIWDN.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-hero__edit-options > div > div > div.edit-menu > ul > div > li:nth-child(1) > a")
    WebElement viewlisting;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(4) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.bVIWDN.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-hero__edit-options > div > div > div.edit-menu > ul > div > li:nth-child(2) > a")
    WebElement editlisting;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(4) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.bVIWDN.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-hero__edit-options > div > div > div.edit-menu > ul > div > li:nth-child(3) > a")
    WebElement unpublishlisting;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(4) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.bVIWDN.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-info > div.puppy-litter-info__field.puppy-litter-info__description > span.puppy-litter-info__more")
    WebElement moreinfolisting;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(4) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.bVIWDN.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-info")
    WebElement infolisting;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div:nth-child(4) > div.tabbed-litter-display > div.Wrapper-sc-1oztcci-0.bVIWDN.puppy-litter-hero > div.puppy-litter-hero__details > div.puppy-litter-info > div.puppy-litter-info__last-edited")
    WebElement lasteditedlist;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > h4")
    WebElement mybuyerheader;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > p:nth-child(2)")
    WebElement mybuyertext;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > div.Styled__FormElement-sc-1he89oj-0.gyzjZo.form-element > div > label:nth-child(1) > span")
    WebElement allbreedscheck;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > div.Styled__FormElement-sc-1he89oj-0.gyzjZo.form-element > div > label:nth-child(2) > span")
    WebElement spebreedscheck;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > form > div.FormElement-sc-1vjtnrg-0.hDZwUR.form-element > label > span.checkbox__visual-input")
    WebElement publiccheck;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > form > div.FormElement-sc-1vjtnrg-0.hDZwUR.form-element > label > span:nth-child(3)")
    WebElement publictext;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > div.Styled__FormElement-sc-1he89oj-0.gyzjZo.form-element > div > label:nth-child(1)")
    WebElement allbreedtext;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > div.Styled__FormElement-sc-1he89oj-0.gyzjZo.form-element > div > label:nth-child(2)")
    WebElement spebreedtext;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > form > div.buyer-survey__information > h5")
    WebElement questintro;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > form > div.buyer-survey__information > p")
    WebElement introtext;

    @FindBy(xpath = "//body[1]/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/textarea[1]")
    WebElement introBrief;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/form/div[2]/section/div[2]/h5")
    WebElement questions;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > form > div.buyer-survey__information > section > div:nth-child(4) > div:nth-child(4) > div.Styled__FormElement-sc-1he89oj-0.gyzjZo > label")
    WebElement typequestiontext;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/form[1]/div[2]/section[1]/div[4]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]")
    WebElement typequestion;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > form > div.buyer-survey__information > section > div:nth-child(4) > div:nth-child(4) > div.header > div.header--right > div.question__move > svg > use")
    WebElement movequestion;

    @FindBy(id = "close")
    WebElement closequestion;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/form[1]/div[2]/section[1]/div[4]/div[5]/div[4]/label[1]")
    WebElement messagetext;

    @FindBy(xpath = "//body[1]/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/form[1]/div[2]/section[1]/div[4]/div[5]/div[4]/div[1]/textarea[1]")
    WebElement messagearea;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > form > div.buyer-survey__information > section > div:nth-child(4) > div:nth-child(4) > div.FormElement-sc-1vjtnrg-0.hDZwUR.form-element > label > span.checkbox__visual-input")
    WebElement requiredcheck;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > form > div.buyer-survey__information > section > div:nth-child(4) > div:nth-child(4) > div.FormElement-sc-1vjtnrg-0.hDZwUR.form-element > label > span:nth-child(3)")
    WebElement requiredtext;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > form > div.buyer-survey__information > section > button")
    WebElement addquestionbut;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.mask-wrapper > form > section > button.Button-sc-4rk3o3-1.hbmGOf.button")
    WebElement savequestion;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.styled__AccordionToTabs-sc-142z30j-0.cZbGfv > div > div.styled__Tab-sc-142z30j-1.eLAvZF > h4")
    WebElement changepassheader;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div.styled__AccordionToTabs-sc-142z30j-0.cZbGfv > div > div.styled__Tab-sc-142z30j-1.eLAvZF > h4")
    WebElement changepasstext;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/label[1]")
    WebElement oldpassword;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/label[1]")
    WebElement newpassword;

    @FindBy(xpath = "//body/div[11]/div[1]/div[1]/div[6]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/label[1]")
    WebElement confirmpassword;

    @FindBy(xpath = "//button[contains(text(),'Change Password')]")
    WebElement changepassbut;

    @FindBy(xpath = "//a[contains(text(),'Payment methods')]")
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



    //DriverFactory driverFactory;
    BrowserFactory browserFactory;

    WebDriver driver;

    public Puppies(WebDriver _driver) {

        //driverFactory = new DriverFactory();
        browserFactory = new BrowserFactory();
        driver = _driver;
        PageFactory.initElements(driver, this);
    }

    /*Check Puppies Menu*/
    public void CheckPuppies() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.visibilityOf(findapuppy));
        wait.until(ExpectedConditions.visibilityOf(resourcesForGettingPup));
        wait.until(ExpectedConditions.visibilityOf(listlitmark));
        wait.until(ExpectedConditions.visibilityOf(findpuprighthome));

    }

/*Check Menu redirection after click*/
    public void CheckPuppies1() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy));
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.visibilityOf(searchpuppage));


    }

    public void CheckPuppies2() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcmarkforpup));
        wait.until(ExpectedConditions.elementToBeClickable(akcmarkforpup)).click();
        wait.until(ExpectedConditions.visibilityOf(akcmarkforpuppage));


    }

    public void CheckPuppies3() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(readyforapup));
        wait.until(ExpectedConditions.elementToBeClickable(readyforapup)).click();
        wait.until(ExpectedConditions.visibilityOf(readyforpuppage));


    }

    public void CheckPuppies4() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(choosingabreed));
        wait.until(ExpectedConditions.elementToBeClickable(choosingabreed)).click();
        wait.until(ExpectedConditions.visibilityOf(choosebreedpage));


    }

    public void CheckPuppies5() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(questaskbreeder));
        wait.until(ExpectedConditions.elementToBeClickable(questaskbreeder)).click();
        wait.until(ExpectedConditions.visibilityOf(qaskbreedpage));

    }

    public void CheckPuppies6() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(viewallbreeds)); //Replace locator
        wait.until(ExpectedConditions.elementToBeClickable(viewallbreeds)).click();
        wait.until(ExpectedConditions.urlContains("/dog-breeds/"));

    }

    public void CheckPuppies7() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(listlitmark));
        wait.until(ExpectedConditions.elementToBeClickable(listlitmark)).click();
        wait.until(ExpectedConditions.visibilityOf(listlitmarkpage));

    }

    public void CheckPuppies8() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpuprighthome));
        wait.until(ExpectedConditions.elementToBeClickable(findpuprighthome)).click();
        wait.until(ExpectedConditions.visibilityOf(findpuprighthomepage));

    }

    public void CheckPuppies9() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(prepforpup));
        wait.until(ExpectedConditions.elementToBeClickable(prepforpup)).click();
        wait.until(ExpectedConditions.visibilityOf(preppuppage));

    }

    public void CheckPuppies10() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedersfaq));
        wait.until(ExpectedConditions.elementToBeClickable(breedersfaq)).click();
        wait.until(ExpectedConditions.visibilityOf(breedfaqpage));
        
    }

    public void CheckPuppies11() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(resourcesForGettingPup));
        wait.until(ExpectedConditions.elementToBeClickable(resourcesForGettingPup)).click();
        wait.until(ExpectedConditions.urlContains("/about-akc-marketplace"));

    }


    /*Check Visibility of elements in Puppies Homepage*/
    public void CheckPuppiesHome() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.visibilityOf(topheader));
        wait.until(ExpectedConditions.visibilityOf(topsubheader));
        wait.until(ExpectedConditions.visibilityOf(findpupform));
        wait.until(ExpectedConditions.visibilityOf(looking));
        wait.until(ExpectedConditions.visibilityOf(breedform));
        wait.until(ExpectedConditions.visibilityOf(genderform));
        wait.until(ExpectedConditions.visibilityOf(zipform));
        wait.until(ExpectedConditions.visibilityOf(distanceform));
        wait.until(ExpectedConditions.visibilityOf(distancearrow));
        wait.until(ExpectedConditions.visibilityOf(options));
        wait.until(ExpectedConditions.elementToBeClickable(options)).click();
        wait.until(ExpectedConditions.visibilityOf(availability));
        wait.until(ExpectedConditions.visibilityOf(nowtext));
        wait.until(ExpectedConditions.visibilityOf(now));
        wait.until(ExpectedConditions.visibilityOf(comingtext));
        wait.until(ExpectedConditions.visibilityOf(coming));
        wait.until(ExpectedConditions.visibilityOf(dogsize));
        wait.until(ExpectedConditions.visibilityOf(smalltext));
        wait.until(ExpectedConditions.visibilityOf(small));
        wait.until(ExpectedConditions.visibilityOf(mediumtext));
        wait.until(ExpectedConditions.visibilityOf(medium));
        wait.until(ExpectedConditions.visibilityOf(largetext));
        wait.until(ExpectedConditions.visibilityOf(large));
        wait.until(ExpectedConditions.visibilityOf(images));
        wait.until(ExpectedConditions.visibilityOf(inlisttext));
        wait.until(ExpectedConditions.visibilityOf(inlist));
        wait.until(ExpectedConditions.visibilityOf(bod));
        wait.until(ExpectedConditions.visibilityOf(bomtext));
        wait.until(ExpectedConditions.visibilityOf(bom));
        wait.until(ExpectedConditions.visibilityOf(bwhtext));
        wait.until(ExpectedConditions.visibilityOf(bwh));
        wait.until(ExpectedConditions.visibilityOf(champion));
        wait.until(ExpectedConditions.visibilityOf(yestext));
        wait.until(ExpectedConditions.visibilityOf(yes));
        wait.until(ExpectedConditions.visibilityOf(club));
        wait.until(ExpectedConditions.visibilityOf(nationaltext));
        wait.until(ExpectedConditions.visibilityOf(national));
        wait.until(ExpectedConditions.visibilityOf(specialtext)); //change this locator
        wait.until(ExpectedConditions.visibilityOf(special));
        wait.until(ExpectedConditions.visibilityOf(licensetext));
        wait.until(ExpectedConditions.visibilityOf(license));
        wait.until(ExpectedConditions.visibilityOf(findpupformbut));
        wait.until(ExpectedConditions.visibilityOf(listcreateform));
        wait.until(ExpectedConditions.visibilityOf(purebreed));
        wait.until(ExpectedConditions.visibilityOf(purebreedtext));
        wait.until(ExpectedConditions.visibilityOf(purebreedimage));
        wait.until(ExpectedConditions.visibilityOf(recomenda));
        wait.until(ExpectedConditions.visibilityOf(carrousel));
        wait.until(ExpectedConditions.visibilityOf(howfind));
        wait.until(ExpectedConditions.visibilityOf(bulldog));
        wait.until(ExpectedConditions.visibilityOf(cavalier));
        wait.until(ExpectedConditions.visibilityOf(yorkshire));
        wait.until(ExpectedConditions.visibilityOf(registered));
        wait.until(ExpectedConditions.visibilityOf(registeredtext));
        wait.until(ExpectedConditions.visibilityOf(kennel));
        wait.until(ExpectedConditions.visibilityOf(kenneltext));
        wait.until(ExpectedConditions.visibilityOf(breededu));
        wait.until(ExpectedConditions.visibilityOf(breededutext));
        wait.until(ExpectedConditions.visibilityOf(getready));
        wait.until(ExpectedConditions.visibilityOf(siberian));
        wait.until(ExpectedConditions.visibilityOf(howdecide));
        wait.until(ExpectedConditions.visibilityOf(beagle));
        wait.until(ExpectedConditions.visibilityOf(thingsconsi));
        wait.until(ExpectedConditions.visibilityOf(dachshund));
        wait.until(ExpectedConditions.visibilityOf(newcheck));
        wait.until(ExpectedConditions.visibilityOf(pug));
        wait.until(ExpectedConditions.visibilityOf(questask));
        wait.until(ExpectedConditions.visibilityOf(howfindright));
        wait.until(ExpectedConditions.visibilityOf(akcbom));
        wait.until(ExpectedConditions.visibilityOf(akcbomtext));
        wait.until(ExpectedConditions.visibilityOf(pembroke));
        wait.until(ExpectedConditions.visibilityOf(akcbwh));
        wait.until(ExpectedConditions.visibilityOf(morebom));
        wait.until(ExpectedConditions.visibilityOf(akcbwhtext));
        wait.until(ExpectedConditions.visibilityOf(husky));
        wait.until(ExpectedConditions.visibilityOf(akcclub));
        wait.until(ExpectedConditions.visibilityOf(morebwh));
        wait.until(ExpectedConditions.visibilityOf(akcclubtext));
        wait.until(ExpectedConditions.visibilityOf(beagle2));
        wait.until(ExpectedConditions.visibilityOf(moreclub));
        wait.until(ExpectedConditions.visibilityOf(akcchampion));
        wait.until(ExpectedConditions.visibilityOf(akcchampiontext));
        wait.until(ExpectedConditions.visibilityOf(shepherd));
        wait.until(ExpectedConditions.visibilityOf(morechampion));
        wait.until(ExpectedConditions.visibilityOf(howregister));
        wait.until(ExpectedConditions.visibilityOf(howregistertext));
        wait.until(ExpectedConditions.visibilityOf(regpuppy));
        wait.until(ExpectedConditions.visibilityOf(mostpop));
        //wait.until(ExpectedConditions.visibilityOf(carrousel2));
        //wait.until(ExpectedConditions.visibilityOf(labrador));
        //wait.until(ExpectedConditions.visibilityOf(golden));
        //wait.until(ExpectedConditions.visibilityOf(french));
        //wait.until(ExpectedConditions.elementToBeClickable(carrousel2)).click();
        //wait.until(ExpectedConditions.visibilityOf(german));
        //wait.until(ExpectedConditions.visibilityOf(poodle));  * Elements not displayed on stage.
        //wait.until(ExpectedConditions.visibilityOf(bull));
        //wait.until(ExpectedConditions.elementToBeClickable(carrousel2)).click();
        //wait.until(ExpectedConditions.visibilityOf(york));
        //wait.until(ExpectedConditions.visibilityOf(australian));
        //wait.until(ExpectedConditions.visibilityOf(welsh));
        //wait.until(ExpectedConditions.elementToBeClickable(carrousel2)).click();
        //wait.until(ExpectedConditions.visibilityOf(sibe));
        //wait.until(ExpectedConditions.visibilityOf(listbreeds));
        wait.until(ExpectedConditions.visibilityOf(howcan));
        wait.until(ExpectedConditions.visibilityOf(howcantext));
        wait.until(ExpectedConditions.visibilityOf(crealist));


    }

    /*Check BOM page*/
    private void validbom() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/breeder-programs/akc-breeder-of-merit-program/"));

    }
    /*Check BWH page*/
    private void validbwh() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("/akc-bred-with-heart-program/"));

    }
    /*Check Clubs page*/
    private void validclubs() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/clubs-delegates/clubs/about-clubs/"));

    }
    /*Check Champions page*/
    private void validchamp() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/sports/conformation/"));

    }
    /*Check Register Dog page*/
    private void validreg() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/register/dog/"));

    }
    /*Check Puppyvisor page*/
    private void validpupvisor() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://stage.marketplace.akc.org/puppyvisor"));

    }
    /*Check  Subscription FAQ page*/
    private void validmarksub() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://stage.marketplace.akc.org/breeders-faq#before-you-purchase"));

    }

    /*Check SERP results*/
    public void CheckSearchBreed() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistpageult));

    }

    public void CheckSearchBreed1() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedform)).click();
        wait.until(ExpectedConditions.elementToBeClickable(affens)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistpageone));

    }

    public void CheckSearchBreed2() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedform)).click();
        wait.until(ExpectedConditions.elementToBeClickable(affens)).click();
        wait.until(ExpectedConditions.elementToBeClickable(genderform)).click();
        wait.until(ExpectedConditions.elementToBeClickable(female)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(AffensPuppiesForSale));

    }

    public void CheckSearchBreed3() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedform)).click();
        wait.until(ExpectedConditions.elementToBeClickable(germanspitz)).click();
        wait.until(ExpectedConditions.elementToBeClickable(genderform)).click();
        wait.until(ExpectedConditions.elementToBeClickable(female)).click();
        wait.until(ExpectedConditions.elementToBeClickable(zipform)).click();
        zipfield.sendKeys("80012");
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistnopage));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");

        //wait.until(ExpectedConditions.visibilityOf(searchlistnopage));

    }

    public void CheckSearchBreedNow() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(options)).click();
        wait.until(ExpectedConditions.elementToBeClickable(now)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistpageult));

    }


    public void CheckSearchBreedSmall() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(options)).click();
        wait.until(ExpectedConditions.elementToBeClickable(small)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistpageult));

    }



    public void CheckSearchBreedLarge() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(options)).click();
        wait.until(ExpectedConditions.elementToBeClickable(large)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistpageult));

    }


    public void CheckSearchBreedInList() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(options)).click();
        wait.until(ExpectedConditions.elementToBeClickable(inlist)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistpageult));

    }

    public void CheckSearchBreedBom() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(options)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bom)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistPageTitle)); //Set Breed of Merit breeders before running the test.

    }


    public void CheckSearchBreedBwh() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(options)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bwh)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistPageTitle));

    }


    public void CheckSearchBreedYes() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(options)).click();
        wait.until(ExpectedConditions.elementToBeClickable(yes)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistPageTitle)); //There are no Champion bloodlines listed in stage

    }


    public void CheckSearchBreedNational() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(options)).click();
        wait.until(ExpectedConditions.elementToBeClickable(national)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistPageTitle));

    }


    public void CheckSearchBreedSpecial() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(options)).click();
        wait.until(ExpectedConditions.elementToBeClickable(special)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(searchlistPageTitle)); //Fails in stage, there are no AKC Speciality clubs listed

    }


    /*Check picture display in carrousel*/
    public void CheckCarrousel() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();
        wait.until(ExpectedConditions.elementToBeClickable(carrousel)).click();


    }
    /*Check Additional Pages*/
    public void CheckHowDecide() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(howdecide)).click();
        wait.until(ExpectedConditions.urlContains("choosing-a-breed"));


    }

    public void CheckThingsto() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(thingsconsi)).click();
        wait.until(ExpectedConditions.visibilityOf(readyforpuppage));


    }

    public void CheckOwner() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(newcheck)).click();
        wait.until(ExpectedConditions.urlContains("preparing-for-puppy"));


    }

    public void CheckQuestionAsk() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(questask)).click();
        wait.until(ExpectedConditions.visibilityOf(qaskbreedpage));


    }

    public void CheckBOM() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(morebom)).click();
        validbom();

    }

    public void CheckBwh() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(morebwh)).click();
        validbwh();


    }

    public void CheckClub() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(moreclub)).click();
        validclubs();


    }

    public void CheckChamp() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(morechampion)).click();
        validchamp();


    }


    public void CheckRegister() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(registered)).click();
        validreg();


    }

    public void CheckCreateaList() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(crealist)).click();
        wait.until(ExpectedConditions.urlContains("/advertise/breeders"));


    }

    /*Check SERP page results*/
    public void CheckSearchBreedListingPage()  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedform)).click();
        wait.until(ExpectedConditions.elementToBeClickable(affens)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(topbanner));
        wait.until(ExpectedConditions.visibilityOf(topbannersigin));
        wait.until(ExpectedConditions.visibilityOf(topbannealert));
        wait.until(ExpectedConditions.visibilityOf(breedinfo1));
        wait.until(ExpectedConditions.visibilityOf(breedtrait)); //check this
        wait.until(ExpectedConditions.visibilityOf(natiobreed));
        wait.until(ExpectedConditions.visibilityOf(descrip));
        wait.until(ExpectedConditions.visibilityOf(histjob));
        wait.until(ExpectedConditions.visibilityOf(health));
        wait.until(ExpectedConditions.visibilityOf(rescue));
        wait.until(ExpectedConditions.visibilityOf(breedVideo));
        wait.until(ExpectedConditions.visibilityOf(breedPhotoTab));
        wait.until(ExpectedConditions.elementToBeClickable(breedtrait)).click();
        wait.until(ExpectedConditions.visibilityOf(breedtraittext));
        wait.until(ExpectedConditions.elementToBeClickable(natiobreed)).click();
        wait.until(ExpectedConditions.visibilityOf(natiobreedtext));
        wait.until(ExpectedConditions.elementToBeClickable(descrip)).click();
        wait.until(ExpectedConditions.visibilityOf(descriptext));
        wait.until(ExpectedConditions.elementToBeClickable(histjob)).click();
        wait.until(ExpectedConditions.visibilityOf(histjobtext));
        wait.until(ExpectedConditions.elementToBeClickable(health)).click();
        wait.until(ExpectedConditions.visibilityOf(healthtext));
        wait.until(ExpectedConditions.elementToBeClickable(rescue)).click();
        wait.until(ExpectedConditions.visibilityOf(rescuetext));
        wait.until(ExpectedConditions.visibilityOf(listdisp));
        wait.until(ExpectedConditions.visibilityOf(listdisptext));
        //wait.until(ExpectedConditions.visibilityOf(puppyvisor)); CMS Settings. This is not being displayed on stage for this breed,
        //wait.until(ExpectedConditions.visibilityOf(puppyvisorbut));
        wait.until(ExpectedConditions.visibilityOf(bottombanner));
        wait.until(ExpectedConditions.visibilityOf(bottombannersigin));
        wait.until(ExpectedConditions.visibilityOf(expotherbreeds));
        wait.until(ExpectedConditions.visibilityOf(otherbreed1));
        wait.until(ExpectedConditions.visibilityOf(otherbreed2));
        wait.until(ExpectedConditions.visibilityOf(otherbreed3));
        wait.until(ExpectedConditions.visibilityOf(otherbreed1text));
        wait.until(ExpectedConditions.visibilityOf(otherbreed2text));
        wait.until(ExpectedConditions.visibilityOf(otherbreed3text));


    }

    /*Check Breeder page*/
    public void CheckSearchBreedList()  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedform)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(listdisp));
        wait.until(ExpectedConditions.visibilityOf(listdisptext));
        wait.until(ExpectedConditions.elementToBeClickable(listdisp)).click();
        wait.until(ExpectedConditions.visibilityOf(listingname));
        wait.until(ExpectedConditions.visibilityOf(listingpict));
        wait.until(ExpectedConditions.visibilityOf(listingBreederLink)); //fix this
        wait.until(ExpectedConditions.elementToBeClickable(listingpict)).click();
        wait.until(ExpectedConditions.visibilityOf(ListingCarouselOpen));
        //wait.until(ExpectedConditions.elementToBeClickable(CarouselRightArrow)).click();
        wait.until(ExpectedConditions.elementToBeClickable(CarouselLeftArrow)).click();
        wait.until(ExpectedConditions.elementToBeClickable(closeCarousel));
        wait.until(ExpectedConditions.elementToBeClickable(closeCarousel)).click();
        //wait.until(ExpectedConditions.elementToBeClickable(listingBreederLink)).click(); //Fix the click out
        //wait.until(ExpectedConditions.visibilityOf(listingmsgbut));
        //wait.until(ExpectedConditions.visibilityOf(aboutbreeder));
        //wait.until(ExpectedConditions.visibilityOf(breederprof));
        //wait.until(ExpectedConditions.visibilityOf(signinbut));
        //wait.until(ExpectedConditions.visibilityOf(reportissue));

    }

    /*Check Puppyvisor page elements*/
    public void CheckPuppyvisorPage() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedform)).click();
        wait.until(ExpectedConditions.elementToBeClickable(affens)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.visibilityOf(puppyvisor));
        wait.until(ExpectedConditions.elementToBeClickable(puppyvisorbut)).click();
        validpupvisor();
        wait.until(ExpectedConditions.visibilityOf(pupfindetext));
        wait.until(ExpectedConditions.visibilityOf(pupfindpict));
        wait.until(ExpectedConditions.visibilityOf(pufindtm));
        wait.until(ExpectedConditions.visibilityOf(pupcounselor));
        wait.until(ExpectedConditions.visibilityOf(pupcounselortext));
        wait.until(ExpectedConditions.visibilityOf(pupcounspict));
        wait.until(ExpectedConditions.visibilityOf(whatsinclu));
        wait.until(ExpectedConditions.visibilityOf(whatsinclutext));
        wait.until(ExpectedConditions.visibilityOf(onetimefee));
        wait.until(ExpectedConditions.visibilityOf(onetimefeebut));
        wait.until(ExpectedConditions.visibilityOf(howakcpupvis));
        wait.until(ExpectedConditions.visibilityOf(pupvisorworks));
        wait.until(ExpectedConditions.visibilityOf(whysignup));
        wait.until(ExpectedConditions.visibilityOf(whysignuptext));
        wait.until(ExpectedConditions.visibilityOf(whysignupbut));
        wait.until(ExpectedConditions.visibilityOf(pupvistermscond));


    }
    /*Check advertise breeders page*/
    public void CheckBreederListingPage() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(crealist)).click();
        wait.until(ExpectedConditions.visibilityOf(advertlitters));
        wait.until(ExpectedConditions.visibilityOf(advertlitterspict));
        wait.until(ExpectedConditions.visibilityOf(StartHere));
        wait.until(ExpectedConditions.visibilityOf(creanewlit));
        wait.until(ExpectedConditions.visibilityOf(GoToMyAccountPage));
        wait.until(ExpectedConditions.visibilityOf(monthlyPlanTitle));
        wait.until(ExpectedConditions.visibilityOf(annualPlanTitle));
        wait.until(ExpectedConditions.visibilityOf(getAnnualplanbut));
        wait.until(ExpectedConditions.visibilityOf(singleLitterListing));
        wait.until(ExpectedConditions.visibilityOf(FAQsBreederListingTitle));
        //wait.until(ExpectedConditions.visibilityOf(purchsubs));
        //wait.until(ExpectedConditions.elementToBeClickable(marksubs)).click();
        //validmarksub();

    }

    /*SignIn User*/
    public void signInBreeder(User _testUser) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(crealist)).click();
        wait.until(ExpectedConditions.elementToBeClickable(actpaidlit)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.visibilityOf(dashhome));
        //wait.until(ExpectedConditions.elementToBeClickable(actpaidlit)).click();
        //wait.until(ExpectedConditions.visibilityOf(litternumber));
        //wait.until(ExpectedConditions.visibilityOf(damnumber));
        //wait.until(ExpectedConditions.visibilityOf(damdate));


    }

    /*ActivateListing*/
    public void ActListing(Listing _testListing) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(crealist)).click();
        wait.until(ExpectedConditions.elementToBeClickable(actpaidlit)).click();
        userName.sendKeys(_testListing.Email);
        passwordlog.sendKeys(_testListing.Password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        wait.until(ExpectedConditions.visibilityOf(logged));
        wait.until(ExpectedConditions.elementToBeClickable(actpaidlit)).click();
        litternumber.sendKeys(_testListing.LitNum);
        damnumber.sendKeys(_testListing.DamRegNum);
        damdate.sendKeys(_testListing.DamCertDate);
        wait.until(ExpectedConditions.elementToBeClickable(creabutton)).click();
        creditcard.sendKeys("4111111111111111");
        expdate.sendKeys(_testListing.ExpDate);
        cvv.sendKeys(_testListing.CVV);
        firstname2.sendKeys(_testListing.FirstName);
        lastname2.sendKeys(_testListing.LastName);
        billaddress.sendKeys(_testListing.Address);
        wait.until(ExpectedConditions.elementToBeClickable(billzip)).click();
        billzip2.sendKeys(_testListing.ZIP);
        wait.until(ExpectedConditions.visibilityOf(city));
        wait.until(ExpectedConditions.visibilityOf(coupon));
        wait.until(ExpectedConditions.visibilityOf(state));
        phone.sendKeys(_testListing.Phone);
        wait.until(ExpectedConditions.visibilityOf(summary));
        wait.until(ExpectedConditions.elementToBeClickable(purchnow));
        wait.until(ExpectedConditions.elementToBeClickable(purchnow)).click();
        wait.until(ExpectedConditions.elementToBeClickable(variety)).click();
        wait.until(ExpectedConditions.elementToBeClickable(variety2)).click();
        listdesc.sendKeys(_testListing.Desc);
        wait.until(ExpectedConditions.visibilityOf(litternum));
        wait.until(ExpectedConditions.visibilityOf(litterdob));
        wait.until(ExpectedConditions.visibilityOf(males));
        wait.until(ExpectedConditions.visibilityOf(females));
        price.sendKeys(_testListing.Price);
        healthvacc.sendKeys(_testListing.Healthvac);
        wait.until(ExpectedConditions.visibilityOf(textimportant));
        wait.until(ExpectedConditions.elementToBeClickable(firstcheck)).click();
        wait.until(ExpectedConditions.visibilityOf(firstchecktext));
        wait.until(ExpectedConditions.elementToBeClickable(secondcheck)).click();
        wait.until(ExpectedConditions.visibilityOf(secondchecktext));
        wait.until(ExpectedConditions.elementToBeClickable(thirdcheck)).click();
        wait.until(ExpectedConditions.visibilityOf(thirdchecktext));
        wait.until(ExpectedConditions.elementToBeClickable(fourcheck)).click();
        wait.until(ExpectedConditions.visibilityOf(fourcheck2));
        wait.until(ExpectedConditions.elementToBeClickable(fivecheck)).click();
        wait.until(ExpectedConditions.visibilityOf(fivecheck2));
        wait.until(ExpectedConditions.elementToBeClickable(continue2)).click();
        wait.until(ExpectedConditions.visibilityOf(addfile));
        wait.until(ExpectedConditions.elementToBeClickable(addfile)).click();
        wait.until(ExpectedConditions.visibilityOf(addphovid));
        wait.until(ExpectedConditions.visibilityOf(uploadmess));
        wait.until(ExpectedConditions.visibilityOf(youtu2));
        youtu2.sendKeys(_testListing.Youtube);
        youtu2.sendKeys(ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(contyou)).click();
        wait.until(ExpectedConditions.elementToBeClickable(closediag));
        wait.until(ExpectedConditions.elementToBeClickable(closediag)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addfile));
        wait.until(ExpectedConditions.elementToBeClickable(addfile)).click();
        selimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\boxer2.jpg");
        inputimages.sendKeys("Breed picture");
        wait.until(ExpectedConditions.elementToBeClickable(saveimages)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closediag));
        wait.until(ExpectedConditions.elementToBeClickable(closediag)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue3));
        wait.until(ExpectedConditions.elementToBeClickable(continue3)).click();
        kenname.sendKeys(_testListing.Kenname);
        weblink.sendKeys(_testListing.Weblink);
        descken.sendKeys(_testListing.Descken);
        breedsince.sendKeys(_testListing.Breedsince);
        wait.until(ExpectedConditions.elementToBeClickable(ibreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(optaffen)).click();
        website.sendKeys(_testListing.Website);
        wait.until(ExpectedConditions.elementToBeClickable(continue4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue6)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addfile)).click();
        selimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\linkedinimage.jpg");
        inputimages2.sendKeys("Breeder picture");
        wait.until(ExpectedConditions.elementToBeClickable(inputbreeder)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(selbreederimages)).click();
        wait.until(ExpectedConditions.elementToBeClickable(saveimages)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closediag2));
        wait.until(ExpectedConditions.elementToBeClickable(closediag2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue7));
        wait.until(ExpectedConditions.elementToBeClickable(continue7)).click();
        wait.until(ExpectedConditions.visibilityOf(sucesslisting));


    }
    /*Create listing*/
    public void CreaListing(Listing _testListing) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(crealist)).click();
        wait.until(ExpectedConditions.elementToBeClickable(creanewlit)).click();
        userName.sendKeys(_testListing.Email);
        passwordlog.sendKeys(_testListing.Password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        wait.until(ExpectedConditions.elementToBeClickable(manageMyListings));
        //wait.until(ExpectedConditions.visibilityOf(logged));
        wait.until(ExpectedConditions.elementToBeClickable(manageMyListings)).click();
        wait.until(ExpectedConditions.elementToBeClickable(createLitterListing));
        wait.until(ExpectedConditions.elementToBeClickable(createLitterListing)).click();
        litternumber.sendKeys(_testListing.LitNum);
        damnumber.sendKeys(_testListing.DamRegNum);
        damdate.sendKeys(_testListing.DamCertDate);
        wait.until(ExpectedConditions.elementToBeClickable(creabutton)).click();
        creditcard.sendKeys("4111111111111111");
        expdate.sendKeys(_testListing.ExpDate);
        cvv.sendKeys(_testListing.CVV);
        firstname2.sendKeys(_testListing.FirstName);
        lastname2.sendKeys(_testListing.LastName);
        billaddress.sendKeys(_testListing.Address);
        wait.until(ExpectedConditions.elementToBeClickable(billzip)).click();
        billzip2.sendKeys(_testListing.ZIP);
        wait.until(ExpectedConditions.visibilityOf(city));
        wait.until(ExpectedConditions.visibilityOf(coupon));
        wait.until(ExpectedConditions.visibilityOf(state));
        phone.sendKeys(_testListing.Phone);
        wait.until(ExpectedConditions.visibilityOf(summary));
        wait.until(ExpectedConditions.elementToBeClickable(purchnow));
        wait.until(ExpectedConditions.elementToBeClickable(purchnow)).click();
        wait.until(ExpectedConditions.elementToBeClickable(variety)).click();
        wait.until(ExpectedConditions.elementToBeClickable(variety2)).click();
        listdesc.sendKeys(_testListing.Desc);
        wait.until(ExpectedConditions.visibilityOf(litternum));
        wait.until(ExpectedConditions.visibilityOf(litterdob));
        wait.until(ExpectedConditions.visibilityOf(males));
        wait.until(ExpectedConditions.visibilityOf(females));
        price.sendKeys(_testListing.Price);
        healthvacc.sendKeys(_testListing.Healthvac);
        wait.until(ExpectedConditions.visibilityOf(textimportant));
        wait.until(ExpectedConditions.elementToBeClickable(firstcheck)).click();
        wait.until(ExpectedConditions.visibilityOf(firstchecktext));
        wait.until(ExpectedConditions.elementToBeClickable(secondcheck)).click();
        wait.until(ExpectedConditions.visibilityOf(secondchecktext));
        wait.until(ExpectedConditions.elementToBeClickable(thirdcheck)).click();
        wait.until(ExpectedConditions.visibilityOf(thirdchecktext));
        wait.until(ExpectedConditions.elementToBeClickable(fourcheck)).click();
        wait.until(ExpectedConditions.visibilityOf(fourcheck2));
        wait.until(ExpectedConditions.elementToBeClickable(fivecheck)).click();
        wait.until(ExpectedConditions.visibilityOf(fivecheck2));
        wait.until(ExpectedConditions.elementToBeClickable(continue2)).click();
        wait.until(ExpectedConditions.visibilityOf(addfile));
        wait.until(ExpectedConditions.elementToBeClickable(addfile)).click();
        wait.until(ExpectedConditions.visibilityOf(addphovid));
        wait.until(ExpectedConditions.visibilityOf(uploadmess));
        wait.until(ExpectedConditions.visibilityOf(youtu2));
        youtu2.sendKeys(_testListing.Youtube);
        youtu2.sendKeys(ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(contyou)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closediag));
        wait.until(ExpectedConditions.elementToBeClickable(closediag)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addfile));
        wait.until(ExpectedConditions.elementToBeClickable(addfile)).click();
        selimages.sendKeys("/Users/sebastian.viquez/Documents/NYCATS-QA-branch-A/src/test/java/Resources/image.png");
        inputimages.sendKeys("Breed picture");
        wait.until(ExpectedConditions.elementToBeClickable(saveimages)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closediag));
        wait.until(ExpectedConditions.elementToBeClickable(closediag)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue3));
        wait.until(ExpectedConditions.elementToBeClickable(continue3)).click();
        kenname.sendKeys(_testListing.Kenname);
        weblink.sendKeys(_testListing.Weblink);
        descken.sendKeys(_testListing.Descken);
        breedsince.sendKeys(_testListing.Breedsince);
        wait.until(ExpectedConditions.elementToBeClickable(ibreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(optaffen)).click();
        website.sendKeys(_testListing.Website);
        wait.until(ExpectedConditions.elementToBeClickable(continue4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue6)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addfile)).click();
        selimages.sendKeys("/Users/sebastian.viquez/Documents/NYCATS-QA-branch-A/src/test/java/Resources/image.png");
        inputimages2.sendKeys("Breeder picture");
        wait.until(ExpectedConditions.elementToBeClickable(inputbreeder)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selbreederimages)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(saveimages)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closediag2));
        wait.until(ExpectedConditions.elementToBeClickable(closediag2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue7));
        wait.until(ExpectedConditions.elementToBeClickable(continue7)).click();
        wait.until(ExpectedConditions.visibilityOf(sucesslisting));


    }
    /*Purchase Suscription*/
    public void PurchaseSubs(Subscription _testSubscription) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(crealist)).click();
        wait.until(ExpectedConditions.elementToBeClickable(purchsubs)).click();
        userName.sendKeys(_testSubscription.Email);
        passwordlog.sendKeys(_testSubscription.Password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        wait.until(ExpectedConditions.visibilityOf(logged));
        wait.until(ExpectedConditions.elementToBeClickable(purchsubs)).click();
        wait.until(ExpectedConditions.visibilityOf(monthplan));
        wait.until(ExpectedConditions.visibilityOf(monthplanbut));
        wait.until(ExpectedConditions.visibilityOf(annualplan));
        wait.until(ExpectedConditions.elementToBeClickable(annualplanbut)).click();
        creditcard.sendKeys("4111111111111111");
        expdate.sendKeys(_testSubscription.ExpDate);
        cvv.sendKeys(_testSubscription.CVV);
        firstname2.sendKeys(_testSubscription.FirstName);
        lastname2.sendKeys(_testSubscription.LastName);
        billaddress.sendKeys(_testSubscription.Address);
        wait.until(ExpectedConditions.elementToBeClickable(billzip)).click();
        billzip2.sendKeys(_testSubscription.ZIP);
        wait.until(ExpectedConditions.visibilityOf(city));
        wait.until(ExpectedConditions.visibilityOf(coupon));
        wait.until(ExpectedConditions.visibilityOf(state));
        phone.sendKeys(_testSubscription.Phone);
        wait.until(ExpectedConditions.visibilityOf(summary));
        wait.until(ExpectedConditions.elementToBeClickable(purchnowsub));
        wait.until(ExpectedConditions.elementToBeClickable(purchnowsub)).click();
        wait.until(ExpectedConditions.visibilityOf(kenname));
        kenname.sendKeys(_testSubscription.Kenname);
        weblink.sendKeys(_testSubscription.Weblink);
        descken.sendKeys(_testSubscription.Descken);
        breedsince.sendKeys(_testSubscription.Breedsince);
        wait.until(ExpectedConditions.elementToBeClickable(ibreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(optaffen)).click();
        website.sendKeys(_testSubscription.Website);
        wait.until(ExpectedConditions.elementToBeClickable(continue4)).click();
        wait.until(ExpectedConditions.visibilityOf(billaddress2));
        billaddress2.sendKeys(_testSubscription.Address2);
        wait.until(ExpectedConditions.elementToBeClickable(billzipsub)).click();
        billzip2.sendKeys(_testSubscription.ZIP2);
        wait.until(ExpectedConditions.visibilityOf(city));
        wait.until(ExpectedConditions.visibilityOf(state));
        wait.until(ExpectedConditions.elementToBeClickable(billaddress2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue5));
        wait.until(ExpectedConditions.elementToBeClickable(continue5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue6));
        wait.until(ExpectedConditions.elementToBeClickable(continue6)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addfile)).click();
        selimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\linkedinimage.jpg");
        inputimages2.sendKeys("Breeder picture");
        wait.until(ExpectedConditions.elementToBeClickable(inputbreeder)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selbreederimages)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(saveimages)).click();
        wait.until(ExpectedConditions.elementToBeClickable(closediag2));
        wait.until(ExpectedConditions.elementToBeClickable(closediag2)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(continue7));
        wait.until(ExpectedConditions.elementToBeClickable(continue7)).click();
        wait.until(ExpectedConditions.visibilityOf(successsubsc));




    }
    /*Purchase Monthly Subscription*/
    public void PurchaseSubsMonth(Subscription _testSubscription) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(crealist)).click();
        wait.until(ExpectedConditions.elementToBeClickable(purchsubs)).click();
        userName.sendKeys(_testSubscription.Email);
        passwordlog.sendKeys(_testSubscription.Password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        wait.until(ExpectedConditions.visibilityOf(logged));
        wait.until(ExpectedConditions.elementToBeClickable(purchsubs)).click();
        wait.until(ExpectedConditions.visibilityOf(monthplan));
        wait.until(ExpectedConditions.visibilityOf(monthplanbut));
        wait.until(ExpectedConditions.visibilityOf(annualplan));
        wait.until(ExpectedConditions.elementToBeClickable(monthplanbut)).click();
        creditcard.sendKeys("4111111111111111");
        expdate.sendKeys(_testSubscription.ExpDate);
        cvv.sendKeys(_testSubscription.CVV);
        firstname2.sendKeys(_testSubscription.FirstName);
        lastname2.sendKeys(_testSubscription.LastName);
        billaddress.sendKeys(_testSubscription.Address);
        wait.until(ExpectedConditions.elementToBeClickable(billzip)).click();
        billzip2.sendKeys(_testSubscription.ZIP);
        wait.until(ExpectedConditions.visibilityOf(city));
        wait.until(ExpectedConditions.visibilityOf(coupon));
        wait.until(ExpectedConditions.visibilityOf(state));
        phone.sendKeys(_testSubscription.Phone);
        wait.until(ExpectedConditions.visibilityOf(summary));
        wait.until(ExpectedConditions.elementToBeClickable(purchnowsub));
        wait.until(ExpectedConditions.elementToBeClickable(purchnowsub)).click();
        wait.until(ExpectedConditions.visibilityOf(kenname));
        kenname.sendKeys(_testSubscription.Kenname);
        weblink.sendKeys(_testSubscription.Weblink);
        descken.sendKeys(_testSubscription.Descken);
        breedsince.sendKeys(_testSubscription.Breedsince);
        wait.until(ExpectedConditions.elementToBeClickable(ibreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(optaffen)).click();
        website.sendKeys(_testSubscription.Website);
        wait.until(ExpectedConditions.elementToBeClickable(continue4)).click();
        wait.until(ExpectedConditions.visibilityOf(billaddress2));
        billaddress2.sendKeys(_testSubscription.Address2);
        wait.until(ExpectedConditions.elementToBeClickable(billzipsub)).click();
        billzip2.sendKeys(_testSubscription.ZIP2);
        wait.until(ExpectedConditions.visibilityOf(city));
        wait.until(ExpectedConditions.visibilityOf(state));
        wait.until(ExpectedConditions.elementToBeClickable(billaddress2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue5));
        wait.until(ExpectedConditions.elementToBeClickable(continue5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continue6));
        wait.until(ExpectedConditions.elementToBeClickable(continue6)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addfile)).click();
        selimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\linkedinimage.jpg");
        inputimages2.sendKeys("Breeder picture");
        wait.until(ExpectedConditions.elementToBeClickable(inputbreeder)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selbreederimages)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(saveimages)).click();
        wait.until(ExpectedConditions.elementToBeClickable(closediag2));
        wait.until(ExpectedConditions.elementToBeClickable(closediag2)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(continue7));
        wait.until(ExpectedConditions.elementToBeClickable(continue7)).click();
        wait.until(ExpectedConditions.visibilityOf(successsubsc));


    }
    /*Check Breeder Dashboard elements*/
    public void VerifiyDashboard(User _testUser)  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.visibilityOf(dashhome));
        wait.until(ExpectedConditions.visibilityOf(dashmessenger));
        wait.until(ExpectedConditions.visibilityOf(dashmanmypag));
        wait.until(ExpectedConditions.visibilityOf(dashmanmylist));
        wait.until(ExpectedConditions.visibilityOf(dashquestion));
        wait.until(ExpectedConditions.visibilityOf(dashaccount));
        wait.until(ExpectedConditions.visibilityOf(dashmypage));
        wait.until(ExpectedConditions.visibilityOf(profperf));
        wait.until(ExpectedConditions.visibilityOf(namedash));
        wait.until(ExpectedConditions.visibilityOf(joinedin));
        wait.until(ExpectedConditions.visibilityOf(status));
        wait.until(ExpectedConditions.visibilityOf(changePlan)); //check this plan with new user
        wait.until(ExpectedConditions.visibilityOf(editdash));
        wait.until(ExpectedConditions.visibilityOf(profileviews));
        wait.until(ExpectedConditions.visibilityOf(totalinquiries));
        //wait.until(ExpectedConditions.visibilityOf(purchmarksub)); //Removing these because account already has a subscription
        //wait.until(ExpectedConditions.visibilityOf(monthlydash));
        //wait.until(ExpectedConditions.visibilityOf(yeardash));
        wait.until(ExpectedConditions.visibilityOf(publishedlist)); //FIX THIS LOCATOR
        wait.until(ExpectedConditions.visibilityOf(editListingButton));
        wait.until(ExpectedConditions.visibilityOf(seealllist));
        wait.until(ExpectedConditions.visibilityOf(createanewlisting));
        wait.until(ExpectedConditions.visibilityOf(usersadmin));
        wait.until(ExpectedConditions.visibilityOf(activeadmin));
        wait.until(ExpectedConditions.visibilityOf(newadmin));
        wait.until(ExpectedConditions.visibilityOf(addadmin));


    }
    /*Check Messenger elements*/
    public void VerifiyMessenger(User _testUser)  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        //wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(messengertab)).click();
        wait.until(ExpectedConditions.visibilityOf(imgmess));
        wait.until(ExpectedConditions.visibilityOf(usermess));
        wait.until(ExpectedConditions.visibilityOf(convchannel));
        wait.until(ExpectedConditions.elementToBeClickable(otheruserconv)).click();
        wait.until(ExpectedConditions.visibilityOf(imgothuser));
        wait.until(ExpectedConditions.visibilityOf(conversation));
        wait.until(ExpectedConditions.elementToBeClickable(messmenu));
        wait.until(ExpectedConditions.elementToBeClickable(messmenu)).click();
        wait.until(ExpectedConditions.visibilityOf(messquestion));
        wait.until(ExpectedConditions.visibilityOf(messblock));
        wait.until(ExpectedConditions.visibilityOf(delconv));
        wait.until(ExpectedConditions.visibilityOf(messupfile));
        wait.until(ExpectedConditions.visibilityOf(messemoji));
        wait.until(ExpectedConditions.visibilityOf(messtextarea));
        wait.until(ExpectedConditions.visibilityOf(responsemess));
        wait.until(ExpectedConditions.visibilityOf(sentmess));

    }

       //Sends message to breeder account from Findpuppy's page
        public void messageBreeder(User _testUser){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SERPResult)).click(); //check on this find the respn why its not clicking
        wait.until(ExpectedConditions.elementToBeClickable(messageBreederButton)).click();

        }


    /*Check ManageMyPage elements*/
    public void VerifiyManmypage(User _testUser)  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashmanmypag));
        wait.until(ExpectedConditions.elementToBeClickable(dashmanmypag)).click();
        wait.until(ExpectedConditions.visibilityOf(profileman));
        wait.until(ExpectedConditions.visibilityOf(contactman));
        wait.until(ExpectedConditions.visibilityOf(tellusman));
        wait.until(ExpectedConditions.visibilityOf(phvidman));
        wait.until(ExpectedConditions.visibilityOf(yourbreedprof));
        wait.until(ExpectedConditions.visibilityOf(kennameman));
        wait.until(ExpectedConditions.visibilityOf(weblinkman));
        wait.until(ExpectedConditions.visibilityOf(descripman));
        wait.until(ExpectedConditions.visibilityOf(breedsinceman));
        wait.until(ExpectedConditions.visibilityOf(breedman));
        wait.until(ExpectedConditions.visibilityOf(websiteman));
        wait.until(ExpectedConditions.visibilityOf(backtoacct));
        wait.until(ExpectedConditions.elementToBeClickable(savebutman)).click();
        wait.until(ExpectedConditions.elementToBeClickable(contactman)).click();
        wait.until(ExpectedConditions.visibilityOf(continfoman));
        wait.until(ExpectedConditions.visibilityOf(fullnameman));
        wait.until(ExpectedConditions.visibilityOf(addressman));
        wait.until(ExpectedConditions.visibilityOf(zipman));
        wait.until(ExpectedConditions.visibilityOf(cityman));
        wait.until(ExpectedConditions.visibilityOf(stateman));
        wait.until(ExpectedConditions.visibilityOf(phoneman));
        wait.until(ExpectedConditions.visibilityOf(emailman));
        wait.until(ExpectedConditions.elementToBeClickable(savebutman2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(tellusman)).click();
        wait.until(ExpectedConditions.visibilityOf(tellusmoreman));
        wait.until(ExpectedConditions.visibilityOf(nationalclubCheckBox));
        wait.until(ExpectedConditions.elementToBeClickable(nationalclubCheckBox)).click();
        wait.until(ExpectedConditions.visibilityOf(nationalclubman));
        wait.until(ExpectedConditions.visibilityOf(specialtyCheckBox));
        wait.until(ExpectedConditions.elementToBeClickable(specialtyCheckBox)).click();
        wait.until(ExpectedConditions.visibilityOf(specialtyman));
        wait.until(ExpectedConditions.visibilityOf(licensedCheckBox));
        wait.until(ExpectedConditions.elementToBeClickable(licensedCheckBox)).click();
        wait.until(ExpectedConditions.visibilityOf(licensedman));
        wait.until(ExpectedConditions.visibilityOf(mydogsmanCheckBox));
        wait.until(ExpectedConditions.elementToBeClickable(mydogsmanCheckBox)).click();
        wait.until(ExpectedConditions.visibilityOf(mydogsman));
        wait.until(ExpectedConditions.elementToBeClickable(savebutman3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(phvidman)).click();
        wait.until(ExpectedConditions.visibilityOf(dragDropFileIcon));
        wait.until(ExpectedConditions.visibilityOf(ContinueButton));
        wait.until(ExpectedConditions.visibilityOf(backToMyAccount));
        wait.until(ExpectedConditions.visibilityOf(AddYouTubeLinksInput));
        wait.until(ExpectedConditions.visibilityOf(AddYouTubeLinksButton));
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();


    }
    /*Check ManageMy List elements*/
    public void VerifiyManmylisting(User _testUser)  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashmanmylistFromUserDropdown)).click();
        //wait.until(ExpectedConditions.visibilityOf(upgrto)); //This won't show if you already have an annual plan
        wait.until(ExpectedConditions.visibilityOf(crealitterbutton));
        wait.until(ExpectedConditions.visibilityOf(namelitter));
        wait.until(ExpectedConditions.visibilityOf(publishedlitter));
        wait.until(ExpectedConditions.visibilityOf(unpublishedlitter));
        wait.until(ExpectedConditions.visibilityOf(expiredlitter));
        wait.until(ExpectedConditions.visibilityOf(comingsoon));
        wait.until(ExpectedConditions.visibilityOf(dayslitter));
        wait.until(ExpectedConditions.visibilityOf(litterpicture));
        wait.until(ExpectedConditions.visibilityOf(litterheader));
        wait.until(ExpectedConditions.elementToBeClickable(editlitter)).click(); //this is expected to fail if the listing moves from current DOM location.
        wait.until(ExpectedConditions.visibilityOf(viewlisting));
        wait.until(ExpectedConditions.visibilityOf(editlisting));
        //wait.until(ExpectedConditions.visibilityOf(editListingButton));
        wait.until(ExpectedConditions.visibilityOf(unpublishlisting));
        wait.until(ExpectedConditions.elementToBeClickable(moreinfolisting)).click();
        wait.until(ExpectedConditions.visibilityOf(infolisting));
        wait.until(ExpectedConditions.visibilityOf(lasteditedlist));



    }
    /*Check MyPage*/
    private void validmypage() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://stage.marketplace.akc.org/breeder/"));

    }
    /*Check BuyerQuestionnaire elements*/
    public void VerifiyMyBuyerQuest(User _testUser)  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashquestion)).click();
        wait.until(ExpectedConditions.visibilityOf(mybuyerheader)); //check this
        wait.until(ExpectedConditions.visibilityOf(mybuyertext));
        wait.until(ExpectedConditions.visibilityOf(allbreedscheck));
        wait.until(ExpectedConditions.visibilityOf(allbreedtext));
        wait.until(ExpectedConditions.visibilityOf(spebreedscheck));
        wait.until(ExpectedConditions.visibilityOf(spebreedtext));
        wait.until(ExpectedConditions.visibilityOf(publiccheck));
        wait.until(ExpectedConditions.visibilityOf(publictext));
        wait.until(ExpectedConditions.visibilityOf(questintro));
        wait.until(ExpectedConditions.visibilityOf(introtext));
        wait.until(ExpectedConditions.visibilityOf(introBrief));
        wait.until(ExpectedConditions.visibilityOf(addquestionbut));
        wait.until(ExpectedConditions.elementToBeClickable(addquestionbut)).click();
        //wait.until(ExpectedConditions.visibilityOf(questions));
        wait.until(ExpectedConditions.visibilityOf(typequestiontext));
        wait.until(ExpectedConditions.visibilityOf(typequestion));
        wait.until(ExpectedConditions.visibilityOf(movequestion));
        wait.until(ExpectedConditions.visibilityOf(closequestion));
        wait.until(ExpectedConditions.visibilityOf(messagetext));
        wait.until(ExpectedConditions.visibilityOf(messagearea));
        wait.until(ExpectedConditions.visibilityOf(requiredcheck));
        wait.until(ExpectedConditions.visibilityOf(requiredtext));
        wait.until(ExpectedConditions.visibilityOf(savequestion));



    }
    /*Check MyAccount elements*/
    public void VerifiyMyAcoount(User _testUser)  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashaccount)).click();
        wait.until(ExpectedConditions.visibilityOf(changepassheader));
        wait.until(ExpectedConditions.visibilityOf(changepasstext));
        wait.until(ExpectedConditions.visibilityOf(oldpassword)); //update this one
        wait.until(ExpectedConditions.visibilityOf(newpassword));
        wait.until(ExpectedConditions.visibilityOf(confirmpassword));
        wait.until(ExpectedConditions.visibilityOf(changepassbut));
        wait.until(ExpectedConditions.visibilityOf(paymethods));

    }
    /*Check MyPage elements*/
    public void VerifiyMyPage(User _testUser)  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashmypage)).click();
        validmypage();
    }

    public void ResourcesForGettingPupAboutPage(){  //Fix this test

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click();
        wait.until(ExpectedConditions.elementToBeClickable(resourcesForGettingPup));
        wait.until(ExpectedConditions.elementToBeClickable(resourcesForGettingPup)).click();
        wait.until(ExpectedConditions.visibilityOf(RFGPAbout));
        wait.until(ExpectedConditions.visibilityOf(RFGPReadyForAPup));
        wait.until(ExpectedConditions.visibilityOf(RFGPCChossingBreed));
        wait.until(ExpectedConditions.visibilityOf(RFGPCQuestionsBreeder));
        wait.until(ExpectedConditions.visibilityOf(RFGPCPuppyCheckList));
        wait.until(ExpectedConditions.visibilityOf(RFGPCFindPuppyButton));
        wait.until(ExpectedConditions.visibilityOf(RFGPCQuestionsAskBreeder));
        wait.until(ExpectedConditions.visibilityOf(RFGPCAKCBreederOfMerit));
        wait.until(ExpectedConditions.visibilityOf(RFGPCAKCBredWithHEART));
        wait.until(ExpectedConditions.visibilityOf(RFGPCNationalBreedClubMember));
        wait.until(ExpectedConditions.visibilityOf(RFGPCCanineCollege));
        wait.until(ExpectedConditions.visibilityOf(RFGPCKennelInspectionsLearnMore));
        wait.until(ExpectedConditions.visibilityOf(RFGPCDNAProfiling));

    }

    public void VerifyTellUsMore(User _testUser) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashmanmypag)).click();
        wait.until(ExpectedConditions.elementToBeClickable(tellusman)).click();
        wait.until(ExpectedConditions.elementToBeClickable(NoToRegPappers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(YesToRegPappers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(savebutman3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(NoToRegPappers));
        //wait.until(ExpectedConditions.elementToBeClickable(NoToRegPappers)).click();
        //wait.until(ExpectedConditions.elementToBeClickable(TellUsWhyInput)).click();
        //TellUsWhyInput.sendKeys("123456789");
        //wait.until(ExpectedConditions.elementToBeClickable(savebutman3));
        //wait.until(ExpectedConditions.elementToBeClickable(savebutman3)).click();

    }

    public void CheckAlertMe() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys("sxv+5@akc.org");
        password.sendKeys("CypresHill2*");
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(puppies)).click(); //fix this
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedform)).click();
        wait.until(ExpectedConditions.elementToBeClickable(affens)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findpupformbut)).click();
        wait.until(ExpectedConditions.elementToBeClickable(topbannealert)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SaveSearchConfirmation));

    }


}