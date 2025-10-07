Feature: User Registration

  @userRegistration
  Scenario Outline: Register multiple users with valid data
    Given user visits "https://claruswaysda.github.io/form.html"
    When user enters ssn "<ssn>"
    And user enters firstname "<firstname>"
    And user enters lastname "<lastname>"
    And user enters address "<address>"
    And user enters phone number "<phoneNumber>"
    And user enters username "<username>"
    And user enters email "<email>"
    And user enters password "<password>"
    And user enters confirm password "<confirmPassword>"
    And user clicks register button
    Then user should see the success message "Registration Successful"
    And close browser
    Examples:
      | ssn         | firstname | lastname   | address | phoneNumber | username | email           | password | confirmPassword |
      | 123-45-6789 | yaser     | Alshammari | KSA     | 055555555   | y4ser    | yaser@gmail.com | 12345678 | 12345678        |
      | 123-45-6712 | John      | Doe        | UK      | 055555555   | Johnx    | John@gmail.com  | 12345678 | 12345678        |
      | 123-45-6743 | Mary      | Hans       | Canada  | 055555555   | Mary.12  | Mary@gmail.com  | 12345678 | 12345678        |
      | 123-45-6722 | Kevin     | max        | USA     | 055555555   | Kevin    | Kevin@gmail.com | 12345678 | 12345678        |
      | 123-45-6789 | Tom       | Flex       | UK      | 055555555   | Tom      | Tom@gmail.com   | 12345678 | 12345678        |