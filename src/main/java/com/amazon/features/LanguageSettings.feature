Feature: Change Language Settings

Background:

Given Open the browser and Enter the url of the website
When I click on Account and Lists it opens SignIn Page 
Then I type Valid Emailid and click on continue  
Then I type Valid password and checks for remember me
When I click on Login it enters into Homepage
When I click on language icon it opens changes Language Settings Page
Then I click on radio button


# Scenario-1
Scenario: HomePage converts into selected language

When I Click on Savechanges it opens Homepage
Then Close browser of the website

#Scenario-2
Scenario: HomePage does not convert into selected language

When I Click on Cancel it opens HomePage
Then Close the browser of the website