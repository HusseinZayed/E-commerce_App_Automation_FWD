package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P1_Register;

public class SD1_Register {

    P1_Register p1_register;

    @Given("user navigate to register page")
    public void user_navigate_to_register_page() {
        p1_register = new P1_Register(Hooks.driver);
        p1_register.go_to_register_page();
    }

    @When("user enter valid data")
    public void user_enter_valid_data() {
        p1_register.stepsRegister("hussein" , "zayed" , "husseinzayed@gmail.com", "19191919@asd" , "19191919@asd");
    }

    @And("click on register button")
    public void click_on_register_button() {
        p1_register.clickRegisterBTN();
    }
    @Then("user could create account")
    public void user_could_create_account() {
        p1_register.doAssertRegister();
    }

}
