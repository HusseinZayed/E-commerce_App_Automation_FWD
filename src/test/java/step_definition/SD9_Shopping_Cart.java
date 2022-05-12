package step_definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P9_Shopping_Cart;

public class SD9_Shopping_Cart {

    P9_Shopping_Cart p9_shopping_cart;

    @When("user add first product to Shopping cart")
    public void user_add_first_product_to_shopping_cart() throws Exception{
        Thread.sleep(5);
        p9_shopping_cart = new P9_Shopping_Cart(Hooks.driver);
        p9_shopping_cart.addFirstProduct();
    }
    @Then("shopping cart have products")
    public void shopping_cart_have_products() {
        p9_shopping_cart.doAddCartAssertion();
    }
}
