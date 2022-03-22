Feature: Home page feature

Background:
Given user has already logged in 
|username|password|
|sjain@sg.palo-it.com|Welcome@352|


Scenario: Home Page Title
Given user is on account page
When user gets the title of the page
Then page title should be "FitnetManager"

Scenario: Home Page menu 
Given user is on account page
Then user gets the home page menu
|PERSONAL CALENDAR|
|TIMESHEET|
|EXPENSES|
|VACATION / LEAVE|
|TRAINING SESSIONS|
And count should be 5


