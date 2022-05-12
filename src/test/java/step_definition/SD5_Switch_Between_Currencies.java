package step_definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P5_Switch_Between_Currencies;

public class SD5_Switch_Between_Currencies {

    P5_Switch_Between_Currencies p5_switch_between_currencies;

    @When("user changes the currency")
    public void user_changes_the_currency() {
        p5_switch_between_currencies = new P5_Switch_Between_Currencies(Hooks.driver);
        p5_switch_between_currencies.switchToDifferentCurrency(1);
    }


    @Then("user could find the selected currency")
    public void user_could_find_the_selected_currency() {
       p5_switch_between_currencies.doAssertSwitchCurrencies();
    }

}
