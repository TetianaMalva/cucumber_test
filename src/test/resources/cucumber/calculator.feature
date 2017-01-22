Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

  Scenario: Add two numbers
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5

  Scenario: Add two numbers
    Given I have a calculator
    When I subtract 5 and 2
    Then the result should be 3

  Scenario: Add two numbers
    Given I have a calculator
    When I multiply 4 and 3
    Then the result should be 12