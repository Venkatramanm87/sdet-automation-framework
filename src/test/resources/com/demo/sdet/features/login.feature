Feature: User Login

  As a registered user
  I want to login into the application
  So that I can access the products page


 Scenario: Successful login with valid credentials

    Given user launches the application

    When user logs in with username "standard_user" and password "secret_sauce"

    Then products page should be displayed