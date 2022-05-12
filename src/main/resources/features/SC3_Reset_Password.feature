@Major_Functions
  Feature: Reset password

    Scenario: SC3- User could reset his/her password successfully
      Given navigate to login page
      And click forget password
      When user entre valid email
      And click recover button
      Then notification with success message
