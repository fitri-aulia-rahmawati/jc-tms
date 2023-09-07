Feature: Login Page
  Scenario: Login Invalid URL
    Given User Enter Invalid URL TMS
    Then User Get Text Error Login Page

  Scenario: Login Valid` URL
    Given User Enter Valid URL TMS
    Then User Get Text Login Page

  Scenario: Login Admin Invalid Username
    When User Input Invalid Username
    And User Input Password Admin
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Admin Invalid Password
    When User Input Username Admin
    And User Input Invalid Password
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Admin No Username
    When User Input Password Admin
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Admin No Password
    When User Input Username Admin
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Admin Valid Credentials
    When User Input Username Admin
    And User Input Password Admin
    And User Click Login Button
    Then User Get Text Dashboard

  Scenario: Logout
    When  User Click Logout Button
    Then User Get Text Login Page