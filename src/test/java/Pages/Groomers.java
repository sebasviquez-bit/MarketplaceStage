package Pages;

import Helpers.BrowserFactory;

import Model.Service;
import Model.User;
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

public class Groomers {

    @FindBy(css = "#center-menu > div:nth-child(2) > div.menu-item-title-container")
    WebElement groomers;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/ul/li[1]")
    WebElement groomseek;

    @FindBy(css = "#center-menu > div:nth-child(2) > div.menu-item-dropdown-container > div > ul > li:nth-child(2) > div.title-container > a")
    WebElement findgroom;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/ul/li[3]/div/a")
    WebElement akcmarkgroom;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/ul/li[4]/div/a")
    WebElement howfindgroom;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/ul/li[5]")
    WebElement forgroom;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/ul/li[6]/div/a")
    WebElement listservmark;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[4]")
    WebElement findgroompage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div/div[3]/div/img")
    WebElement akcmarkforgroompage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div/div/div/div/div/p[5]")
    WebElement howfindgroompage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[3]")
    WebElement listservicmarkpage;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section/div/h1")
    WebElement groomhead;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/section/div/h2")
    WebElement groomtext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form")
    WebElement groomserp;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form/div[1]/div[1]/span")
    WebElement looking;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form/div[1]/div[2]/div/div[1]/div[1]")
    WebElement service;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form/div[1]/div[3]/div[1]/div/div[1]/div[1]/div[1]")
    WebElement zipstate;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-12hl6es-0.blZGXr > div > form > div:nth-child(1) > div.search-location > div.search-location__radius > div > div")
    WebElement distance;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[2]/div/form/div[2]/div/button")
    WebElement searchbut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[3]/p")
    WebElement areyougroom;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[3]/p/a")
    WebElement crealist;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[4]/h2")
    WebElement whychoose;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[4]/div[1]/div[2]")
    WebElement whypicture;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[4]/div[2]/p")
    WebElement whytext;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > section > div.Styled__Wrapper-sc-1cb5cbj-0.cYXciP > h2")
    WebElement whatmakes;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div[2]/div[4]/section/div[6]/div[1]/div[2]/h3")
    WebElement trustpict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/div[1]/div[2]/h3")
    WebElement trust;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/div[1]/div[2]")
    WebElement trusttext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/div[2]/div[1]")
    WebElement salonpict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/div[2]/div[2]/h3")
    WebElement salon;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/div[2]/div[2]")
    WebElement salontext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/div[3]/div[1]")
    WebElement groomedupict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/div[3]/div[2]/h3")
    WebElement groomedu;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/div[3]/div[2]/p[1]")
    WebElement groomedutext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/h2")
    WebElement howchoose;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[1]/div[1]/a")
    WebElement howpict1;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[1]/div[2]/a")
    WebElement howpict2;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[1]/div[3]/a")
    WebElement howpict3;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[1]/div[4]/a")
    WebElement howpict4;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[6]/div[2]/p")
    WebElement howchoosetext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[8]/h2")
    WebElement howfind;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-ysw841-0.cWfaAR > div.Styled__Wrapper-sc-13lpz7m-0.fJSjAr.content-right > div.image-container > img")
    WebElement safepict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[8]/div[1]/div[2]/h3")
    WebElement safe;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[8]/div[1]/div[2]/p")
    WebElement safetext;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > section > div.Styled__Wrapper-sc-ysw841-0.cWfaAR > div.Styled__Wrapper-sc-13lpz7m-0.fJSjAr.content-right > div.content > p > a")
    WebElement safemore;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-ysw841-0.cWfaAR > div.Styled__Wrapper-sc-13lpz7m-0.fJSjAr.content-left > div.image-container > img")
    WebElement salonsafepict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[8]/div[2]/div[2]/h3")
    WebElement salonsafe;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[8]/div[2]/div[2]/p")
    WebElement salonsafetext;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > section > div.Styled__Wrapper-sc-ysw841-0.cWfaAR > div.Styled__Wrapper-sc-13lpz7m-0.fJSjAr.content-left > div.content > p > a")
    WebElement salonsafemore;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/h2")
    WebElement iamgroom;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div/p")
    WebElement iamgroomtext;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > section > div:nth-child(4) > p > a")
    WebElement crealistbelow;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[2]/div/h2")
    WebElement allresults;

    @FindBy(id = "react-select-2-option-1")
    WebElement bathopt;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__Wrapper-sc-1eah9gv-2.bnMXnr > div.Styled__RowResults-sc-1eah9gv-4.bxzOCt > div > div:nth-child(3) > div > a")
    WebElement bathresults;

    @FindBy(id = "location__zip")
    WebElement zipfield2;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[2]/div/section/ul/li[2]/span")
    WebElement zipresults;

    @FindBy(id = "react-select-4-option-1")
    WebElement distopt;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[2]/div/section/ul/li[2]/span")
    WebElement distresults;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.Styled__Wrapper-sc-1eah9gv-2.bnMXnr > div.Styled__RowResults-sc-1eah9gv-4.bxzOCt > div > div:nth-child(3) > div > a:nth-child(2)")
    WebElement groompict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[2]/h4")
    WebElement groomname;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[2]/div[1]/div")
    WebElement groomtype;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[2]/div[2]/p")
    WebElement groomaddress;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[2]/div[3]")
    WebElement groomcert;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__GroomerHero-sc-1ganx6z-0.cOKNao > div.Styled__GroomerDetails-sc-1ganx6z-1.krpSXW > div > h1")
    WebElement groom2name;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__GroomerHero-sc-1ganx6z-0.cOKNao > div.groomer-hero__slider > div > div > div > div > div > div > div > div > div.image")
    WebElement groom2pict;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__GroomerHero-sc-1ganx6z-0.cOKNao > div.Styled__GroomerDetails-sc-1ganx6z-1.krpSXW > div > div.groomer-details__breadcrumbs > div > span > div.icon-breadcrumbs__breadcrumb-icon > svg")
    WebElement groom2type;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.Styled__GroomerHero-sc-1ganx6z-0.cOKNao > div.Styled__GroomerDetails-sc-1ganx6z-1.krpSXW > div > div.groomer-details__address > span")
    WebElement groom2address;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[3]/div/div[1]")
    WebElement groom2cert;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[3]/div/div[5]/a/button")
    WebElement messgroombut;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.groomer-profile__flexible-content > div.groomer-profile__main-content > div.Styled__Wrapper-sc-1gmc4jr-0.dUcTfa > div > div.about-me-title")
    WebElement aboutme;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.groomer-profile__flexible-content > div.groomer-profile__main-content > div.Styled__Wrapper-sc-1gmc4jr-0.dUcTfa > div > div.about-me-text")
    WebElement aboutmetext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.groomer-profile__flexible-content > div.groomer-profile__main-content > div.groomer-profile__editable-section > div > div.groomer-profile__service-title")
    WebElement myservices;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.groomer-profile__flexible-content > div.groomer-profile__main-content > div.groomer-profile__editable-section > div > div.groomer-profile__services-content > div > div > div > div > div.groomer-service__wrap > div.groomer-service__content > div.groomer-service__title")
    WebElement myservicestext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[2]/div/div[2]/div[2]/div[1]")
    WebElement packages;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[2]/div/div[2]/div[2]")
    WebElement packagestext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.groomer-profile__flexible-content > div.groomer-profile__main-content > div.Styled__OperationsWrapper-sc-yg6hq3-1.bZsPaK > div > div.groomer-profile__operations-title")
    WebElement operations;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.groomer-profile__flexible-content > div.groomer-profile__main-content > div.Styled__OperationsWrapper-sc-yg6hq3-1.bZsPaK > div > div.groomer-profile__operations-content > div > div.flexible > div > div.sub-header")
    WebElement operationstext;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.groomer-profile__flexible-content > div.groomer-profile__main-content > div.Styled__OperationsWrapper-sc-yg6hq3-1.bZsPaK > div > div.groomer-profile__operations-content > div > div.payment > div.sub-header")
    WebElement payment;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.groomer-profile__flexible-content > div.groomer-profile__main-content > div.Styled__OperationsWrapper-sc-yg6hq3-1.bZsPaK > div > div.groomer-profile__operations-content > div > div.payment > div.sub-header")
    WebElement paymenttext;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.groomer-profile__flexible-content > div.groomer-profile__main-content > div.Styled__OperationsWrapper-sc-yg6hq3-1.bZsPaK > div > div.groomer-profile__operations-content > div > div.payment > div.payment-symbols > svg > use")
    WebElement paymentMethodVS;


    //@FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.flexible-content > div:nth-child(2) > div > div.contact-form-desktop > div:nth-child(2) > div > button")
    WebElement createaccbut;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.groomer-profile__flexible-content > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2) > div > button")
    WebElement signinbut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[1]")
    WebElement whatsincludetext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[2]")
    WebElement annualplantext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[2]/div[7]/button")
    WebElement annualplanbut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[3]")
    WebElement quatplantext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[3]/div[7]/button")
    WebElement quatplanbut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[1]/div[4]")
    WebElement whatsinclupict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/h1")
    WebElement howgroomworkstext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/div[2]/div[2]")
    WebElement howgroomworkspict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/form/div/a/button")
    WebElement chooseplanbut;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement businessname;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/textarea[1]")
    WebElement aboutmegro;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement businesssince;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[8]/div/div/label[1]/span")
    WebElement salonowner;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[8]/div/div/label[2]/span")
    WebElement groomer;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[11]/div/div/label/span[1]")
    WebElement cash;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[12]/div/div/label/span[1]")
    WebElement check;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[13]/div/div/label/span[1]")
    WebElement visa;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[14]/div/div/label/span[1]")
    WebElement mastercard;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[15]/div/div/label/span[1]")
    WebElement amex;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[16]/div/div[1]/label/span[1]")
    WebElement other;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[16]/div[1]/div[2]/div[1]/input[1]")
    WebElement othertext;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[19]/div[1]/div[1]/input[1]")
    WebElement street;

    @FindBy(id = "react-select-2-input")
    WebElement zip3;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[22]/div[1]/div[1]/input[1]")
    WebElement city;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[23]/div[1]/div[1]/input[1]")
    WebElement state3;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[24]/div[1]/div[1]/input[1]")
    WebElement bussphone;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[25]/div[1]/div[1]/input[1]")
    WebElement bussemail;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[28]/div[2]/div[1]/label/span[1]")
    WebElement sunday;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[28]/div[3]/div[1]/label/span[1]")
    WebElement monday;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[28]/div[4]/div[1]/label/span[1]")
    WebElement tuesday;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[28]/div[5]/div[1]/label/span[1]")
    WebElement wednesday;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[28]/div[6]/div[1]/label/span[1]")
    WebElement thursday;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[28]/div[7]/div[1]/label/span[1]")
    WebElement friday;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[28]/div[8]/div[1]/label/span[1]")
    WebElement saturday;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[2]/div[2]/div[1]/input[1]")
    WebElement sunopen;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[2]/div[3]/div[1]/input[1]")
    WebElement sunclose;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[3]/div[2]/div[1]/input[1]")
    WebElement monopen;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[3]/div[3]/div[1]/input[1]")
    WebElement monclose;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[4]/div[2]/div[1]/input[1]")
    WebElement tuesopen;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[4]/div[3]/div[1]/input[1]")
    WebElement tuesclose;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[5]/div[2]/div[1]/input[1]")
    WebElement wedopen;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[5]/div[3]/div[1]/input[1]")
    WebElement wedclose;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[6]/div[2]/div[1]/input[1]")
    WebElement thuropen;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[6]/div[3]/div[1]/input[1]")
    WebElement thurclose;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[7]/div[2]/div[1]/input[1]")
    WebElement friopen;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[7]/div[3]/div[1]/input[1]")
    WebElement friclose;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[8]/div[2]/div[1]/input[1]")
    WebElement satopen;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[28]/div[8]/div[3]/div[1]/input[1]")
    WebElement satclose;

    @FindBy(id = "onboarding-groomers-storefront-contact__submit")
    WebElement save1;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement usernamegroom;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
    WebElement passgroom;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section/div/form/div/button[1]")
    WebElement logingroom;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/a")
    WebElement continuephoto;

    @FindBy(id = "onboarding-groomers-storefront-cover-photo__submit")
    WebElement save2;

    @FindBy(xpath = "//*[@id='groomers-storefront-cover-photo']/div/div/div/input")
    WebElement photouploadinput;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/section[1]/div/div[1]")
    WebElement addmorefiles;

    @FindBy(id = "images")
    WebElement selimages;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/div/div[3]/input")
    WebElement caption;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/a")
    WebElement continueimages;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/div[1]/a[1]/*[1]")
    WebElement closeimages;

    @FindBy(id = "onboarding-groomers-storefront-media__submit")
    WebElement save3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[1]/div/div/div/div[1]/div[1]")
    WebElement avabserv;

    @FindBy(id = "react-select-2-option-0")
    WebElement haircut;

    @FindBy(id = "react-select-2-option-1")
    WebElement bath;

    @FindBy(id = "react-select-2-option-2")
    WebElement breedcuts;

    @FindBy(id = "react-select-2-option-3")
    WebElement earclean;

    @FindBy(id = "react-select-2-option-4")
    WebElement nailtrim;

    @FindBy(id = "react-select-2-option-5")
    WebElement teethclean;

    @FindBy(id = "react-select-2-option-6")
    WebElement analgland;

    @FindBy(id = "react-select-2-option-7")
    WebElement dematting;

    @FindBy(id = "react-select-2-option-8")
    WebElement deshedding;

    @FindBy(id = "react-select-2-option-9")
    WebElement decorating;

    @FindBy(id = "react-select-2-option-10")
    WebElement handscissor;

    @FindBy(id = "react-select-2-option-11")
    WebElement handstripp;

    @FindBy(id = "react-select-2-option-12")
    WebElement largdoggroom;

    @FindBy(id = "react-select-2-option-13")
    WebElement mobile;

    @FindBy(id = "react-select-2-option-14")
    WebElement showgroom;

    @FindBy(id = "react-select-2-option-15")
    WebElement otherserv;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[2]/div/div[1]/div/a")
    WebElement closeserv;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[2]/div/div[1]/h3")
    WebElement headerserv;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[2]/div/div[2]/div[2]/label/span[1]")
    WebElement checkprice;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[2]/div/div[2]/div[2]/label/span[2]")
    WebElement pricerange;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/textarea[1]")
    WebElement descserv;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    WebElement pricemin;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
    WebElement pricemax;

    @FindBy(id = "onboarding-groomers-storefront-services__submit")
    WebElement save4;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[1]/button")
    WebElement addnewpack;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]")
    WebElement titlepack;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
    WebElement priceminpack;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[1]/div/div/div[6]/label/span[1]")
    WebElement checkpricepack;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[1]/div/div/div[6]/label/span[2]")
    WebElement pricerangepack;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/input[1]")
    WebElement pricemaxpack;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/textarea[1]")
    WebElement descpack;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[1]/div/div/div[8]/label/span[1]")
    WebElement showpackcheck;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[1]/div/div/div[8]/label/span[2]")
    WebElement showpacktext;

    @FindBy(id = "onboarding-groomers-storefront-packages__submit")
    WebElement save5;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement creditcard;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement expdate;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement cvv;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/input[1]")
    WebElement couponcode;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[10]/div[1]/div[1]/input[1]")
    WebElement firstnamebill;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[11]/div[1]/div[1]/input[1]")
    WebElement lastnamebill;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[12]/div[1]/div[1]/input[1]")
    WebElement billaddress;

    @FindBy(id = "react-select-2-input")
    WebElement zip4;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[14]/div[1]/div[1]/input[1]")
    WebElement citybill;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[15]/div[1]/div[1]/input[1]")
    WebElement statebill;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[16]/div[1]/div[1]/input[1]")
    WebElement phonebill;

    @FindBy(id = "onboarding-groomers-storefront-payment__submit")
    WebElement save6;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/div/div[2]/div[2]/div/a[1]")
    WebElement dashgroomer;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/div/div[2]/div[2]/div/a[2]")
    WebElement messengergroomer;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/div/div[2]/div[2]/div/a[3]")
    WebElement manmypagegroomer;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/div/div[2]/div[2]/div/a[4]")
    WebElement accountgroomer;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > div > div > ul > li:nth-child(3) > a")
    WebElement mypagegroomer;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[1]/h4")
    WebElement profperfor;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[1]/div/div[1]/div/div[2]")
    WebElement headergroomer;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[1]/div/div[3]/div/p[1]")
    WebElement totviewsgroom;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[1]/div/div[3]/div/p[2]")
    WebElement inquiriesgroom;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div[3]/h4")
    WebElement jointexthead;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div[3]/a[1]")
    WebElement jointext;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div[3]/a[1]")
    WebElement forsalons;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div[3]/a[2]")
    WebElement forgroomers;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[1]/div[1]/img")
    WebElement messimg;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[1]/div[1]/div")
    WebElement messinfo;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[1]/div[2]/div[2]/div/a/div[2]/p[1]")
    WebElement messsenderopen;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[2]/div/div[3]")
    WebElement sentmessage;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[2]/div/div[5]")
    WebElement receivedmessage;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[3]/div[1]/div/form/div[3]/textarea")
    WebElement textarea;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[3]/div[1]/div/form/div[4]/input")
    WebElement sentbutton;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div > div.Styled__Wrapper-sc-1ua1fsq-0.hrLcqJ > div > div > div.Styled__Wrapper-sc-sad8oe-0.dlPvhI.top-bar-wrapper > div.styled__Wrapper-sc-44lfr5-0.eMLIJi > div.styled__MenuHandle-sc-44lfr5-2.crAtxK > button")
    WebElement menumess;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[3]/div[1]/ul/div/a[1]/li")
    WebElement viewquestrespo;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[3]/div[1]/ul/div/div/li/span")
    WebElement blockchannel;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[3]/div[1]/ul/div/a[2]/li")
    WebElement deleteconvers;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[1]/span")
    WebElement contactinfo;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[2]/a")
    WebElement coverphoto;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[3]/a")
    WebElement photosandvideos;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[4]/a")
    WebElement services;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[5]/a")
    WebElement packsepecials;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/div[1]/h4")
    WebElement contactinfohead;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement bussname;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement weblink;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/textarea[1]")
    WebElement aboutmetext2;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement busssince;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[8]/div/div/label[2]")
    WebElement iamgroomer;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[11]/div")
    WebElement paymethods;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[19]/div[1]/div[1]/input[1]")
    WebElement strretline;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[21]/div/div/div/div/div[1]")
    WebElement zipcode;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[22]/div[1]/div[1]/input[1]")
    WebElement citygroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[23]/div[1]/div[1]/input[1]")
    WebElement stategroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[24]/div[1]/div[1]/input[1]")
    WebElement bussphonegroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[25]/div[1]/div[1]/input[1]")
    WebElement bussemailgroom;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[28]/div[2]")
    WebElement hoursofoperation;

    @FindBy(id = "groomers-storefront-contact__submit")
    WebElement savegroombut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/section/button[2]")
    WebElement backmyacct;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div/img")
    WebElement imgprofile;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div/div/button")
    WebElement changephbut;

    @FindBy(id = "groomers-storefront-cover-photo__submit")
    WebElement savephbut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/section[1]/div/div[1]/div")
    WebElement addmorefilesgroom;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/section[1]/div/div[2]/div")
    WebElement photodispl;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/section[1]/div/div[2]/div/div[2]/button")
    WebElement delphbut;

    @FindBy(id = "groomers-storefront-media__submit")
    WebElement saveimgbut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[1]/div/div/div/div[1]/div[1]")
    WebElement selgroomserv;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]/div/div[1]/div/a")
    WebElement delservices;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]/div/div[1]/h3")
    WebElement servicename;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]/div/div[2]/div[2]/label/span[2]")
    WebElement pricerangeserv;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    WebElement pricing;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
    WebElement pricing2;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/textarea[1]")
    WebElement descservices;

    @FindBy(id = "groomers-storefront-services__submit")
    WebElement saveservbut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[1]/div/div/div[6]/label/span[2]")
    WebElement pricerangepackgroom;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[1]/div/div/div[8]/label/span[1]")
    WebElement showpackpack;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]/div/div/div[6]/label/span[2]")
    WebElement pricerangespegroom;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]/div/div/div[8]/label/span[2]")
    WebElement showpackspe;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]")
    WebElement titlepackgroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
    WebElement pricepackgroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/input[1]")
    WebElement pricepackgroom2;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/textarea[1]")
    WebElement descpackgroom;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[1]/button")
    WebElement addnewpackbut;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/input[1]")
    WebElement titlespegroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
    WebElement pricespegroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/input[1]")
    WebElement pricespegroom2;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/textarea[1]")
    WebElement descspegroom;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]/button")
    WebElement addnewspebut;

    @FindBy(id = "groomers-storefront-packages__submit")
    WebElement savepackspebut;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/span[1]")
    WebElement security;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/section/ul/li[2]/a")
    WebElement paymentmethods;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    WebElement oldpassword;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")
    WebElement newpassword;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]")
    WebElement confirmpassword;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/section[1]/button[1]")
    WebElement changepasssbut;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement cardnumber;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement expirationdate;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement cvvgroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
    WebElement firstnamegroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement lastnamegroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/input[1]")
    WebElement billingaddressgroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement zipgroom;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[9]/div[1]/div[1]/input[1]")
    WebElement citygroomer;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[10]/div[1]/div[1]/input[1]")
    WebElement stategroomer;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[11]/div[1]/div[1]/input[1]")
    WebElement phonegroomer;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[12]/div[1]/a[1]")
    WebElement clicktermscond;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[12]/section[1]/button[1]")
    WebElement savebilling;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > div > div.select-to-bar-nav > div.show-at-medium > div > a:nth-child(6)")
    WebElement mypagepage;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/a/span")
    WebElement iconsignin;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[3]/input")
    WebElement userName;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[4]/input")
    WebElement passwordlog;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[3]/div/input")
    WebElement ingresar;

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.header-bar > div.header-icon-container.user-menu > div > a > span")
    WebElement GroomerUser;
    //

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/div/a/span")
    WebElement logged;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/ul/li[1]/a")
    WebElement dashbreed;

    @FindBy(xpath = "//Pending fix of page")
    WebElement successgroomer;

    @FindBy(css = "#landing-groomers > div.landing-groomers__whats-include > div.landing-groomers__premium-card > div.landing-groomers__card-button.annual > button")
    WebElement AnnualPlanButtton;


    BrowserFactory browserFactory;

    WebDriver driver;

    /*Initialize Groomers*/
    public Groomers(WebDriver _driver) {

        //driverFactory = new DriverFactory();
        browserFactory = new BrowserFactory();
        driver = _driver;
        PageFactory.initElements(driver, this);
    }

    /*Check Safe page*/
    private void validsafe() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/products-services/akc-safe-grooming-program/"));

    }

    /*Check Groomers menu*/
    public void CheckGroomers() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.visibilityOf(groomseek));
        wait.until(ExpectedConditions.visibilityOf(findgroom));
        wait.until(ExpectedConditions.visibilityOf(akcmarkgroom));
        wait.until(ExpectedConditions.visibilityOf(howfindgroom));
        wait.until(ExpectedConditions.visibilityOf(forgroom));
        wait.until(ExpectedConditions.visibilityOf(listservmark));

    }

    /*Check Groomer pages*/
    public void CheckGroomers1() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        wait.until(ExpectedConditions.visibilityOf(findgroompage));

    }

    public void CheckGroomers2() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcmarkgroom)).click();
        wait.until(ExpectedConditions.visibilityOf(akcmarkforgroompage));

    }

    public void CheckGroomers3() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(howfindgroom)).click();
        wait.until(ExpectedConditions.visibilityOf(howfindgroompage));

    }


    public void CheckGroomers4() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(listservmark)).click();
        wait.until(ExpectedConditions.visibilityOf(listservicmarkpage));


    }

    /*Check Groomer Homepage elements*/
    public void CheckGroomHome() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        wait.until(ExpectedConditions.visibilityOf(groomhead));
        wait.until(ExpectedConditions.visibilityOf(groomtext));
        wait.until(ExpectedConditions.visibilityOf(groomserp));
        wait.until(ExpectedConditions.visibilityOf(looking));
        wait.until(ExpectedConditions.visibilityOf(service));
        wait.until(ExpectedConditions.visibilityOf(zipstate));
        wait.until(ExpectedConditions.visibilityOf(distance));
        wait.until(ExpectedConditions.visibilityOf(searchbut));
        wait.until(ExpectedConditions.visibilityOf(areyougroom));
        wait.until(ExpectedConditions.visibilityOf(crealist));
        wait.until(ExpectedConditions.visibilityOf(whychoose));
        wait.until(ExpectedConditions.visibilityOf(whypicture));
        wait.until(ExpectedConditions.visibilityOf(whytext));
        wait.until(ExpectedConditions.visibilityOf(whatmakes));
        /*
        wait.until(ExpectedConditions.visibilityOf(trustpict));
        wait.until(ExpectedConditions.visibilityOf(trust));
        wait.until(ExpectedConditions.visibilityOf(trusttext));
        wait.until(ExpectedConditions.visibilityOf(salonpict));
        wait.until(ExpectedConditions.visibilityOf(salon));
        wait.until(ExpectedConditions.visibilityOf(salontext));
        wait.until(ExpectedConditions.visibilityOf(groomedupict));
        wait.until(ExpectedConditions.visibilityOf(groomedu));
        wait.until(ExpectedConditions.visibilityOf(groomedutext)); //All this elements already covered in visual test
        wait.until(ExpectedConditions.visibilityOf(howchoose));
        wait.until(ExpectedConditions.visibilityOf(howpict1));
        wait.until(ExpectedConditions.visibilityOf(howpict2));
        wait.until(ExpectedConditions.visibilityOf(howpict3));
        wait.until(ExpectedConditions.visibilityOf(howpict4));
        wait.until(ExpectedConditions.visibilityOf(howchoosetext));
        wait.until(ExpectedConditions.visibilityOf(howfind));
        wait.until(ExpectedConditions.visibilityOf(safepict));
        wait.until(ExpectedConditions.visibilityOf(safe));
        wait.until(ExpectedConditions.visibilityOf(safetext));
        wait.until(ExpectedConditions.visibilityOf(safemore));
        wait.until(ExpectedConditions.visibilityOf(salonsafepict));
        wait.until(ExpectedConditions.visibilityOf(salonsafe));
        wait.until(ExpectedConditions.visibilityOf(salonsafetext));
        wait.until(ExpectedConditions.visibilityOf(salonsafemore));
        wait.until(ExpectedConditions.visibilityOf(iamgroom));
        wait.until(ExpectedConditions.visibilityOf(iamgroomtext));
        wait.until(ExpectedConditions.visibilityOf(crealistbelow));
        */
    }

    /*Check SERP results*/
    public void CheckAllResults() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchbut)).click();
        wait.until(ExpectedConditions.visibilityOf(allresults)); //This fails on Stage env because of the missing Groomers board

    }

    public void CheckBathResults() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(groomers)).click();
        wait.until(ExpectedConditions.visibilityOf(findgroom)).click();
        wait.until(ExpectedConditions.visibilityOf(service)).click();
        wait.until(ExpectedConditions.visibilityOf(bathopt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchbut)).click();
        wait.until(ExpectedConditions.visibilityOf(bathresults)).isDisplayed();
    }

    public void CheckZipResults() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        wait.until(ExpectedConditions.elementToBeClickable(service)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bathopt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(zipstate)).click();
        zipfield2.sendKeys("10011");
        wait.until(ExpectedConditions.elementToBeClickable(searchbut)).click();  //This fails because of the Groomers issue on stage
        wait.until(ExpectedConditions.visibilityOf(zipresults));

    }

    public void CheckDistResults() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        wait.until(ExpectedConditions.elementToBeClickable(service)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bathopt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(zipstate)).click();
        zipfield2.sendKeys("10011");
        //wait.until(ExpectedConditions.elementToBeClickable(distance)).click();
        wait.until(ExpectedConditions.elementToBeClickable(distance)).click(); //fix this
        wait.until(ExpectedConditions.elementToBeClickable(distopt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchbut)).click();
        wait.until(ExpectedConditions.visibilityOf(distresults)); //This fails on stage because there is no bath Serivces.

    }

    /*Check other pages*/
    public void CheckList1() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        wait.until(ExpectedConditions.elementToBeClickable(crealist)).click();
        wait.until(ExpectedConditions.visibilityOf(AnnualPlanButtton)); //fix this

    }


    public void CheckSafe1() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        wait.until(ExpectedConditions.elementToBeClickable(safemore)).click();
        validsafe();

    }

    public void CheckSafe2() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        wait.until(ExpectedConditions.elementToBeClickable(salonsafemore)).click();
        validsafe();

    }

    public void CheckList2() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        wait.until(ExpectedConditions.elementToBeClickable(crealistbelow)).click(); //update this one
        wait.until(ExpectedConditions.visibilityOf(listservicmarkpage));


    }

    /*Check Groomer SERP page*/
    public void CheckGroomListPage() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        wait.until(ExpectedConditions.elementToBeClickable(service)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bathopt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(zipstate)).click();
        zipfield2.sendKeys("10011");
        wait.until(ExpectedConditions.elementToBeClickable(searchbut)).click();
        wait.until(ExpectedConditions.visibilityOf(groompict)); //This fails on stage because of there are no Groomers Bath services
        wait.until(ExpectedConditions.visibilityOf(groomname));
        wait.until(ExpectedConditions.visibilityOf(groomtype));
        wait.until(ExpectedConditions.visibilityOf(groomaddress));
        wait.until(ExpectedConditions.visibilityOf(groomcert));

    }

    /*Check Groomer page*/
    public void CheckGroomPage() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        wait.until(ExpectedConditions.elementToBeClickable(service)).click();
        wait.until(ExpectedConditions.elementToBeClickable(haircut)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchbut)).click();
        wait.until(ExpectedConditions.elementToBeClickable(groompict)).click();
        wait.until(ExpectedConditions.visibilityOf(groom2name));
        wait.until(ExpectedConditions.visibilityOf(groom2pict));
        wait.until(ExpectedConditions.visibilityOf(groom2address));
        wait.until(ExpectedConditions.visibilityOf(groom2type));
        //wait.until(ExpectedConditions.visibilityOf(groom2cert));
        //wait.until(ExpectedConditions.visibilityOf(createaccbut)); //This changed for "Login to get in touch"
        wait.until(ExpectedConditions.visibilityOf(aboutme));
        wait.until(ExpectedConditions.visibilityOf(aboutmetext));
        wait.until(ExpectedConditions.visibilityOf(myservices));
        wait.until(ExpectedConditions.visibilityOf(myservicestext));
        //wait.until(ExpectedConditions.visibilityOf(packages)); //There are no packages for this groomer
        //wait.until(ExpectedConditions.visibilityOf(packagestext));
        wait.until(ExpectedConditions.visibilityOf(operations));
        wait.until(ExpectedConditions.visibilityOf(operationstext));
        wait.until(ExpectedConditions.visibilityOf(payment));
        wait.until(ExpectedConditions.visibilityOf(paymenttext));
        wait.until(ExpectedConditions.visibilityOf(paymentMethodVS));
        //wait.until(ExpectedConditions.visibilityOf(createaccbut));
        wait.until(ExpectedConditions.visibilityOf(signinbut));


    }

    /*Get Annual Groomer*/
    public void AnnualGroomers(Service _testService) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(listservmark)).click();
        wait.until(ExpectedConditions.visibilityOf(listservicmarkpage));
        wait.until(ExpectedConditions.visibilityOf(whatsincludetext));
        wait.until(ExpectedConditions.visibilityOf(whatsinclupict));
        wait.until(ExpectedConditions.visibilityOf(annualplantext));
        wait.until(ExpectedConditions.visibilityOf(annualplanbut));
        wait.until(ExpectedConditions.visibilityOf(quatplantext));
        wait.until(ExpectedConditions.visibilityOf(quatplanbut));
        wait.until(ExpectedConditions.visibilityOf(howgroomworkstext));
        wait.until(ExpectedConditions.visibilityOf(howgroomworkspict));
        wait.until(ExpectedConditions.visibilityOf(chooseplanbut));
        wait.until(ExpectedConditions.elementToBeClickable(annualplanbut)).click();
        usernamegroom.sendKeys(_testService.Email);
        passgroom.sendKeys(_testService.Password);
        wait.until(ExpectedConditions.elementToBeClickable(logingroom)).click();
        businessname.sendKeys(_testService.Businessname);
        aboutmegro.sendKeys(_testService.Aboutme);
        businesssince.sendKeys(_testService.Businesssince);
        wait.until(ExpectedConditions.elementToBeClickable(salonowner)).click();
        wait.until(ExpectedConditions.elementToBeClickable(groomer)).click();
        wait.until(ExpectedConditions.elementToBeClickable(cash)).click();
        wait.until(ExpectedConditions.elementToBeClickable(check)).click();
        wait.until(ExpectedConditions.elementToBeClickable(visa)).click();
        wait.until(ExpectedConditions.elementToBeClickable(mastercard)).click();
        wait.until(ExpectedConditions.elementToBeClickable(amex)).click();
        wait.until(ExpectedConditions.elementToBeClickable(other)).click();
        othertext.sendKeys("Insurance");
        street.sendKeys(_testService.Street);
        zip3.sendKeys(_testService.ZIP);
        wait.until(ExpectedConditions.visibilityOf(city));
        wait.until(ExpectedConditions.visibilityOf(state3));
        bussphone.sendKeys(_testService.BusinessPhone);
        bussemail.sendKeys(_testService.BusinessEmail);
        wait.until(ExpectedConditions.elementToBeClickable(sunday)).click();
        sunopen.sendKeys("13:00 P");
        sunclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(monday)).click();
        monopen.sendKeys("13:00 P");
        monclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(tuesday)).click();
        tuesopen.sendKeys("13:00 P");
        tuesclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(wednesday)).click();
        wedopen.sendKeys("13:00 P");
        wedclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(thursday)).click();
        thuropen.sendKeys("13:00 P");
        thurclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(friday)).click();
        friopen.sendKeys("13:00 P");
        friclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(saturday)).click();
        satopen.sendKeys("13:00 P");
        satclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(save1)).click();
        photouploadinput.sendKeys("/Users/sebastian.viquez/Documents/NYCATS-QA-branch-A/src/test/java/Resources/image.png");
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(continuephoto));
        wait.until(ExpectedConditions.elementToBeClickable(continuephoto)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(save2));
        wait.until(ExpectedConditions.elementToBeClickable(save2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addmorefiles)).click();
        selimages.sendKeys("/Users/sebastian.viquez/Documents/NYCATS-QA-branch-A/src/test/java/Resources/image.png");
        wait.until(ExpectedConditions.visibilityOf(caption));
        caption.sendKeys("Beagle Specialized2");
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(continueimages)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closeimages));
        wait.until(ExpectedConditions.elementToBeClickable(closeimages)).click();
        wait.until(ExpectedConditions.elementToBeClickable(save3));
        wait.until(ExpectedConditions.elementToBeClickable(save3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(avabserv));
        wait.until(ExpectedConditions.elementToBeClickable(avabserv)).click();
        wait.until(ExpectedConditions.visibilityOf(haircut));
        wait.until(ExpectedConditions.visibilityOf(bath));
        wait.until(ExpectedConditions.visibilityOf(breedcuts));
        wait.until(ExpectedConditions.visibilityOf(earclean));
        wait.until(ExpectedConditions.visibilityOf(nailtrim));
        wait.until(ExpectedConditions.visibilityOf(teethclean));
        wait.until(ExpectedConditions.visibilityOf(analgland));
        wait.until(ExpectedConditions.visibilityOf(dematting));
        wait.until(ExpectedConditions.visibilityOf(deshedding));
        wait.until(ExpectedConditions.visibilityOf(decorating));
        wait.until(ExpectedConditions.visibilityOf(handscissor));
        wait.until(ExpectedConditions.visibilityOf(handstripp));
        wait.until(ExpectedConditions.visibilityOf(largdoggroom));
        wait.until(ExpectedConditions.visibilityOf(mobile));
        wait.until(ExpectedConditions.visibilityOf(showgroom));
        wait.until(ExpectedConditions.visibilityOf(otherserv));
        wait.until(ExpectedConditions.elementToBeClickable(bath)).click();
        wait.until(ExpectedConditions.visibilityOf(closeserv));
        wait.until(ExpectedConditions.visibilityOf(headerserv));
        wait.until(ExpectedConditions.elementToBeClickable(checkprice)).click();
        wait.until(ExpectedConditions.visibilityOf(pricerange));
        pricemin.sendKeys(_testService.Pricemin);
        pricemax.sendKeys(_testService.Pricemax);
        descserv.sendKeys(_testService.Descservice);
        wait.until(ExpectedConditions.elementToBeClickable(save4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addnewpack));
        wait.until(ExpectedConditions.elementToBeClickable(addnewpack)).click();
        wait.until(ExpectedConditions.visibilityOf(titlepack));
        titlepack.sendKeys(_testService.PackTitle);
        wait.until(ExpectedConditions.visibilityOf(pricerangepack));
        wait.until(ExpectedConditions.elementToBeClickable(checkpricepack)).click();
        priceminpack.sendKeys(_testService.Priceminpack);
        pricemaxpack.sendKeys(_testService.Pricemaxpack);
        descpack.sendKeys(_testService.Descpack);
        wait.until(ExpectedConditions.elementToBeClickable(showpackcheck)).click();
        wait.until(ExpectedConditions.elementToBeClickable(showpackcheck)).click();
        wait.until(ExpectedConditions.visibilityOf(showpacktext));
        wait.until(ExpectedConditions.elementToBeClickable(save5)).click();
        wait.until(ExpectedConditions.visibilityOf(creditcard));
        creditcard.sendKeys("4111111111111111");
        expdate.sendKeys(_testService.ExpDate);
        cvv.sendKeys(_testService.CVV);
        wait.until(ExpectedConditions.visibilityOf(couponcode));
        firstnamebill.sendKeys(_testService.FirstName);
        lastnamebill.sendKeys(_testService.LastName);
        billaddress.sendKeys(_testService.Street);
        zip4.sendKeys(_testService.ZIP);
        wait.until(ExpectedConditions.visibilityOf(citybill));
        wait.until(ExpectedConditions.visibilityOf(statebill));
        phonebill.sendKeys(_testService.BusinessPhone);
        wait.until(ExpectedConditions.elementToBeClickable(save6));
        wait.until(ExpectedConditions.elementToBeClickable(save6)).click();
        wait.until(ExpectedConditions.visibilityOf(successgroomer));


    }

    /*Get Quarter Groomer*/
    public void QuatGroomers(Service _testService) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(groomers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(listservmark)).click();
        wait.until(ExpectedConditions.visibilityOf(listservicmarkpage));
        wait.until(ExpectedConditions.visibilityOf(whatsincludetext));
        wait.until(ExpectedConditions.visibilityOf(whatsinclupict));
        wait.until(ExpectedConditions.visibilityOf(annualplantext));
        wait.until(ExpectedConditions.visibilityOf(annualplanbut));
        wait.until(ExpectedConditions.visibilityOf(quatplantext));
        wait.until(ExpectedConditions.visibilityOf(quatplanbut));
        wait.until(ExpectedConditions.visibilityOf(howgroomworkstext));
        wait.until(ExpectedConditions.visibilityOf(howgroomworkspict));
        wait.until(ExpectedConditions.visibilityOf(chooseplanbut));
        wait.until(ExpectedConditions.elementToBeClickable(quatplanbut)).click();
        usernamegroom.sendKeys(_testService.Email);
        passgroom.sendKeys(_testService.Password);
        wait.until(ExpectedConditions.elementToBeClickable(logingroom)).click();
        businessname.sendKeys(_testService.Businessname);
        wait.until(ExpectedConditions.visibilityOf(aboutmegro));
        aboutmegro.sendKeys(_testService.Aboutme);
        wait.until(ExpectedConditions.visibilityOf(businesssince));
        businesssince.sendKeys(_testService.Businesssince);
        wait.until(ExpectedConditions.visibilityOf(salonowner));
        wait.until(ExpectedConditions.elementToBeClickable(salonowner)).click();
        wait.until(ExpectedConditions.elementToBeClickable(groomer));
        wait.until(ExpectedConditions.elementToBeClickable(groomer)).click();
        wait.until(ExpectedConditions.elementToBeClickable(cash)).click();
        wait.until(ExpectedConditions.elementToBeClickable(check)).click();
        wait.until(ExpectedConditions.elementToBeClickable(visa)).click();
        wait.until(ExpectedConditions.elementToBeClickable(mastercard)).click();
        wait.until(ExpectedConditions.elementToBeClickable(amex)).click();
        wait.until(ExpectedConditions.elementToBeClickable(other)).click();
        othertext.sendKeys("Insurance");
        street.sendKeys(_testService.Street);
        zip3.sendKeys(_testService.ZIP);
        wait.until(ExpectedConditions.visibilityOf(city));
        wait.until(ExpectedConditions.visibilityOf(state3));
        bussphone.sendKeys(_testService.BusinessPhone);
        bussemail.sendKeys(_testService.BusinessEmail);
        wait.until(ExpectedConditions.elementToBeClickable(sunday)).click();
        sunopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(sunclose));
        sunclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(monday)).click();
        monopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(monclose));
        monclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(tuesday)).click();
        tuesopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(tuesclose));
        tuesclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(wednesday)).click();
        wedopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(wedclose));
        wedclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(thursday)).click();
        thuropen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(thurclose));
        thurclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(friday)).click();
        friopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(friclose));
        friclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(saturday)).click();
        satopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(satclose));
        satclose.sendKeys("18:00 P");
        wait.until(ExpectedConditions.elementToBeClickable(save1)).click();
        wait.until(ExpectedConditions.visibilityOf(photouploadinput));
        photouploadinput.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\linkedinimage.jpg");
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(continuephoto));
        wait.until(ExpectedConditions.elementToBeClickable(continuephoto)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(save2));
        wait.until(ExpectedConditions.elementToBeClickable(save2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addmorefiles));
        wait.until(ExpectedConditions.elementToBeClickable(addmorefiles)).click();
        selimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\boxer1.jpg");
        wait.until(ExpectedConditions.visibilityOf(caption));
        caption.sendKeys("Beagle Specialized2");
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(continueimages)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closeimages));
        wait.until(ExpectedConditions.elementToBeClickable(closeimages)).click();
        wait.until(ExpectedConditions.elementToBeClickable(save3));
        wait.until(ExpectedConditions.elementToBeClickable(save3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(avabserv));
        wait.until(ExpectedConditions.elementToBeClickable(avabserv)).click();
        wait.until(ExpectedConditions.visibilityOf(haircut));
        wait.until(ExpectedConditions.visibilityOf(bath));
        wait.until(ExpectedConditions.visibilityOf(breedcuts));
        wait.until(ExpectedConditions.visibilityOf(earclean));
        wait.until(ExpectedConditions.visibilityOf(nailtrim));
        wait.until(ExpectedConditions.visibilityOf(teethclean));
        wait.until(ExpectedConditions.visibilityOf(analgland));
        wait.until(ExpectedConditions.visibilityOf(dematting));
        wait.until(ExpectedConditions.visibilityOf(deshedding));
        wait.until(ExpectedConditions.visibilityOf(decorating));
        wait.until(ExpectedConditions.visibilityOf(handscissor));
        wait.until(ExpectedConditions.visibilityOf(handstripp));
        wait.until(ExpectedConditions.visibilityOf(largdoggroom));
        wait.until(ExpectedConditions.visibilityOf(mobile));
        wait.until(ExpectedConditions.visibilityOf(showgroom));
        wait.until(ExpectedConditions.visibilityOf(otherserv));
        wait.until(ExpectedConditions.elementToBeClickable(bath)).click();
        wait.until(ExpectedConditions.visibilityOf(closeserv));
        wait.until(ExpectedConditions.visibilityOf(headerserv));
        wait.until(ExpectedConditions.elementToBeClickable(checkprice)).click();
        wait.until(ExpectedConditions.visibilityOf(pricerange));
        pricemin.sendKeys(_testService.Pricemin);
        pricemax.sendKeys(_testService.Pricemax);
        descserv.sendKeys(_testService.Descservice);
        wait.until(ExpectedConditions.elementToBeClickable(save4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addnewpack));
        wait.until(ExpectedConditions.elementToBeClickable(addnewpack)).click();
        wait.until(ExpectedConditions.visibilityOf(titlepack));
        titlepack.sendKeys(_testService.PackTitle);
        wait.until(ExpectedConditions.visibilityOf(pricerangepack));
        wait.until(ExpectedConditions.elementToBeClickable(checkpricepack)).click();
        priceminpack.sendKeys(_testService.Priceminpack);
        pricemaxpack.sendKeys(_testService.Pricemaxpack);
        descpack.sendKeys(_testService.Descpack);
        wait.until(ExpectedConditions.elementToBeClickable(showpackcheck)).click();
        wait.until(ExpectedConditions.elementToBeClickable(showpackcheck)).click();
        wait.until(ExpectedConditions.visibilityOf(showpacktext));
        wait.until(ExpectedConditions.elementToBeClickable(save5)).click();
        wait.until(ExpectedConditions.visibilityOf(creditcard));
        creditcard.sendKeys("4111111111111111");
        expdate.sendKeys(_testService.ExpDate);
        cvv.sendKeys(_testService.CVV);
        wait.until(ExpectedConditions.visibilityOf(couponcode));
        firstnamebill.sendKeys(_testService.FirstName);
        lastnamebill.sendKeys(_testService.LastName);
        billaddress.sendKeys(_testService.Street);
        zip4.sendKeys(_testService.ZIP);
        wait.until(ExpectedConditions.visibilityOf(citybill));
        wait.until(ExpectedConditions.visibilityOf(statebill));
        phonebill.sendKeys(_testService.BusinessPhone);
        wait.until(ExpectedConditions.elementToBeClickable(save6));
        wait.until(ExpectedConditions.elementToBeClickable(save6)).click();
        wait.until(ExpectedConditions.visibilityOf(successgroomer));

    }


    /*Check Groomer Dashboard*/
    public void VerifiyDashGroom(User _testUser) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.visibilityOf(dashgroomer));
        wait.until(ExpectedConditions.visibilityOf(messengergroomer));
        wait.until(ExpectedConditions.visibilityOf(manmypagegroomer));
        wait.until(ExpectedConditions.visibilityOf(accountgroomer));
        wait.until(ExpectedConditions.visibilityOf(mypagegroomer));
        wait.until(ExpectedConditions.visibilityOf(profperfor));
        wait.until(ExpectedConditions.visibilityOf(headergroomer));
        wait.until(ExpectedConditions.visibilityOf(totviewsgroom));
        wait.until(ExpectedConditions.visibilityOf(inquiriesgroom));
        wait.until(ExpectedConditions.visibilityOf(jointexthead));
        wait.until(ExpectedConditions.visibilityOf(jointext));
        wait.until(ExpectedConditions.visibilityOf(forsalons));
        wait.until(ExpectedConditions.visibilityOf(forgroomers));


    }

    /*Check Groomer messenger */
    public void VerifiyMessenger(User _testUser) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(messengergroomer)).click();
        wait.until(ExpectedConditions.visibilityOf(messimg));
        wait.until(ExpectedConditions.visibilityOf(messinfo));
        wait.until(ExpectedConditions.elementToBeClickable(messsenderopen)).click();
        wait.until(ExpectedConditions.visibilityOf(sentmessage));
        wait.until(ExpectedConditions.visibilityOf(receivedmessage)); //Need to update locators Pending
        wait.until(ExpectedConditions.visibilityOf(textarea));
        wait.until(ExpectedConditions.visibilityOf(sentbutton));
        wait.until(ExpectedConditions.elementToBeClickable(menumess)).click();  //replace with new button PENDING
        wait.until(ExpectedConditions.visibilityOf(viewquestrespo));
        wait.until(ExpectedConditions.visibilityOf(blockchannel));
        wait.until(ExpectedConditions.visibilityOf(deleteconvers));
    }

    /*Check ManMyPage Groomer*/
    public void VerifiyManMypage(User _testUser) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(manmypagegroomer)).click();
        wait.until(ExpectedConditions.visibilityOf(contactinfo));
        wait.until(ExpectedConditions.visibilityOf(coverphoto));
        wait.until(ExpectedConditions.visibilityOf(photosandvideos));
        wait.until(ExpectedConditions.visibilityOf(services));
        wait.until(ExpectedConditions.visibilityOf(packsepecials));
        wait.until(ExpectedConditions.visibilityOf(contactinfohead));
        wait.until(ExpectedConditions.visibilityOf(bussname));
        wait.until(ExpectedConditions.visibilityOf(weblink));
        wait.until(ExpectedConditions.visibilityOf(aboutmetext2));
        wait.until(ExpectedConditions.visibilityOf(busssince));
        wait.until(ExpectedConditions.visibilityOf(iamgroomer));
        wait.until(ExpectedConditions.visibilityOf(paymethods));
        wait.until(ExpectedConditions.visibilityOf(strretline));
        wait.until(ExpectedConditions.visibilityOf(zipcode));
        wait.until(ExpectedConditions.visibilityOf(citygroom));
        wait.until(ExpectedConditions.visibilityOf(stategroom));
        wait.until(ExpectedConditions.visibilityOf(bussphonegroom));
        wait.until(ExpectedConditions.visibilityOf(bussemailgroom));
        wait.until(ExpectedConditions.visibilityOf(hoursofoperation));
        wait.until(ExpectedConditions.visibilityOf(backmyacct));
        wait.until(ExpectedConditions.elementToBeClickable(savegroombut)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(coverphoto));
        wait.until(ExpectedConditions.elementToBeClickable(coverphoto)).click();
        wait.until(ExpectedConditions.visibilityOf(imgprofile));
        wait.until(ExpectedConditions.visibilityOf(changephbut));
        wait.until(ExpectedConditions.visibilityOf(savephbut));
        wait.until(ExpectedConditions.elementToBeClickable(photosandvideos)).click();
        wait.until(ExpectedConditions.visibilityOf(addmorefilesgroom));
        wait.until(ExpectedConditions.visibilityOf(photodispl));
        wait.until(ExpectedConditions.visibilityOf(delphbut));
        wait.until(ExpectedConditions.visibilityOf(saveimgbut));
        wait.until(ExpectedConditions.elementToBeClickable(services)).click();
        wait.until(ExpectedConditions.visibilityOf(selgroomserv));
        wait.until(ExpectedConditions.visibilityOf(delservices));
        wait.until(ExpectedConditions.visibilityOf(servicename));
        wait.until(ExpectedConditions.visibilityOf(pricerangeserv));
        wait.until(ExpectedConditions.visibilityOf(pricing));
        wait.until(ExpectedConditions.visibilityOf(pricing2));
        wait.until(ExpectedConditions.visibilityOf(descservices));
        wait.until(ExpectedConditions.visibilityOf(saveservbut));
        wait.until(ExpectedConditions.elementToBeClickable(packsepecials)).click();
        wait.until(ExpectedConditions.visibilityOf(pricerangepackgroom));
        wait.until(ExpectedConditions.visibilityOf(showpackpack));
        wait.until(ExpectedConditions.visibilityOf(pricerangespegroom));
        wait.until(ExpectedConditions.visibilityOf(showpackspe));
        wait.until(ExpectedConditions.visibilityOf(titlepackgroom));
        wait.until(ExpectedConditions.visibilityOf(pricepackgroom));
        wait.until(ExpectedConditions.visibilityOf(pricepackgroom2));
        wait.until(ExpectedConditions.visibilityOf(descpackgroom));
        wait.until(ExpectedConditions.visibilityOf(addnewpackbut));
        wait.until(ExpectedConditions.visibilityOf(titlespegroom));
        wait.until(ExpectedConditions.visibilityOf(pricespegroom));
        wait.until(ExpectedConditions.visibilityOf(pricespegroom2));
        wait.until(ExpectedConditions.visibilityOf(descspegroom));
        wait.until(ExpectedConditions.visibilityOf(addnewspebut));
        wait.until(ExpectedConditions.visibilityOf(savepackspebut));


    }

    /*Check Account Groomer*/
    public void VerifiyMyAccountGroom(User _testUser) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(accountgroomer)).click();
        wait.until(ExpectedConditions.visibilityOf(security));
        //wait.until(ExpectedConditions.visibilityOf(paymentmethods));
        wait.until(ExpectedConditions.visibilityOf(oldpassword));
        wait.until(ExpectedConditions.visibilityOf(newpassword));
        wait.until(ExpectedConditions.visibilityOf(confirmpassword));
        wait.until(ExpectedConditions.visibilityOf(changepasssbut));
        wait.until(ExpectedConditions.elementToBeClickable(manmypagegroomer)).click();
        //wait.until(ExpectedConditions.visibilityOf(cardnumber));
        //wait.until(ExpectedConditions.visibilityOf(expirationdate));
        //wait.until(ExpectedConditions.visibilityOf(cvvgroom));
        //wait.until(ExpectedConditions.visibilityOf(firstnamegroom));
        //wait.until(ExpectedConditions.visibilityOf(lastnamegroom));
        //wait.until(ExpectedConditions.visibilityOf(billingaddressgroom));
        //wait.until(ExpectedConditions.visibilityOf(zipgroom));
        //wait.until(ExpectedConditions.visibilityOf(citygroomer));
        //wait.until(ExpectedConditions.visibilityOf(stategroomer));
        //wait.until(ExpectedConditions.visibilityOf(phonegroomer));
        //wait.until(ExpectedConditions.visibilityOf(clicktermscond));
        //wait.until(ExpectedConditions.visibilityOf(savebilling));

    }

    /*Check My Page Groomer*/
    public void VerifiyMyPage(User _testUser) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        wait.until(ExpectedConditions.elementToBeClickable(GroomerUser)).click();
        //wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(mypagegroomer)).click();
        wait.until(ExpectedConditions.visibilityOf(mypagepage));

    }

}