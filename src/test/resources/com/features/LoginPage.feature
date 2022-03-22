Feature: Login page feature
@Smoke
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "FitnetManager"
@Login
Scenario: Forgot Password link
Given user is on login page
Then Lost Your Password link should be displayed
@Skip
Scenario: Login with correct credentials
Given user is on login page
When user enters username "sjain@sg.palo-it.com"
And user enters password "Welcome@352"
And user clicks on SignIn button
Then user should be on Homepage
