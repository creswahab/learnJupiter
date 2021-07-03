@OpenGoogle
Feature: This is to test Google Search
Scenario: Google Search Scenario
Given user is entering google.co.in
When user is typing the search term "India"
And enters the return key
Then the user should see the search result
