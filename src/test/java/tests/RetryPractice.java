package tests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryPractice {

    static int count = 0;

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void retryTest() {

        count++;

        System.out.println("Executing Test...");

        if(count < 3){

            Assert.fail();

        }

    }

}
