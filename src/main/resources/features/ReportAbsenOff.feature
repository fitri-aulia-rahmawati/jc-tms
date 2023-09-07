Feature: Report Absen Off Page
  Scenario: Report Absen Just Position
    When User Click Report Absen Menu
    And User Click Absen Off Menu
    And User Click Position Dropdown
    And User Input Position
    And User Click Export Button
    Then User Get Text Alert

  Scenario: Report Absen Just Branch
    When User Click Branch Dropdown
    And User Input Branch
    And User Click Export Button
    Then User Get Text Alert

  Scenario: Report Absen Just Unit
    When User Click Unit Dropdown
    And User Input Unit
    And User Click Export Button
    Then User Get Text Alert

  Scenario: Report Absen Just Start Date
    When User Input Start Date
    And User Click Export Button
    Then User Get Text Alert

  Scenario: Report Absen Just End Date
    When User Input End Date
    And User Click Export Button
    Then User Get Text Alert

  Scenario: Report Absen Off
    And User Click Position Dropdown
    And User Input Position
    And User Click Branch Dropdown
    And User Input Branch
    And User Click Unit Dropdown
    And User Input Unit
    And User Input Start Date
    And User Input End Date
    And User Click Export Button
    And User Get Text Alert

