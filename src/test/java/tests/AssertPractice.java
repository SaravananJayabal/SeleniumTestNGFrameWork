package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertPractice {

    @Test
    public void verifyTitle() {

        String expected = "Products";
        String actual = "Products";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void verifyTrue() {

        Assert.assertTrue(10 > 5);

    }
    @Test
    public void verifyNull() {

        String name = null;

        Assert.assertNull(name);

    }

    @Test
    public void verifyNotNull() {

        String name = "Saro";

        Assert.assertNotNull(name);
    }

    @Test // hard Assert
    public void loginTest() {

        System.out.println("Step 1");

        Assert.assertEquals("Home","Products");

        System.out.println("Step 2");
    }

    @Test
    public void softAssertExample() {

        SoftAssert softAssert = new SoftAssert();

        System.out.println("Step 1");

        softAssert.assertEquals(
                "Home",
                "Products");

        System.out.println("Step 2");

        softAssert.assertTrue(true);

        System.out.println("Step 3");

        softAssert.assertAll();

    }


}
