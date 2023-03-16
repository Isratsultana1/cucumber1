$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/TechfiosLogin.feature");
formatter.feature({
  "name": "Techfios billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.User_enters_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on_log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_should_land_on_dashboard_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003cDashboard- iBilling\u003e but was:\u003cnull\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat steps.LoginStepDefination.user_should_land_on_dashboard_page(LoginStepDefination.java:45)\r\n\tat ✽.User should land on dashboard page(classpath:features/TechfiosLogin.feature:11)\r\n",
  "status": "failed"
});
});