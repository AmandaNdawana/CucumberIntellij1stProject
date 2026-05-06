@login @Regression @Sanity
Feature: login

  Scenario Outline: as a user I want to login to ndosi website
    Given I am on the login page
    And I enter email <email>
    And I enter password <password>
    When I click login button
    Then I should be logged in successfully
    And I click mobile automation
    Examples:
      | email            | password  |
      | admin@gmail.com   | @12345678 |