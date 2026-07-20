package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import utilities.ConfigReader;

public class HomeTest extends BaseTest {
    @Test
    public void openHome() throws InterruptedException {

        driver.get(ConfigReader.getProperty("url"));

//        System.out.println("Home Test Executed");

        System.out.println(Thread.currentThread().getId());

        Thread.sleep(5000);


    }



}
