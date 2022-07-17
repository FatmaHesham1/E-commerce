
@somke
Feature: F09_WishLists | Existing users could add products to their wishlist
  Background: user should be logged in first
Given user go to login page
When user fill email field with "testt@example.com"
And user fill password field with "P@ssw0rd"
And user clicked on login button
Then user logged in successfully

Scenario: user add products to the wishlist
Given user go to products page
When user clicks favorite icon below the product
Then product is added and closes the message box

  Scenario: user check wishlist
  When user chooses wishlist tab
  Then user check that the item has been added





