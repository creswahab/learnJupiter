$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/CucumberOptions.feature");
formatter.feature({
  "line": 1,
  "name": "test Google Search with dryRun",
  "description": "",
  "id": "test-google-search-with-dryrun",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Google Search Scenario dryRun",
  "description": "",
  "id": "test-google-search-with-dryrun;google-search-scenario-dryrun",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is navigating to google.co.in",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user is entering the search term \"India\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "entering return key",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Verify the search result",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberOptions.user_is_navigating_to_google_co_in()"
});
formatter.result({
  "duration": 6881457900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 34
    }
  ],
  "location": "CucumberOptions.user_is_entering_the_search_term(String)"
});
formatter.result({
  "duration": 101107100,
  "status": "passed"
});
formatter.match({
  "location": "CucumberOptions.entering_return_key()"
});
formatter.result({
  "duration": 2413854700,
  "status": "passed"
});
formatter.match({
  "location": "CucumberOptions.verify_the_search_result()"
});
formatter.result({
  "duration": 81819500,
  "status": "passed"
});
});