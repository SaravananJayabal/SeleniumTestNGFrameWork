package tests;

import org.testng.annotations.Test;

public class SkipPractice {

    @Test
    public void login() {

        System.out.println("Login");

    }

    @Test (enabled = false)
    public void payment() {

        System.out.println("Payment");

    }
}
