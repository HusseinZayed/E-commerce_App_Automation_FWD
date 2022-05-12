package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P3_Reset_Password {

    public WebDriver driver;

    public P3_Reset_Password(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(className = "ico-login")
    WebElement loginHeader;
    @FindBy(id = "Email")
    WebElement emailInput;

    @FindBy(name = "send-email")
    WebElement recoverBTN;

    @FindBy(xpath = "//div[@class=\"returning-wrapper fieldset\" ]/form/div[@class=\"buttons\"]/button")
    WebElement loginBTN;

    @FindBy(css = "a[href=\"/passwordrecovery\"]")
    WebElement forgetPasswordBTN;

    @FindBy(css="p[class=\"content\"]")
    WebElement notificationText;



    public void setEmail(String email ){
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void clickLoginBTN() {
        loginBTN.click();
    }

    public void clickForgetPassword() {
        forgetPasswordBTN.click();
    }

    public void doAssertReset() {
        String expectedResult="Email with instructions has been sent to you.";
        String actualResult = notificationText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    public void resetPassword() {
        recoverBTN.click();
    }

    public void go_to_login_page() {
        loginHeader.click();
    }


}
