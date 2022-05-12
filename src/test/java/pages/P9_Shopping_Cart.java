package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P9_Shopping_Cart {

    WebDriver driver;


    By first_product= By.xpath("//div[@data-productid='25']");
    By cart_first_product=By.id("add-to-cart-button-25");

    By chooseSize= By.id("product_attribute_9");
    By successaddtoshopping=By.xpath("//*[@id=\"bar-notification\"]/div/p");

    public P9_Shopping_Cart(WebDriver driver) {
        this.driver=driver;
    }
    public void addFirstProduct(){
        driver.findElement(first_product).click();
        Select select = new Select(driver.findElement(chooseSize));
        select.selectByIndex(1);
        driver.findElement(cart_first_product).click();
    }

    public void doAddCartAssertion(){
        Assert.assertTrue(driver.findElement(successaddtoshopping).getText().contains("The product has been added"));
    }
}
