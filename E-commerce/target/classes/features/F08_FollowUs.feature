@smoke
Feature: F08_FollowUs | Existing users could click on different social media links

  Scenario: user can follow the site on Facebook
    When user click on facebook
    Then user go to facebook page

  Scenario: user can follow the site on Twitter
    When user click on twitter
    Then user go to twitter page

  Scenario: user can follow the site on RSS
    When user click on rss
    Then user go to rss page

  Scenario: user can follow the site on Youtube
    When user click on youtube
    Then user go to youtube page