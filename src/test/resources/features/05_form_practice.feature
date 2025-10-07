Feature: Form Feature

  @Form
  Scenario Outline: Form Test
    Given user visits "https://testpages.eviltester.com/styled/validation/input-validation.html"
    When user enters first name "<firstname>"
    And user enters last name "<lastname>"
    And user enters age "<age>"
    And user enters country "<country>"
    And user enters notes "<notes>"
    Then close browser
    Examples:
      | firstname | lastname   | age | country        | notes            |
      | yaser     | Alshammari | 24  | Saudi Arabia   | Hello from Yaser |
      | John      | Doe        | 30  | Germany        | Hello from John  |
      | Mary      | Alex       | 20  | United Kingdom | Hello from Mary  |