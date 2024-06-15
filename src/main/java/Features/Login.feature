Feature: Login Application feature
    Scenario: Login scenario
        Given  User is on Application Home Page
        When  Application Page Title is FREE CRM
        Then user enter username and password
        And user clicks on login button
        When USer navigate to user Profile Page
    Scenario: Verify duplicate registration
        Given User is on Application home Page
        Then User clicks on Sign-up Page
        Then User fills the sign-up form
        And user clicks the submit button
        Then Display already registered message
        Then Navigate to reset password page


