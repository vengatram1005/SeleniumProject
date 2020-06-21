$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login page verification",
  "description": "",
  "id": "login-page-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Fb login verification",
  "description": "",
  "id": "login-page-verification;fb-login-verification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@FBLogin"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user verify the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_on_facebook_page()"
});
formatter.result({
  "duration": 240482500,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enters_username_and_password()"
});
formatter.result({
  "duration": 140700,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_login_button()"
});
formatter.result({
  "duration": 101500,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_verify_the_home_page()"
});
formatter.result({
  "duration": 93600,
  "status": "passed"
});
});