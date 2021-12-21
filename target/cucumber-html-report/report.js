$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Web/scenario/Bill_001.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "  Verify user ketika Login masuk ke aplikasi web billing",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@important"
    }
  ]
});
formatter.scenario({
  "name": ": Login as user aktif billing",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@important"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "BL001.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Login Page",
  "keyword": "When "
});
formatter.match({
  "location": "BL001.user_navigates_to_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "BL001.user_enters_username_and_Password$()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BL001.success_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});