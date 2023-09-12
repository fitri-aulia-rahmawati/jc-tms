Feature: Report Absen Masuk Page Test

  Scenario: User hanya input Position
    When User click report absen masuk
    And User click absen masuk
    And User click position absen masuk
    And User input list in dropdown absen masuk
    And User click export data absen masuk
    Then alert popup masuk

  Scenario: User hanya input branch
    When User click report absen masuk
    And User click absen masuk
    And User click branch absen masuk
    And User input list in dropdown branch absen masuk
    And User click export data absen masuk
    Then alert popup masuk

  Scenario: User hanya input Unit
    When User click report absen masuk
    And User click absen masuk
    And User click unit absen masuk
    And User input list in dropdown unit absen masuk
    And User click export data absen masuk
    Then alert popup masuk

  Scenario: User hanya input Start date
    When User click report absen masuk
    And User click absen masuk
    And User input start date absen masuk
    And User click export data absen masuk
    Then alert popup masuk

  Scenario: User hanya input End date
    When User click report absen masuk
    And User click absen masuk
    And User input end date absen masuk
    And User click export data absen masuk
    Then alert popup masuk


  Scenario: User Add Absen Masuk
    When User click report absen masuk
    And User click absen masuk
    And User click position absen masuk
    And User input list in dropdown absen masuk
    And User click branch absen masuk
    And User input list in dropdown branch absen masuk
    And User click unit absen masuk
    And User input list in dropdown unit absen masuk
    And User input start date absen masuk
    And User input end date absen masuk
    And User click export data absen masuk
#    Then alert popup masuk
