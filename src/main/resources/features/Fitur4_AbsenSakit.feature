Feature: Absen Sakit Page Test

  Scenario: User hanya input Position
    When User click report absen sakit
    And User click absen sakit
    And User click position absen sakit
    And User input list in dropdown absen sakit
    And User click export data absen sakit
    Then alert popup absen sakit

  Scenario: User hanya input branch
    When User click report absen sakit
    And User click absen sakit
    And User click branch absen sakit
    And User input list in dropdown branch absen sakit
    And User click export data absen sakit
    Then alert popup absen sakit

  Scenario: User hanya input Unit
    When User click report absen sakit
    And User click absen sakit
    And User click unit absen sakit
    And User input list in dropdown unit absen sakit
    And User click export data absen sakit
    Then alert popup absen sakit

  Scenario: User hanya input Start date
    When User click report absen sakit
    And User click absen sakit
    And User input start date absen sakit
    And User click export data absen sakit
    Then alert popup absen sakit

  Scenario: User hanya input Start date
    When User click report absen sakit
    And User click absen sakit
    And User input end date absen sakit
    And User click export data absen sakit
    Then alert popup absen sakit

  Scenario: User Add Absen Sakit
    When User click report absen sakit
    And User click absen sakit
    And User click position absen sakit
    And User input list in dropdown absen sakit
    And User click branch absen sakit
    And User input list in dropdown branch absen sakit
    And User click unit absen sakit
    And User input list in dropdown unit absen sakit
    And User input start date absen sakit
    And User input end date absen sakit
    When User click export data absen sakit
#    Then alert popup absen sakit