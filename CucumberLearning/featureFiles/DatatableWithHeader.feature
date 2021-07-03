@DataDriven
Feature: DataTable with Header
Scenario: Test Login Sceanrio by DataTable with Header
Given You should be on OrangeHRM login page
When the User enters below valid credentials from the DataTable
|UserName | PassWord|
|Admin | admin123|
And clicks the login button and navigate to application
Then You should be on Home Page and verify result as expected