package Pages;

import Helpers.BrowserFactory;

import Model.Classes;
import Model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Trainers {

    @FindBy(css = "#react-root > div > div.Styled__Wrapper-sc-rvwmv6-0.gtRBZE > div.Styled__Right-sc-rvwmv6-3.jzQSQV > div > div.Styled__Wrapper-sc-7bo7op-0.llObZX > div > div:nth-child(4) > div.menu-item-title-container")
    WebElement trainers;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[2]/div/ul/li[1]")
    WebElement trainersseek;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[2]/div/ul/li[2]/div[2]/a")
    WebElement findtrain;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[2]/div/ul/li[3]")
    WebElement fortrain;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[2]/div/ul/li[4]/div/a")
    WebElement listtrain;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div/form")
    WebElement trainserp;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div/form/div[1]/div[1]/span")
    WebElement looking;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div/form/div[1]/div[2]/div/div[1]/div[1]")
    WebElement traintype;

    @FindBy(xpath = "//div[contains(text(),'Training Type')]")
    WebElement traintypeInput;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div/form/div[1]/div[3]/div[1]/div/div[1]/div[1]/div[1]")
    WebElement zip;

    @FindBy(id = "trainer-location__zip")
    WebElement zipform;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div/form/div[1]/div[3]/div[2]")
    WebElement distance;

    @FindBy(id = "find-a-trainer-button")
    WebElement findtrainbut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/h1")
    WebElement traintext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[2]/div/h2")
    WebElement results;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(4) > div.Styled__RowResults-sc-10ypou4-3.kTfmWx > div > div.search-results-title > div > h2")
    WebElement allresults;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(4) > div.Styled__RowResults-sc-10ypou4-3.kTfmWx > div > div:nth-child(3) > div > a:nth-child(1) > div > div.Styled__Image-sc-hcxd8a-5.gkbCuh.card-media-wrapper > div > div")
    WebElement AKCScentWorkResults;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[2]/div/section/ul/li[2]/span")
    WebElement zipresults;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[2]/div/section/ul/li[2]/span")
    WebElement distresults;

    @FindBy(id = "react-select-2-option-3")
    WebElement AKCScentWork;

    @FindBy(id = "#trainer-location__radius")
    WebElement miles;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div/a[1]/div/div[1]/div/div")
    WebElement trainlistpict;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div:nth-child(4) > div.Styled__RowResults-sc-10ypou4-3.kTfmWx > div > div:nth-child(3) > div > a > div > div.Styled__Details-sc-hcxd8a-1.cTPwBu.trainer-details-wrapper > div.Styled__Name-sc-hcxd8a-2.bInnWc.trainer-result_name")
    WebElement trainlisthead;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div/a[1]/div/div[2]/div[3]/p")
    WebElement trainlisttext;

    @FindBy(css = "#dfp-searchfooter-728-90")
    WebElement trainadvert;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div:nth-child(4) > div.Styled__RowResults-sc-10ypou4-3.kTfmWx > div > div:nth-child(3) > div:nth-child(1) > a:nth-child(3)")
    WebElement trainlist2pict;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[2]/div[1]")
    WebElement train2name;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[2]/div[2]")
    WebElement train2type;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[2]/div[3]/p")
    WebElement train2address;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[2]/div/div[5]/a/button")
    WebElement messtrainbut;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[1]/div/div[1]")
    WebElement aboutme;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[1]/div/div[3]")
    WebElement aboutmetext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[2]/div/div[1]")
    WebElement howtrain;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[2]/div/div[2]")
    WebElement howtraintext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[3]/div/div[1]")
    WebElement whattrain;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[3]/div/div[2]")
    WebElement whattrain2;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[1]/div[4]")
    WebElement acceptedpayment;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[2]/div/div[2]/div[2]/div/form/button")
    WebElement createacc;

    @FindBy(css = "#react-root > div.Styled__Wrapper-sc-rxlt93-0.buCIDb > div:nth-child(4) > div > div.trainer-profile__flexible-content > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2) > div > button")
    WebElement signin;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div[2]")
    WebElement trainerpicture;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/h2")
    WebElement whybecome;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/h3")
    WebElement whybecometext;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[1]/div[1]/div")
    WebElement trainerpicture2;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[2]/h2")
    WebElement getstarted;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[2]/div/div[1]/h3")
    WebElement currentcgc;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[2]/div/div[1]/p")
    WebElement currentcgctext;

    @FindBy(id= "advertise-trainers-profile-button")
    WebElement createprofile;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[2]/div/div[2]/h3")
    WebElement cgcevaluator;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[2]/div[2]/div/div[2]/p")
    WebElement cgcevaluatortext;

    @FindBy(id = "advertise-trainers-apply-today-button")
    WebElement applytoday;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[3]/input")
    WebElement usernametrain;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[4]/input")
    WebElement passwordtrain;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[3]/div/input")
    WebElement signinbut;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement emailcgc;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement bussname;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
    WebElement weblink;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/textarea[1]")
    WebElement aboutme2;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/input[1]")
    WebElement trainsince;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/textarea[1]")
    WebElement philosophy;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[11]/div/div/label/span[1]")
    WebElement cash;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[12]/div/div/label/span[1]")
    WebElement check;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[13]/div/div/label/span[1]")
    WebElement creditcard;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[14]/div/div/label/span[1]")
    WebElement paypal;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[15]/div/div/label/span[1]")
    WebElement venmo;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[16]/div/div/label/span[1]")
    WebElement square;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[17]/div/div[1]/label/span[1]")
    WebElement other;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[17]/div[1]/div[2]/div[1]/input[1]")
    WebElement othertext;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[20]/div[1]/div[1]/input[1]")
    WebElement bussname2;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[21]/div[1]/div[1]/input[1]")
    WebElement street;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[22]/div[1]/div[1]/input[1]")
    WebElement street2;

    @FindBy(id = "react-select-2-input")
    WebElement zipcode;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[24]/div[1]/div[1]/input[1]")
    WebElement city;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[25]/div[1]/div[1]/input[1]")
    WebElement state;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[26]/div[1]/div[1]/input[1]")
    WebElement bussphone;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/form[1]/div[1]/div[27]/div[1]/div[1]/input[1]")
    WebElement bussemail;

    @FindBy(id = "onboarding-trainers-storefront-contact__submit")
    WebElement save1;

    @FindBy(xpath = "//*[@id='trainers-storefront-cover-photo']/div/div/div/input")
    WebElement uploadphoto;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/span")
    WebElement phcontinue;

    @FindBy(id = "onboarding-trainers-storefront-cover-photo__submit")
    WebElement save2;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/section[1]/div/div[1]/div/div/span")
    WebElement addmorefiles;

    @FindBy(id = "images")
    WebElement trainimages;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/div/div[3]/input")
    WebElement caption;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/div[1]/div/a")
    WebElement captioncontinue;

    @FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/section[2]/div[1]/div[1]/a[1]/*[1]")
    WebElement closeimages;

    @FindBy(id = "onboarding-trainers-storefront-media__submit")
    WebElement save3;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/section[2]/div/form/div/div[1]/div/div/div/div[1]/div[1]/div[1]")
    WebElement selectservices;

    @FindBy(id = "react-select-2-option-0")
    WebElement akcrally;

    @FindBy(id = "react-select-2-option-1")
    WebElement akcstarpuppy;

    @FindBy(id = "react-select-2-option-2")
    WebElement akcscent;

    @FindBy(id = "react-select-2-option-3")
    WebElement akctrick;

    @FindBy(id = "react-select-2-option-4")
    WebElement akcagility;

    @FindBy(id = "react-select-2-option-5")
    WebElement akcbarn;

    @FindBy(id = "react-select-2-option-6")
    WebElement akcbtcgc;

    @FindBy(id = "react-select-2-option-7")
    WebElement akcbtucgc;

    @FindBy(id = "react-select-2-option-8")
    WebElement akcbtacgc;

    @FindBy(id = "react-select-2-option-9")
    WebElement akcdockdiv;

    @FindBy(id = "react-select-2-option-10")
    WebElement akcearthdog;

    @FindBy(id = "react-select-2-option-11")
    WebElement akcfieldevents;

    @FindBy(id = "react-select-2-option-12")
    WebElement akcflyball;

    @FindBy(id = "react-select-2-option-13")
    WebElement akcfrisbee;

    @FindBy(id = "react-select-2-option-14")
    WebElement akcherding;

    @FindBy(id = "react-select-2-option-15")
    WebElement akclurecours;

    @FindBy(id = "react-select-2-option-16")
    WebElement akcshowhand;

    @FindBy(id = "react-select-2-option-17")
    WebElement akctracking;

    @FindBy(id = "onboarding-trainers-storefront-services__submit")
    WebElement save4;

    @FindBy(id = "onboarding-trainers-storefront-calendar__submit")
    WebElement save5;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > h4")
    WebElement profiletrain;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div > div.styled__PerformanceDetails-sc-iquegx-0.dXyKyN.dashboard__performance-details > div > div:nth-child(2) > p:nth-child(2)")
    WebElement servicetrain;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div > div.styled__PerformanceDetails-sc-iquegx-0.dXyKyN.dashboard__performance-details > div > div:nth-child(2) > p:nth-child(3)")
    WebElement jointrain;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div > div.styled__PerformanceDetails-sc-iquegx-0.dXyKyN.dashboard__performance-details > div > div:nth-child(2) > p:nth-child(4)")
    WebElement lastloginttrain;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div > div.styled__PerformanceDetails-sc-iquegx-0.dXyKyN.dashboard__performance-details > div > div:nth-child(2) > p:nth-child(5)")
    WebElement cgcemailtrain;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div > div.styled__PerformanceDetails-sc-iquegx-0.dXyKyN.dashboard__performance-details > div > div:nth-child(2) > a:nth-child(6)")
    WebElement updpasstrain;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div > div.styled__PerformanceDetails-sc-iquegx-0.dXyKyN.dashboard__performance-details > div > div:nth-child(2) > a:nth-child(7)")
    WebElement profpublic;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div > div.styled__PerformanceDetails-sc-iquegx-0.dXyKyN.dashboard__performance-details > div > div.profile-details__section.breeders > div.profile-details__avatar.bgc-shady > img")
    WebElement imgtraindash;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div > div.dashboard__performance-stats > div > p:nth-child(2) > span:nth-child(1)")
    WebElement totprofviews;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > section > div > div.dashboard__performance-stats > div > p:nth-child(3) > span")
    WebElement inquiries;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/div/div[2]/div[2]/div/a[1]")
    WebElement dashtrain;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/div/div[2]/div[2]/div/a[2]")
    WebElement messtrain;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/div/div[2]/div[2]/div/a[3]")
    WebElement manmypagetrain;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div[6]/div/div/main/div/div[2]/div[2]/div/a[4]")
    WebElement accounttrain;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/div/div[2]/div[2]/div/a[5]")
    WebElement calendartrain;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/div/div[2]/div[2]/div/a[6]")
    WebElement mypagetrain;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[1]/div[1]/img")
    WebElement imgmess;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[1]/div[1]/div")
    WebElement headermess;

    @FindBy(id = "conversations-scrolled-element")
    WebElement channels;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[1]/div[2]/div[2]/div/a/div[2]/p[1]")
    WebElement openconv;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[2]/div/div[3]")
    WebElement messagessent;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[2]/div/div[4]")
    WebElement messagesrec;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[3]/div[1]/div/form/div[3]/textarea")
    WebElement textarea;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[3]/div[1]/div/form/div[4]/input")
    WebElement sentmessagesbut;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div > div.Styled__Wrapper-sc-1ua1fsq-0.hrLcqJ > div > div > div.Styled__Wrapper-sc-sad8oe-0.kuvYpa.top-bar-wrapper > div.styled__Wrapper-sc-44lfr5-0.jVwmeq > div.styled__MenuHandle-sc-44lfr5-2.kZwlVU > button")
    WebElement manageButton;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div > div.Styled__Wrapper-sc-1ua1fsq-0.hrLcqJ > div > div > div.Styled__Wrapper-sc-sad8oe-0.kuvYpa.top-bar-wrapper > div.styled__Wrapper-sc-44lfr5-0.jVwmeq > div.styled__EditMenu-sc-44lfr5-1.bWHzdK > ul > div > div:nth-child(2) > li > span")
    WebElement blockmess;

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div > div.Styled__Wrapper-sc-1ua1fsq-0.hrLcqJ > div > div > div.Styled__Wrapper-sc-sad8oe-0.kuvYpa.top-bar-wrapper > div.styled__Wrapper-sc-44lfr5-0.jVwmeq > div.styled__EditMenu-sc-44lfr5-1.bWHzdK > ul > div > div:nth-child(1) > li > span")
    WebElement reportSpam;
    //

    @FindBy(css = "#react-root > div > div.dashboard.account-index > div > div > main > section > div > div > div.Styled__Wrapper-sc-1ua1fsq-0.hrLcqJ > div > div > div.Styled__Wrapper-sc-sad8oe-0.kuvYpa.top-bar-wrapper > div.styled__Wrapper-sc-44lfr5-0.jVwmeq > div.styled__EditMenu-sc-44lfr5-1.bWHzdK > ul > div > a > li")
    WebElement deleteConversation;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[1]/span")
    WebElement contacttrain;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[2]/a")
    WebElement coverphoto;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[3]/a")
    WebElement photosvideos;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[4]/a")
    WebElement services;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[1]/section/ul/li[5]/a")
    WebElement calendar;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/div[1]/h4")
    WebElement contactinfo;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement bussname01;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement weblinktrain;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/textarea[1]")
    WebElement aboutmetrain;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement ihavetrainsince;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[1]/textarea[1]")
    WebElement philosophytrain;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[10]/div")
    WebElement paymentmethods;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[19]/div[1]/div[1]/input[1]")
    WebElement bussname02;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[20]/div[1]/div[1]/input[1]")
    WebElement streetline1;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[22]/div/div/div/div[1]/div[1]")
    WebElement zipcodetrain;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[23]/div[1]/div[1]/input[1]")
    WebElement citytrain;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[24]/div[1]/div[1]/input[1]")
    WebElement statetrain;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[25]/div[1]/div[1]/input[1]")
    WebElement bussphonetrain;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[2]/form[1]/div[1]/div[26]/div[1]/div[1]/input[1]")
    WebElement bussemailtrain;

    @FindBy(id = "trainers-storefront-contact__submit")
    WebElement savetrainbut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/div[2]/h4")
    WebElement coverphotoheader;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div/img")
    WebElement coverimg;

    @FindBy(id = "storefront-cover-photo__button")
    WebElement changephotobut;

    @FindBy(id = "trainers-storefront-cover-photo__submit")
    WebElement covphosavebut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/div[2]")
    WebElement galimgheader;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/section[1]/div/div[1]/div")
    WebElement addmorefilestrain;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/section[1]/div/div[2]/div")
    WebElement pictsaved;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/section[1]/div/div[2]/div/div[2]/button")
    WebElement delpictbut;

    @FindBy(id = "trainers-storefront-media__submit")
    WebElement galimgsavebut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/section/button[2]")
    WebElement backacct;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[1]/div/div/div/div[1]/div[1]")
    WebElement avalservices;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]/div[1]/div")
    WebElement service01;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]/div[2]/div")
    WebElement service02;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]/div[3]/div")
    WebElement service03;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]/div[4]/div")
    WebElement service04;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div/div[2]/div[5]/div")
    WebElement service05;

    @FindBy(id = "trainers-storefront-services__submit")
    WebElement avalservsavebut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/h4")
    WebElement calendarclass;

    @FindBy(id = "single-picker-calendar")
    WebElement startdate;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div[2]/div/div/div/div[1]/div[1]")
    WebElement selectclass;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div[4]")
    WebElement addclass;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div[2]/form/div[6]/div[1]/div/div")
    WebElement openclass;

    @FindBy(id = "trainers-storefront-calendar__submit")
    WebElement saveclassdatebut;

    @FindBy(css = "#react-root > div > div:nth-child(4) > div > div.sc-fkyLDJ.ivpsCG > div.sc-jUpvKA.gPCAiH > div > h1")
    WebElement mypagepage;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/a/span")
    WebElement iconsignin;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[3]/input")
    WebElement userName;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[4]/input")
    WebElement passwordlog;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[3]/div/input")
    WebElement ingresar;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/div/a/span")
    WebElement logged;

    @FindBy(xpath = "//html/body/main/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/ul/li[1]/a")
    WebElement dashbreed;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/section/ul/li[1]/span")
    WebElement security;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/section/ul/li[2]/a")
    WebElement visibility;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/div/div[1]/h4")
    WebElement chanpasstext;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    WebElement oldpass;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")
    WebElement newpass;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]")
    WebElement confpass;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/div/div[1]/div/form/section/button[1]")
    WebElement chanpassbut;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/div/div[3]/div/h4")
    WebElement acctpubhid;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/div/div[3]/div/form/div/div/label[1]")
    WebElement publictrain;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/div/div[3]/div/form/div/div/label[2]")
    WebElement hiddentrain;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div[1]/div/div[3]/div/form/section/button[1]")
    WebElement savevisib;

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[1]/div/div[2]")
    WebElement successtrainer;



    //Helpers//

    //DriverFactory driverFactory;
    BrowserFactory browserFactory;

    WebDriver driver;
    /*Initialize WebDriver*/
    public Trainers(WebDriver _driver) {

        //driverFactory = new DriverFactory();
        browserFactory = new BrowserFactory();
        driver = _driver;
        PageFactory.initElements(driver, this);

    }

    /*Check SERP results*/
    public void CheckTrainers(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(trainers)).click();
        wait.until(ExpectedConditions.visibilityOf(trainersseek));
        wait.until(ExpectedConditions.visibilityOf(findtrain));
        wait.until(ExpectedConditions.visibilityOf(fortrain));
        wait.until(ExpectedConditions.visibilityOf(listtrain));
    }

    public void CheckTrainers1(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(trainers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findtrain)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findtrainbut)).click();
        wait.until(ExpectedConditions.visibilityOf(allresults));

    }

    public void CheckTrainers2(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(trainers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findtrain)).click();
        wait.until(ExpectedConditions.elementToBeClickable(traintype)).click();
        //traintypeInput.sendKeys("Rally");
        wait.until(ExpectedConditions.elementToBeClickable(AKCScentWork)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findtrainbut)).click();
        wait.until(ExpectedConditions.visibilityOf(AKCScentWorkResults));

    }


    public void CheckTrainers3(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(trainers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findtrain)).click();
        wait.until(ExpectedConditions.elementToBeClickable(traintype)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AKCScentWork)).click();
        wait.until(ExpectedConditions.elementToBeClickable(zip)).click();
        zipform.sendKeys("10001");
        wait.until(ExpectedConditions.elementToBeClickable(findtrainbut)).click();
        wait.until(ExpectedConditions.visibilityOf(zipresults));

    }

    public void CheckTrainers4(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(trainers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findtrain)).click();
        wait.until(ExpectedConditions.elementToBeClickable(traintype)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AKCScentWork)).click();
        wait.until(ExpectedConditions.elementToBeClickable(zip)).click();
        zipform.sendKeys("10001");
        wait.until(ExpectedConditions.elementToBeClickable(distance)).click();
        wait.until(ExpectedConditions.elementToBeClickable(distance)).click();
        //wait.until(ExpectedConditions.elementToBeClickable(miles)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findtrainbut)).click();
        wait.until(ExpectedConditions.visibilityOf(distresults));
        wait.until(ExpectedConditions.visibilityOf(trainlistpict));
        wait.until(ExpectedConditions.visibilityOf(trainlisthead));
        wait.until(ExpectedConditions.visibilityOf(trainlisttext));
        wait.until(ExpectedConditions.visibilityOf(trainadvert));

    }

    /*Check Trainers Homepage*/
    public void CheckTrainersHome(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(trainers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findtrain)).click();
        wait.until(ExpectedConditions.visibilityOf(trainserp));
        wait.until(ExpectedConditions.visibilityOf(looking));
        wait.until(ExpectedConditions.visibilityOf(traintype));
        wait.until(ExpectedConditions.visibilityOf(zip));
        wait.until(ExpectedConditions.visibilityOf(distance));
        wait.until(ExpectedConditions.visibilityOf(traintext));
        wait.until(ExpectedConditions.visibilityOf(results));
    }
    /*Check Trainer page*/
    public void CheckTrainersListPage(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(trainers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findtrain)).click();
        wait.until(ExpectedConditions.visibilityOf(trainlist2pict));
        wait.until(ExpectedConditions.visibilityOf(train2name));
        wait.until(ExpectedConditions.visibilityOf(train2type));
        wait.until(ExpectedConditions.visibilityOf(train2address));
        wait.until(ExpectedConditions.elementToBeClickable(trainlist2pict)).click();
        wait.until(ExpectedConditions.visibilityOf(messtrainbut));
        wait.until(ExpectedConditions.visibilityOf(aboutme));
        wait.until(ExpectedConditions.visibilityOf(aboutmetext));
        wait.until(ExpectedConditions.visibilityOf(howtrain));
        wait.until(ExpectedConditions.visibilityOf(howtraintext));
        wait.until(ExpectedConditions.visibilityOf(whattrain));
        wait.until(ExpectedConditions.visibilityOf(whattrain2));
        wait.until(ExpectedConditions.visibilityOf(acceptedpayment));
        //wait.until(ExpectedConditions.visibilityOf(createacc)); This was removed and replaced by "Login to get in touch!"
        wait.until(ExpectedConditions.visibilityOf(signin));

    }
    /*Get Trainer Subscription*/
    public void GetTrainerSubscription (Classes _testClasses) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(trainers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(listtrain)).click();
        wait.until(ExpectedConditions.visibilityOf(trainerpicture));
        wait.until(ExpectedConditions.visibilityOf(whybecome));
        wait.until(ExpectedConditions.visibilityOf(whybecometext));
        wait.until(ExpectedConditions.visibilityOf(trainerpicture2));
        wait.until(ExpectedConditions.visibilityOf(getstarted));
        wait.until(ExpectedConditions.visibilityOf(currentcgc));
        wait.until(ExpectedConditions.visibilityOf(currentcgctext));
        wait.until(ExpectedConditions.visibilityOf(createprofile));
        wait.until(ExpectedConditions.visibilityOf(cgcevaluator));
        wait.until(ExpectedConditions.visibilityOf(cgcevaluatortext));
        wait.until(ExpectedConditions.visibilityOf(applytoday));
        wait.until(ExpectedConditions.elementToBeClickable(createprofile)).click();
        usernametrain.sendKeys(_testClasses.BusinessEmail);
        passwordtrain.sendKeys(_testClasses.Password);
        wait.until(ExpectedConditions.elementToBeClickable(signinbut)).click();
        wait.until(ExpectedConditions.elementToBeClickable(createprofile)).click();
        emailcgc.sendKeys(_testClasses.Email);
        bussname.sendKeys(_testClasses.Businessname);
        wait.until(ExpectedConditions.visibilityOf(weblink));
        aboutme2.sendKeys(_testClasses.Aboutme);
        trainsince.sendKeys(_testClasses.Businesssince);
        philosophy.sendKeys(_testClasses.Philosophy);
        wait.until(ExpectedConditions.elementToBeClickable(cash)).click();
        wait.until(ExpectedConditions.elementToBeClickable(check)).click();
        wait.until(ExpectedConditions.elementToBeClickable(creditcard)).click();
        wait.until(ExpectedConditions.elementToBeClickable(paypal)).click();
        wait.until(ExpectedConditions.elementToBeClickable(venmo)).click();
        wait.until(ExpectedConditions.elementToBeClickable(square)).click();
        wait.until(ExpectedConditions.elementToBeClickable(other)).click();
        othertext.sendKeys(_testClasses.Other);
        bussname2.sendKeys(_testClasses.Businessname);
        street.sendKeys(_testClasses.Street);
        wait.until(ExpectedConditions.visibilityOf(street2));
        zipcode.sendKeys(_testClasses.ZIP);
        wait.until(ExpectedConditions.visibilityOf(city));
        wait.until(ExpectedConditions.visibilityOf(state));
        bussphone.sendKeys(_testClasses.BusinessPhone);
        bussemail.sendKeys(_testClasses.BusinessEmail);
        wait.until(ExpectedConditions.elementToBeClickable(save1)).click();
        uploadphoto.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\linkedinimage.jpg");
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(phcontinue));
        wait.until(ExpectedConditions.elementToBeClickable(phcontinue)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(save2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addmorefiles));
        wait.until(ExpectedConditions.elementToBeClickable(addmorefiles)).click();
        trainimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\boxer2.jpg");
        caption.sendKeys("Trainer");
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(captioncontinue)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closeimages));
        wait.until(ExpectedConditions.elementToBeClickable(closeimages)).click();
        wait.until(ExpectedConditions.elementToBeClickable(save3));
        wait.until(ExpectedConditions.elementToBeClickable(save3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices));
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcrally)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcstarpuppy)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcscent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akctrick)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcagility)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcbarn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcbtcgc)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcbtucgc)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcbtacgc)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcdockdiv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcearthdog)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcfieldevents)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcflyball)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcfrisbee)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcherding)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akclurecours)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcshowhand)).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akctracking)).click();
        wait.until(ExpectedConditions.elementToBeClickable(save4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(save5)).click();
        wait.until(ExpectedConditions.visibilityOf(successtrainer));


    }


    public void CheckTrainersDashboard(User _testUser) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.visibilityOf(dashtrain)); //update this one
        wait.until(ExpectedConditions.visibilityOf(messtrain));
        wait.until(ExpectedConditions.visibilityOf(manmypagetrain));
        wait.until(ExpectedConditions.visibilityOf(accounttrain));
        wait.until(ExpectedConditions.visibilityOf(calendartrain));
        wait.until(ExpectedConditions.visibilityOf(mypagetrain));
        wait.until(ExpectedConditions.visibilityOf(profiletrain));
        wait.until(ExpectedConditions.visibilityOf(servicetrain));
        wait.until(ExpectedConditions.visibilityOf(jointrain));
        wait.until(ExpectedConditions.visibilityOf(lastloginttrain));
        wait.until(ExpectedConditions.visibilityOf(cgcemailtrain));
        wait.until(ExpectedConditions.visibilityOf(updpasstrain));
        wait.until(ExpectedConditions.visibilityOf(profpublic));
        wait.until(ExpectedConditions.visibilityOf(imgtraindash));
        wait.until(ExpectedConditions.visibilityOf(totprofviews));
        wait.until(ExpectedConditions.visibilityOf(inquiries));

    }


    public void CheckTrainersMessenger(User _testUser)  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(messtrain)).click(); //update this one
        wait.until(ExpectedConditions.visibilityOf(imgmess));
        wait.until(ExpectedConditions.visibilityOf(headermess));
        wait.until(ExpectedConditions.visibilityOf(channels));
        wait.until(ExpectedConditions.elementToBeClickable(openconv)).click();
        wait.until(ExpectedConditions.visibilityOf(messagessent)); //Need to update the trainers account to check on sent messages
        wait.until(ExpectedConditions.visibilityOf(messagesrec));
        wait.until(ExpectedConditions.visibilityOf(textarea));
        wait.until(ExpectedConditions.visibilityOf(sentmessagesbut));
        wait.until(ExpectedConditions.elementToBeClickable(manageButton)).click();
        wait.until(ExpectedConditions.visibilityOf(reportSpam));
        wait.until(ExpectedConditions.visibilityOf(blockmess));
        wait.until(ExpectedConditions.visibilityOf(deleteConversation));


    }

    public void CheckTrainersManMypage(User _testUser) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(manmypagetrain)).click(); //update this one
        wait.until(ExpectedConditions.visibilityOf(contacttrain));
        wait.until(ExpectedConditions.visibilityOf(coverphoto));
        wait.until(ExpectedConditions.visibilityOf(photosvideos));
        wait.until(ExpectedConditions.visibilityOf(services));
        wait.until(ExpectedConditions.visibilityOf(calendar));
        wait.until(ExpectedConditions.visibilityOf(contactinfo));
        wait.until(ExpectedConditions.visibilityOf(bussname01));
        wait.until(ExpectedConditions.visibilityOf(weblinktrain));
        wait.until(ExpectedConditions.visibilityOf(aboutmetrain));
        wait.until(ExpectedConditions.visibilityOf(ihavetrainsince));
        wait.until(ExpectedConditions.visibilityOf(philosophytrain));
        wait.until(ExpectedConditions.visibilityOf(paymentmethods));
        wait.until(ExpectedConditions.visibilityOf(bussname02));
        wait.until(ExpectedConditions.visibilityOf(streetline1));
        wait.until(ExpectedConditions.visibilityOf(zipcodetrain));
        wait.until(ExpectedConditions.visibilityOf(citytrain));
        wait.until(ExpectedConditions.visibilityOf(statetrain));
        wait.until(ExpectedConditions.visibilityOf(bussphonetrain));
        wait.until(ExpectedConditions.visibilityOf(bussemailtrain));
        wait.until(ExpectedConditions.elementToBeClickable(savetrainbut)).click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(coverphoto));
        wait.until(ExpectedConditions.elementToBeClickable(coverphoto)).click();
        wait.until(ExpectedConditions.visibilityOf(coverphotoheader));
        wait.until(ExpectedConditions.visibilityOf(coverimg));
        wait.until(ExpectedConditions.visibilityOf(changephotobut));
        wait.until(ExpectedConditions.visibilityOf(covphosavebut));
        wait.until(ExpectedConditions.elementToBeClickable(photosvideos)).click();
        wait.until(ExpectedConditions.visibilityOf(galimgheader));
        wait.until(ExpectedConditions.visibilityOf(addmorefilestrain));
        wait.until(ExpectedConditions.visibilityOf(pictsaved));
        wait.until(ExpectedConditions.visibilityOf(delpictbut));
        wait.until(ExpectedConditions.visibilityOf(galimgsavebut));
        wait.until(ExpectedConditions.visibilityOf(backacct));
        wait.until(ExpectedConditions.elementToBeClickable(services)).click();
        wait.until(ExpectedConditions.visibilityOf(avalservices));
        wait.until(ExpectedConditions.visibilityOf(service01));
        wait.until(ExpectedConditions.visibilityOf(service02));
        wait.until(ExpectedConditions.visibilityOf(service03));
        wait.until(ExpectedConditions.visibilityOf(service04));
        wait.until(ExpectedConditions.visibilityOf(service05));
        wait.until(ExpectedConditions.visibilityOf(avalservsavebut));
        wait.until(ExpectedConditions.elementToBeClickable(calendar)).click();
        wait.until(ExpectedConditions.visibilityOf(calendarclass));
        wait.until(ExpectedConditions.visibilityOf(startdate));
        wait.until(ExpectedConditions.visibilityOf(selectclass));
        wait.until(ExpectedConditions.visibilityOf(addclass));
        wait.until(ExpectedConditions.visibilityOf(openclass));
        wait.until(ExpectedConditions.visibilityOf(saveclassdatebut));



    }


    public void CheckTrainersAccount(User _testUser)  {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(accounttrain)).click(); //update this one
        wait.until(ExpectedConditions.visibilityOf(security)); //check
        wait.until(ExpectedConditions.visibilityOf(visibility));
        wait.until(ExpectedConditions.visibilityOf(chanpasstext));
        wait.until(ExpectedConditions.visibilityOf(oldpass));
        wait.until(ExpectedConditions.visibilityOf(newpass));
        wait.until(ExpectedConditions.visibilityOf(confpass));
        wait.until(ExpectedConditions.visibilityOf(chanpassbut));
        wait.until(ExpectedConditions.elementToBeClickable(visibility)).click();
        wait.until(ExpectedConditions.visibilityOf(acctpubhid));
        wait.until(ExpectedConditions.visibilityOf(publictrain));
        wait.until(ExpectedConditions.visibilityOf(hiddentrain));
        wait.until(ExpectedConditions.visibilityOf(savevisib));

    }

    public void CheckTrainersMyPage(User _testUser) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        userName.sendKeys(_testUser.username);
        passwordlog.sendKeys(_testUser.password);
        wait.until(ExpectedConditions.elementToBeClickable(ingresar)).click();
        Actions action = new Actions(driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        wait.until(ExpectedConditions.elementToBeClickable(dashbreed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(mypagetrain)).click(); //update this one
        wait.until(ExpectedConditions.urlContains("/account/trainer"));
        //wait.until(ExpectedConditions.visibilityOf(mypagepage));

    }


}
