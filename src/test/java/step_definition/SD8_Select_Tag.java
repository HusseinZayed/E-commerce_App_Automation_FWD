package step_definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P8_Select_Tag;

public class SD8_Select_Tag {

    P8_Select_Tag p8_select_tag;

    @When("user choose tag")
    public void user_choose_tag()  {
        p8_select_tag = new P8_Select_Tag(Hooks.driver);
        p8_select_tag.clickOnComputerTag();
    }

    @Then("user could find products related with this the tag")
    public void user_filter_choose_with_color() {
        p8_select_tag.doTagAssert();
    }



}
