package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P7_Filter_With_Color;

public class SD7_Filter_With_Color {

    P7_Filter_With_Color p7_filter_with_color;

    @Given("you should select specific category and open sub-category")
    public void you_should_select_specific_category_and_open_sub_category()  {
        p7_filter_with_color = new P7_Filter_With_Color(Hooks.driver);
        p7_filter_with_color.goToShoesSubCategory();
    }

    @Then("user filter choose with color")
    public void user_filter_choose_with_color() {
        p7_filter_with_color.chooseBlueColor();
    }

    @When("user could find right products")
    public void user_could_find_right_products() {
        p7_filter_with_color.doFilterAssert();
    }

}
