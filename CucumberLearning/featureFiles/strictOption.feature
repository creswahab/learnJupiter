Feature: test Google Search with strict
Scenario: Google Search Scenario strict
Given user is moving to google.co.in
When user is typing search term "India"
And press enter key
Then Verify the output
