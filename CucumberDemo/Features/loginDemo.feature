Feature: Test login functionality

  Scenario Outline:: check login is successssful with valid credentials
    Given Browser is open
    And User opens the application login page
    When user enters valid email as "<username>" and password as "<password>"
    And user clicks on login button
    Then user should be able to logged in and navigated to home page
    And close the browser

    Examples: 
    |username|password|
    |Anusha|12345|
    |Manasa|12345|
    |Sumedh|12345|
    |Krishna|12345|