package tests;

import org.testng.annotations.Test;

public class GroupPractice {

    @Test(groups = {"Smoke", "Regression"})
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(groups = "Smoke")
    public void searchTest() {
        System.out.println("Search Test");
    }

    @Test(groups = "Regression")
    public void cartTest() {
        System.out.println("Cart Test");
    }

    @Test(groups = "Regression")
    public void paymentTest() {
        System.out.println("Payment Test");
    }

    @Test(groups = "Sanity")
    public void profileTest() {
        System.out.println("Profile Test");
    }
}
