@AddStudent
Feature: Add Student

  Background: User is on the app
    Given user visits "https://claruswaysda.github.io/addStudent.html"

  @StudentPositive
  Scenario: Happy Path
    When user enters full name "John Doe"
    And user enters student id "j123"
    And user enters email "john@doe.com"
    And user enters course "PE"
    And user selects grade "B+"
    And user click on add student button
    Then assert that student is added
    And close browser

  @StudentNegative
  Scenario Outline: Negative inputs
    When user enters full name "<name>"
    And user enters student id "<id>"
    And user enters email "<email>"
    And user enters course "<course>"
    And user selects grade "<grade>"
    And user click on add student button
    Then assert that error message is displayed as "<error_message>"
    And close browser

    Examples:
      | name | id  | email        | course | grade | error_message          |
      |      | 123 | john@doe.com | Math   | A     | This field is required |
      | John |     | john@doe.com | Math   | A     | This field is required |
    #Rest is homework!
      | John | 123 |              | Math   | A     | This field is required |
      | John | 123 | john@doe.com |        | A     | This field is required |
      | John | 123 | john@doe.com | Math   |       | This field is required |
      | John | 123 | john@doe.com | Math   | A     | This field is required |


  @StudentScenarioOutline @AddDelete
  Scenario Outline: Happy Path Scenario Outline
    When user enters full name "<fullName>"
    And user enters student id "<id>"
    And user enters email "<email>"
    And user enters course "<course>"
    And user selects grade "<grade>"
    And user click on add student button
    Then assert that student is added
    #And close browser
    Examples:
      | fullName   | id   | email          | course  | grade |
      | John Doe   | j123 | john@gmail.com | Math    | A+    |
      | Jane Doe   | j456 | jane@gmail.com | PE      | B+    |
      | Mike White | m123 | mike@gmail.com | Physics | B     |
      | Tom Black  | t123 | tom@gmail.com  | SWE     | A+    |

  @AddDelete
  Scenario: Edit Student
    When user clicks on edit button for student "Tom Black"
    And user updates fullName "Yaser"
    And user updates id "Y12345"
    And user updates email "yaser@gmail.com"
    And user clicks on save changes button
    Then assert that student info is updated
#    And close browser

  @AddDelete
  Scenario: Delete specific student
    When user deletes the student contains "Mike White"
#    And close browser

  @AddDelete
  Scenario Outline: Search students
    When user types "<keyword>" in the search box
#    Then assert that all visible records contain "<keyword>"
    Examples:
      | keyword    |
      | Yaser      |
      | j123       |
      | john@gmail |
      | SWE        |




  @ClearAll
  Scenario: Clear all students
    When user clicks on clear all button
    And user confirms the alert
    Then assert that all records are deleted from local storage
    And close browser





