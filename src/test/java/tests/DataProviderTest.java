package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][]{
                {"Admin", "Admin123"},
                {"User", "User123"},
                {"Guest", "Guest123"}
        };
    }

    @Test(dataProvider = "loginData")
    public void login(String username, String password) {

        System.out.println(username + " : " + password);

    }


}
