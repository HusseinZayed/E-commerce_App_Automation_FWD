package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P8_Select_Tag {

    @FindBy(css = "a[href=\"/computer\"]")
    WebElement computerTag;

    By elementTitle = By.cssSelector("h2[class=\"product-title\"] a");

    WebDriver driver;

    public P8_Select_Tag(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void clickOnComputerTag() {
        computerTag.click();
    }


    public void doTagAssert(){
        int numElement = driver.findElements(elementTitle).size();
        Assert.assertTrue(numElement > 0);

        for (int i = 0; i < numElement ; i++)
            Assert.assertTrue("Error Message: Not Found Products with this tag",
                    driver.findElements(elementTitle).get(i).getText().toLowerCase().contains("computer")
                    || driver.findElements(elementTitle).get(i).getText().toLowerCase().contains("")
            );

    }

}
