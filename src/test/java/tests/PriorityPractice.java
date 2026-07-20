package tests;

import org.testng.annotations.Test;

public class PriorityPractice {

    @Test(priority = 1)
    public void login() {
        System.out.println("Login");
    }

    @Test(priority = 2)
    public void search() {
        System.out.println("Search");
    }

    @Test(priority = 3)
    public void addToCart() {
        System.out.println("Add To Cart");
    }

    @Test(priority = 4)
    public void payment() {
        System.out.println("Payment");
    }

    @Test(priority = 5)
    public void logout() {
        System.out.println("Logout");
    }


}
