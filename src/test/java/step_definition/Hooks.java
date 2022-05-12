package step_definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.P2_Login;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;



    @Before
    public static void user_opens_chrome_browser()
    {

//        System.setProperty("webdriver.chrome.driver","/home/hussein/IdeaProjects/First_Script/src/main/resources/chromedriver");
//        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    @After
    public static void user_closes_the_driver() throws Exception {
        Thread.sleep(5);
        driver.quit();
    }

}
