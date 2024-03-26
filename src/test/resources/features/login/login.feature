Feature: Create Account

  Scenario: Login
    Given User is located on Login page
    When User sets username and password
    And Press Sign In button
    Then The user will be redirected to dashboard