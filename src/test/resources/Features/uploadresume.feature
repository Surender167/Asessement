Feature: feature to test the naukri application

  Scenario Outline: Test the login functionality of naukri
    Given user is on chrome browser of naukri application
    When user enters url of naukri application
    And user hits on search button of naukri application
    When user clicks on login button of naukri application
    Then user should see username and password
    When user enters the "<username>" and "<password>"
    And hits on login button of naukri application
    Then user should see the home page of naukri application

    Examples: 
      | username                  | password      |
      | surenderreddy71@gmail.com | Surender5850@ |
