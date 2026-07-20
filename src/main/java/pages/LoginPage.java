package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private WebDriver driver;

    private By txtUsername = By.id("user-name");
    private By txtPassword = By.id("password");
    private By buttonLogin = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

//    public void enterUsername(String username){
//      type(txtUsername,username);
//    }
//
//    public void enterPassword(String password){
//        type(txtPassword,password);
//    }
//
//    public void clickLogin(){
//      click(buttonLogin);
//    }

//    public void login(String username,String password){
//        enterUsername(username);
//        enterPassword(password);
//        clickLogin();
//    }


    public void login(String username,String password){
        type(txtUsername,username);
        type(txtPassword,password);
        click(buttonLogin);
    }








}
