@smoke
Feature: user should be able to reset the password

Background: user is logged in
Given user go to login page
When user fill email field with "test1@example.com"
And user fill password field with "P@ssw0rd"
And user clicked on login button
Then user logged in successfully

Scenario: user resets his/her password
Given user got to My Account tab
When user chooses change password
And user enter current password "P@ssw0rd"
And user enter new password "newP@ssw0rd"
And user re-enter new password "newP@ssw0rd"
Then password is changed successfully