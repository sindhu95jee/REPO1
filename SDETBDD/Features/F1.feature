Feature:To test the OPENMRS application

@SC1
Scenario: To test the valid login page of OPENMRS app
Given Open chrome browser and the url of the application
When Enter vaild Username, valid password
And Select location for this session
And Click on the Login button
Then Login to the account

@SC2
Scenario: To test the invalid login page of OPENMRS app
Given Open chrome browser and the url of the application
When Enter invaild Username, invalid password
And Select location for this session
And Click on the Login button
Then Error message to be displayed -Invalid details