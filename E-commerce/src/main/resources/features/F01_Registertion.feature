@smoke
Feature: F01_Register | users could register with new accounts

  Scenario Outline: user could register with all valid data successfully
    Given user go to register page
    When user selected "<gender>"
    And user type "<firstName>"
    And user entered "<lastName>"
    And user selected date of birth
    And user enter "<email>"
    And user entered company Name
    And user enters "<password>"
    And user re-enter "<confirmedPassword>"
    And user clicked on register button
    Then user registered successfully

    Examples:
      |gender| firstName  | lastName   | email            | password     | confirmedPassword |
      |  f   | automation | tester     | test1@example.com | P@ssw0rd     | P@ssw0rd          |
      |  m   | omar       | ahmed      | ommar@gmail.com | 123omar      | 123omar           |