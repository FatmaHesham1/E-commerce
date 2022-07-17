@smoke
Feature: F04_Search | Existing users could search for products

  Scenario Outline: user search on products using product name
    Given user searched using product name "<productName>"
    When user clicked on Search button
    Then Results are displayed


    Examples:
      | productName |
      | book        |
      | laptop      |
      | nike        |

  Scenario Outline: user search on products using sku
    Given user searched using "<serialNumber>"
    When user clicked on Search button
    Then Results are displayed
    Examples:
      | serialNumber |
      | AP_MBP_13     |
      | SCI_FAITH     |
      | SF_PRO_11     |
