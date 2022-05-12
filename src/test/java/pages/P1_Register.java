package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1_Register {
    public WebDriver driver;

    public P1_Register(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(className = "ico-register")
    WebElement registerHeader;

    @FindBy(id= "FirstName")
    WebElement firstNameInput;

    @FindBy(id= "LastName")
    WebElement lastNameInput;

    @FindBy(id= "Email")
    WebElement emailInput;

    @FindBy(id= "Password")
    WebElement passwordInput;

    @FindBy(id= "ConfirmPassword")
    WebElement confirmPasswordInput;


    @FindBy(id = "register-button")
    WebElement registerBTN;

    @FindBy(id = "ico-logout")
    WebElement logoutBTN;

    @FindBy(css = "a[class^=\"button-1\"]")
    WebElement continueBTN;



    public void stepsRegister(String firstName , String lastName , String email , String password , String confirmPassword){

        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
        emailInput.clear();
        emailInput.sendKeys(email);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    public void clickRegisterBTN() {
        registerBTN.click();
    }

    public void clickLogoutBTN() {
        logoutBTN.click();
    }

    public void doAssertRegister() {
        Assert.assertTrue("Register_Assertion",continueBTN.isDisplayed());
    }

    public void go_to_register_page() {
        registerHeader.click();
    }
}
