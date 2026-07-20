package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private WebDriver driver;

    private By lblProducts = By.className("title");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return getText(lblProducts);
    }
}
