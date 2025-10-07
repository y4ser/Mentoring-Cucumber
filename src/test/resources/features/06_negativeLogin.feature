Feature: Multiple negative feature

  @negativeLogin
  Scenario Outline: Multiple negative test cases
    Given user visits "https://claruswaysda.github.io/signIn.html"
    When user enters username "<username>"
    And user enters password "<password>"
    And user click signin button
    Then close browser

Examples:
  | username | password |
  |          |          |
  | admin    |          |
  |          | 123      |
  | Admin    | 123      |
  | admin    | y123     |
  | Admin    | ad123    |
  | A@min    | 123      |
  | admin    | 1 2 3    |