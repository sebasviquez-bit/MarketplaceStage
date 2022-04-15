package Pages;

import Helpers.DriverHelper;
import Model.Service;
import Model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class Groomers {

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/span[1]")
    WebElement groomers;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/ul/li[1]")
    WebElement groomseek;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/ul/li[2]/div[2]/a")
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

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/h2")
    WebElement whatmakes;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[5]/div[1]/div[1]")
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

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[8]/div[1]/div[2]/p/a")
    WebElement safemore;

    @FindBy(css = "#react-root > div > div:nth-child(4) > section > div.Styled__Wrapper-sc-ysw841-0.cWfaAR > div.Styled__Wrapper-sc-13lpz7m-0.fJSjAr.content-left > div.image-container > img")
    WebElement salonsafepict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[8]/div[2]/div[2]/h3")
    WebElement salonsafe;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[8]/div[2]/div[2]/p")
    WebElement salonsafetext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[8]/div[2]/div[2]/p/a")
    WebElement salonsafemore;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/h2")
    WebElement iamgroom;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div/p")
    WebElement iamgroomtext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/section/div[9]/div/a")
    WebElement crealistbelow;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[2]/div/h2")
    WebElement allresults;

    @FindBy(id = "react-select-2-option-1")
    WebElement bathopt;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.sc-bAeIUo.hLrVvj > div.sc-GMQeP.buojOw > div > div:nth-child(3) > div > a:nth-child(1)")
    WebElement bathresults;

    @FindBy(id = "location__zip")
    WebElement zipfield2;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[2]/div/section/ul/li[2]/span")
    WebElement zipresults;

    @FindBy(id = "react-select-4-option-1")
    WebElement distopt;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[2]/div/section/ul/li[2]/span")
    WebElement distresults;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[1]/div/div")
    WebElement groompict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[2]/h4")
    WebElement groomname;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[2]/div[1]/div")
    WebElement groomtype;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[2]/div[2]/p")
    WebElement groomaddress;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[2]/div[3]")
    WebElement groomcert;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[3]/div/h1")
    WebElement groom2name;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div[1]")
    WebElement groom2pict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[3]/div/div[2]/div")
    WebElement groom2type;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[3]/div/div[3]/span")
    WebElement groom2address;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[3]/div/div[1]")
    WebElement groom2cert;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[3]/div/div[5]/a/button")
    WebElement messgroombut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[1]/div/div[1]")
    WebElement aboutme;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[1]/div/div[3]")
    WebElement aboutmetext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[2]/div/div[1]")
    WebElement myservices;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[2]/div/div[2]/div[1]")
    WebElement myservicestext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[2]/div/div[2]/div[2]/div[1]")
    WebElement packages;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[2]/div/div[2]/div[2]")
    WebElement packagestext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[3]/div/div[1]")
    WebElement operations;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[3]/div/div[2]/div/div[1]")
    WebElement operationstext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[3]/div/div[2]/div/div[2]/div[1]")
    WebElement payment;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[3]/div/div[2]/div/div[2]/div[2]")
    WebElement paymenttext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[2]/div/div[2]/div[2]/div/form/button")
    WebElement createaccbut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[2]/div/div[2]/div[2]/div/form/div[6]/button")
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

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[3]/div[2]/span")
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

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.marketplace__top-image > div.Container-sc-q7fgo0-0.ihhzmc.hero-wrapper > div > h1")
    WebElement AdvertiseLitter;


    DriverHelper driverHelper;

    WebDriver driver;

    /*Check Safe page*/
    private void validsafe() {
        for (String winHandle : driver.getWindowHandles()) {

            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/products-services/akc-safe-grooming-program/"));

    }
    /*Initialize Groomers*/
    public Groomers(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }

/*Check Groomers menu*/
    public void CheckGroomers(){

        this.groomers.click();
        this.groomseek.isDisplayed();
        this.findgroom.isDisplayed();
        this.akcmarkgroom.isDisplayed();
        this.howfindgroom.isDisplayed();
        this.forgroom.isDisplayed();
        this.listservmark.isDisplayed();

    }
    /*Check Groomer pages*/
    public void CheckGroomers1() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        this.groomers.click();
        this.findgroom.click();
        wait.until(ExpectedConditions.visibilityOf(findgroompage));

    }

    public void CheckGroomers2() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        this.groomers.click();
        this.akcmarkgroom.click();
        wait.until(ExpectedConditions.visibilityOf(akcmarkforgroompage));

    }

    public void CheckGroomers3() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        this.groomers.click();
        this.howfindgroom.click();
        wait.until(ExpectedConditions.visibilityOf(howfindgroompage));

    }


    public void CheckGroomers4() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        this.groomers.click();
        this.listservmark.click();
        wait.until(ExpectedConditions.visibilityOf(listservicmarkpage));

    }

    /*Check Groomer Homepage elements*/
    public void CheckGroomHome(){

        this.groomers.click();
        this.findgroom.click();
        this.groomhead.isDisplayed();
        this.groomtext.isDisplayed();
        this.groomserp.isDisplayed();
        this.looking.isDisplayed();
        this.service.isDisplayed();
        this.zipstate.isDisplayed();
        this.distance.isDisplayed();
        this.searchbut.isDisplayed();
        this.areyougroom.isDisplayed();
        this.crealist.isDisplayed();
        this.whychoose.isDisplayed();
        this.whypicture.isDisplayed();
        this.whytext.isDisplayed();
        this.whatmakes.isDisplayed();
        this.trustpict.isDisplayed();
        this.trust.isDisplayed();
        this.trusttext.isDisplayed();
        this.salonpict.isDisplayed();
        this.salon.isDisplayed();
        this.salontext.isDisplayed();
        this.groomedupict.isDisplayed();
        this.groomedu.isDisplayed();
        this.groomedutext.isDisplayed();
        this.howchoose.isDisplayed();
        this.howpict1.isDisplayed();
        this.howpict2.isDisplayed();
        this.howpict3.isDisplayed();
        this.howpict4.isDisplayed();
        this.howchoosetext.isDisplayed();
        this.howfind.isDisplayed();
        this.safepict.isDisplayed();
        this.safe.isDisplayed();
        this.safetext.isDisplayed();
        this.safemore.isDisplayed();
        this.salonsafepict.isDisplayed();
        this.salonsafe.isDisplayed();
        this.salonsafetext.isDisplayed();
        this.salonsafemore.isDisplayed();
        this.iamgroom.isDisplayed();
        this.iamgroomtext.isDisplayed();
        this.crealistbelow.isDisplayed();

    }
    /*Check SERP results*/
    public void CheckAllResults(){

        this.groomers.click();
        this.findgroom.click();
        this.searchbut.click();
        this.allresults.isDisplayed(); //This fails on Stage env because of the missing Groomers board

    }

    public void CheckBathResults(){

        this.groomers.click();
        this.findgroom.click();
        this.service.click();
        this.bathopt.click();
        this.searchbut.click();
        this.bathresults.isDisplayed();   //This fails on Stage env because of the missing Groomers board

    }

    public void CheckZipResults(){

        this.groomers.click();
        this.findgroom.click();
        this.service.click();
        this.bathopt.click();
        this.zipstate.click();
        this.zipfield2.sendKeys("80012");
        this.searchbut.click();  //This fails because of the Groomers issue on stage
        this.zipresults.isDisplayed();

    }

    public void CheckDistResults(){

        this.groomers.click();
        this.findgroom.click();
        this.service.click();
        this.bathopt.click();
        this.zipstate.click();
        this.zipfield2.sendKeys("80001");
        //this.distance.click();
        this.distance.click();
        this.distopt.click();
        this.searchbut.click();
        this.distresults.isDisplayed(); //This fails on stage because of the Groomers Menu table issue

    }

    /*Check other pages*/
    public void CheckList1(){

        WebDriverWait wait = new WebDriverWait (driver, 10);
        this.groomers.click();
        this.findgroom.click();
        this.crealist.click();
        wait.until(ExpectedConditions.visibilityOf(AdvertiseLitter));

    }


    public void CheckSafe1(){

        this.groomers.click();
        this.findgroom.click();
        this.safemore.click();
        validsafe();

    }

    public void CheckSafe2(){

        this.groomers.click();
        this.findgroom.click();
        this.salonsafemore.click();
        validsafe();

    }

    public void CheckList2(){

        WebDriverWait wait = new WebDriverWait (driver, 10);
        this.groomers.click();
        this.findgroom.click();
        this.crealistbelow.click();
        wait.until(ExpectedConditions.visibilityOf(listservicmarkpage));


    }

    /*Check Groomer SERP page*/
    public void CheckGroomListPage() {

        this.groomers.click();
        this.findgroom.click();
        this.service.click();
        this.bathopt.click();
        this.zipstate.click();
        this.zipfield2.sendKeys("80001");
        this.searchbut.click();  //This fails on stage because of the Groomers Menu table issue.
        this.groompict.isDisplayed();
        this.groomname.isDisplayed();
        this.groomtype.isDisplayed();
        this.groomaddress.isDisplayed();
        this.groomcert.isDisplayed();

    }

    /*Check Groomer page*/
    public void CheckGroomPage() {

        this.groomers.click();
        this.findgroom.click();
        this.service.click();
        this.bathopt.click();
        this.searchbut.click();
        this.groompict.click();  //This fails on stage because of the Groomers Menu table issue.
        this.groom2name.isDisplayed();
        this.groom2pict.isDisplayed();
        this.groom2address.isDisplayed();
        this.groom2type.isDisplayed();
        this.groom2cert.isDisplayed();
        this.messgroombut.isDisplayed();
        this.aboutme.isDisplayed();
        this.aboutmetext.isDisplayed();
        this.myservices.isDisplayed();
        this.myservicestext.isDisplayed();
        //this.packages.isDisplayed();
        //this.packagestext.isDisplayed();
        this.operations.isDisplayed();
        this.operationstext.isDisplayed();
        this.payment.isDisplayed();
        this.paymenttext.isDisplayed();
        this.createaccbut.isDisplayed();
        this.signinbut.isDisplayed();





    }
    /*Get Annual Groomer*/
    public void AnnualGroomers(Service _testService) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        this.groomers.click();
        this.listservmark.click();
        this.listservicmarkpage.isDisplayed();
        this.whatsincludetext.isDisplayed();
        this.whatsinclupict.isDisplayed();
        this.annualplantext.isDisplayed();
        this.annualplanbut.isDisplayed();
        this.quatplantext.isDisplayed();
        this.quatplanbut.isDisplayed();
        this.howgroomworkstext.isDisplayed();
        this.howgroomworkspict.isDisplayed();
        this.chooseplanbut.isDisplayed();
        this.annualplanbut.click();
        this.usernamegroom.sendKeys(_testService.Email);
        this.passgroom.sendKeys(_testService.Password);
        this.logingroom.click();
        this.businessname.sendKeys(_testService.Businessname);
        this.aboutmegro.sendKeys(_testService.Aboutme);
        this.businesssince.sendKeys(_testService.Businesssince);
        this.salonowner.click();
        this.groomer.click();
        this.cash.click();
        this.check.click();
        this.visa.click();
        this.mastercard.click();
        this.amex.click();
        this.other.click();
        this.othertext.sendKeys("Insurance");
        this.street.sendKeys(_testService.Street);
        this.zip3.sendKeys(_testService.ZIP);
        this.city.isDisplayed();
        this.state3.isDisplayed();
        this.bussphone.sendKeys(_testService.BusinessPhone);
        this.bussemail.sendKeys(_testService.BusinessEmail);
        this.sunday.click();
        this.sunopen.sendKeys("13:00 P");
        this.sunclose.sendKeys("18:00 P");
        this.monday.click();
        this.monopen.sendKeys("13:00 P");
        this.monclose.sendKeys("18:00 P");
        this.tuesday.click();
        this.tuesopen.sendKeys("13:00 P");
        this.tuesclose.sendKeys("18:00 P");
        this.wednesday.click();
        this.wedopen.sendKeys("13:00 P");
        this.wedclose.sendKeys("18:00 P");
        this.thursday.click();
        this.thuropen.sendKeys("13:00 P");
        this.thurclose.sendKeys("18:00 P");
        this.friday.click();
        this.friopen.sendKeys("13:00 P");
        this.friclose.sendKeys("18:00 P");
        this.saturday.click();
        this.satopen.sendKeys("13:00 P");
        this.satclose.sendKeys("18:00 P");
        this.save1.click();
        this.photouploadinput.sendKeys("/Users/sebastian.viquez/Documents/NYCATS-QA-branch-A/src/test/java/Resources/image.png");
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(continuephoto));
        this.continuephoto.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(save2));
        this.save2.click();
        this.addmorefiles.click();
        this.selimages.sendKeys("/Users/sebastian.viquez/Documents/NYCATS-QA-branch-A/src/test/java/Resources/image.png");
        wait.until(ExpectedConditions.visibilityOf(caption));
        this.caption.sendKeys("Beagle Specialized2");
        sleep(2000);
        this.continueimages.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closeimages));
        this.closeimages.click();
        wait.until(ExpectedConditions.elementToBeClickable(save3));
        this.save3.click();
        wait.until(ExpectedConditions.elementToBeClickable(avabserv));
        this.avabserv.click();
        this.haircut.isDisplayed();
        this.bath.isDisplayed();
        this.breedcuts.isDisplayed();
        this.earclean.isDisplayed();
        this.nailtrim.isDisplayed();
        this.teethclean.isDisplayed();
        this.analgland.isDisplayed();
        this.dematting.isDisplayed();
        this.deshedding.isDisplayed();
        this.decorating.isDisplayed();
        this.handscissor.isDisplayed();
        this.handstripp.isDisplayed();
        this.largdoggroom.isDisplayed();
        this.mobile.isDisplayed();
        this.showgroom.isDisplayed();
        this.otherserv.isDisplayed();
        this.bath.click();
        this.closeserv.isDisplayed();
        this.headerserv.isDisplayed();
        this.checkprice.click();
        this.pricerange.isDisplayed();
        this.pricemin.sendKeys(_testService.Pricemin);
        this.pricemax.sendKeys(_testService.Pricemax);
        this.descserv.sendKeys(_testService.Descservice);
        this.save4.click();
        wait.until(ExpectedConditions.elementToBeClickable(addnewpack));
        this.addnewpack.click();
        wait.until(ExpectedConditions.visibilityOf(titlepack));
        this.titlepack.sendKeys(_testService.PackTitle);
        this.pricerangepack.isDisplayed();
        this.checkpricepack.click();
        this.priceminpack.sendKeys(_testService.Priceminpack);
        this.pricemaxpack.sendKeys(_testService.Pricemaxpack);
        this.descpack.sendKeys(_testService.Descpack);
        this.showpackcheck.click();
        this.showpackcheck.click();
        this.showpacktext.isDisplayed();
        this.save5.click();
        wait.until(ExpectedConditions.visibilityOf(creditcard));
        this.creditcard.sendKeys("4111111111111111");
        this.expdate.sendKeys(_testService.ExpDate);
        this.cvv.sendKeys(_testService.CVV);
        this.couponcode.isDisplayed();
        this.firstnamebill.sendKeys(_testService.FirstName);
        this.lastnamebill.sendKeys(_testService.LastName);
        this.billaddress.sendKeys(_testService.Street);
        this.zip4.sendKeys(_testService.ZIP);
        this.citybill.isDisplayed();
        this.statebill.isDisplayed();
        this.phonebill.sendKeys(_testService.BusinessPhone);
        wait.until(ExpectedConditions.elementToBeClickable(save6));
        this.save6.click();
        this.successgroomer.isDisplayed();







    }
    /*Get Quarter Groomer*/
    public void QuatGroomers(Service _testService) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        this.groomers.click();
        this.listservmark.click();
        this.listservicmarkpage.isDisplayed();
        this.whatsincludetext.isDisplayed();
        this.whatsinclupict.isDisplayed();
        this.annualplantext.isDisplayed();
        this.annualplanbut.isDisplayed();
        this.quatplantext.isDisplayed();
        this.quatplanbut.isDisplayed();
        this.howgroomworkstext.isDisplayed();
        this.howgroomworkspict.isDisplayed();
        this.chooseplanbut.isDisplayed();
        this.quatplanbut.click();
        this.usernamegroom.sendKeys(_testService.Email);
        this.passgroom.sendKeys(_testService.Password);
        this.logingroom.click();
        this.businessname.sendKeys(_testService.Businessname);
        wait.until(ExpectedConditions.visibilityOf(aboutmegro));
        this.aboutmegro.sendKeys(_testService.Aboutme);
        wait.until(ExpectedConditions.visibilityOf(businesssince));
        this.businesssince.sendKeys(_testService.Businesssince);
        wait.until(ExpectedConditions.visibilityOf(salonowner));
        this.salonowner.click();
        wait.until(ExpectedConditions.elementToBeClickable(groomer));
        this.groomer.click();
        this.cash.click();
        this.check.click();
        this.visa.click();
        this.mastercard.click();
        this.amex.click();
        this.other.click();
        this.othertext.sendKeys("Insurance");
        this.street.sendKeys(_testService.Street);
        this.zip3.sendKeys(_testService.ZIP);
        this.city.isDisplayed();
        this.state3.isDisplayed();
        this.bussphone.sendKeys(_testService.BusinessPhone);
        this.bussemail.sendKeys(_testService.BusinessEmail);
        this.sunday.click();
        this.sunopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(sunclose));
        this.sunclose.sendKeys("18:00 P");
        this.monday.click();
        this.monopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(monclose));
        this.monclose.sendKeys("18:00 P");
        this.tuesday.click();
        this.tuesopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(tuesclose));
        this.tuesclose.sendKeys("18:00 P");
        this.wednesday.click();
        this.wedopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(wedclose));
        this.wedclose.sendKeys("18:00 P");
        this.thursday.click();
        this.thuropen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(thurclose));
        this.thurclose.sendKeys("18:00 P");
        this.friday.click();
        this.friopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(friclose));
        this.friclose.sendKeys("18:00 P");
        this.saturday.click();
        this.satopen.sendKeys("13:00 P");
        wait.until(ExpectedConditions.visibilityOf(satclose));
        this.satclose.sendKeys("18:00 P");
        this.save1.click();
        wait.until(ExpectedConditions.visibilityOf(photouploadinput));
        this.photouploadinput.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\linkedinimage.jpg");
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(continuephoto));
        this.continuephoto.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(save2));
        this.save2.click();
        wait.until(ExpectedConditions.elementToBeClickable(addmorefiles));
        this.addmorefiles.click();
        this.selimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\boxer1.jpg");
        wait.until(ExpectedConditions.visibilityOf(caption));
        this.caption.sendKeys("Beagle Specialized2");
        sleep(2000);
        this.continueimages.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closeimages));
        this.closeimages.click();
        wait.until(ExpectedConditions.elementToBeClickable(save3));
        this.save3.click();
        wait.until(ExpectedConditions.elementToBeClickable(avabserv));
        this.avabserv.click();
        this.haircut.isDisplayed();
        this.bath.isDisplayed();
        this.breedcuts.isDisplayed();
        this.earclean.isDisplayed();
        this.nailtrim.isDisplayed();
        this.teethclean.isDisplayed();
        this.analgland.isDisplayed();
        this.dematting.isDisplayed();
        this.deshedding.isDisplayed();
        this.decorating.isDisplayed();
        this.handscissor.isDisplayed();
        this.handstripp.isDisplayed();
        this.largdoggroom.isDisplayed();
        this.mobile.isDisplayed();
        this.showgroom.isDisplayed();
        this.otherserv.isDisplayed();
        this.bath.click();
        this.closeserv.isDisplayed();
        this.headerserv.isDisplayed();
        this.checkprice.click();
        this.pricerange.isDisplayed();
        this.pricemin.sendKeys(_testService.Pricemin);
        this.pricemax.sendKeys(_testService.Pricemax);
        this.descserv.sendKeys(_testService.Descservice);
        this.save4.click();
        wait.until(ExpectedConditions.elementToBeClickable(addnewpack));
        this.addnewpack.click();
        wait.until(ExpectedConditions.visibilityOf(titlepack));
        this.titlepack.sendKeys(_testService.PackTitle);
        this.pricerangepack.isDisplayed();
        this.checkpricepack.click();
        this.priceminpack.sendKeys(_testService.Priceminpack);
        this.pricemaxpack.sendKeys(_testService.Pricemaxpack);
        this.descpack.sendKeys(_testService.Descpack);
        this.showpackcheck.click();
        this.showpackcheck.click();
        this.showpacktext.isDisplayed();
        this.save5.click();
        wait.until(ExpectedConditions.visibilityOf(creditcard));
        this.creditcard.sendKeys("4111111111111111");
        this.expdate.sendKeys(_testService.ExpDate);
        this.cvv.sendKeys(_testService.CVV);
        this.couponcode.isDisplayed();
        this.firstnamebill.sendKeys(_testService.FirstName);
        this.lastnamebill.sendKeys(_testService.LastName);
        this.billaddress.sendKeys(_testService.Street);
        this.zip4.sendKeys(_testService.ZIP);
        this.citybill.isDisplayed();
        this.statebill.isDisplayed();
        this.phonebill.sendKeys(_testService.BusinessPhone);
        wait.until(ExpectedConditions.elementToBeClickable(save6));
        this.save6.click();
        this.successgroomer.isDisplayed();






    }
    /*Check Groomer Dashboard*/
    public void VerifiyDashGroom(User _testUser)  {


        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.dashgroomer.isDisplayed();
        this.messengergroomer.isDisplayed();
        this.manmypagegroomer.isDisplayed();
        this.accountgroomer.isDisplayed();
        this.mypagegroomer.isDisplayed();
        this.profperfor.isDisplayed();
        this.headergroomer.isDisplayed();
        this.totviewsgroom.isDisplayed();
        this.inquiriesgroom.isDisplayed();
        this.jointexthead.isDisplayed();
        this.jointext.isDisplayed();
        this.forsalons.isDisplayed();
        this.forgroomers.isDisplayed();


    }
    /*Check Groomer messenger */
    public void VerifiyMessenger(User _testUser)  {


        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.messengergroomer.click();
        this.messimg.isDisplayed();
        this.messinfo.isDisplayed();
        this.messsenderopen.click();
        this.sentmessage.isDisplayed();
        this.receivedmessage.isDisplayed();
        this.textarea.isDisplayed();
        this.sentbutton.isDisplayed();
        this.menumess.click();
        this.viewquestrespo.isDisplayed();
        this.blockchannel.isDisplayed();
        this.deleteconvers.isDisplayed();
    }
    /*Check ManMyPage Groomer*/
    public void VerifiyManMypage(User _testUser) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.manmypagegroomer.click();
        this.contactinfo.isDisplayed();
        this.coverphoto.isDisplayed();
        this.photosandvideos.isDisplayed();
        this.services.isDisplayed();
        this.packsepecials.isDisplayed();
        this.contactinfohead.isDisplayed();
        this.bussname.isDisplayed();
        this.weblink.isDisplayed();
        this.aboutmetext2.isDisplayed();
        this.busssince.isDisplayed();
        this.iamgroomer.isDisplayed();
        this.paymethods.isDisplayed();
        this.strretline.isDisplayed();
        this.zipcode.isDisplayed();
        this.citygroom.isDisplayed();
        this.stategroom.isDisplayed();
        this.bussphonegroom.isDisplayed();
        this.bussemailgroom.isDisplayed();
        this.hoursofoperation.isDisplayed();
        this.backmyacct.isDisplayed();
        this.savegroombut.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(coverphoto));
        this.coverphoto.click();
        this.imgprofile.isDisplayed();
        this.changephbut.isDisplayed();
        this.savephbut.isDisplayed();
        this.photosandvideos.click();
        this.addmorefilesgroom.isDisplayed();
        this.photodispl.isDisplayed();
        this.delphbut.isDisplayed();
        this.saveimgbut.isDisplayed();
        this.services.click();
        this.selgroomserv.isDisplayed();
        this.delservices.isDisplayed();
        this.servicename.isDisplayed();
        this.pricerangeserv.isDisplayed();
        this.pricing.isDisplayed();
        this.pricing2.isDisplayed();
        this.descservices.isDisplayed();
        this.saveservbut.isDisplayed();
        this.packsepecials.click();
        this.pricerangepackgroom.isDisplayed();
        this.showpackpack.isDisplayed();
        this.pricerangespegroom.isDisplayed();
        this.showpackspe.isDisplayed();
        this.titlepackgroom.isDisplayed();
        this.pricepackgroom.isDisplayed();
        this.pricepackgroom2.isDisplayed();
        this.descpackgroom.isDisplayed();
        this.addnewpackbut.isDisplayed();
        this.titlespegroom.isDisplayed();
        this.pricespegroom.isDisplayed();
        this.pricespegroom2.isDisplayed();
        this.descspegroom.isDisplayed();
        this.addnewspebut.isDisplayed();
        this.savepackspebut.isDisplayed();





    }

    /*Check Account Groomer*/
    public void VerifiyMyAccountGroom(User _testUser)  {


        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.accountgroomer.click();
        this.security.isDisplayed();
        this.paymentmethods.isDisplayed();
        this.oldpassword.isDisplayed();
        this.newpassword.isDisplayed();
        this.confirmpassword.isDisplayed();
        this.changepasssbut.isDisplayed();
        this.paymentmethods.click();
        this.cardnumber.isDisplayed();
        this.expirationdate.isDisplayed();
        this.cvvgroom.isDisplayed();
        this.firstnamegroom.isDisplayed();
        this.lastnamegroom.isDisplayed();
        this.billingaddressgroom.isDisplayed();
        this.zipgroom.isDisplayed();
        this.citygroomer.isDisplayed();
        this.stategroomer.isDisplayed();
        this.phonegroomer.isDisplayed();
        this.clicktermscond.isDisplayed();
        this.savebilling.isDisplayed();

    }
    /*Check My Page Groomer*/
    public void VerifiyMyPage(User _testUser)  {

        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        this.GroomerUser.click();
        //this.dashbreed.click();
        this.mypagegroomer.click();
        this.mypagepage.isDisplayed();

    }

}
