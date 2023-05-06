package Pages;

import Helpers.BrowserFactory;
import Helpers.DriverHelper;
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

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[3]/div[1]/div/div[3]/div[1]/a[1]/div/div[1]/div/div")
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

    @FindBy(xpath = "//html/body/main/div/div/div[4]/div/div[4]/div[2]/div/div[2]/div[2]/div/form/div[6]/button")
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

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/div/div[2]/div[2]/div/a[4]")
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

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[3]/div[2]/span")
    WebElement messmenu;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[3]/div[1]/ul/div/div/li/span")
    WebElement blockmess;

    @FindBy(xpath = "//html/body/div[5]/div/div/div[5]/div/div/main/section/div/div/div[2]/div/div/div[1]/div[3]/div[1]/ul/div/a/li")
    WebElement deletemess;

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
    DriverHelper driverHelper;
    //DriverFactory driverFactory;
    BrowserFactory browserFactory;

    WebDriver driver;
    /*Initialize WebDriver*/
    public Trainers(WebDriver _driver) {

        //this.driverFactory = new DriverFactory();
        this.browserFactory = new BrowserFactory();
        this.driver = _driver;
        PageFactory.initElements(driver, this);

    }

    /*Check SERP results*/
    public void CheckTrainers(){

        this.trainers.click();
        this.trainersseek.isDisplayed();
        this.findtrain.isDisplayed();
        this.fortrain.isDisplayed();
        this.listtrain.isDisplayed();
    }

    public void CheckTrainers1(){

        this.trainers.click();
        this.findtrain.click();
        this.findtrainbut.click();
        this.allresults.isDisplayed();

    }

    public void CheckTrainers2(){

        this.trainers.click();
        this.findtrain.click();
        this.traintype.click();
        //this.traintypeInput.sendKeys("Rally");
        this.AKCScentWork.click();
        this.findtrainbut.click();
        this.AKCScentWorkResults.isDisplayed();

    }


    public void CheckTrainers3(){

        this.trainers.click();
        this.findtrain.click();
        this.traintype.click();
        this.AKCScentWork.click();
        this.zip.click();
        this.zipform.sendKeys("10001");
        this.findtrainbut.click();
        this.zipresults.isDisplayed();

    }

    public void CheckTrainers4(){

        this.trainers.click();
        this.findtrain.click();
        this.traintype.click();
        this.AKCScentWork.click();
        this.zip.click();
        this.zipform.sendKeys("10001");
        this.distance.click();
        this.distance.click();
        //this.miles.click();
        this.findtrainbut.click();
        this.distresults.isDisplayed();
        this.trainlistpict.isDisplayed();
        this.trainlisthead.isDisplayed();
        this.trainlisttext.isDisplayed();
        this.trainadvert.isDisplayed();

    }

    /*Check Trainers Homepage*/
    public void CheckTrainersHome(){

        this.trainers.click();
        this.findtrain.click();
        this.trainserp.isDisplayed();
        this.looking.isDisplayed();
        this.traintype.isDisplayed();
        this.zip.isDisplayed();
        this.distance.isDisplayed();
        this.traintext.isDisplayed();
        this.results.isDisplayed();
    }
    /*Check Trainer page*/
    public void CheckTrainersListPage(){

        this.trainers.click();
        this.findtrain.click();
        this.trainlist2pict.isDisplayed();
        this.train2name.isDisplayed();
        this.train2type.isDisplayed();
        this.train2address.isDisplayed();
        this.trainlist2pict.click();
        this.messtrainbut.isDisplayed();
        this.aboutme.isDisplayed();
        this.aboutmetext.isDisplayed();
        this.howtrain.isDisplayed();
        this.howtraintext.isDisplayed();
        this.whattrain.isDisplayed();
        this.whattrain2.isDisplayed();
        this.acceptedpayment.isDisplayed();
        this.createacc.isDisplayed();
        this.signin.isDisplayed();

    }
    /*Get Trainer Subscription*/
    public void GetTrainerSubscription (Classes _testClasses) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.trainers.click();
        this.listtrain.click();
        this.trainerpicture.isDisplayed();
        this.whybecome.isDisplayed();
        this.whybecometext.isDisplayed();
        this.trainerpicture2.isDisplayed();
        this.getstarted.isDisplayed();
        this.currentcgc.isDisplayed();
        this.currentcgctext.isDisplayed();
        this.createprofile.isDisplayed();
        this.cgcevaluator.isDisplayed();
        this.cgcevaluatortext.isDisplayed();
        this.applytoday.isDisplayed();
        this.createprofile.click();
        this.usernametrain.sendKeys(_testClasses.BusinessEmail);
        this.passwordtrain.sendKeys(_testClasses.Password);
        this.signinbut.click();
        this.createprofile.click();
        this.emailcgc.sendKeys(_testClasses.Email);
        this.bussname.sendKeys(_testClasses.Businessname);
        this.weblink.isDisplayed();
        this.aboutme2.sendKeys(_testClasses.Aboutme);
        this.trainsince.sendKeys(_testClasses.Businesssince);
        this.philosophy.sendKeys(_testClasses.Philosophy);
        this.cash.click();
        this.check.click();
        this.creditcard.click();
        this.paypal.click();
        this.venmo.click();
        this.square.click();
        this.other.click();
        this.othertext.sendKeys(_testClasses.Other);
        this.bussname2.sendKeys(_testClasses.Businessname);
        this.street.sendKeys(_testClasses.Street);
        this.street2.isDisplayed();
        this.zipcode.sendKeys(_testClasses.ZIP);
        this.city.isDisplayed();
        this.state.isDisplayed();
        this.bussphone.sendKeys(_testClasses.BusinessPhone);
        this.bussemail.sendKeys(_testClasses.BusinessEmail);
        this.save1.click();
        this.uploadphoto.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\linkedinimage.jpg");
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(phcontinue));
        this.phcontinue.click();
        sleep(2000);
        this.save2.click();
        wait.until(ExpectedConditions.elementToBeClickable(addmorefiles));
        this.addmorefiles.click();
        this.trainimages.sendKeys("C:\\Users\\Jonathan Blanco\\Pictures\\boxer2.jpg");
        this.caption.sendKeys("Trainer");
        sleep(2000);
        this.captioncontinue.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(closeimages));
        this.closeimages.click();
        wait.until(ExpectedConditions.elementToBeClickable(save3));
        this.save3.click();
        wait.until(ExpectedConditions.elementToBeClickable(selectservices));
        this.selectservices.click();
        this.akcrally.click();
        this.selectservices.click();
        this.akcstarpuppy.click();
        this.selectservices.click();
        this.akcscent.click();
        this.selectservices.click();
        this.akctrick.click();
        this.selectservices.click();
        this.akcagility.click();
        this.selectservices.click();
        this.akcbarn.click();
        this.selectservices.click();
        this.akcbtcgc.click();
        this.selectservices.click();
        this.akcbtucgc.click();
        this.selectservices.click();
        this.akcbtacgc.click();
        this.selectservices.click();
        this.akcdockdiv.click();
        this.selectservices.click();
        this.akcearthdog.click();
        this.selectservices.click();
        this.akcfieldevents.click();
        this.selectservices.click();
        this.akcflyball.click();
        this.selectservices.click();
        this.akcfrisbee.click();
        this.selectservices.click();
        this.akcherding.click();
        this.selectservices.click();
        this.akclurecours.click();
        this.selectservices.click();
        this.akcshowhand.click();
        this.selectservices.click();
        this.akctracking.click();
        this.save4.click();
        this.save5.click();
        this.successtrainer.isDisplayed();


    }


    public void CheckTrainersDashboard(User _testUser) {


        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.dashtrain.isDisplayed();
        this.messtrain.isDisplayed();
        this.manmypagetrain.isDisplayed();
        this.accounttrain.isDisplayed();
        this.calendartrain.isDisplayed();
        this.mypagetrain.isDisplayed();
        this.profiletrain.isDisplayed();
        this.servicetrain.isDisplayed();
        this.jointrain.isDisplayed();
        this.lastloginttrain.isDisplayed();
        this.cgcemailtrain.isDisplayed();
        this.updpasstrain.isDisplayed();
        this.profpublic.isDisplayed();
        this.imgtraindash.isDisplayed();
        this.totprofviews.isDisplayed();
        this.inquiries.isDisplayed();





    }


    public void CheckTrainersMessenger(User _testUser)  {


        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.messtrain.click();
        this.imgmess.isDisplayed();
        this.headermess.isDisplayed();
        this.channels.isDisplayed();
        this.openconv.click();
        this.messagessent.isDisplayed();
        this.messagesrec.isDisplayed();
        this.textarea.isDisplayed();
        this.sentmessagesbut.isDisplayed();
        this.messmenu.click();
        this.blockmess.isDisplayed();
        this.deletemess.isDisplayed();


    }

    public void CheckTrainersManMypage(User _testUser) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.manmypagetrain.click();
        this.contacttrain.isDisplayed();
        this.coverphoto.isDisplayed();
        this.photosvideos.isDisplayed();
        this.services.isDisplayed();
        this.calendar.isDisplayed();
        this.contactinfo.isDisplayed();
        this.bussname01.isDisplayed();
        this.weblinktrain.isDisplayed();
        this.aboutmetrain.isDisplayed();
        this.ihavetrainsince.isDisplayed();
        this.philosophytrain.isDisplayed();
        this.paymentmethods.isDisplayed();
        this.bussname02.isDisplayed();
        this.streetline1.isDisplayed();
        this.zipcodetrain.isDisplayed();
        this.citytrain.isDisplayed();
        this.statetrain.isDisplayed();
        this.bussphonetrain.isDisplayed();
        this.bussemailtrain.isDisplayed();
        this.savetrainbut.click();
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(coverphoto));
        this.coverphoto.click();
        this.coverphotoheader.isDisplayed();
        this.coverimg.isDisplayed();
        this.changephotobut.isDisplayed();
        this.covphosavebut.isDisplayed();
        this.photosvideos.click();
        this.galimgheader.isDisplayed();
        this.addmorefilestrain.isDisplayed();
        this.pictsaved.isDisplayed();
        this.delpictbut.isDisplayed();
        this.galimgsavebut.isDisplayed();
        this.backacct.isDisplayed();
        this.services.click();
        this.avalservices.isDisplayed();
        this.service01.isDisplayed();
        this.service02.isDisplayed();
        this.service03.isDisplayed();
        this.service04.isDisplayed();
        this.service05.isDisplayed();
        this.avalservsavebut.isDisplayed();
        this.calendar.click();
        this.calendarclass.isDisplayed();
        this.startdate.isDisplayed();
        this.selectclass.isDisplayed();
        this.addclass.isDisplayed();
        this.openclass.isDisplayed();
        this.saveclassdatebut.isDisplayed();



    }


    public void CheckTrainersAccount(User _testUser)  {


        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.accounttrain.click();
        this.security.isDisplayed();
        this.visibility.isDisplayed();
        this.chanpasstext.isDisplayed();
        this.oldpass.isDisplayed();
        this.newpass.isDisplayed();
        this.confpass.isDisplayed();
        this.chanpassbut.isDisplayed();
        this.visibility.click();
        this.acctpubhid.isDisplayed();
        this.publictrain.isDisplayed();
        this.hiddentrain.isDisplayed();
        this.savevisib.isDisplayed();

    }

    public void CheckTrainersMyPage(User _testUser) {

        this.iconsignin.click();
        this.userName.sendKeys(_testUser.username);
        this.passwordlog.sendKeys(_testUser.password);
        this.ingresar.click();
        Actions action = new Actions(this.driver);
        action.moveToElement(logged).perform();
        action.moveToElement(logged).click();
        this.dashbreed.click();
        this.mypagetrain.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/account/trainer"));
        //this.mypagepage.isDisplayed();

    }
}
