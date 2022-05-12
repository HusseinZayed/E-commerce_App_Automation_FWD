package step_definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P6_Select_Different_Categories;

public class SD6_Select_Different_Categories {

    P6_Select_Different_Categories p6_select_different_categories;

    @When("user could select any Category")
    public void user_could_select_any_category() throws Exception {
        p6_select_different_categories = new P6_Select_Different_Categories(Hooks.driver);
        p6_select_different_categories.selectRandomCategory();
    }

    @Then("hover and open sub-Category")
    public void hover_and_open_sub_category() {
        p6_select_different_categories.hover_and_open_subCategory();
    }

}
