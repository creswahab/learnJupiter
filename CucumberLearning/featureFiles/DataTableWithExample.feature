@DataDriven
Feature: DataTable with Examples
Scenario Outline: Test Login Sceanrio by DataTable with Examples
Given The User is on OrangeHRM login page
When Enters the "<UserName>" and "<PassWord>" in the application
And click login button

Examples:
|UserName | PassWord|
|Admin | admin123|
|Admin | admin12|