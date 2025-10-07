Feature: Add Record

  @AddRecord
  Scenario: Add Record Scenario
    Given user visits "https://claruswaysda.github.io/addRecordWebTable.html"
    When enter data
      | John  | 15 | Germany   |
      | Mary  | 25 | Canada    |
      | Tom   | 25 | UK        |
      | Kevin | 30 | USA       |
      | Bob   | 10 | Australia |
      | Hans  | 40 | Germany   |
    #Rest is homework
      | Emma      | 28 | USA       |
      | Liam      | 35 | UK        |
      | Olivia    | 22 | Canada    |
      | Noah      | 30 | Australia |
      | Ava       | 26 | Germany   |
      | Ethan     | 32 | USA       |
      | Sophia    | 24 | UK        |
      | Mason     | 29 | Canada    |
      | Isabella  | 27 | Australia |
      | Logan     | 31 | Germany   |
      | Mia       | 25 | USA       |
      | Lucas     | 33 | UK        |
      | Charlotte | 23 | Canada    |
      | Jackson   | 34 | Australia |
      | Amelia    | 28 | Germany   |
      | Aiden     | 30 | USA       |
    #Then assert added records
    Then close browser
