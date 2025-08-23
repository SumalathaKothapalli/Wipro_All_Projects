Feature: Ebay login Page 
Scenario Outline: Check for valid and invalid credentials 
Given login page should be open in default browser
When Email<username1>
And Password <password1>
Then login successfully and open home page
Examples:
|username1|password1|status|
|Ammullu663@gmail.com|Ammullu@663|pass|
