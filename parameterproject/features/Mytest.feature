Feature: end to end test of facebook application

  Scenario: verify the facebook loginn functionality with valid credentials
    Given launch the application
    When enter "kiran" and "kkumar"
    And click on login button
    Then page should be displayed facebook home page
