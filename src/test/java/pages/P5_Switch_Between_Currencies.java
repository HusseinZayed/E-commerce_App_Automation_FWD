package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class P5_Switch_Between_Currencies {


    public WebDriver driver;
    int currencyFlag;
    Select select;

    public P5_Switch_Between_Currencies(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "customerCurrency")
    WebElement currenciesList;

    By switchCurrPOM = By.id("customerCurrency");

    public void switchToDifferentCurrency(int IndexCurrencyValue){

        currenciesList.click();
        select=new Select(driver.findElement(switchCurrPOM));
        select.selectByIndex(IndexCurrencyValue);
        currencyFlag = IndexCurrencyValue;
    }


    public void doAssertSwitchCurrencies() {

        Assert.assertTrue("currency not selected",driver.findElement(switchCurrPOM).isDisplayed());

    }


    }
