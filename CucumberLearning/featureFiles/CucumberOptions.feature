Feature: test Google Search with dryRun
Scenario: Google Search Scenario dryRun
Given user is navigating to google.co.in
When user is entering the search term "India"
And entering return key
Then Verify the search result
