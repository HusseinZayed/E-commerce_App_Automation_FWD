package step_definition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P2_Login;
import pages.P3_Reset_Password;

public class SD3_Reset_Password {

    P3_Reset_Password p3_reset_password;

    @Given("navigate to login page")
    public void navigate_to_login_page() {
        p3_reset_password = new P3_Reset_Password(Hooks.driver);
        p3_reset_password.go_to_login_page();
    }


    @And("click forget password")
    public void click_forget_password() {
        p3_reset_password.clickForgetPassword();
    }

    @When("user entre valid email")
    public void user_entre_valid_email() {
        p3_reset_password.setEmail("husseinzayed@gmail.com");
    }

    @And("click recover button")
    public void click_recover_button() {
       p3_reset_password.resetPassword();
    }

    @Then("notification with success message")
    public void notification_with_success_message() {
       p3_reset_password.doAssertReset();
    }

}
