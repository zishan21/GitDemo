Feature: Application Login

Background:
Given Validate browser
When browser is open
Then hit url
And verify title


Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and "1234"
Then Homa page is populated 
And Cards displayed are "true"


Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and "4321"
Then Homa page is populated 
And Cards displayed are "false"


Scenario: SignUp
Given User is on NetBanking landing page
When User signup with following details
| firstname | lastname | username | password |
Then Homa page is populated 
And Cards displayed are "false"


Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with <username> and <password>
Then Homa page is populated 
And Cards displayed are "true"

Examples:
| username | password |
| user1 | password1 |
| user2 | password2 |
