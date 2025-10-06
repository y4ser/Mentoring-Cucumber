
@Arithmetic

Feature: Simple Arithmetic Operations

  @smoke @positive
  Scenario: Addition of two positive numbers
    Given I have two numbers 5 and 7
    When I add the numbers
    Then the result should be 12

  @negative
  Scenario: Subtraction resulting in a negative number
    Given I have two numbers 3 and 8
    When I subtract the second number from the first
    Then the result should be -5

  @negative
  Scenario: Division by zero
    Given I have two numbers 10 and 0
    When I divide the first number by the second
    Then an error should be displayed
    And the operation should not continue