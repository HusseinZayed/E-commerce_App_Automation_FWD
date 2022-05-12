package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.P2_Login;

public class SD2_Login {

    P2_Login p2_login;

    @Given("user navigate to login page")
    public void user_navigate_to_login_page() {
        p2_login =new P2_Login(Hooks.driver);
        p2_login.go_to_login_page();

    }

    @When("user enter valid email and password")
    public void user_enter_valid_email_and_password() {
        p2_login.stepsLogin("husseinzayed@gmail.com","19191919@asd");
    }

    @And("click on login button")
    public void click_on_login_button() {
        p2_login.clickLoginBTN();
    }

    @Then("user could login successfully")
    public void user_could_login_successfully() {
        p2_login.doAssertLogin();
    }



}
