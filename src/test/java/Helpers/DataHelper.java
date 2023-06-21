package Helpers;

import org.testng.annotations.DataProvider;

public class DataHelper {

    public DataHelper(){
    }

    /*Define Data resources*/
    @DataProvider(name="ExistingUsers")
    public static Object[][] credentialsExisting0() throws Exception {

       return ExcelHelper.getTableArray("SignInBreeder.xlsx","Sheet1", 2);
    }

    @DataProvider(name="BreederSignInUsers")
    public static Object[][] credentialsExisting() throws Exception {

        return ExcelHelper.getTableArray("SignInBreeder.xlsx","Sheet1", 2);
    }

    @DataProvider(name="BreederSignInUsers2")
    public static Object[][] credentialsExisting2() throws Exception {

        return ExcelHelper.getTableArray("SignInBreeder.xlsx","Sheet1", 2);
    }

    @DataProvider(name="BreederSignInUsers3")
    public static Object[][] credentialsExisting3() throws Exception {

        return ExcelHelper.getTableArray("SignInBreeder.xlsx","Sheet1", 2);
    }

    @DataProvider(name="BreederSignInUsers4")
    public static Object[][] credentialsExisting4() throws Exception {

        return ExcelHelper.getTableArray("SignInBreeder.xlsx","Sheet1", 2);
    }

    @DataProvider(name="BreederSignInUsers5")
    public static Object[][] credentialsExisting5() throws Exception {

        return ExcelHelper.getTableArray("SignInBreeder.xlsx","Sheet1", 2);
    }

    @DataProvider(name="BreederSignInUsers6")
    public static Object[][] credentialsExisting6() throws Exception {

        return ExcelHelper.getTableArray("SignInBreeder.xlsx","Sheet1", 2);
    }

    @DataProvider(name="BreederSignInUsers7")
    public static Object[][] credentialsExisting7() throws Exception {

        return ExcelHelper.getTableArray("SignInBreeder.xlsx","Sheet1", 2);
    }

    @DataProvider(name="BreederSignInUsers8")
    public static Object[][] credentialsExisting8() throws Exception {

        return ExcelHelper.getTableArray("SignInBreeder.xlsx","Sheet1", 2);
    }

    @DataProvider(name="GroomerSignInUsers2")
    public static Object[][] credentialsExisting9() throws Exception {

        return ExcelHelper.getTableArray("SignInGroomer.xlsx","Sheet1", 2);
    }

    @DataProvider(name="GroomerSignInUsers3")
    public static Object[][] credentialsExisting10() throws Exception {

        return ExcelHelper.getTableArray("SignInGroomer.xlsx","Sheet1", 2);
    }

    @DataProvider(name="GroomerSignInUsers4")
    public static Object[][] credentialsExisting11() throws Exception {

        return ExcelHelper.getTableArray("SignInGroomer.xlsx","Sheet1", 2);
    }

    @DataProvider(name="GroomerSignInUsers5")
    public static Object[][] credentialsExisting12() throws Exception {

        return ExcelHelper.getTableArray("SignInGroomer.xlsx","Sheet1", 2);
    }

    @DataProvider(name="GroomerSignInUsers6")
    public static Object[][] credentialsExisting13() throws Exception {

        return ExcelHelper.getTableArray("SignInGroomer.xlsx","Sheet1", 2);
    }

    @DataProvider(name="BreederCreateListing")
    public static Object[][] registerListing() throws Exception {

        return ExcelHelper.getTableArray("CreateListing.xlsx","Sheet1", 23);
    }

    @DataProvider(name="BreederActListing")
    public static Object[][] registerListing2() throws Exception {

        return ExcelHelper.getTableArray("ActListing.xlsx","Sheet1", 23);
    }

    @DataProvider(name="BreederPurchSubs")
    public static Object[][] purchaseSubs() throws Exception {

        return ExcelHelper.getTableArray("PurchSusc.xlsx","Sheet1", 18);
    }

    @DataProvider(name="BreederPurchSubs2")
    public static Object[][] purchaseSubs2() throws Exception {

        return ExcelHelper.getTableArray("PurchSuscMont.xlsx","Sheet1", 18);
    }

    @DataProvider(name="ServiceGroomer")
    public static Object[][] purchaseGroomService() throws Exception {

        return ExcelHelper.getTableArray("GroomerService.xlsx","Sheet1", 26);
    }

    @DataProvider(name="ServiceGroomer2")
    public static Object[][] purchaseGroomService2() throws Exception {

        return ExcelHelper.getTableArray("GroomerServiceQuat.xlsx","Sheet1", 26);
    }

    @DataProvider(name="ClassTrainer")
    public static Object[][] purchaseTrainClass() throws Exception {

        return ExcelHelper.getTableArray("TrainerClass.xlsx","Sheet1", 17);
    }

    @DataProvider(name="RegisterUsers")
    public static Object[][] credentialsRegister() throws Exception {

        return CsvHelper.getCSVArray("RegisterUser.csv");

    }

    @DataProvider(name="TrainSignInUsers2")
    public static Object[][] credentialsExisting15() throws Exception {

        return ExcelHelper.getTableArray("SignInTrainer.xlsx","Sheet1", 2);
    }

    @DataProvider(name="TrainSignInUsers3")
    public static Object[][] credentialsExisting16() throws Exception {

        return ExcelHelper.getTableArray("SignInTrainer.xlsx","Sheet1", 2);
    }

    @DataProvider(name="TrainSignInUsers4")
    public static Object[][] credentialsExisting17() throws Exception {

        return ExcelHelper.getTableArray("SignInTrainer.xlsx","Sheet1", 2);
    }

    @DataProvider(name="TrainSignInUsers5")
    public static Object[][] credentialsExisting18() throws Exception {

        return ExcelHelper.getTableArray("SignInTrainer.xlsx","Sheet1", 2);
    }

    @DataProvider(name="TrainSignInUsers6")
    public static Object[][] credentialsExisting19() throws Exception {

        return ExcelHelper.getTableArray("SignInTrainer.xlsx","Sheet1", 2);
    }

    @DataProvider(name="PCTLoginGermanPinscher")
    public static Object[][] PCT1() throws Exception {

        return ExcelHelper.getTableArray("PCTGermanPinscher.xlsx","Sheet1", 1);
    }


}
