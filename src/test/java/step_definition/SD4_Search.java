package step_definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P4_Search;

public class SD4_Search {

    P4_Search p4_search;

    @When("user enter name of product in search field")
    public void user_enter_name_of_product_in_search_field() {
        p4_search = new P4_Search(Hooks.driver);
        p4_search.setProductName("book");
        p4_search.clickSearchBTN();

    }
    @Then("user could find relative results")
    public void user_could_find_relative_results() {
        p4_search.clickSearchBTN();
    }
}
