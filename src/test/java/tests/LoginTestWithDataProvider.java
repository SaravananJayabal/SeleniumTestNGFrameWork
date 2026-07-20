//package tests;
//
//import base.BaseTest;
//import dataproviders.LoginDataProvider;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.HomePage;
//import pages.LoginPage;
//import utilities.ConfigReader;
//
//public class LoginTestWithDataProvider extends BaseTest {
//
//
//    @Test (dataProvider = "loginData",
//            dataProviderClass= LoginDataProvider.class)
//    public void verifySuccessfulLoginTest(String user,String pass){
//
//        driver.get(ConfigReader.getProperty("url"));
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.login(user,pass);
//
//        HomePage homePage = new HomePage(driver);
//
//        Assert.assertEquals(homePage.getPageTitle(),"Products");
////        System.out.println("Test Passed");
//
//    }
//}
