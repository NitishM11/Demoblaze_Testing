Feature: CartPage feature

Background:
Given user has already logged in to application
|username|password|
|admin|admin|

Scenario: Filter and order phones 
Given Logged into the user account "admin"
Then user clicks on Phones Button
Then user clicks on Cart Button
And user clicks on Place_order Button
And user fills out the details 
|Name|Country|City|Credit_Card|Month|Year|
|James|India|Bangalore|111111111111|May|2023|
And clicks on Purchase Button 
Then popup with order details should be displayed







