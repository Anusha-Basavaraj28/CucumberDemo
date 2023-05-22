Feature: Test login functionality with multiple test data

  Scenario Outline:: check login is successssful with multiple test data from excel sheet
    Given Browser is open
    And User opens the application login page
    When user enters valid email and password from excel sheet row "<row_number>"
    And user clicks on login button
    Then user should be able to logged in and navigated to home page
    And close the browser
    
    
    Examples: 
    |row_number|
    |1|
    |2|
    |3|
    |4|