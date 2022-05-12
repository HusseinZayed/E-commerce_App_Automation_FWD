package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_Login {

    public WebDriver driver;

    public P2_Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(className = "ico-login")
    WebElement loginHeader;
    @FindBy(id = "Email")
    WebElement emailInput;

    @FindBy(id = "Password")
    WebElement passwordInput;

    @FindBy(xpath = "//div[@class=\"returning-wrapper fieldset\" ]/form/div[@class=\"buttons\"]/button")
    WebElement loginBTN;

    @FindBy(className = "ico-logout")
    WebElement logoutBTN;



    public void stepsLogin(String email , String password){
        emailInput.clear();
        emailInput.sendKeys(email);
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLoginBTN() {
        loginBTN.click();
    }

    public void clickLogoutBTN() {
        logoutBTN.click();
    }

    public void doAssertLogin() {
        Assert.assertTrue("Login_Assertion",logoutBTN.isDisplayed());
    }

    public void go_to_login_page() {
        loginHeader.click();
    }
}
