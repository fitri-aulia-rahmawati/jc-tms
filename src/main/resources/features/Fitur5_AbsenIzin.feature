Feature: Absen Izin Page Test

  Scenario: User hanya input Position
    When User click report absen izin
    And User click absen izin
    And User click position absen izin
    And User input list in dropdown absen izin
    And User click export data absen izin
    Then alert popup absen izin

  Scenario: User hanya input branch
    When User click report absen izin
    And User click absen izin
    And User click branch absen izin
    And User input list in dropdown branch absen izin
    And User click export data absen izin
    Then alert popup absen izin

  Scenario: User hanya input Unit
    When User click report absen izin
    And User click absen izin
    And User click unit absen izin
    And User input list in dropdown unit absen izin
    And User click export data absen izin
    Then alert popup absen izin

  Scenario: User hanya input Start date
    When User click report absen izin
    And User click absen izin
    And User input start date absen izin
    And User click export data absen izin
    Then alert popup izin

  Scenario: User input End date
    When User click report absen izin
    And User click absen izin
    And User input end date absen izin
    And User click export data absen izin
#    Then alert popup izin
    Then alert popup absen izin

  Scenario: User Add Absen izin
    When User click report absen izin
    And User click absen izin
    And User click position absen izin
    And User input list in dropdown absen izin
    And User click branch absen izin
    And User input list in dropdown branch absen izin
    And User click unit absen izin
    And User input list in dropdown unit absen izin
    And User input start date absen izin
    And User input end date absen izin
    When User click export data absen izin
#    Then alert popup izin