@Major_Functions

Feature: Select_Tag

  Background:
  Given you should select specific category and open sub-category

  Scenario: SC8- Logged user could select different tags
    When user choose tag
    Then user could find products related with this the tag