@Major_Functions

Feature: Shopping Cart

  Background:
    Given you should select specific category and open sub-category

  Scenario: SC9- Logged user could add different products to Shopping cart
    When user add first product to Shopping cart
    Then shopping cart have products
