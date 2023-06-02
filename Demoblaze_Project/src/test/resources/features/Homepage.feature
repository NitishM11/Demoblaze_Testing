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
 
Scenario: Verify Contact button
Given user is on homepage
Then user clicks on Contact_button
Then Contact popup should be displayed with title "New message"
Then Contact popup should be displayed with Send message button and Close button
 
Scenario: Verify "About us" Button
Given user is on homepage
Then user clicks on About_us button
Then About_us popup should be displayed with title "About us"
Then About_us popup should be displayed with a video and Close button
 
Scenario: Verify "Sign up" Button
Given user is on homepage
Then user clicks on Sign_up button
Then Sign_up popup should be displayed with title "Sign up"
Then Sign_up popup should be displayed with a Sign_up and Close button
 
Scenario: Sign up for an account
Given user is on Home_page
Then user clicks on Sign_up button
Then user enters a new username 
And user enters a new password
Then user cliks on Sign_up button

 
Scenario: Verify items shown on homepage
Given user is on homepage
Then Number of items shown on homepage should be 9
Then Previous and Next button should be displayed
Then Filter buttons for Catogories,Phones,Laptops and Monitors should be displayed
 
Scenario: Verify Cart Button on homepage
Given user is on homepage
Then user clicks on Cart Button
Then verify user is on Cart page

Scenario: Verify Login with wrong password
Given user is on homepage
When user clicks on Log in button
Then user get login popup window
And user enters username "admin"
And user enters password "admin1"
Then user clicks on Login button
Then alert should be diplayed with the message "Wrong password."












