Feature: Login

@Login
Scenario: Login Functionality
Given : I will open the browser
When : I am navigating to ecommerce website
And : I am entering the UserName & Password
And : I am clicking on the login button
Then : Home page should be displayed after login

@Login2
Scenario: Verify that user name is displayed on home page or not
Given : I will open the browser
When : I am navigating to ecommerce website
And : I am entering the UserName & Password
And : I am clicking on the login button
Then : Home page should be displayed after login after that user name should be displayed on home page

@Login3
Scenario: Verify that featured products are displayed on home page
Given : I will open the browser
When : I am navigating to ecommerce website
And : I am entering the UserName & Password
And : I am clicking on the login button
And : I am click on products menu
Then : Home page should be displayed after products also should be displayed on home page

@Login4
Scenario: Verify that the search funcionality is on home page
Given : I will open the browser
When : I am navigating to ecommerce website
And : I am entering the UserName & Password
And : I am clicking on the login button
Then : User should be ib logged and search funcionality present on home page