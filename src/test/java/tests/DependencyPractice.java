package tests;

import org.testng.annotations.Test;
import org.testng.Assert;

public class DependencyPractice {

    @Test
    public void login() {

        System.out.println("Login");
        Assert.fail();

//        Assert.assertTrue(true);
}

    @Test(dependsOnMethods = "login")
    public void search() {

        System.out.println("Search");

    }

    @Test(dependsOnMethods = "search")
    public void payment() {

        System.out.println("Payment");

    }
}
