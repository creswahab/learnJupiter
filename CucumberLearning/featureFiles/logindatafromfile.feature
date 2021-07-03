Feature: This is to test login feature for OrangeHRM
Scenario: Test Login Sceanrio
Given User is on OrangeHRM login page
When the User enters valid credentils "Admin" and "admin123"
And clicks on login button to navigate
Then User should be navigated to Home Page and verify result