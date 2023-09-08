Feature: Login Page Test
  Scenario: Login Valid Test
    Given User enter url TMS
    When User enter valid username
    And User enter valid password
    And User click button login
    Then User get text title dashboard page
