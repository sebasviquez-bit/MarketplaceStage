package Specs;

import Helpers.DataHelper;
import Model.*;
import Pages.Homepage;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class MPTestSuite extends SpecsBaseClass {


    /*Register User*/
    @Test (dataProvider = "RegisterUsers", dataProviderClass = DataHelper.class)
    public void SuccessfulRegister(String sUserName, String sFirstName, String sLastName, String sPassword1, String sPassword2)  {

        User testUser;
        testUser = new User(sUserName, sFirstName, sLastName, sPassword1, sPassword2);
        register.registerUser(testUser);

    }
    /*Login User*/
    @Test (dataProvider = "ExistingUsers", dataProviderClass = DataHelper.class)
    public void SuccessfulLogin(String sEmail, String sPassword)  {

        User testUser = new User(sEmail, sPassword);
        signIn.signInUser(testUser);

    }
    /*Login Breeder*/
    @Test (dataProvider = "BreederSignInUsers", dataProviderClass = DataHelper.class)
    public void BreederSignIn(String sEmail, String sPassword)  {

        User testUser = new User(sEmail, sPassword);
        puppies.signInBreeder(testUser);

    }

    /*Activate Listing*/
    //@Test (dataProvider = "BreederActListing", dataProviderClass = DataHelper.class)

    public void BreederListAct(String sEmail, String sPassword, String sLitNum, String sDamRegNum, String sDamCert, String sCreditCard, String sExpDate, String sCVV, String sFirstName, String sLastName, String sAddress, String sZIP, String sPhone, String sVariety, String sDesc, String sPrice, String sHealthvacc, String sYoutube, String sKenname, String sWeblink, String sDescken, String sBreedsince, String sWebsite) throws InterruptedException {

        Listing testListing = new Listing(sEmail, sPassword, sLitNum, sDamRegNum, sDamCert, sCreditCard,sExpDate,sCVV,sFirstName,sLastName,sAddress,sZIP,sPhone,sVariety,sDesc,sPrice,sHealthvacc, sYoutube, sKenname,sWeblink,sDescken,sBreedsince,sWebsite);
        puppies.ActListing(testListing);

    }

    /*Create Listing*/
    //@Test (dataProvider = "BreederCreateListing", dataProviderClass = DataHelper.class)

    public void BreederCreateList(String sEmail, String sPassword, String sLitNum, String sDamRegNum, String sDamCert, String sCreditCard, String sExpDate, String sCVV, String sFirstName, String sLastName, String sAddress, String sZIP, String sPhone, String sVariety, String sDesc, String sPrice, String sHealthvacc, String sYoutube, String sKenname, String sWeblink, String sDescken, String sBreedsince, String sWebsite) throws InterruptedException {

        Listing testListing = new Listing(sEmail, sPassword, sLitNum, sDamRegNum, sDamCert, sCreditCard,sExpDate,sCVV,sFirstName,sLastName,sAddress,sZIP,sPhone,sVariety,sDesc,sPrice,sHealthvacc, sYoutube, sKenname,sWeblink,sDescken,sBreedsince,sWebsite);
        puppies.CreaListing(testListing);


    }

    /*Subscription Annual*/
    //@Test (dataProvider = "BreederPurchSubs", dataProviderClass = DataHelper.class)

    public void BreederPurchSubs(String sEmail, String sPassword, String sCreditCard, String sExpDate, String sCVV, String sFirstName, String sLastName, String sAddress, String sZIP, String sPhone, String sKenname, String sWeblink, String sDescken, String sBreedsince, String sWebsite, String sAddress2, String sZIP2, String sPhone2) throws InterruptedException {

        Subscription testSubscription = new Subscription(sEmail, sPassword, sCreditCard,sExpDate,sCVV,sFirstName,sLastName,sAddress,sZIP,sPhone,sKenname,sWeblink,sDescken,sBreedsince,sWebsite,sAddress2,sZIP2,sPhone2);
        puppies.PurchaseSubs(testSubscription);

        //For this test to properly run you need to add a new account on the .xlsx

    }

    /*Subscription Monthly*/
    //@Test (dataProvider = "BreederPurchSubs2", dataProviderClass = DataHelper.class)

    public void BreederPurchSubsMonth(String sEmail, String sPassword, String sCreditCard, String sExpDate, String sCVV, String sFirstName, String sLastName, String sAddress, String sZIP, String sPhone, String sKenname, String sWeblink, String sDescken, String sBreedsince, String sWebsite, String sAddress2, String sZIP2, String sPhone2) throws InterruptedException {

        Subscription testSubscription = new Subscription(sEmail, sPassword, sCreditCard,sExpDate,sCVV,sFirstName,sLastName,sAddress,sZIP,sPhone,sKenname,sWeblink,sDescken,sBreedsince,sWebsite,sAddress2,sZIP2,sPhone2);
        puppies.PurchaseSubsMonth(testSubscription);

        //For this test to properly run you need to add a new account on the .xlsx

    }

    /*Annual Groomer*/
    //@Test (dataProvider = "ServiceGroomer", dataProviderClass = DataHelper.class)

    public void GroomerAnnualService(String sEmail, String sPassword, String sCreditCard, String sExpDate, String sCVV, String sFirstName, String sLastName, String sStreet, String sZIP, String sBusinessPhone, String sBusinessname, String sWeblink, String sAboutme, String sBusinesssince, String sBusinessEmail, String sPricemin, String sPricemax, String sDescserv, String sPackTitle, String sPriceminpack, String sPricemaxpack, String sDescpack, String sSpeTitle, String sPriceminspe, String sPricemaxspe, String sDescspe) throws InterruptedException {

        Service testService = new Service(sEmail, sPassword, sCreditCard,sExpDate,sCVV,sFirstName,sLastName,sStreet,sZIP,sBusinessPhone,sBusinessname,sWeblink,sAboutme,sBusinesssince,sBusinessEmail,sPricemin,sPricemax,sDescserv, sPackTitle,sPriceminpack,sPricemaxpack,sDescpack,sSpeTitle,sPriceminspe,sPricemaxspe,sDescspe);
        groomers.AnnualGroomers(testService);

        //this has to be fixed on stage to run the test

    }
    /*Quaterly Groomer*/
    //@Test (dataProvider = "ServiceGroomer2", dataProviderClass = DataHelper.class)

    public void GroomerQuatService(String sEmail, String sPassword, String sCreditCard, String sExpDate, String sCVV, String sFirstName, String sLastName, String sStreet, String sZIP, String sBusinessPhone, String sBusinessname, String sWeblink, String sAboutme, String sBusinesssince, String sBusinessEmail, String sPricemin, String sPricemax, String sDescserv, String sPackTitle, String sPriceminpack, String sPricemaxpack, String sDescpack, String sSpeTitle, String sPriceminspe, String sPricemaxspe, String sDescspe) throws InterruptedException {

        Service testService = new Service(sEmail, sPassword, sCreditCard,sExpDate,sCVV,sFirstName,sLastName,sStreet,sZIP,sBusinessPhone,sBusinessname,sWeblink,sAboutme,sBusinesssince,sBusinessEmail,sPricemin,sPricemax,sDescserv, sPackTitle,sPriceminpack,sPricemaxpack,sDescpack,sSpeTitle,sPriceminspe,sPricemaxspe,sDescspe);
        groomers.QuatGroomers(testService);

        //this has to be fixed on stage to run the test

    }
    /*Trainer Class*/
    //@Test (dataProvider = "ClassTrainer", dataProviderClass = DataHelper.class)

    public void TrainerClass(String sEmail, String sPassword, String sCreditCard, String sExpDate, String sCVV, String sFirstName, String sLastName, String sStreet, String sZIP, String sBusinessPhone, String sBusinessname, String sWeblink, String sAboutme, String sBusinesssince, String sBusinessEmail, String sPhilosophy, String sOther) throws InterruptedException {

        Classes testClasses = new Classes(sEmail, sPassword, sCreditCard,sExpDate,sCVV,sFirstName,sLastName,sStreet,sZIP,sBusinessPhone,sBusinessname,sWeblink,sAboutme,sBusinesssince,sBusinessEmail,sPhilosophy,sOther);
        trainers.GetTrainerSubscription(testClasses);


    }
    /*Homepage tests*/
    @Test
    public void HomepageCheck()  {

        homepage.CheckHomepage();

    }

    @Test
    public void PupButtCheck() {

        homepage.CheckPupbutt();

    }

    @Test
    public void TrainButtCheck() {

        homepage.CheckTrainbutt();

    }

    @Test
    public void AKCCheck() {

        homepage.CheckAKC();

    }

    @Test
    public void ShopCheck() {

        homepage.CheckShop();

    }

    @Test
    public void PupForm2Check() {

        homepage.CheckPupform2();

    }

    @Test
    public void GroomForm2Check() {

        homepage.CheckGroomform2();

    }

    @Test
    public void TrainForm2Check() {

        homepage.CheckTrainform2();

    }

    @Test
    public void PupListCheck() {

        homepage.CheckPupList();

    }

    @Test
    public void GroomListCheck() {

        homepage.CheckGroomList();

    }

    @Test
    public void TrainListCheck() {

        homepage.CheckTrainList();

    }

    @Test
    public void CarrouselHCheck() {

        homepage.CheckCarrousel();

    }

    @Test
    public void NewsletterCheck() {

        homepage.CheckNewsletter();

    }

    @Test
    public void GoodWorksCheck() {

        homepage.CheckGoodWorks();

    }

    @Test
    public void TermsofuseCheck() {

        homepage.CheckTermsofuse();

    }

    @Test
    public void ShopCheckH() {

        homepage.CheckShop();

    }

    @Test
    public void PrivacyCheck() {

        homepage.CheckPrivacy();

    }

    @Test
    public void FacebookCheck() {

        homepage.CheckFacebook();

    }

    //@Test
    public void TwitterCheck() {

        homepage.CheckTwitter();

    }

    //@Test
    public void InstagramCheck() {

        homepage.CheckInstagram();

    }

    //@Test
    public void YoutubeCheck() {

        homepage.CheckYoutube();

    }

    //@Test
    public void PinterestCheck() {

        homepage.CheckPinterest();

    }
    /*Check Puppies tests*/
    @Test
    public void PuppiesCheck() {

        puppies.CheckPuppies();

    }

    @Test
    public void PuppiesCheck1() {

        puppies.CheckPuppies1();

    }

    //@Test
    public void PuppiesCheck2() {

        puppies.CheckPuppies2(); //this menu was replaced by Resources for getting puppy content

    }

    //@Test
    public void PuppiesCheck3() {

        puppies.CheckPuppies3(); //this menu was replaced by Resources for getting puppy content

    }

    //@Test
    public void PuppiesCheck4() {

        puppies.CheckPuppies4(); //this menu was replaced by Resources for getting puppy content

    }

    //@Test
    public void PuppiesCheck5() {

        puppies.CheckPuppies5(); //this menu was replaced by Resources for getting puppy content

    }

    @Test
    public void PuppiesCheck6() {

        puppies.CheckPuppies6();

    }

    @Test
    public void PuppiesCheck7() {

        puppies.CheckPuppies7();

    }

    @Test
    public void PuppiesCheck8() {

        puppies.CheckPuppies8();

    }

    //@Test
    public void PuppiesCheck9() {

        puppies.CheckPuppies9(); //this menu was replaced by Resources for getting puppy content

    }

    //@Test
    public void PuppiesCheck10() {

        puppies.CheckPuppies10(); //This was related to old FAQ page

    }

    @Test
    public void CheckPuppies11(){

        puppies.CheckPuppies11();

    }

    @Test
    public void MarkSubsPageCheck() {

        puppies.CheckBreederListingPage();

    }


    @Test
    public void PuppiesHomeCheck() {

        puppies.CheckPuppiesHome();

    }

    @Test
    public void PuppiesSearchBreed() {

        puppies.CheckSearchBreed();

    }

    @Test
    public void PuppiesSearchBreed1() {

        puppies.CheckSearchBreed1();

    }

    @Test
    public void PuppiesSearchBreed2() {

        puppies.CheckSearchBreed2();

    }

    @Test
    public void PuppiesSearchBreed3() {

        puppies.CheckSearchBreed3();

    }

    @Test
    public void PuppiesSearchBreedNow() {

        puppies.CheckSearchBreedNow();

    }

    @Test
    public void PuppiesSearchBreedSmall() {

        puppies.CheckSearchBreedSmall();

    }

    @Test
    public void PuppiesSearchBreedLarge() {

        puppies.CheckSearchBreedLarge();

    }

    @Test
    public void PuppiesSearchBreedInList() {

        puppies.CheckSearchBreedInList();

    }

    @Test
    public void PuppiesSearchBreedBom() {

        puppies.CheckSearchBreedBom();

    }

    @Test
    public void PuppiesSearchBreedBwh() {

        puppies.CheckSearchBreedBwh();

    }

    @Test
    public void PuppiesSearchBreedYes() {

        puppies.CheckSearchBreedYes();

    }

    @Test
    public void PuppiesSearchBreedNational() {

        puppies.CheckSearchBreedNational();

    }

    @Test
    public void PuppiesSearchBreedSpecial() {

        puppies.CheckSearchBreedSpecial();

    }

    /*Check Puppies Homepage functionality*/
    @Test
    public void CarrouselCheck() {

        puppies.CheckCarrousel();

    }

    @Test
    public void HowDecideCheck() {

        puppies.CheckHowDecide();

    }

    @Test
    public void ThingstoCheck() {

        puppies.CheckThingsto();

    }

    @Test
    public void NewPupCheck() {

        puppies.CheckOwner();

    }

    @Test
    public void QuestionsAskCheck() {

        puppies.CheckQuestionAsk();

    }

    @Test
    public void BOMCheck() {

        puppies.CheckBOM();

    }

    @Test
    public void BwhCheck() {

        puppies.CheckBwh();

    }

    @Test
    public void ClubCheck() {

        puppies.CheckClub();

    }

    @Test
    public void ChampCheck() {

        puppies.CheckChamp();

    }

    @Test
    public void RegisterCheck() {

        puppies.CheckRegister();

    }

    @Test
    public void CreateListCheck() {

        puppies.CheckCreateaList();

    }

    @Test
    public void CheckSearchListingPage()  {

        puppies.CheckSearchBreedListingPage();

    }

    @Test
    public void CheckAlertMeMessage() throws InterruptedException {

        puppies.CheckAlertMe();

    }


    @Test
    public void CheckSearchBreederList()  {

        puppies.CheckSearchBreedList();

    }

    //@Test
    public void PuppyVisorPageCheck()  {

        puppies.CheckPuppyvisorPage();   //PuppyVisor is available in prod

    }


    @Test(dataProvider = "BreederSignInUsers2", dataProviderClass = DataHelper.class)
    public void BreederDashVerify(String sEmail1, String sPassword1)   {

        User testUser = new User(sEmail1, sPassword1);
        puppies.VerifiyDashboard(testUser);

    }

    //@Test(dataProvider = "BreederSignInUsers3", dataProviderClass = DataHelper.class)
    public void BreederMessVerify(String sEmail1, String sPassword1)   {

        User testUser = new User(sEmail1, sPassword1);
        puppies.VerifiyMessenger(testUser);

    }

    @Test(dataProvider = "BreederSignInUsers4", dataProviderClass = DataHelper.class)
    public void BreederManmypageVerify(String sEmail1, String sPassword1)   {

        User testUser = new User(sEmail1, sPassword1);
        puppies.VerifiyManmypage(testUser);

    }

    @Test(dataProvider = "BreederSignInUsers5", dataProviderClass = DataHelper.class)
    public void BreederManmylistingPage(String sEmail1, String sPassword1)   {

        User testUser = new User(sEmail1, sPassword1);
        puppies.VerifiyManmylisting(testUser);

    }

    @Test(dataProvider = "BreederSignInUsers6", dataProviderClass = DataHelper.class)
    public void BreederManmyQuestionnaire(String sEmail1, String sPassword1)  {

        User testUser = new User(sEmail1, sPassword1);
        puppies.VerifiyMyBuyerQuest(testUser);

    }

    @Test(dataProvider = "BreederSignInUsers7", dataProviderClass = DataHelper.class)
    public void BreederManmyAccount(String sEmail1, String sPassword1)   {

        User testUser = new User(sEmail1, sPassword1);
        puppies.VerifiyMyAcoount(testUser);

    }

    @Test(dataProvider = "BreederSignInUsers8", dataProviderClass = DataHelper.class)
    public void BreederManmyPage(String sEmail1, String sPassword1)   {

        User testUser = new User(sEmail1, sPassword1);
        puppies.VerifiyMyPage(testUser);

    }

    @Test(dataProvider = "BreederSignInUsers2", dataProviderClass = DataHelper.class)
    public void messageBreederFromPuppysPage(String sEmail1, String sPassword1)   {

        User testUser = new User(sEmail1, sPassword1);
        puppies.messageBreeder(testUser);

    }

    @Test
    public void ResourcesForGettingPupAboutPage()  {

        puppies.ResourcesForGettingPupAboutPage();

    }


    /*Check Groomer tests*/
    @Test
    public void GroomersCheck() {

        groomers.CheckGroomers();

    }

    @Test
    public void GroomersCheck1() {

        groomers.CheckGroomers1();

    }

    @Test
    public void GroomersCheck2() {

        groomers.CheckGroomers2();

    }

    @Test
    public void GroomersCheck3() {

        groomers.CheckGroomers3();

    }

    @Test
    public void GroomersCheck4() {

        groomers.CheckGroomers4();

    }

    @Test
    public void GroomHomeCheck() {

        groomers.CheckGroomHome();

    }

    @Test
    public void AllResultsCheck() {

        groomers.CheckAllResults();

    }

    @Test
    public void BathResultsCheck() {

        groomers.CheckBathResults();

    }

    @Test
    public void ZipResultsCheck() {

        groomers.CheckZipResults();

    }

    @Test
    public void DistResultsCheck() {

        groomers.CheckDistResults();

    }

    @Test
    public void List1Check() {

        groomers.CheckList1();

    }

    @Test
    public void Safe1Check() {

        groomers.CheckSafe1();

    }

    @Test
    public void Safe2Check() {

        groomers.CheckSafe2();

    }

    @Test
    public void List2Check() {

        groomers.CheckList2();

    }

    @Test
    public void GroomPageListCheck()  {

        groomers.CheckGroomListPage();

    }

    @Test
    public void GroomPageCheck()  {

        groomers.CheckGroomPage();

    }

    //@Test(dataProvider = "GroomerSignInUsers2", dataProviderClass = DataHelper.class)
    public void GroomerDashVerify(String sEmail1, String sPassword1) throws InterruptedException  {

        User testUser = new User(sEmail1, sPassword1);
        groomers.VerifiyDashGroom(testUser);

    }

    //@Test(dataProvider = "GroomerSignInUsers3", dataProviderClass = DataHelper.class)
    public void GroomerMessengerVerify(String sEmail1, String sPassword1)  {

        User testUser = new User(sEmail1, sPassword1);
        groomers.VerifiyMessenger(testUser);

    }


    //@Test(dataProvider = "GroomerSignInUsers4", dataProviderClass = DataHelper.class)
    public void GroomerManMyPageVerify(String sEmail1, String sPassword1) throws InterruptedException  {

        User testUser = new User(sEmail1, sPassword1);
        groomers.VerifiyManMypage(testUser);

    }

    //@Test(dataProvider = "GroomerSignInUsers5", dataProviderClass = DataHelper.class)
    public void GroomerAccountVerify(String sEmail1, String sPassword1) throws InterruptedException  {

        User testUser = new User(sEmail1, sPassword1);
        groomers.VerifiyMyAccountGroom(testUser);

    }

    //@Test(dataProvider = "GroomerSignInUsers6", dataProviderClass = DataHelper.class)
    public void GroomerMyPageVerify(String sEmail1, String sPassword1) throws InterruptedException  {

        User testUser = new User(sEmail1, sPassword1);
        groomers.VerifiyMyPage(testUser);


    }

    /*Check ListMarketplace tests*/
    @Test
    public void ListMarketplaceCheck() {

        listMarketplace.CheckListMarketplace();

    }

    @Test
    public void ListMarketplaceCheck1() {

        listMarketplace.CheckListMarketplace1();

    }

    @Test
    public void ListMarketplaceCheck2() {

        listMarketplace.CheckListMarketplace2();

    }

    @Test
    public void ListMarketplaceCheck3() {

        listMarketplace.CheckListMarketplace3();

    }

    /*Check Trainer tests*/
    @Test
    public void TrainersCheck() {

        trainers.CheckTrainers();

    }

    @Test
    public void Trainers1Check() {

        trainers.CheckTrainers1();

    }

    @Test
    public void Trainers2Check() {

        trainers.CheckTrainers2();

    }

    @Test
    public void Trainers3Check() {

        trainers.CheckTrainers3();

    }

    @Test
    public void Trainers4Check() {

        trainers.CheckTrainers4();

    }


    @Test
    public void TrainersHomeCheck() {

        trainers.CheckTrainersHome();

    }

    @Test
    public void TrainListPageCheck()  {

        trainers.CheckTrainersListPage();

    }

    @Test(dataProvider = "TrainSignInUsers2", dataProviderClass = DataHelper.class)
    public void TrainerDashVerify(String sEmail1, String sPassword1)   {

        User testUser = new User(sEmail1, sPassword1);
        trainers.CheckTrainersDashboard(testUser);

    }

    @Test(dataProvider = "TrainSignInUsers3", dataProviderClass = DataHelper.class)
    public void TrainerMessVerify(String sEmail1, String sPassword1)   {

        User testUser = new User(sEmail1, sPassword1);
        trainers.CheckTrainersMessenger(testUser);

    }

    @Test(dataProvider = "TrainSignInUsers4", dataProviderClass = DataHelper.class)
    public void TrainerManmypageVerify(String sEmail1, String sPassword1) throws InterruptedException  {

        User testUser = new User(sEmail1, sPassword1);
        trainers.CheckTrainersManMypage(testUser);

    }

    @Test(dataProvider = "TrainSignInUsers5", dataProviderClass = DataHelper.class)
    public void TrainerAcctVerify(String sEmail1, String sPassword1)   {

        User testUser = new User(sEmail1, sPassword1);
        trainers.CheckTrainersAccount(testUser);

    }

    @Test(dataProvider = "TrainSignInUsers6", dataProviderClass = DataHelper.class)
    public void TrainerMyPageVerify(String sEmail1, String sPassword1)   {

        User testUser = new User(sEmail1, sPassword1);
        trainers.CheckTrainersMyPage(testUser);

    }

    @Test(dataProvider = "BreederSignInUsers4", dataProviderClass = DataHelper.class)
    public void VerifyTellUsMore(String sEmail1, String sPassword1){

        User testUser = new User(sEmail1, sPassword1);
        puppies.VerifyTellUsMore(testUser);

    }

    @Test(dataProvider = "PCTLoginGermanPinscher", dataProviderClass = DataHelper.class)
    public void pctLoginGermanPinscher (String sPassword) {

        pct.PCTLoginGermanPinscher(sPassword);

    }

    @Test
    public void pctLoginFoxTerrier () {

        pct.PCTLoginFoxTerrier();
    }

    //Visual tests

    @Test
    public void MPHomePage () {

        driver.get().navigate().to("https://stage.marketplace.akc.org/");
        eyes.open(driver.get(), "MP", "MPHomePage");
        eyes.check("MPHomePage", Target.window());
        eyes.close();

    }

    @Test
    public void MPFindPuppyPage () {

        driver.get().navigate().to("https://stage.marketplace.akc.org/search-puppies");
        eyes.open(driver.get(), "MP", "PuppyPage");
        eyes.check("PuppyPage", Target.window());
        eyes.close();

    }

    @Test
    public void MPPoodleBreedPage () {

        driver.get().navigate().to("https://stage.marketplace.akc.org/puppies/poodle?");
        eyes.open(driver.get(), "MP", "PoodleBreedPage");
        eyes.check("PoodleBreedPage", Target.window());
        eyes.close();

    }

    @Test
    public void MPResourcesPuppy () {

        driver.get().navigate().to("https://stage.marketplace.akc.org/about-akc-marketplace");
        eyes.open(driver.get(), "MP", "ResourcesPuppy");
        eyes.check("ResourcesPuppy", Target.window());
        eyes.close();

    }

    @Test
    public void MPAdvertise () {

        driver.get().navigate().to("https://stage.marketplace.akc.org/advertise/breeders");
        eyes.open(driver.get(), "MP", "AdvertiseLitterPage");
        eyes.check("Advertise", Target.window());
        eyes.close();

    }

    @Test
    public void MPFindGroomersPage () {

        driver.get().navigate().to("https://stage.marketplace.akc.org/search-groomers");
        eyes.open(driver.get(), "MP", "FindGroomersPage");
        eyes.check("FindGroomersPage", Target.window());
        eyes.close();

    }


    @Test
    public void MPGroomersList () {

        driver.get().navigate().to("https://stage.marketplace.akc.org/groomers?");
        eyes.open(driver.get(), "MP", "GroomersList");
        eyes.check("GroomersList", Target.window());
        eyes.close();

    }

    @Test
    public void MPTrainers () {

        driver.get().navigate().to("https://stage.marketplace.akc.org/trainers");
        eyes.open(driver.get(), "MP", "trainers");
        eyes.check("trainers", Target.window());
        eyes.close();

    }

    @Test
    public void MPListing () {

        driver.get().navigate().to("https://stage.marketplace.akc.org/breeder/ja-doe-210/poodle/395");
        eyes.open(driver.get(), "MP", "Listing");
        eyes.check("breederListing", Target.window());
        eyes.close();

    }

    //@Test
    public void PercyMP () {

        driver.get().navigate().to("https://stage.marketplace.akc.org/");
        //percy.snapshot("Homepage");
    }



}


    





