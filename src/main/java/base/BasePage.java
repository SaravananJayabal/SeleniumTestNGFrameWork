package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtils;

public class BasePage {

    protected WebDriver driver;
    protected WaitUtils waitUtils;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    protected void click(By locator) {
        waitUtils.waitForClickable(locator).click();
    }

    protected void type(By locator, String text) {
        waitUtils.waitForVisibility(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        return waitUtils.waitForVisibility(locator).getText();
    }

    protected boolean isDisplayed(By locator) {
        return waitUtils.waitForVisibility(locator).isDisplayed();
    }
}