package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class P4_Search {

    public WebDriver driver;

    public P4_Search(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "small-searchterms")
    WebElement searchInput;
    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
    WebElement searchBTN;
    @FindBy(className = "product-item")
    By assertPOM;




    public void setProductName(String name){
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(name);

    }

    public void clickSearchBTN() {
        searchBTN.click();
    }


    public void doAssertSearch() throws Exception{

        Thread.sleep(5);

        int numElements = driver.findElements(assertPOM).size();  //2
        Assert.assertTrue(numElements > 0);

        ArrayList<String> productList = new ArrayList<>();
        for (int i = 0; i < numElements ; i++) {
            productList.add(driver.findElements(assertPOM).get(i).getText());
            Assert.assertTrue("Error Message: Product Not Found",driver.findElements(assertPOM).get(i).getText().toLowerCase().contains("book"));
        }

    }

}
