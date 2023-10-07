Feature: This is a Sample feature file

  Scenario: This is Adactin login with valid credentials
    Given user enter the adactin url
    When user enter the username "SatyaVaniChittelu"
    And useer enter the password "moksha@15"
    Then user login in th the adactin home page

  Scenario Outline: This is Adactin Login with valid credentials
    Given user enter the adactin url
    When user enter the username as "<Username>"
    And user enter the password as "<Password>"
    Then user login in to the adactin home page

    Examples: 
      | Username          | Password  |
      | SatyaVaniChittelu | moksha@15 |
      | Mustafa87         | G5PCVW    |
