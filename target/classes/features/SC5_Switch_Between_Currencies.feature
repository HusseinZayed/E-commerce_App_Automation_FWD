@Major_Functions

  Feature: Change the currency

    Scenario: Logged User could switch between currencies US-Euro
      When user changes the currency
      Then user could find the selected currency
