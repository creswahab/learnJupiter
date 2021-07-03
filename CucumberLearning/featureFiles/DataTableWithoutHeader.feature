@DataDriven
Feature: DataTable without Header
Scenario: Test Login Sceanrio by DataTable without Header
Given You are on OrangeHRM login page
When the User enters below credentials 
|Admin | admin123|
And clicks the login button
Then You should Home Page and verify result