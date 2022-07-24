Feature: Application Login

Scenario: Login with valid credentials
Given Open any Browser
And Navigate to Login page
When User enters username as "jatin260400@gmail.com" and password as "260400" into the fields
And User clicks on Login button
Then Verify user is able to successfully login