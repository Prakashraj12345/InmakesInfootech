Feature: To Validate the Login functionality of facebook application.


@Sanity
Scenario: To Validate the Login functionality of facebook application.
Given  To launch the chrome browser and maxmize window
When To launch the url of facebook application
And To pass the valid username in email field
And To pass the valid password in password field
And To click the Login button
Then To close the  browser



@Regression
Scenario Outline: To validate the positive and negative combination of gmail login functionality.
Given To launch the chrome browser and maxmize window
When To launch the url of gmail application.
And User has to enter the data "<emaildatas>" in email field.
And User has to enter the data "<passworddatas>"in password field.
Then User has to close the chrome browser.
Examples:
|emaildatas|passworddatas|
|r.prakashraj|naga97441|
|prakashpraku|jaga29118|
|jawaharprasath|ram1252|
|ramkumar1987|dev985781|



@Smoke
Scenario: To Signin the amazon account
Given To launch the browser and maxmize the window 
When To launch the url of amazon application
And To enter email in email text box
|key|value|
|email1|prakash@gmail.com|
|email2|ram@gmail.com|
|email3|jawahar@gmail.com|
|email4|yathesh@gmail.com|
And To enter the password in password text box
|password1|password2|password3|
|praku2911|jaga2711|naga4465|
|jawa123|12345|756352|ss
|abcd34|hijk3456|plmno6878|
Then To close the browser





