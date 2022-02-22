Feature: Login

  Scenario Outline: Login functionality
    Given : I will open the broswer
    When : Iam navigating to facebookpage
    And : I will enter "<username>" & "<password>"
    Then : Click on login button
    When : Click on profile logo
    When : Refresh the browser
    And : click on signout option
    Then : Facebook should signout successfull

    Examples: 
      | username                  | password      |
      | surenderreddy71@gmail.com | Surender5850@ |
      | chinnyreddy36@gmail.com   | Surender5850@ |
