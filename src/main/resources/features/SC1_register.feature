
@Major_Functions

 Feature: register operation

   Scenario: SC1- User could register with valid data
     Given user navigate to register page
     When user enter valid data
     And click on register button
     Then user could create account