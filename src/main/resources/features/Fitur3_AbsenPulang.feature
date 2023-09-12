Feature: Report Absen Pulang

  Scenario: User hanya input Position

    When User click report absen pulang
    And User click absen pulang
    And User click position absen pulang
    And User input list in dropdown absen pulang
    And User click export data absen pulang
    Then alert popup absen

  Scenario: User hanya input branch

    When User click report absen pulang
    And User click absen pulang
    And User click branch absen pulang
    And User input list in dropdown branch absen pulang
    And User click export data absen pulang
#    Then alert popup absen pulang
    Then alert popup absen


  Scenario: User hanya input Unit
    When User click report absen pulang
    And User click absen pulang
    And User click unit absen pulang
    And User input list in dropdown unit absen pulang
    And User click export data absen pulang
    Then alert popup absen
#    Then alert popup absen pulang

  Scenario: User hanya input Start date
    When User click report absen pulang
    And User click absen pulang
    And User input start date absen pulang
    And User click export data absen pulang
    Then alert popup absen pulang
#    Then alert popup absen

  Scenario: User hanya input End date
    When User click report absen pulang
    And User click absen pulang
    And User input end date absen pulang
    And User click export data absen pulang
    Then alert popup absen

  Scenario: User Add Absen Pulang
    When User click report absen pulang
    And User click absen pulang
    And User click position absen pulang
    And User input list in dropdown absen pulang
    And User click branch absen pulang
    And User input list in dropdown branch absen pulang
    And User click unit absen pulang
    And User input list in dropdown unit absen pulang
    And User input start date absen pulang
    And User input end date absen pulang
    When User click export data absen pulang
#    Then alert popup absen
#    Then alert popup absen pulang
