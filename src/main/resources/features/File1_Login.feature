Feature: Login Page Test
#T1
  Scenario: Valid Login Test
    Given User enter url HRM
    When User enter valid username1
    And User enter valid password1
    And User click button login
    Then User get text title page dashboard


