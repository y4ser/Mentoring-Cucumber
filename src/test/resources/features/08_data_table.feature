Feature: Data Table Test

  @DataTable
  Scenario: Data Table Scenario
    Given user gets list of string
      | yaser |
      | John  |
      | Mary  |
      | Tom   |
      | Kevin |
      | Tim   |
    When user gets map of string
      | yaser | 24 |
      | John  | 22 |
      | Mary  | 26 |
      | Tom   | 29 |
      | Kevin | 21 |
      | Tim   | 30 |
    And user get list of list of string
      | Yaser | Alshammari | 24 | Riyadh   |
      | John  | Doe        | 22 | New York |
      | Mary  | Hawk       | 26 | London   |
      | Tom   | Jessie     | 29 | Berlin   |
      | Kevin | Carter     | 21 | Paris    |
      | Tim   | Hook       | 30 | Rome     |
