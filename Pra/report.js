$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Auto.feature");
formatter.feature({
  "name": "To Validate the Login functionality of facebook application.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Validate the Login functionality of facebook application.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and maxmize window",
  "keyword": "Given "
});
formatter.match({
  "location": "Cucum.to_launch_the_chrome_browser_and_maxmize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "Cucum.to_launch_the_url_of_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid username in email field",
  "keyword": "And "
});
formatter.match({
  "location": "Cucum.to_pass_the_valid_username_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Cucum.to_pass_the_valid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Cucum.to_click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the  browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucum.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Signin the amazon account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maxmize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Rock.to_launch_the_browser_and_maxmize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of amazon application",
  "keyword": "When "
});
formatter.match({
  "location": "Rock.to_launch_the_url_of_amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter email in email text box",
  "rows": [
    {
      "cells": [
        "key",
        "value"
      ]
    },
    {
      "cells": [
        "email1",
        "prakash@gmail.com"
      ]
    },
    {
      "cells": [
        "email2",
        "ram@gmail.com"
      ]
    },
    {
      "cells": [
        "email3",
        "jawahar@gmail.com"
      ]
    },
    {
      "cells": [
        "email4",
        "yathesh@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Rock.to_enter_email_in_email_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter the password in password text box",
  "rows": [
    {
      "cells": [
        "password1",
        "password2",
        "password3"
      ]
    },
    {
      "cells": [
        "praku2911",
        "jaga2711",
        "naga4465"
      ]
    },
    {
      "cells": [
        "jawa123",
        "12345",
        "756352"
      ]
    },
    {
      "cells": [
        "abcd34",
        "hijk3456",
        "plmno6878"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Rock.to_enter_the_password_in_password_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Rock.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});