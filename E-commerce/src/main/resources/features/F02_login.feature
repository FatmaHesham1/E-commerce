@smoke
Feature: F02_Login | users could login with existing account

  Scenario: user could login with valid email and password
    Given user go to login page
    When user fill email field with "test1@example.com"
    And user fill password field with "P@ssw0rd"
    And user clicked on login button
    Then user logged in successfully



    Scenario: user could login with Invalid email or password
      Given user go to login page
      When user enter invalid email "testttt@example.com"
      And user enter invalid password "Pa@ssw0rd"
      And user clicked on login button
      Then Error Message Appears

