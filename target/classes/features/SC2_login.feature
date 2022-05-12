@Major_Functions

Feature: Login operation


  Scenario: SC2-User could log in with valid email and password
    Given user navigate to login page
    When user enter valid email and password
    And click on login button
    Then user could login successfully


