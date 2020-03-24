$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Yourlogo Website",
  "description": "",
  "id": "yourlogo-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Yourlogo"
    }
  ]
});
formatter.scenario({
  "line": 61,
  "name": "",
  "description": "",
  "id": "yourlogo-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 60,
      "name": "@TC010_Yourlogo"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "open the site in chrome and lanch the website",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "login to the page",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "send keys to the newsletters",
  "keyword": "Then "
});
formatter.match({
  "location": "NewsLettersSteps.launch_the_chrome_application()"
});
formatter.result({
  "duration": 19989671591,
  "status": "passed"
});
formatter.match({
  "location": "NewsLettersSteps.the_user_logged_in_to_the_home_page_and_signin_the_page()"
});
formatter.result({
  "duration": 9472565411,
  "status": "passed"
});
formatter.match({
  "location": "NewsLettersSteps.the_user_and_navigate_to_next_page_count_images()"
});
formatter.result({
  "duration": 3358029786,
  "status": "passed"
});
});