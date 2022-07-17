@smoke
Feature: F05_ChangeCurrency | Existing users could change currency

  Scenario Outline: user change currency
    Given user choosed "<currency type>"
    Then Currency selected is diplayed "<currency type>"
    Examples:
      | currency type |
      | Euro          |
      | US Dollar     |