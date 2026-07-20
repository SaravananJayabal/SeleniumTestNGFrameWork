package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;


public class LoginTest extends BaseTest {

    @Test
    public void verifySuccessfulLogin() throws InterruptedException {
        driver.get(ConfigReader.getProperty("url"));
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(ConfigReader.getProperty("username")
        ,ConfigReader.getProperty("password"));

        HomePage homePage = new HomePage(driver);

        Assert.assertEquals(homePage.getPageTitle(),"Products");
//        System.out.println("Test Passed");
        System.out.println(Thread.currentThread().getId());

        Thread.sleep(5000);


    }

}
