@first_feature
Feature: Failed Feature

  @first_scenario @smoke
  Scenario: First Scenario
    Given failed step
    When print from one to hundred on console
    Then assert if Cucumber contains C

  @first_scenario @smoke
  Scenario: First Scenario
    Given failed step
    When print from one to hundred on console
    Then assert if Cucumber contains C