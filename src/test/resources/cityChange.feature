Feature: Change City

  Scenario: I try to change app location
    Given I am on Start screen
    Then I am on Select City screen
    Then Select city screen is open
    When I type "Dubai" and click it
    Then I am on Start screen
    And The city is "Dubai"