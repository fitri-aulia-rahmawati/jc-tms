Feature: Login Staff
  Scenario: Login Staff1 Invalid Username
    When User Input Invalid Username
    And User Input Password Staff1
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Staff1 Invalid Password
    When User Input Username Staff1
    And User Input Invalid Password
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Admin No Username
    When User Input Password Staff1
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Staff1 No Password
    When User Input Username Staff1
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Staff1 Valid Credentials
    When User Input Username Staff1
    And User Input Password Staff1
    And User Click Login Button
    Then User Get Text Dashboard

  Scenario: Logout
    When User Click Logout Button
    Then User Get Text Login Page

  Scenario: Login Staff2 Invalid Username
    When User Input Invalid Username
    And User Input Password Staff2
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Staff2 Invalid Password
    When User Input Username Staff2
    And User Input Invalid Password
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Staff2 No Username
    When User Input Password Staff2
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Staff2 No Password
    When User Input Username Staff2
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Staff2 Valid Credentials
    When User Input Username Staff2
    And User Input Password Staff2
    And User Click Login Button
    Then User Get Text Dashboard

  Scenario: Logout
    When User Click Logout Button
    Then User Get Text Login Page

  Scenario: Login Staff3 Invalid Username
    When User Input Invalid Username
    And User Input Password Staff3
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Staff3 Invalid Password
    When User Input Username Staff3
    And User Input Invalid Password
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Staff3 No Username
    When User Input Password Staff3
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Staff3 No Password
    When User Input Username Staff3
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Staff3 Valid Credentials
    When User Input Username Staff3
    And User Input Password Staff3
    And User Click Login Button
    Then User Get Text Dashboard

  Scenario: Logout
    When User Click Logout Button
    Then User Get Text Login Page

  Scenario: Login Staff4 Invalid Username
    When User Input Invalid Username
    And User Input Password Staff4
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Staff4 Invalid Password
    When User Input Username Staff4
    And User Input Invalid Password
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Staff4 No Username
    When User Input Password Staff4
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Staff4 No Password
    When User Input Username Staff4
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Staff4 Valid Credentials
    When User Input Username Staff4
    And User Input Password Staff4
    And User Click Login Button
    Then User Get Text Dashboard

  Scenario: Logout
    When User Click Logout Button
    Then User Get Text Login Page

  Scenario: Login Staff5 Invalid Username
    When User Input Invalid Username
    And User Input Password Staff5
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Staff5 Invalid Password
    When User Input Username Staff5
    And User Input Invalid Password
    And User Click Login Button
    Then User Get Text Wrong Credentials

  Scenario: Login Staff5 No Username
    When User Input Password Staff5
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Staff5 No Password
    When User Input Username Staff5
    And User Click Login Button
    Then User Get Text Alert Fill

  Scenario: Login Staff5 Valid Credentials
    When User Input Username Staff5
    And User Input Password Staff5
    And User Click Login Button
    Then User Get Text Dashboard

  Scenario: Logout
    When User Click Logout Button
    Then User Get Text Login Page