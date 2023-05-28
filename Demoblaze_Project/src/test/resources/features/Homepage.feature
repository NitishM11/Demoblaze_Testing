Feature: Homepage feature

@Skip
Scenario: Verify Homepage title
Given user is on homepage
Then page title should be "STORE"

@Skip
Scenario: Login with correct credentials
Given user is on Home_page
When user clicks on Log in button
Then user get login popup window
And user enters username "admin"
And user enters password "admin"
Then user clicks on Login button
Then page title should be "STORE"

@Skip
Scenario: Verify Contact button
Given user is on homepage
Then user clicks on Contact_button
Then Contact popup should be displayed with title "New message"
Then Contact popup should be displayed with Send message button and Close button
@Skip
Scenario: Verify "About us" Button
Given user is on homepage
Then user clicks on About_us button
Then About_us popup should be displayed with title "About us"
Then About_us popup should be displayed with a video and Close button
@Skip
Scenario: Verify "Sign up" Button
Given user is on homepage
Then user clicks on Sign_up button
Then Sign_up popup should be displayed with title "Sign up"
Then Sign_up popup should be displayed with a Sign_up and Close button
@Skip
Scenario: Verify items shown on homepage
Given user is on homepage
Then Number of items shown on homepage should be 9
Then Previous and Next button should be displayed
Then Filter buttons for Catogories,Phones,Laptops and Monitors should be displayed













