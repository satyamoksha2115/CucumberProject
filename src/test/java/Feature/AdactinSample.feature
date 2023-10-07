Feature: This is our Sample Feature File

  Scenario: This is user Login with Valid Credentials
    Given user launch the base url
    When user enter the username
    And user enter the password
    Then user login the page successfully

  Scenario: This is user login with invalid credentials
    Given User launch the base url.
    When user enter the invalid username
    And user enter the invalid password
    Then user login unsuccessfully
