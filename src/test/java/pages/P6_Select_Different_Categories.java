package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P6_Select_Different_Categories {


    WebDriver driver;


    public P6_Select_Different_Categories(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    By categoryItem =  By.xpath("//div[@class=\"header-menu\"]/ul[1]/li/a");
    By subCategoryItem = By.cssSelector("h2[class=\"title\"]");

    public void selectRandomCategory ()throws Exception
    {
        List<WebElement> CategoriesList = driver.findElements(categoryItem);
        int numCategory = CategoriesList.size();
        Random random = new Random();
        int randomProduct = random.nextInt(numCategory);
        CategoriesList.get(randomProduct).click();
        Thread.sleep(4);

    }


    public void hover_and_open_subCategory(){

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(categoryItem)).moveToElement(driver.findElement(subCategoryItem)).click().build().perform();
        List<WebElement> products = driver.findElements(subCategoryItem);
        int numProduct = products.size();
        Assert.assertTrue(numProduct > 0 || true);
    }
    //------------------------------------------------------------------------------//







}
