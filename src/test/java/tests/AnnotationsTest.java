package tests;

import org.testng.annotations.*;

public class AnnotationsTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("1. Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("2. Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("3. Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("4. Before Method");
    }

    @Test
    public void test1() {
        System.out.println("5. Test 1");
    }

    @Test
    public void test2() {
        System.out.println("6. Test 2");
    }

    @Test
    public void test3() {
        System.out.println("7. Test 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("8. After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("9. After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("10. After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("11. After Suite");
    }
}
