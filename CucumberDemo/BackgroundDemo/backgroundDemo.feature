Feature: check home page functionality

  Background: user is logged in
    Given user is on the login page
    When user enters valid username and password
    And user clicks on ligin button
    Then user is navidated to home page

  Scenario: check logout link
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar
    When user clicks on dashboard link
    Then quick launch tool bar is displayed
