Feature: Amazom Login 



Background:
Given User launch the browser

Scenario: Successfull Login Validation

When User pass the valid username and valid password 
And User clicks on the Login Button
Then User verify the home page


Scenario Outline: Invalid Login Validation
When User pass the valid <username> and valid <password>
And User clicks on the Login Button
Then User verify the home page

Examples:
     |abc|test12|
     |xyz|test536|

