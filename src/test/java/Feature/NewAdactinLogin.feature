Feature: This is our Sample Cucumber Project
  BackGround: It will execute before each Scenarios
  Given user enter the url

  @smoke
  Scenario: using aslist() datatable method for parameterization
    
    When user enter the username as list
      | Mustafa87 |
    And user enter the password as list
      | G5PCVW |
    Then user logged in the page successfully

  @sanity
  Scenario: using asLists() datatable method for parameterization
    When user enter the username as lists
      | Mustafa87 | SatyaVaniChittelu |
      | Mohamed   | VaniChittelu      |
    And user enter the password as lists
      | G5PCVW | moksha@15 |
     Then user logged in the page successfully

  @regression
  Scenario: using as map() datatable method for parameterization
    When user enter the username as map
      | username  | Mustafa87         |
      | username1 | SatyaVaniChittelu |
    And user enter the password as map
      | password  | G5PCVW    |
      | password1 | moksha@15 |
     Then user logged in the page successfully

  @smoke @sanity
  Scenario: using as maps() datatable method for parameterization
    When user enter the username as maps
      | username          |
      | Mustafa87         |
      | SatyaVaniChittelu |
    And user enter the password as maps
      | password  |
      | G5PCVW    |
      | moksha@15 |
     Then user logged in the page successfully
