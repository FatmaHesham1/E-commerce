@smoke
Feature: F06_SelectCategories | Existing users could choose random category

  Scenario: user could choose different categories
    Given user could Hover on random category
    And   user select specific category
    And   select specific sub category
    Then user go the selected category page
