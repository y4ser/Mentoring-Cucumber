@validInvalid
Feature: valid_invalid_inputs

  Background:
    Given  user visits "https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html"

  Scenario: valid inputs
    Given user enters valid inputs
      | yaser11 |
      | 1234567 |
      | YYYYYYY |
      | aaaaaaa |
      | Xxxxxxx |


  Scenario: invalid inputs
    Given user enters invalid inputs
      | ()$#%^101        |
      | abc              |
      | yyyyyyyyyyyyyyyy |
      | ****             |
      | ()$#%^!@*        |