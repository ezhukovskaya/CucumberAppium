Feature: Check product

  Scenario: I try to check if discount is correct
    Given I am on Start screen
    Then I get Product brand name
    And I go to Product screen
    Then I confirm Product name
    And I confirm Discount Price