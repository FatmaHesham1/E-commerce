@smoke
Feature: F07_HomeSliders | Existing users could click on different sliders

  Scenario Outline: user could click on home sliders
    Given user clicked on "Square Number"
    And   user click on this slider
    Then user go the selected "Slider Name"
    Examples:
      |Square Number|Slider Name|
      |1            |Nokia       |
      |2            |Iphone      |