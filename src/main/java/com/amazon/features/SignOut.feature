Feature: Product should move to wishlist and signout from the page

Background:

Given Open the browser and enter the Url of the website
When I click on Accounts and Lists it takes to SignIn Page 
Then I enter valid Emailid and click on continue  
Then I enter valid password and checks for remember me
When I click on login it opens Homepage
And click on Cart Icon it opens the shopping cart page

Scenario:

When I click on save for later the product moves to save for later
And click on move to wish list 
Then Mouse hover on Accounts and lists and click on prashanthi
Then Mouse Hover on Accounts and lists and click on Signout
And close browser of website 
