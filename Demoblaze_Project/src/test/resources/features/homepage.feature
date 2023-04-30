Feature: Homepage feature

Scenario: Verify Homepage title
Given user is on homepage
Then page title should be "STORE"

Scenario: Login with correct credentials
Given user is on Home_page
When user clicks on Log in button
Then user get login popup window
And user enters username "admin"
And user enters password "admin"
Then user clicks on Login button
Then page title should be "STORE"


