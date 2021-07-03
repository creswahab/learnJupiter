@login
Feature: This is to test Login Scenario
@positive
Scenario: Test Valid Login Sceanrio
Given User is on login page
When the User enters valid UserName and Password
And clicks on login button
Then User should be navigated to Home Page

@negative
Scenario: Test Invalid Login Sceanrio
Given User is on login page
When the User enters valid UserName and Password
And clicks on login button
Then User should be navigated to Home Page