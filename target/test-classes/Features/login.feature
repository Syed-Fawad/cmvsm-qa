@Auth
Feature: Test user login Functionality

  @Auth
  Scenario Outline: Check user is login successfully with valid credentials
    Given Browser is open
    And user is on the login page
    When user enters <username> and <password>
    And clicks on the login button
    Then user is navigated to the Homepage

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
