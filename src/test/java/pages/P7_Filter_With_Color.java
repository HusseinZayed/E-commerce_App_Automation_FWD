package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P7_Filter_With_Color {


    By categoryElement = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/a");
    By subCategoryElement = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/ul/li[1]/a");
    @FindBy(id = "attribute-option-16")
    WebElement colorFlag;
    @FindBy(css = "div[class=\"picture\"]")
    WebElement pictureResult;
    WebDriver driver;

    public P7_Filter_With_Color(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void goToShoesSubCategory() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(categoryElement)).moveToElement(driver.findElement(subCategoryElement)).click().build().perform();
    }

    public void chooseBlueColor() {
        colorFlag.click();
    }

    public void doFilterAssert(){
        Assert.assertTrue("Error Message: Not Found Result With This The color!",pictureResult.isDisplayed());
    }
}
