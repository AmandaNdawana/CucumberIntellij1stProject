Feature: login

  Scenario Outline: as a user I want to login to ndosi website
    Given I am on the login page
    And I enter email <email>
    And I enter password <password>
    When I click login button
    Then I should be logged in successfully
    Examples:
    | email | password |
    | Amanda@gmail.com |@1234567 |